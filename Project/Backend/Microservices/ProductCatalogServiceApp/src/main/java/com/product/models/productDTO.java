package com.product.models;

import java.util.List;

public class productDTO {

	private List<Product> list;

	@Override
	public String toString() {
		return "productDTO [list=" + list + "]";
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
}
