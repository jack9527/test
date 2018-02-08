package com.yx.base.parameter;

import java.io.Serializable;

public class ResponseData implements Serializable {

	private static final long serialVersionUID = -7048248470110058317L;

	private int code;
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
