package com.capgemini.medicalcollection.bean;

public class OrderBean {
	private int OrderId;
	private int uid;
	private double price;
	private String Adress;
	private String Cardno;

	public OrderBean() {
		super();
	}

	public OrderBean(int orderId, int uid, double price, String adress, String cardno) {
		super();
		OrderId = orderId;
		this.uid = uid;
		this.price = price;
		Adress = adress;
		Cardno = cardno;
	}

	@Override
	public String toString() {
		return "OrderId = " + OrderId + ", uid = " + uid + ", price = " + price + ", Adress = " + Adress + ", Cardno = "
				+ Cardno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getCardno() {
		return Cardno;
	}

	public void setCardno(String cardno) {
		Cardno = cardno;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}
