package com.yx.base.service.chat;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.framework.util.RedisUtil;
import com.google.common.collect.Sets;
import com.yx.base.model.ImMessage;
import com.yx.base.parameter.Constants;
import com.yx.base.parameter.IMConstants;
import com.yx.base.thread.JPushTask;

@Service
public class MsgStoreAndNotify {

	@Autowired
	private UserRedisMap userRedisMap;

	public final static Set<String> notifyIpSet = Sets.newConcurrentHashSet();

	RestTemplate request = new RestTemplate();

	public void addIpToSet(long userId, int deviceId) {
		String ip = userRedisMap.getUserIp(userId, deviceId);
		notifyIpSet.add(ip);
	}

	public boolean storeMsgAndNotifyImServer(ImMessage message, long userId) {
		Map<String, String> devMap = RedisUtil.hgetAll(Constants.USER_IP_KEY + userId);
		// 有设备在线时，通知在线目标用户
		if (devMap.size() > 0) {
			for (String deviceId : devMap.keySet()) {
				int devParam = 0;
				//通知我在线的其它设备
				if (message != null && message.getMessageType() != null && message.getDevType() != null
						&& message.getDevType() > 0
						&& (message.getMessageType() == IMConstants.MSG_TYPE_DEL_FRIEND
								|| message.getMessageType() == IMConstants.MSG_TYPE_DEL_FRIEND
								|| message.getMessageType() == IMConstants.MSG_TYPE_JOIN_GROUP
								|| message.getMessageType() == IMConstants.MSG_TYPE_INVITE_GROUP
								|| message.getMessageType() == IMConstants.MSG_TYPE_QUIT_GROUP
								|| message.getMessageType() == IMConstants.MSG_TYPE_MODIFY_GROUP
								|| message.getMessageType() == IMConstants.MSG_TYPE_ACCEPT_FRIEND
								|| message.getMessageType() == IMConstants.MSG_TYPE_MODIFY_PROFILE)) {

					devParam = message.getDevType();
					if (!deviceId.equals(String.valueOf(devParam))) {
						RedisUtil.lpush("msg_" + userId + "_" + deviceId, JSONObject.toJSONString(message));
						// 加入通知列表，通知所在服务器
						addIpToSet(userId, devParam);
					}
				} else {
					RedisUtil.lpush("msg_" + userId + "_" + deviceId, JSONObject.toJSONString(message));
					// 加入通知列表，通知所在服务器
					addIpToSet(userId, Integer.parseInt(deviceId));
				}
			}
		} else {
			// 没有设备在线时
			RedisUtil.lpush("msg_" + userId, JSONObject.toJSONString(message));
			//System.out.println("开始极光推送，为用户："+userId+",消息类型："+message.getMessageType());
			// 极光推送
			if (message.getMessageType() == IMConstants.MSG_TYPE_TEXT
					|| message.getMessageType() == IMConstants.MSG_TYPE_IMG
					|| message.getMessageType() == IMConstants.MSG_TYPE_FILE
					|| message.getMessageType() == IMConstants.MSG_TYPE_EMOJI_YUN
					|| message.getMessageType() == IMConstants.MSG_TYPE_FRIEND_REQ
					|| message.getMessageType() == IMConstants.MSG_TYPE_SEND_LOCATION
					|| message.getMessageType() == IMConstants.MSG_TYPE_VOICE
					|| message.getMessageType() == IMConstants.MSG_TYPE_SEND_VIDEO
					|| message.getMessageType() == IMConstants.MSG_TYPE_VIDEO_CHAT
					|| message.getMessageType() == IMConstants.MSG_TYPE_VOICE_CHAT
					|| message.getMessageType() == IMConstants.MSG_TYPE_READ_DEL) {

				/*
				 * //安卓 String channelId=RedisUtil.hget("bind_pusher",
				 * String.valueOf(userId) + "_1");
				 * if(!StringUtil.isEmpty(channelId)){ JPushTask task=new
				 * JPushTask(message,channelId); task.start(); } //苹果
				 * channelId=RedisUtil.hget("bind_pusher",
				 * String.valueOf(userId) + "_2");
				 * if(!StringUtil.isEmpty(channelId)){ JPushTask task=new
				 * JPushTask(message,channelId); task.start(); }
				 */

				JPushTask task = new JPushTask(message, String.valueOf(userId));
				task.start();
				
			}
		}

		return true;
	}

	/**
	 * 同步消息到其它设备
	 * 
	 * @param message
	 *            消息
	 * @param userId
	 *            目标id
	 * @param deviceId
	 *            当前设备id
	 * @return
	 */
	public boolean synchronOtherDev(ImMessage message, long userId, int deviceId) {
		Map<String, String> devMap = RedisUtil.hgetAll(Constants.USER_IP_KEY + userId);
		for (String devId : devMap.keySet()) {
			System.out.println(userId + "在线的设备=" + devId);
			System.out.println(userId + "当前设备=" + deviceId);
			if (!devId.equals(String.valueOf(deviceId))) {
				RedisUtil.lpush("msg_" + userId + "_" + devId, JSONObject.toJSONString(message));
				addIpToSet(userId, Integer.parseInt(devId));
			}
		}

		return true;
	}

	/**
	 * 通知目标服务器
	 */
	@SuppressWarnings("rawtypes")
	public boolean notifyImServer() {
		for (Iterator it = notifyIpSet.iterator(); it.hasNext();) {
			String addr = String.valueOf(it.next());
			String url = "http://" + addr + ":19569/chat/notifyNew";
			System.out.println("通知服务器：" + url);
			httpRequest(url);
			it.remove();
		}
		return true;
	}

	public String httpRequest(String url) {
		try {
			return request.getForObject(url, String.class);
		} catch (RestClientException e) {
			System.out.println("发送通知异常:" + e.toString());
		}
		return null;
	}

	/**
	 * 通知下线
	 * 
	 * @param userId
	 */
	public void noticeOffline(long userId, int deviceId) {
		String ip = userRedisMap.getUserIp(userId, deviceId);
		if (ip != null && ip.length() > 0) {
			System.out.println("暂时关闭其它地方登陆");
			// ImMessage msg = msgFactory.otherLoginNotice(userId);
			// storeMsgAndNotifyImServer(msg, userId);
		}
	}

}
