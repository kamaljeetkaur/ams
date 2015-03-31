package com.research.test.businessservice;

import java.util.List;

import com.research.test.entity.User;

public interface UserBusinessService {
	
	void saveUser(User user);
	List<User> fetchUsers();
	public boolean userExist(User user);

}
