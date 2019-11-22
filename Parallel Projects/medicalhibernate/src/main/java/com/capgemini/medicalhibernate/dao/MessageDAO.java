package com.capgemini.medicalhibernate.dao;

import java.util.List;

import com.capgemini.medicalhibernate.bean.MessageBean;


public interface MessageDAO {

	
	boolean sendMessage(String message, int uId, String type);

	List<MessageBean> viewResponse(int uId);

	List<MessageBean> viewMessage();

	boolean sendResponse(String message, String type, int uId);

}
