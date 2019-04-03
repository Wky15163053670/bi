package com.bi.service;

import com.bi.pojo.login.Login;

public interface LoginService {
	
	int selectUserId(Login login,String ip);

	
}
