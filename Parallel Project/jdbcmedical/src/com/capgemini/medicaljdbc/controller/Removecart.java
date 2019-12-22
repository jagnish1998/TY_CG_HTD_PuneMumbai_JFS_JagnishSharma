package com.capgemini.medicaljdbc.controller;

import com.capgemini.medicaljdbc.dao.CartDAO;
import com.capgemini.medicaljdbc.factory.MedicineFactory;

public class Removecart {
	public boolean removeMedicine(int cartid) {
		CartDAO dao = MedicineFactory.getCartDAO();
		boolean isRemoved = false;
		
		try {
			isRemoved = dao.removecart(cartid);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		if (isRemoved) {
			System.out.println("Item Removed from cart");
			return true;
		} else {
			System.out.println("Item not Exist please Enter the Correct Cart id");
		}
		return false;
	}
}
