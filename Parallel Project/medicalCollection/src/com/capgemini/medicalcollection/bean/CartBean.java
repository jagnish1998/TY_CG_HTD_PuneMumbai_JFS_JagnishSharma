package com.capgemini.medicalcollection.bean;

public class CartBean {
	private int cartId;
	private int mid;
	private int uid;
	private String medName;
	private double price;

	public CartBean() {
		super();
	}

	
	
	public CartBean(int cartId, int mid, int uid, String medName, double price) {
		super();
		this.cartId = cartId;
		this.mid = mid;
		this.uid = uid;
		this.medName = medName;
		this.price = price;
	}



	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
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
		result = prime * result + ((medName == null) ? 0 : medName.hashCode());
		result = prime * result + mid;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (medName == null) {
			if (other.medName != null)
				return false;
		} else if (!medName.equals(other.medName))
			return false;
		if (mid != other.mid)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}


}
