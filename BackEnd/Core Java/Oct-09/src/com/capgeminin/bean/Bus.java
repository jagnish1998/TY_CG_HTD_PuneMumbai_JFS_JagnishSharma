package com.capgeminin.bean;

final public class Bus {

	final private String name;
	final private int seat;

	public Bus(String name, int seat) {
		this.name = name;
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public int getSeat() {
		return seat;
	}

}
