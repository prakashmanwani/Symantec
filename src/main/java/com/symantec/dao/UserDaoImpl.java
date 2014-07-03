package com.symantec.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void addUser(UserDetail usd) {
	    getHibernateTemplate().save(usd);
	}
	public void addHealth(Health hsrc){
		getHibernateTemplate().save(hsrc);
	}

}
