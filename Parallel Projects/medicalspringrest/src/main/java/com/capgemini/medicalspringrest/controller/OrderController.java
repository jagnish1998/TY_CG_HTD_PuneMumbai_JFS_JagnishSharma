package com.capgemini.medicalspringrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.medicalspringrest.bean.OrderBean;
import com.capgemini.medicalspringrest.bean.ResponseBean;
import com.capgemini.medicalspringrest.service.CartService;
import com.capgemini.medicalspringrest.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private CartService cartService;

	@GetMapping(path = "/orderHistory", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBean orderHistory(int uid) {
		List<OrderBean> orderlist = orderService.getOrder(uid);
		ResponseBean response = new ResponseBean();
		if (orderlist != null && !orderlist.isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Order List Found");
			response.setOrderList(orderlist);
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("No Previous Order");
		}
		return response;
	}
	
	@PostMapping(path = "/addToOrder",consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBean addToOrder(String adress,int uid , String cardNo) {
		double totalPrice = cartService.getPrice(uid);
		OrderBean orderBean = new OrderBean();
		orderBean.setAdress(adress);
		orderBean.setCardNo(cardNo);
		orderBean.setPrice(totalPrice);
		orderBean.setUid(uid);
		boolean isAdded = orderService.addOrder(orderBean);
		cartService.removeAllcart(uid);
		ResponseBean response = new ResponseBean();
		if(isAdded) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Order Placed SuccessFul");
		} else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Unable to Place Order");
		}
		return response;
	}
}
