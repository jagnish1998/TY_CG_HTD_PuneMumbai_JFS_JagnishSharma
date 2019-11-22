package com.capgemini.objectclass.methods;

public class Cow {
	int id;
	String name;

	public Cow(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
@Override
	public int hashCode()
	{
		return 4;
		
	}
	public boolean equals(Object obj) {
		Cow c = (Cow) obj;
		if (this.id == c.id) {
			if (this.name == c.name) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
