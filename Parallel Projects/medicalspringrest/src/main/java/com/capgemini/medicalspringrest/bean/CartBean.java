package com.capgemini.medicalspringrest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartBean {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	@Column
	private int mid;
	@Column
	private int uid;
	@Column
	private String MedName;
	@Column 
	private double price;

	
	
	public String getMedName() {
		return MedName;
	}

	public void setMedName(String medName) {
		MedName = medName;
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
}
