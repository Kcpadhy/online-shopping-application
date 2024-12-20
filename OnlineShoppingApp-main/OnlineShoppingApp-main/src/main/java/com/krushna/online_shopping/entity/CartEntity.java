package com.krushna.online_shopping.entity;

public class CartEntity {
	private int id = -1;
	private int userId;
	private int productId;
	private int quantity;
	private double totalPrice;
	
	@Override
	public String toString() {
		return "CartEntity [id=" + id + ", userId=" + userId + ", productId=" + productId + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
