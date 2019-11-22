package com.capgemini.jpawithhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhiberate1.onetoone.Person;
import com.capgemini.jpawithhiberate1.onetoone.VoterCard;
import com.capgemini.jpawithhibernate1.dto.Movie;

public class TestOneToOne 
{
	public static void main(String[] args)
	{
		VoterCard voterCard = new VoterCard();
		voterCard.setAddress("Pune");
		voterCard.setVoter_id(142);

		Person person = new Person();
		person.setPid(1);
		person.setName("Pooja poo");
		person.setVoterCard(voterCard);

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			// To Insert Data we use Persist()
			//entityManager.persist(person);
			System.out.println("Using Person");
			Person person2 = entityManager.find(Person.class,1);
			System.out.println(person2.getVoterCard().getAddress());
			System.out.println("Saved");
			System.out.println("--------------------------------------------------------------------");

			System.out.println("Using VoterCard");
			VoterCard voterCard2 = entityManager.find(VoterCard.class,142);
			System.out.println(voterCard2.getPerson().getName());
			System.out.println("Saved");
			System.out.println("--------------------------------------------------------------------");
			
			entityTransaction.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		entityManager.close();

	}
}
