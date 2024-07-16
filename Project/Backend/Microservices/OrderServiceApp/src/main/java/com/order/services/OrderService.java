package com.order.services;

import org.springframework.stereotype.Service;

import com.order.dao.OrderItemDao;
import com.order.dao.OrdersDao;
import com.order.models.Order;
import com.order.models.OrderItem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
	
	@Autowired
	private OrdersDao dao;
	
	@Autowired
	private OrderItemDao otdao;
	
	public List<Order> getAll(){
		return dao.findAll();
	}
	
	public boolean add(Order order) {
	List<OrderItem>	items=order.getOrderItems();
			otdao.saveAll(items);
		Order order1=dao.save(order);
		if(order1!=null)
		  return true;
		else
		  return false;
	}
	
	public boolean addOrderItems(Order order) {
		List<Order> list=dao.findAll();
		int n=list.size()-1;
		int id=list.get(n).getOrderId();
		List<OrderItem> items=order.getOrderItems();
		for(OrderItem o:items) {
			o.setOrderId(id);
		      OrderItem item = otdao.save(o);
			if(item!=null)
			{
				return true;
			}
		}
		return false;
		}
}
