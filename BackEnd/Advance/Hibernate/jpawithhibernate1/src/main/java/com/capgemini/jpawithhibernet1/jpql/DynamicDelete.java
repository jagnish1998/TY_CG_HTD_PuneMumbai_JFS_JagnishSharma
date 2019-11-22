package com.capgemini.jpawithhibernet1.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DynamicDelete 
{
	public static void main(String[] args)
	 {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		javax.persistence.Query query = entityManager.createQuery("delete from Movie where id = :id");
		query.setParameter("id",1);
		int result = query.executeUpdate();
		if(result>0)
		{
			System.out.println("Delete Sucessful");
		}	
		else
		{
			System.out.println("Somthing went wrong");
		}
		
		entityTransaction.commit();
	}
}
