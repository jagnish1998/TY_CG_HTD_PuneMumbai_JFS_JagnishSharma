package com.capgemini.jpawithhibernet1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Modification {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Query query =  entityManager.createQuery("update from Movie set name = 'Hello brother' where id = 1");
		int result  = query.executeUpdate();
		if(result>0)
		{
			System.out.println("Update Sucessful");
		}	
		else
		{
			System.out.println("Somthing went wrong");
		}
		
		entityTransaction.commit();
	}
}
