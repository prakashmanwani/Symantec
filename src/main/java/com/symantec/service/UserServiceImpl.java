package com.symantec.service;

import org.springframework.stereotype.Service;

import com.symantec.dao.HealthDao;
import com.symantec.dao.UserDao;
import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

@Service
public class UserServiceImpl implements UserService{
	private UserDao usd;
	private HealthDao hd;
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
	

	/**
	 * @return the hd
	 */
	public HealthDao getHd() {
		return hd;
	}

	/**
	 * @param hd the hd to set
	 */
	public void setHd(HealthDao hd) {
		this.hd = hd;
	}
	
	public int getUserIdByEmail(String email){
		return usd.getUserByEmail(email);
	}
	
	public void healthInfo(UserDetail usr, Health hsrc) {
		usd.addUser(usr);
		hd.addHealth(hsrc);
	}
	
}
