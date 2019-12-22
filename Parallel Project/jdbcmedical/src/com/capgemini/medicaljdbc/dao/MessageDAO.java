package com.capgemini.medicaljdbc.dao;

import java.util.List;

import com.capgemini.medicaljdbc.bean.MessageBean;

public interface MessageDAO {

	public boolean sendMessage(String message, int userId, String type);

	public List<MessageBean> viewResponse(int uId);

	boolean sendResponse(String message, String type, int uId);

	List<MessageBean> viewMessage();

}
