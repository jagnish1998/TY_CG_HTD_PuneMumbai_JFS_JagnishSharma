package com.capgemini.springcore.beans;

public class Mobile {
	private String brandName;
	private String modelName;
	private MobileDisplayBean mobileDisplay;
	
	
	public MobileDisplayBean getMobileDisplay() {
		return mobileDisplay;
	}
	public void setMobileDisplay(MobileDisplayBean mobileDisplay) {
		this.mobileDisplay = mobileDisplay;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

}
