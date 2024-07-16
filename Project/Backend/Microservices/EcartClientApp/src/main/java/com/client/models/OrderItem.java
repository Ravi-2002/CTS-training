package com.client.models;

public class OrderItem {
	private int id;
	private int orderId;
	private int productid;
	private String productName;
	private int productPrice;
	private int quantity;
	private int subTotal;
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", productid=" + productid + ", productName="
				+ productName + ", productPrice=" + productPrice + ", quantity=" + quantity + ", subTotal=" + subTotal
				+ "]";
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
