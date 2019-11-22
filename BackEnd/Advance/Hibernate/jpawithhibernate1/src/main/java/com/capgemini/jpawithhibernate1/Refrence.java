package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;
	
public class Refrence 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie movie = entityManager.getReference(Movie.class,1);
		
		System.out.println("Id is "+movie.getId());
		System.out.println("Name is "+movie.getName());
		System.out.println("Rating is "+movie.getRating());
	}
}
