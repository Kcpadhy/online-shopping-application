package com.krushna.online_shopping.dao;

import java.util.ArrayList;

import com.krushna.online_shopping.entity.CartEntity;

public interface CartDao {
	public int addCartProduct(CartEntity entity);
	public CartEntity getCartProduct(int userId, int productId);
	public ArrayList<CartEntity> getAllActiveCartProductsById(int id);
	public ArrayList<CartEntity> getAllActiveCartProducts();
	public int deleteCartProduct(int id);
	public int updateCartProduct(CartEntity entity);
}
