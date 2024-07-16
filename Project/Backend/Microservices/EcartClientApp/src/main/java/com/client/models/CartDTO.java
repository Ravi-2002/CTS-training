package com.client.models;

import java.util.List;

public class CartDTO {

	private List<Cart> list;

	public List<Cart> getList() {
		return list;
	}

	public void setList(List<Cart> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CartDTO [list=" + list + "]";
	}
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
