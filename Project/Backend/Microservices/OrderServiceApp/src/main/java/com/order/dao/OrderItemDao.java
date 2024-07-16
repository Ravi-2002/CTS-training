package com.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.models.OrderItem;
@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {

//	public boolean addItem(OrderItem item);
}
