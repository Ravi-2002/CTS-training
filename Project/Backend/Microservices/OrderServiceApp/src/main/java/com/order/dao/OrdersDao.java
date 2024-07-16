package com.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.models.Order;

@Repository
public interface OrdersDao  extends JpaRepository<Order, Integer>{

//	public boolean add(Order order);
//	public List<Order> getAll();

}
