package com.capgemini.jpawithhibernate1.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Student")
public class Student {

	@Id
	@Column
	private int id;
	@Column
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="student_course",joinColumns = @JoinColumn(name="id")
	,inverseJoinColumns = @JoinColumn(name ="cid"))
	private List<Course> course;

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Course> getCourse() {
		return course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


}
