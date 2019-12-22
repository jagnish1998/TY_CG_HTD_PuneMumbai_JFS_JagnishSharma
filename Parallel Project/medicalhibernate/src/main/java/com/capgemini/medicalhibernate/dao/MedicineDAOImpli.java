package com.capgemini.medicalhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.medicalhibernate.bean.MedicineBean;
import com.capgemini.medicalhibernate.exception.MedicalExeption;

public class MedicineDAOImpli implements MedicineDAO {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	@Override
	public List<MedicineBean> getMedicine() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = " from MedicineBean ";
			Query query = entityManager.createQuery(jpql);
			List<MedicineBean> bean = query.getResultList();
			return bean;
		} catch (Exception e) {
			throw new MedicalExeption("No Medicine Present");
		}
	}

	@Override
	public boolean addMedicine(MedicineBean medBean) {
		boolean isAdded = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(medBean);
			isAdded = true;
			entityTransaction.commit();
		} catch (Exception e) {
			isAdded = false;
			entityTransaction.rollback();
			throw new MedicalExeption("Unable to add medicine");
		}
		return isAdded;
	}

	@Override
	public boolean removeMedicine(int mCode) {
		boolean isDeleted = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			MedicineBean medBean = entityManager.find(MedicineBean.class,mCode);
			entityTransaction.begin();
			entityManager.remove(medBean);
			isDeleted = true;
			entityTransaction.commit();
		} catch (Exception e) {
			isDeleted = false;
			entityTransaction.rollback();
			throw new MedicalExeption("Invalid medicine Id");
		}
		return isDeleted;
	}

	@Override
	public boolean updateMedicineName(int mid, String name) {
		boolean isChanged = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MedicineBean medicineBean = entityManager.find(MedicineBean.class,mid);
			medicineBean.setmedicineName(name);
			entityManager.persist(medicineBean);
			entityTransaction.commit();
			isChanged = true;
		} catch (Exception e) {
			entityTransaction.rollback();
			isChanged = false;
			throw new MedicalExeption("Unable to update medicine");
		}
		return isChanged;
	}

	@Override
	public boolean updateMedicinePrice(int id, double price) {
		boolean isChanged = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MedicineBean medicineBean = entityManager.find(MedicineBean.class,id);
			medicineBean.setPrice(price);
			entityManager.persist(medicineBean);
			entityTransaction.commit();
			isChanged = true;
		} catch (Exception e) {
			isChanged = false;
			entityTransaction.rollback();
			throw new MedicalExeption("Unable to update medicine");
		}
		return isChanged;
	}

	@Override
	public boolean updateMedicineCategory(int id, String catgeory) {
		boolean isChanged = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("medical");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			MedicineBean medicineBean = entityManager.find(MedicineBean.class,id);
			medicineBean.setproductCategory(catgeory);
			entityManager.persist(medicineBean);
			entityTransaction.commit();
			isChanged = true;
		} catch (Exception e) {
			entityTransaction.rollback();
			throw new MedicalExeption("Unable to update medicine");
		}
		return isChanged;
	}
}