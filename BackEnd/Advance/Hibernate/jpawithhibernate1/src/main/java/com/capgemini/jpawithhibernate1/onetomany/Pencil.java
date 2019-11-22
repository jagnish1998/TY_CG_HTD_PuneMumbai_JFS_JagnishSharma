package com.capgemini.jpawithhibernate1.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="pencil")
public class Pencil 
{
	@Id
	@Column
	private int pid;
		@Column
	private String colour;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="bid",nullable=false)
	private  Box box;
	
	public Box getBox() {
		return box;
	}
	public void setBox(Box box) {
		this.box = box;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
