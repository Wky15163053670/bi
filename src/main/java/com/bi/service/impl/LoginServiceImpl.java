package com.bi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.mapper.LoginMapper;
import com.bi.pojo.login.Login;
@Service
public class LoginServiceImpl {

	@Autowired
	LoginMapper loginMapper;
	
	public Login selectUserId(String user_id) {
		// TODO Auto-generated method stub
		return loginMapper.selectUserId(user_id);
	}
	
}
