package com.symantec.service;

import org.springframework.stereotype.Service;

import com.symantec.dao.UserDao;
import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

@Service
public class UserServiceImpl implements UserService{
	private UserDao usd;
	
	/**
	 * @return the usd
	 */
	public UserDao getUsd() {
		return usd;
	}

	/**
	 * @param usd the usd to set
	 */
	public void setUsd(UserDao usd) {
		this.usd = usd;
	}

	public void healthInfo(UserDetail usr, Health hsrc) {
		usd.addUser(usr);
		usd.addHealth(hsrc);	
	}
	
}
