package com.capgemini.medicalcollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.medicalcollection.bean.OrderBean;
import com.capgemini.medicalcollection.database.OrderDataBase;

public class OrderDAOImpli implements OrderDAO {
	OrderDataBase orderDataBase = new OrderDataBase();
	List<OrderBean> orderList = orderDataBase.getOrderList();
	
	public List<OrderBean> getOrder(int uid){
		List<OrderBean> orderBeanList = new ArrayList<OrderBean>();
		for (OrderBean orderBean : orderList) {
			if(orderBean.getUid() == uid) {
				orderBeanList.add(orderBean);
			}
		}
		return orderBeanList;
	}

	@Override
	public boolean placeOrder(OrderBean orderBean) {
		orderBean.setOrderId(orderList.size()+48);
		boolean isPlaced = false;
		if(orderList.add(orderBean)) {
			isPlaced = true;
		}
		return isPlaced;
	}
}
