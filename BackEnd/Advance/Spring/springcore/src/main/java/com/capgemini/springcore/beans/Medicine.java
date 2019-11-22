package com.capgemini.springcore.beans;

import java.util.List;
import java.util.Set;

public class Medicine {
	private String name;
	private String type;
	private double price;
	// private List<String> drugs;
	private Set<String> drugs;

	// Getter And Setters

	public String getName() {
		return name;
	}

	public Set<String> getDrugs() {
		return drugs;
	}

	public void setDrugs(Set<String> drugs) {
		this.drugs = drugs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	/*
	 * public List<String> getDrugs() { return drugs; }
	 * 
	 * public void setDrugs(List<String> drugs) { this.drugs = drugs; }
	 * 
	 */}
