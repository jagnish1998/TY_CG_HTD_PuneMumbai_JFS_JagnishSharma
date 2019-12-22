package com.capgemini.medicalhibernate.factory;

import com.capgemini.medicalhibernate.dao.CartDAO;
import com.capgemini.medicalhibernate.dao.CartDAOImpli;
import com.capgemini.medicalhibernate.dao.MedicineDAO;
import com.capgemini.medicalhibernate.dao.MedicineDAOImpli;
import com.capgemini.medicalhibernate.dao.MessageDAO;
import com.capgemini.medicalhibernate.dao.MessageDAOImpli;
import com.capgemini.medicalhibernate.dao.OrderDAO;
import com.capgemini.medicalhibernate.dao.OrderDAOImpli;
import com.capgemini.medicalhibernate.dao.UserDAO;
import com.capgemini.medicalhibernate.dao.UserDAOImpli;
import com.capgemini.medicalhibernate.validation.MedicalValidation;

public class MedicineFactory {

	public static UserDAO getMedicalDAO() {
		UserDAO dao = new UserDAOImpli();
		return dao;
	}

	public static MedicineDAO getMedicineDAO() {
		return new MedicineDAOImpli();
	}

	public static CartDAO getCartDAO() {
		return new CartDAOImpli();
	}

	public static OrderDAO getOrderDao() {
		return  new OrderDAOImpli();
	}

	public static MessageDAO getMessageDAO() {
		return new MessageDAOImpli();
	}

	public static MedicalValidation getMEdicalValidation() {
		return new MedicalValidation();
	}

}
