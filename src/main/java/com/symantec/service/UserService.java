package com.symantec.service;

import com.symantec.entity.Health;
import com.symantec.entity.UserDetail;

public interface UserService {
	public void healthInfo(UserDetail usr, Health hsrc);
}
