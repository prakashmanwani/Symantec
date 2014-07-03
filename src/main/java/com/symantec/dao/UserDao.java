package com.symantec.dao;

import java.util.List;

import com.symantec.entity.UserDetail;

public interface UserDao {
	public void addUser(UserDetail usd);
	public List<UserDetail> getListOfAllUser();

}
