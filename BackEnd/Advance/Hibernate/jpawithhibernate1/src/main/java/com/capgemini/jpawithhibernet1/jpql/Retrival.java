package com.capgemini.jpawithhibernet1.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate1.dto.Movie;


public class Retrival 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		javax.persistence.Query query = entityManager.createQuery("from Movie");
		List<Movie>	l =query.getResultList();
		for (Movie movie : l)
		{
			System.out.println(movie.getName());
		}
		
	}
}
