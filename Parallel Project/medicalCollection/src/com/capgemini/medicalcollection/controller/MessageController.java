package com.capgemini.medicalcollection.controller;

import java.util.Scanner;

import com.capgemini.medicalcollection.bean.MessageBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.MessageDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class MessageController {
	Scanner scan = new Scanner(System.in);
	MessageDAO dao = MedicineFactory.getMessageDAO();
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
			boolean isSend = dao.sendMessage(message, uId, type);
			if (isSend) {
				System.out.println("Message sent..");
			} else {
				System.out.println("Something went wrong..");
			}

			break;
		case 2:

			MessageBean bean = dao.viewResponse(uId);
			break;

		default:
			break;
		}
		new UserIndex().userIndex(userBean);
	}

	public void adminMessage(UserBean userBean) {
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
			MessageBean bean = dao.viewMessage();
			break;
		case 2:
			String type = "Response";
			System.out.println("Enter response to be send");
			String message = scan.next();
			System.out.println("Enter user Id");
			int uId = 0;

			while (true) {
				String ch = scan.nextLine();
				if (validation.validateNo(ch)) {
					uId = Integer.parseInt(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");
					System.out.println("Enter Your Response");
				}
			}
			boolean rs = dao.sendResponse(message, type, uId);
			if (rs = true) {
				System.out.println("Response sent successfully..");
			} else {
				System.out.println("Something wents wrong..");
			}
			break;

		default:
			break;
		}
		new AdminIndex().adminIndex(userBean);

	}

}
