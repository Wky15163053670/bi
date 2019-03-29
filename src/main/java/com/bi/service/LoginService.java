package com.bi.service;

import com.bi.pojo.login.Login;

public interface LoginService {

	Login selectUserId(String user_id);
	
}
