package com.capgemini.medicalcollection.bean;

public class OrderBean {
	private int orderId;
	private int uid;
	private double price;
	private String adress;
	private String medName;

	public OrderBean() {
		super();
	}

	public OrderBean(int orderId, int uid, double price, String adress, String medName) {
		super();
		this.orderId = orderId;
		this.uid = uid;
		this.price = price;
		this.adress = adress;
		this.medName = medName;
	}

	@Override
	public String toString() {
		return "OrderId = " + orderId + ", uid = " + uid + ", price = " + price + ", Adress = " + adress + ", medName = "
				+ medName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getmedName() {
		return medName;
	}

	public void setmedName(String medName) {
		this.medName = medName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}
