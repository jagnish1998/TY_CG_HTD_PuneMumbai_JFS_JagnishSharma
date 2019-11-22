package com.capgemini.medicalcollection.dao;

import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;

public interface CartDAO {
	public Set<CartBean> getCart(int uid);
	public boolean removecart(int cartItem);
	boolean addToAdd(CartBean cartBean);
	boolean removeAllCart(int uId);
	
}
