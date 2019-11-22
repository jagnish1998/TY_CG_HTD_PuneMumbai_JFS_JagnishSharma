package com.capgemini.jpawithhibernate1.onetomany;

import java.awt.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Box")
public class Box
{
	@Id
	@Column
	private int bid;
	@Column
	private String name ;
	
	//private List pencil;
	
	public int getBid()
	{
		return bid;
	}
	public void setBid(int boxid) {
		this.bid = boxid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
