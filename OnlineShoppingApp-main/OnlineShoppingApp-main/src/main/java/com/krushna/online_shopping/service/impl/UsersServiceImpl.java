package com.krushna.online_shopping.service.impl;

import com.krushna.online_shopping.dao.UsersDao;
import com.krushna.online_shopping.entity.UsersEntity;
import com.krushna.online_shopping.service.UsersService;
import com.krushna.online_shopping.utility.Application;

public class UsersServiceImpl implements UsersService{
	public int register(UsersEntity entity) {
		UsersDao dao = Application.getUsersDao();
		return(dao.saveUser(entity));
	}
	
	public UsersEntity login(String phone, String password) {
		UsersDao dao = Application.getUsersDao();
		UsersEntity user = dao.verifyUser(phone, password);
		return user;
	}
	
	public boolean isDuplicateUser(String phone) {
		UsersDao dao = Application.getUsersDao();
		if(dao.isDuplicateUser(phone)) {
			return true;
		}
		return false;
	}
}
