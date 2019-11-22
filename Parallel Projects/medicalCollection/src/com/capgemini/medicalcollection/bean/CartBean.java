package com.capgemini.medicalcollection.bean;

public class CartBean {
	private int cartId;
	private int mid;
	private int uid;

	public CartBean() {
		super();
	}

	public CartBean(int cartId, int mid, int uid) {
		super();
		this.cartId = cartId;
		this.mid = mid;
		this.uid = uid;

	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		result = prime * result + mid;
		result = prime * result + uid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartBean other = (CartBean) obj;
		if (cartId != other.cartId)
			return false;
		if (mid != other.mid)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}

}
