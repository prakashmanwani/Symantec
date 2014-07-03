package com.symantec.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public int addUser(UserDetail usd) {
	    getHibernateTemplate().save(usd);
	    return getUserByEmail(usd.getEmail());
	}
	public List<UserDetail> getListOfAllUser(){
		return getHibernateTemplate().find("from UserDetail u");
	}
	
	public UserDetail getUser(int id){
		List<UserDetail> usrdtl = getHibernateTemplate().find("select u from UserDetail u where u.id=?",id);
		if(usrdtl != null && !usrdtl.isEmpty()){
			return usrdtl.get(0);
		}
		return null;
	}

	public int getUserByEmail(String email){
		List<UserDetail> usrdtl = getHibernateTemplate().find("select u from UserDetail u where u.email=?",email);
		if(usrdtl != null && !usrdtl.isEmpty()){
			return usrdtl.get(0).getId();
		}
		return 0;
	}
}
