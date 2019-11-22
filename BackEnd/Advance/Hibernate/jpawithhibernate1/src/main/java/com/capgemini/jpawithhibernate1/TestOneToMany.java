package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhiberate1.onetoone.Person;
import com.capgemini.jpawithhiberate1.onetoone.VoterCard;
import com.capgemini.jpawithhibernate1.onetomany.Box;
import com.capgemini.jpawithhibernate1.onetomany.Pencil;

public class TestOneToMany
{
	public static void main(String[] args)
	{


		Box box = new Box();
		box.setBid(4);
		box.setName("camln");
		
		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setColour("black");
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(14);
		pencil1.setColour("red");
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(16);
		pencil2.setColour("blue");
		
		pencil1.setBox(box);
		pencil2.setBox(box);
		pencil.setBox(box);
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			// To Insert Data we use Persist()
			//entityManager.persist(pencil);
			//entityManager.persist(pencil1);
			entityManager.persist(pencil2);
			entityTransaction.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}

