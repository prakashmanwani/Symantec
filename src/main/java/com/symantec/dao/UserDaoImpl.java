package com.symantec.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	
	public void addUser(UserDetail usd) {
	    this.sessionFactory.getCurrentSession().save(usd);
		
	}
	
	public void addHealth(Health hsrc){
		this.sessionFactory.getCurrentSession().save(hsrc);
	}

}
