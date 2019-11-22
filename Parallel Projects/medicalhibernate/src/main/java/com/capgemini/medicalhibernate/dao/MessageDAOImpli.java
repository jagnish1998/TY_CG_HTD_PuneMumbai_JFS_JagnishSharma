package com.capgemini.medicalhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.medicalhibernate.bean.MessageBean;

public class MessageDAOImpli implements MessageDAO {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	@Override
	public boolean sendMessage(String message, int uId, String type) {
		boolean isAdded = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MessageBean bean = new MessageBean();
			bean.setMessage(message);
			bean.setType(type);
			bean.setUid(uId);
			entityManager.persist(bean);
			isAdded = true;
			entityTransaction.commit();
		} catch (Exception e) {
			isAdded = false;
			e.printStackTrace();
			entityTransaction.rollback();
		}
		return isAdded;
	}

	@Override
	public List<MessageBean> viewResponse(int uId) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = " from MessageBean where uid = :uId ";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("uId", uId);
			List<MessageBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<MessageBean> viewMessage() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = " from MessageBean where Type = 'Question' ";
			Query query = entityManager.createQuery(jpql);
			List<MessageBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean sendResponse(String message, String type, int uId) {
		boolean isAdded = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MessageBean bean = new MessageBean();
			bean.setMessage(message);
			bean.setType(type);
			bean.setUid(uId);
			entityManager.persist(bean);
			isAdded = true;
			entityTransaction.commit();
		} catch (Exception e) {
			isAdded = false;
			entityTransaction.rollback();
		}
		return isAdded;
	}
}
