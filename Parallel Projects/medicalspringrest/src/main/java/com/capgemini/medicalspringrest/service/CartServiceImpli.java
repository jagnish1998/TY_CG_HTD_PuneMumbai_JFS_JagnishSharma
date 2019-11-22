package com.capgemini.medicalspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.medicalspringrest.bean.CartBean;
import com.capgemini.medicalspringrest.dao.CartDAO;

@Service
public class CartServiceImpli implements CartService {

	@Autowired
	private CartDAO cartDAO;

	@Override
	public boolean addTOCart(CartBean cart) {
		return cartDAO.addTOCart(cart);
	}

	@Override
	public List<CartBean> getAll(int userId) {
		return cartDAO.getAll(userId);
	}

	@Override
	public boolean removecart(int cartId) {
		return cartDAO.removecart(cartId);
	}

	@Override
	public boolean removeAllcart(int userId) {
		return cartDAO.removeAllcart(userId);
		
	}

	@Override
	public double getPrice(int userId) {
		return cartDAO.getPrice(userId);
	}
	
	
}
