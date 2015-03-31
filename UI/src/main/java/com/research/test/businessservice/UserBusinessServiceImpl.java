package com.research.test.businessservice;

import java.util.List;

import com.research.test.dataservice.UserDao;
import com.research.test.entity.User;

public class UserBusinessServiceImpl implements UserBusinessService{
	
	private UserDao userDao;

	public void saveUser(User user) {
		System.out.println("save in dblayer");
		userDao.save(user);
	}

	public List<User> fetchUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean userExist(User user) {
		return userDao.userExist(user);
	}

}
