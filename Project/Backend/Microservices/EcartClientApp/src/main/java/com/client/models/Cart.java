package com.client.models;

public class Cart {

	private int id;
	private int userid;
	private int productId;
	private String productname;
	private int productPrice;
	private int quantity;
	private int sumTotal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
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
	public int getSumTotal() {
		return sumTotal;
	}
	public void setSumTotal(int sumTotal) {
		this.sumTotal = sumTotal;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", userid=" + userid + ", productId=" + productId + ", productname=" + productname
				+ ", productPrice=" + productPrice + ", quantity=" + quantity + ", sumTotal=" + sumTotal + "]";
	}

}
