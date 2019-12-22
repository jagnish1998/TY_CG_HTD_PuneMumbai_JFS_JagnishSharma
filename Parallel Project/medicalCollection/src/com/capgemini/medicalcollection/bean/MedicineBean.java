package com.capgemini.medicalcollection.bean;

public class MedicineBean {
	private int medicineCode;
	private String medicineName;
	private double price;
	private String productCategory;

	
	
	public MedicineBean(int medicineCode, String medicineName, double price, String productCategory) {
		super();
		this.medicineCode = medicineCode;
		this.medicineName = medicineName;
		this.price = price;
		this.productCategory = productCategory;
	}
	

	public MedicineBean() {
		super();
	}


	public int getmedicineCode() {
		return medicineCode;
	}

	public void setmedicineCode(int medicineCode) {
		this.medicineCode = medicineCode;
	}

	public String getmedicineName() {
		return medicineName;
	}

	public void setmedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getproductCategory() {
		return productCategory;
	}

	public void setproductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return " medicineCode  =  " + medicineCode + ", medicineName =  " + medicineName + ", price =  " + price
				+ ", productCategory= " + productCategory;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + medicineCode;
		result = prime * result + ((medicineName == null) ? 0 : medicineName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
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
		MedicineBean other = (MedicineBean) obj;
		if (medicineCode != other.medicineCode)
			return false;
		if (medicineName == null) {
			if (other.medicineName != null)
				return false;
		} else if (!medicineName.equals(other.medicineName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		return true;
	}
	
	

}
