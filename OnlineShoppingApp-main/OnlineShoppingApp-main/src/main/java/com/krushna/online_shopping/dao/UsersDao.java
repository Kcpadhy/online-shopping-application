package com.krushna.online_shopping.dao;

import com.krushna.online_shopping.entity.UsersEntity;

public interface UsersDao {
	public int saveUser(UsersEntity entity);
	public UsersEntity verifyUser(String email, String password);
	public boolean isDuplicateUser(String phone);
}
