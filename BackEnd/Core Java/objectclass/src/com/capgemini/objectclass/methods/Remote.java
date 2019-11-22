package com.capgemini.objectclass.methods;

public class Remote implements Cloneable {
	int id;
	String name;

	public Remote(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
