package com.william.pojo;

public class Token {

	// 请求uid
	private String uid;
	// 登录手机号
	private String loginPhoneNumber;
	// 时间戳
	private String timeStamp;
	// 渠道号
	private String channel;

	public String getLoginPhoneNumber() {
		return loginPhoneNumber;
	}

	public void setLoginPhoneNumber(String loginPhoneNumber) {
		this.loginPhoneNumber = loginPhoneNumber;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
}
