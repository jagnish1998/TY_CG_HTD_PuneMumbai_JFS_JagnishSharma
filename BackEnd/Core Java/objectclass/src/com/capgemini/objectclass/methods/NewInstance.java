package com.capgemini.objectclass.methods;

public class NewInstance implements Cloneable
{
	String s1;
	int id;

	public NewInstance(String s1, int id) {
		super();
		this.s1 = s1;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "NewInstance [s1=" + s1 + ", id=" + id + "]";
	}
	
}
