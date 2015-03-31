package com.research.test.dataservice;

import java.util.List;

import com.research.test.entity.User;

public interface UserDao {

	public void save(User user);
	public List<User> list();
	public boolean userExist(User user);

}
