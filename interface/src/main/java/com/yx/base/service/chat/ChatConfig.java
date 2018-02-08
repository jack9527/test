package com.yx.base.service.chat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatConfig {

	@Value("${local}")
	public String local;
	
	@Value("${socket}")
	private int socket;
	
	@Value("${enablesocket}")
	private boolean enablesocket;
	
	@Value("${isbackup}")
	private boolean isbackup;
	
	@Value("${enableredback}")
	private boolean enableredback;
	
	@Value("${enabletransback}")
	private boolean enabletransback;
	
	@Value("${loginurl}")
	public String loginurl;
	
	@Value("${uploadpath}")
	public String uploadpath;
		
	public String getUploadpath() {
		return uploadpath;
	}

	public String getLoginurl() {
		return loginurl;
	}

	public boolean getEnableredback() {
		return enableredback;
	}	
	
	public boolean getEnabletransback() {
		return enabletransback;
	}
	
	public boolean getIsbackup() {
		return isbackup;
	}

	public boolean getEnablesocket() {
		return enablesocket;
	}

	public int getSocket() {
		return socket;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
