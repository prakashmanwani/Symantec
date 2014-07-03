package com.symantec.dao;

import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

public interface UserDao {
	public void addUser(UserDetail usd);
	public void addHealth(Health hsrc);

}
