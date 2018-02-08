package com.yx.base.service.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.util.RedisUtil;
import com.yx.base.parameter.Constants;

@Service
public class UserRedisMap {

	@Autowired
	private ChatConfig config;

	public boolean isOnline(long userId, int deviceId) {
		if (null != getUserIp(userId, deviceId)) {
			return true;
		}
		return false;
	}

	public void addUserIpToRedis(long userId, int deviceId) {
		RedisUtil.hset(Constants.USER_IP_KEY + userId, String.valueOf(deviceId), config.getLocal());
	}

	public void removeUserIpFromRedis(long userId, int deviceId) {
		RedisUtil.hdel(Constants.USER_IP_KEY + userId, String.valueOf(deviceId));
	}

	public String getUserIp(long userId, int deviceId) {
		String ip = RedisUtil.hget(Constants.USER_IP_KEY + userId, String.valueOf(deviceId));
		if (ip != null) {
			return ip;
		}
		return null;
	}

	public List<String> getAllIps(long userId) {
		Map<String, String> ipMap = RedisUtil.hgetAll(Constants.USER_IP_KEY + userId);
		ArrayList<String> ips = new ArrayList<String>();
		for (String ip : ipMap.values()) {
			ips.add(ip);
		}
		return ips;
	}

	public List<String> getOtherIps(long userId, int deviceId) {
		Map<String, String> ipMap = RedisUtil.hgetAll(Constants.USER_IP_KEY + userId);
		ArrayList<String> ips = new ArrayList<String>();
		for (String key : ipMap.keySet()) {
			if (!key.equals(String.valueOf(deviceId))) {
				ips.add(ipMap.get(key));
			}
		}
		return ips;
	}
	
	

}
