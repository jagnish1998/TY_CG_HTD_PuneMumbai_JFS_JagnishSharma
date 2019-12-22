package com.capgemini.medicalhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.medicalhibernate.bean.OrderBean;
import com.capgemini.medicalhibernate.bean.UserBean;
import com.capgemini.medicalhibernate.exception.MedicalExeption;

public class OrderDAOImpli implements OrderDAO {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	@Override
	public boolean placeOrder(OrderBean orderBean) {
		boolean isAdded = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(orderBean);
			isAdded = true;
			entityTransaction.commit();
		} catch (Exception e) {
			
			isAdded = false;
			entityTransaction.rollback();
			throw new MedicalExeption("Unable to place Order");
		}
		return isAdded;
	}

	@Override
	public List<OrderBean> getAll(int userId) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = " from OrderBean where uid = :userId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("userId", userId);
			List<OrderBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			throw new MedicalExeption("No Previous Order");
		}
	}

}
