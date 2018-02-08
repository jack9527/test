package com.yx.base.parameter;

import java.io.Serializable;

public class OnlineUserDev implements Serializable {

	private static final long serialVersionUID = 109892L;
	private long userId;
	private int deviceId;
	private String serverIp;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

}
