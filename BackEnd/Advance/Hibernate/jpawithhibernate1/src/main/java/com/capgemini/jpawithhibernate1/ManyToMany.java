package com.capgemini.jpawithhibernate1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.manytomany.Course;
import com.capgemini.jpawithhibernate1.manytomany.Student;

public class ManyToMany
{
	public static void main(String[] args)
	{

		Course course = new Course();
		course.setCid(12011);
		course.setCname("java");

		Course course2 = new Course();
		course2.setCid(12012);
		course2.setCname("sql");

		List<Course> l = new ArrayList<Course>();
		l.add(course);
		l.add(course2);
		
		/*
		 * Student student = new Student(); student.setId(1);
		 * student.setSname("Jagnish"); student.setCourse(l);
		 */
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setSname("rahul");
		student2.setCourse(l);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			//entityManager.persist(student2);
			Course course3 = entityManager.find(Course.class,12011);
			System.out.println(course3.getStudent().get(0).getSname());
			
			entityTransaction.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}
}
