package com.capgemini.medicalcollection.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import com.capgemini.medicalcollection.bean.CartBean;

public class CartDAOImpli implements CartDAO {
	private static Set<CartBean> cartList = new LinkedHashSet<CartBean>();

	@Override
	public Set<CartBean> getCart(int uid) {
		Set<CartBean> list = new LinkedHashSet<CartBean>();
		for (CartBean cartBean : cartList) {
			if (cartBean.getUid() == uid) {
				list.add(cartBean);
			}
		}
		return list;
	}

	@Override
	public boolean removecart(int cartItem) {
		CartBean cart = null;
		boolean isDeleted = false;
		isDeleted = cartList.removeIf((bean) -> {
			if (bean.getCartId() == cartItem)
				return true;
			else
				return false;
		});
		return isDeleted;
	}

	@Override
	public boolean addToAdd(CartBean bean) {
		System.out.println("Welcome to addTo");
		bean.setCartId(cartList.size() + 1512534);
		boolean isAdded = false;
		if (cartList.add(bean)) {
			isAdded = true;
		}
		return isAdded;
	}

	@Override
	public boolean removeAllCart(int uId) {
		CartBean cart = null;
		boolean isDeleted = false;
		cartList.removeIf((bean) -> bean.getUid() == uId);
		isDeleted = true;
		return isDeleted;
	}
}
