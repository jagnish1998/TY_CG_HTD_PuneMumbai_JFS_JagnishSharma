package com.capgemini.medicaljdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.medicaljdbc.bean.CartBean;
import com.capgemini.medicaljdbc.bean.MedicineBean;
import com.capgemini.medicaljdbc.bean.UserBean;
import com.capgemini.medicaljdbc.dao.CartDAO;
import com.capgemini.medicaljdbc.dao.MedicineDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;
import com.capgemini.medicaljdbc.validation.MedicalValidation;

public class ViewCart {
	public void options(UserBean bean) {
		CartDAO dao = MedicineFactory.getCartDAO();
		double price = 0;
		MedicalValidation validation =  MedicineFactory.getMedicalValidation();
		Scanner scan = new Scanner(System.in);
		List<CartBean> list = null;
		
		try {
			 list = dao.getAll(bean.getUserId());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		if (list != null && !list.isEmpty()) {
			System.out.printf("%10s %20s %20s", "CartId", "Medicine Name", "MedicinePrice");
			for (CartBean cartBean : list) {
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println();
				System.out.printf("%10s %20s %20f", cartBean.getCartId(), cartBean.getMedName(), cartBean.getPrice());
				price = price + cartBean.getPrice();
			}
			System.out.println("\nYour Bill is " + price);
			System.out.println("Enter 1 to Continue to Shop");
			System.out.println("Enter 2 to remove From cart");
			System.out.println("Enter 3 to Place OrderDAO");

			int choice = 0;
			while (true) {
				String id = scan.nextLine();
				if (validation.validateNo(id)) {
					choice = Integer.parseInt(id);
					break;
				} else {
					System.err.println("Enter Valid Input");
					System.out.println("Enter your choice");
				}
			}
			switch (choice) {
			case 1:
				new AddCart().addCart(bean);
				break;

			case 2:
				int cartid = 0;
				while (true) {
					System.out.println("Enter cartId want to delete");
					String id = scan.nextLine();
					if (validation.validateNo(id)) {
						cartid = Integer.parseInt(id);
						break;
					} else {
						System.err.println("Enter Valid Input");
					}
				}
				
				new Removecart().removeMedicine(cartid);
				options(bean);
				break;
			case 3:
				new PlaceOrder().placeOrder( bean, list);
				break;

			default:
				System.out.println("Wrong Input Please Enter The correct Input");
			}
		} else {
			System.out.println("You have no Item in your Cart");
		}
		new UserIndex().choice(bean);
	}
}
