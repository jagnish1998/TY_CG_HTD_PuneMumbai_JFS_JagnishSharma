package com.capgemini.medicaljdbc.controller;

import java.beans.beancontext.BeanContext;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.MessageBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.MessageDAO;
import com.capgemini.medicaljdbc.dao.UserDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class MessageController {
	MessageDAO dao = MedicineFactory.getMessageDAO();
	Scanner scan = new Scanner(System.in);
	MedicalValidation validation = MedicineFactory.getMedicalValidation();
	int choice;

	public void usermessage(UserBean userBean) {
		System.out.println("Enter your choice");
		System.out.println("Press 1 to send message");
		System.out.println("Press 2 to view response");

		while (true) {
			String ch = scan.nextLine();
			if (validation.validateNo(ch)) {
				choice = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
				System.out.println("Enter Yout Choice");
			}
		}

		int uId = userBean.getUserId();
		switch (choice) {

		case 1:
			String type = "Question";
			System.out.println("Enter message to be send");
			String message = scan.nextLine();
			boolean isSent = false;
			try {
				isSent = dao.sendMessage(message, uId, type);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			if (isSent) {
				System.out.println("Message sent..");
			} else {
				System.out.println("Something went wrong..");
				new MessageController().usermessage(userBean);
			}
			break;
		case 2:

			List<MessageBean> list = null;
			try {
				list = dao.viewResponse(uId);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			if (list != null && !list.isEmpty()) {
				for (MessageBean messageBean : list) {
					System.out.println("Message Id: " + messageBean.getMsid());
					System.out.println("Message: " + messageBean.getMessage());
					System.out.println("-------------------------------------------");
				}
			} else {
				System.out.println("No message to Show");
				new MessageController().usermessage(userBean);
			}
			break;

		default:
			System.out.println("Enter Correct Choice");
			new MessageController().usermessage(userBean);
			break;
		}
		new UserIndex().choice(userBean);
	}

	public void adminmessage(UserBean userBean) {
		System.out.println("Enter your choice");
		System.out.println("Press 1 to view messages");
		System.out.println("Press 2 to send response");

		choice = 0;

		while (true) {
			String ch = scan.nextLine();
			if (validation.validateNo(ch)) {
				choice = Integer.parseInt(ch);
				break;
			} else {
				System.err.println("Enter Valid Input");
				System.out.println("Enter Yout Choice");
			}
		}
		switch (choice) {
		case 1:
			List<MessageBean> list = null;

			try {
				list = dao.viewMessage();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			if (list != null && !list.isEmpty()) {
				for (MessageBean messageBean : list) {
					System.out.println("Message Id: " + messageBean.getMsid());
					System.out.println("Message: " + messageBean.getMessage());
					System.out.println("User Id: " + messageBean.getUid());
					System.out.println("-------------------------------------------");
				}
			} else {
				System.out.println("No Message To Display");
				new MessageController().adminmessage(userBean);
			}

			break;
		case 2:
			String type = "Response";
			System.out.println("Enter response to be send");
			String message = scan.nextLine();
			UserDAO userDAO = MedicineFactory.getMedicalDAO();
			List<UserBean> userList = null;

			try {
				userList = userDAO.getuser();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			int uId = 0;
			while (true) {
				System.out.println("Enter User ID");
				String ch = scan.nextLine();
				if (validation.validateNo(ch)) {
					uId = Integer.parseInt(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");

				}
			}

			boolean isSent = dao.sendResponse(message, type, uId);
			if (isSent) {
				System.out.println("Response sent successfully..");
			} else {
				System.out.println("Something wents wrong..");
				new MessageController().adminmessage(userBean);
			}
			break;
		default:
			break;
		}
		new AdminIndex().choice(userBean);
	}
}
