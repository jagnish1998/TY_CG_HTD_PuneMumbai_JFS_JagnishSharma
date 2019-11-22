package com.capgemini.sorting.set;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) 
	{
		Integer i1 = this.id;
		Integer i2 = o.id;
		return i1.compareTo(i2);
	}
	
	
}
