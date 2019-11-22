package com.capgemini.springcore.annotation.bean;

import com.capgemini.springcore.interfaces.Engine;

public class VolksWagon implements Engine{

	@Override
	public int getCC() {
		return 3000;
	}

	@Override
	public String getType() {
		return "4-Stroke-Diesel";
	}

}
