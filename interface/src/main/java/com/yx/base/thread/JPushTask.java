package com.yx.base.thread;

import java.util.HashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.framework.util.RedisUtil;
import com.framework.util.Utils;
import com.google.common.primitives.Ints;
import com.opslab.util.encrypt.Base64;
import com.yx.base.model.ImMessage;
import com.yx.base.parameter.IMConstants;

import cn.jiguang.common.ClientConfig;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.PushPayload.Builder;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosAlert;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

public class JPushTask extends Thread {
	static {
		ClientConfig config = ClientConfig.getInstance();
		config.setMaxRetryTimes(5);
		config.setConnectionTimeout(10 * 1000); // 10 seconds
		config.setSSLVersion("TLSv1.1");
	}
	private final static String appKey = "c99d316ce83636620c521bfd";
	private final static String appSecret = "0b8b293770ae9a96d213bbb5";
	public static JPushClient jpushClient = new JPushClient(appSecret, appKey, null, ClientConfig.getInstance());

	private ImMessage msg;
	private String cid;

	public JPushTask(ImMessage msgParam, String clientId) {
		this.msg = msgParam;
		this.cid = clientId;
	}

	public void run() {
		try {
			if (jpushClient == null) {
				jpushClient = new JPushClient(appSecret, appKey, null, ClientConfig.getInstance());
			}

			Builder builder = PushPayload.newBuilder();
			// builder.setCid(System.currentTimeMillis()+Utils.random(4));
			builder.setAudience(Audience.alias(cid));
			builder.setPlatform(Platform.android_ios());

			String content = this.msg.getContent();
			if (this.msg.getMessageType() == IMConstants.MSG_TYPE_FRIEND_REQ) {
				content = "[加好友]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_SEND_LOCATION) {
				content = "[位置]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_SEND_VIDEO) {
				content = "[小视频]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_VOICE) {
				content = "[语音留言]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_VOICE_CHAT) {
				content = "[语音请求]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_VIDEO_CHAT) {
				content = "[视频请求]";
			}else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_IMG) {
				content = "[图片]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_READ_DEL) {
				content = "[阅后即焚]";
			} else if (this.msg.getMessageType() == IMConstants.MSG_TYPE_FILE) {
				content = "[文件]";
			} else if (content.contains("msgString")) {
				JSONObject m = JSON.parseObject(content);
				content = m.getString("msgString");
			} else {
				content = this.msg.getContent();
			}

			String deviceByte = RedisUtil.hget("onlineDevice", cid);
			if (deviceByte != null) {
				String device = (deviceByte);
				System.out.println("需要推送的目标平台：" + device);
				if (device.equals("1")) {
					builder.setNotification(Notification.newBuilder()
							.addPlatformNotification(AndroidNotification.newBuilder()
									.setAlert(content)
									.setTitle(msg.getFromName())
									.addExtra("fromType", msg.getFromType())
									.addExtra("fromId", msg.getFromType()==1?msg.getFromId():msg.getDestId())
									.addExtra("messageType", msg.getMessageType())
									.build())
							.build());

					// builder.setMessage(Message.newBuilder().setMsgContent(content).addExtra("msg_json",
					// JSON.toJSONString(msg)).build());
				}
				if (device.equals("2")) {					
					String badegeVal = RedisUtil.hget("userBadege", cid);
					int badege=1;
					if(badegeVal!=null){
						badege=Integer.parseInt(badegeVal)+1;						
					}					
					RedisUtil.hset("userBadege",String.valueOf(cid), String.valueOf(badege));
					
					IosAlert alert = IosAlert.newBuilder().setTitleAndBody("", this.msg.getFromName(), content).build();
					builder.setNotification(Notification.newBuilder()
							.addPlatformNotification(IosNotification
									.newBuilder()
									.setSound("happy")
									.setAlert(alert)
									.setBadge(badege)
									.addExtra("json_msg", JSON.toJSONString(this.msg)).build())
							.build());
				}
			}
			PushPayload payload = builder.build();

			PushResult result = jpushClient.sendPush(payload);
			System.out.println("推送 = " + result.getResponseCode() + ", content==" + result.getOriginalContent());
			jpushClient.close();
			jpushClient = null;

		} catch (Exception e) {
			System.out.println("推送失败=" + e.getMessage());
		}
	}

	public static void main(String args[]) {
		ImMessage msg = new ImMessage();
		msg.setContent("test");
		msg.setFromName("用户名");
		msg.setSendTime(System.currentTimeMillis());
		msg.setMessageType(34);
		String json = JSON.toJSONString(msg);
		System.out.println(Base64.encodeToString(json));
/*
		try {
			if (jpushClient == null) {
				jpushClient = new JPushClient(appSecret, appKey, null, ClientConfig.getInstance());
			}

			Builder builder = PushPayload.newBuilder();
			// builder.setCid(System.currentTimeMillis()+Utils.random(4));
			builder.setAudience(Audience.alias("18791"));
			builder.setPlatform(Platform.android_ios());
			builder.setMessage(
					Message.newBuilder().setMsgContent("").addExtra("msg_json", JSON.toJSONString(msg)).build());

			String content = msg.getContent();
			if (msg.getMessageType() == IMConstants.MSG_TYPE_FRIEND_REQ) {
				content = "[加好友]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_SEND_LOCATION) {
				content = "[位置]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_SEND_VIDEO) {
				content = "[小视频]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_VOICE) {
				content = "[语音]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_IMG) {
				content = "[图片]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_READ_DEL) {
				content = "[阅后即焚]";
			} else if (msg.getMessageType() == IMConstants.MSG_TYPE_FILE) {
				content = "[文件]";
			} else if (content.contains("msgString")) {
				JSONObject m = JSON.parseObject(content);
				content = m.getString("msgString");
			} else {
				content = msg.getContent();
			}

			builder.setNotification(Notification.android("测试", msg.getFromName(), null));
			PushPayload payload = builder.build();

			PushResult result = jpushClient.sendPush(payload);
			System.out.println("推送 = " + result.getResponseCode() + ", content==" + result.getOriginalContent());
			jpushClient.close();
			jpushClient = null;

		} catch (Exception e) {
			System.out.println("推送失败=" + e.getMessage());
		}*/
	}
}
