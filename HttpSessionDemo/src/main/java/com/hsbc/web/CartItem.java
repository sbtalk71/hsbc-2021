package com.hsbc.web;

public class CartItem {
	private String price;
	private String itemName;

	public CartItem() {
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		
		return itemName+" : "+price;
	}
}
