package com.capgemini.medicalcollection.controller;

import java.util.Scanner;
import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;
import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.dao.CartDAO;
import com.capgemini.medicalcollection.dao.MedicineDAO;
import com.capgemini.medicalcollection.factory.MedicineFactory;
import com.capgemini.medicalcollection.validation.MedicalValidation;

public class ViewCart {
	public void showCart(UserBean bean) {
		CartDAO cDao = MedicineFactory.getCartDAO();
		MedicineDAO mDao = MedicineFactory.getMedicineDAO();
		Set<CartBean> cartList = cDao.getCart(bean.getUserId());
		double price = 0;
		if (cartList != null && !cartList.isEmpty()) {
			System.out.printf("%10s %20s %20s", "CartId", "Medicine Name", "MedicinePrice");
			for (CartBean cartBean : cartList) {
				System.out.println("\n------------------------------------------------------------------------");
				System.out.println();
				System.out.printf("%10s %20s %20f", cartBean.getCartId(), cartBean.getMedName(), cartBean.getPrice());
				price = price + cartBean.getPrice();
				System.out.println();
			}

			System.out.println("Your Total Bill is " + price);
			System.out.println("Press 1 to Remove Item  From Cart");
			System.out.println("Press 2 to Place Order");
			System.out.println("Press 3 to Continue to Cart");
			System.out.println("Press any key continue to ");
			Scanner scan = new Scanner(System.in);
			MedicalValidation validation = MedicineFactory.getMedicalValidation();
			int choice = 0;
			while (true) {
				String ch = scan.nextLine();
				if (validation.validateNo(ch)) {
					choice = Integer.parseInt(ch);
					break;
				} else {
					System.err.println("Enter Valid Input");
					System.out.println("Enter Your Choice");
				}
			}
			if (choice == 1) {
				new RemoveCart().removeCart(bean);
			} else if (choice == 2) {
				new PlaceOrder().placeOrder(bean, cartList);
			} else if (choice == 3) {
				new AddToCart().addTOCart(bean);
			} else {
				new UserIndex().userIndex(bean);
			}
		} else {
			System.out.println("No Item Present In Cart");
			new AddToCart().addTOCart(bean);
		}
	}
}
