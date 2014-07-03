package com.symantec.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.symantec.entity.Health;

public class HealthDaoImpl extends HibernateDaoSupport implements HealthDao{
	public void addHealth(Health hsrc){
		getHibernateTemplate().save(hsrc);
	}
}
