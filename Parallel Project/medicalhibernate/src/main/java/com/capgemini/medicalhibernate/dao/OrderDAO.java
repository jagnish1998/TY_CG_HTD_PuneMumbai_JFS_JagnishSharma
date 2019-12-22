package com.capgemini.medicalhibernate.dao;

import java.util.List;

import com.capgemini.medicalhibernate.bean.OrderBean;

public interface OrderDAO {

	boolean placeOrder(OrderBean orderBean);

	List<OrderBean> getAll(int userId);

}
