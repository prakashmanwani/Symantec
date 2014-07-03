package com.symantec.dao;

import java.util.List;

import com.symantec.entity.UserDetail;

public interface UserDao {
	public int addUser(UserDetail usd);
	public List<UserDetail> getListOfAllUser();
	public int getUserByEmail(String email);
	public UserDetail getUser(int id);

}
