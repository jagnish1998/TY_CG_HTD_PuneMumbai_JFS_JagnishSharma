package com.capgemini.medicaljdbc.bean;

public class MedicineBean {
	private int medicineCode;
	private String medicineName;
	private double price;
	private String productCategory;

	public int getMedicineCode() {
		return medicineCode;
	}

	public void setMedicineCode(int medicine_code) {
		this.medicineCode = medicine_code;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicine_name) {
		this.medicineName = medicine_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String product_category) {
		this.productCategory = product_category;
	}

	
}
