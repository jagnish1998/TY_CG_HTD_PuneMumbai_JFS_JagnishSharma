package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class Reataching 
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

			// To Delete Data we need to first find the data and then removie the data
			Movie movie = entityManager.find(Movie.class, 2);
			System.out.println(movie.getId());

			// detach the Object from database
				entityManager.detach(movie);
			//entityManager.clear();
			System.out.println(entityManager.contains(movie));
			Movie m1 = entityManager.merge(movie);
			m1.setName("Kush Kush Hota h");
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
