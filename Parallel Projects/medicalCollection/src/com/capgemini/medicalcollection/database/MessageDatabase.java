package com.capgemini.medicalcollection.database;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.medicalcollection.bean.MessageBean;

public class MessageDatabase {

	public static ArrayList<MessageBean> msgList = new ArrayList<MessageBean>();
	static {
		MessageBean m1 = new MessageBean(1001,102,"Any Discount", "Question");
		MessageBean m2 = new MessageBean(1002,102,"Any Discount", "Question");
		MessageBean m3 = new MessageBean(1003,101,"Sorry no Discount Is Availabe", "response");
		msgList.add(m1);
		msgList.add(m2);
		msgList.add(m3);
	}
	
	public List<MessageBean> getMessage(){
		return msgList;
	}
}
