package com.client.models;

import java.sql.Date;
import java.util.List;

public class Order {
	private int orderId;
	private int userid;
	private String deliveryAddress;
	private Date orderDate;
	private String paymentMode;
	private int orderAmount;
	private List<OrderItem> orderItems;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userid=" + userid + ", deliveryAddress=" + deliveryAddress
				+ ", orderDate=" + orderDate + ", paymentMode=" + paymentMode + ", orderAmount=" + orderAmount
				+ ", orderItems=" + orderItems + "]";
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}
