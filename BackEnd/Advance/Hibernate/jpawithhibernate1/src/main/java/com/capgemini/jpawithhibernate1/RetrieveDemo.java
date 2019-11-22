package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import com.capgemini.jpawithhibernate1.dto.Movie;

public class RetrieveDemo
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie movie = entityManager.find(Movie.class,1);
		System.out.println("Id is "+movie.getId());
		System.out.println("Name is "+movie.getName());
		System.out.println("Rating is "+movie.getRating());
	}
}
