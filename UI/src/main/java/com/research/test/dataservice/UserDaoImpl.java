package com.research.test.dataservice;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.research.test.entity.User;

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;

	public void save(User user) {
		hibernateTemplate.save(user);
	}

	public List<User> list() {
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public boolean userExist(User user) {
		
		StringBuilder str = new StringBuilder("select user from User user where user.username = :username and user.password = :pwd ");
		Query query = hibernateTemplate.getSessionFactory().openSession().createQuery(str.toString());
		query.setParameter("username", user.getUsername());
		query.setParameter("pwd", user.getPassword());
		List<User> userList = query.list();
		if(!userList.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
