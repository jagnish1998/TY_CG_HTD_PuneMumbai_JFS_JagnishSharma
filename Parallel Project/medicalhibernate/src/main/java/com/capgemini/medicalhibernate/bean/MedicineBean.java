package com.capgemini.medicalhibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class MedicineBean 
{	
	@Id
	@Column(name = "medicine_code")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int medicineCode;
	@Column(name = "medicine_name")
	private String medicineName;
	@Column
	private double price;
	@Column
	private String productCategory;
	
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
				+ ", productCategory= " + productCategory  ;
	}
	
	
}
