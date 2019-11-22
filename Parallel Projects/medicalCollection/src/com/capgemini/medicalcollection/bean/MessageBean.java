package com.capgemini.medicalcollection.bean;

public class MessageBean {

	private int msid;
	private int uid;
	private String message;
	private String type;

	public MessageBean() {
		super();
	}

	public MessageBean(int msid, int uid, String message, String type) {
		super();
		this.msid = msid;
		this.uid = uid;
		this.message = message;
		this.type = type;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMsid() {
		return msid;
	}

	public void setMsid(int msid) {
		this.msid = msid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageBean [msid=" + msid + ", uid=" + uid + ", message=" + message + ", Type=" + type + "]";
	}
	
}
