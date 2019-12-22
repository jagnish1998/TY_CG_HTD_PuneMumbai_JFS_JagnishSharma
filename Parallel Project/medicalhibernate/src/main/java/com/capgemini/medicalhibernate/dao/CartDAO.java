package com.capgemini.medicalhibernate.dao;

import java.util.List;

import com.capgemini.medicalhibernate.bean.CartBean;

public interface CartDAO {

	boolean addTOCart(CartBean cart);

	List<CartBean> getAll(int userId);

	boolean removecart(int cartId);

	void removeAllcart(int userId);

}
