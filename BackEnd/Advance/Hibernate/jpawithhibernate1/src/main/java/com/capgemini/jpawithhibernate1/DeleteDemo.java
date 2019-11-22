package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class DeleteDemo 
{
	public static void main(String[] args)
	{
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			// To Delete  Data we need to first find the data and then removie the data
			Movie movie = entityManager.find(Movie.class,2); //Find the Data
			entityManager.remove(movie); //Remove or delete the data
			System.out.println("Record Deleted");
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
