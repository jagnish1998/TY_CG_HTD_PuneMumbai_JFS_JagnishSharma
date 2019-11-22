package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class InsertDemo
{
	public static void main(String[] args)
	{
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		Movie movie = new Movie();
		movie.setId(1);
		movie.setName("ABCD");
		movie.setRating("Average");

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			// To Insert Data we use Persist()
			entityManager.persist(movie);
			System.out.println("Saved");

			entityTransaction.commit();
		} 
		catch (Exception e) 
		{
			entityTransaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}
}
