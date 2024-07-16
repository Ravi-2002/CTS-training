package com.order.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems")
public class OrderItem {
	@Id
	@GeneratedValue
	private int orderItemId;
	private int orderId;
	private int productid;
	private String productName;
	private int productPrice;
	private int quantity;
	private int subTotal;

	@Override
	public String toString() {
		return "OrderItem [id=" + orderItemId + ", orderId=" + orderId + ", productid=" + productid + ", productName="
				+ productName + ", productPrice=" + productPrice + ", quantity=" + quantity + ", subTotal=" + subTotal
				+ "]";
	}

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
}
