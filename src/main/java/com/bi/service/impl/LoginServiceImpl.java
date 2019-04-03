package com.bi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.mapper.LoginMapper;
import com.bi.pojo.login.Login;
import com.bi.service.LoginService;
@Service("LoginServiceImpl")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public int selectUserId(Login request_login, String ip) {
		if(loginMapper.selectUserId(request_login.getUser_id()) != null) {
			if(loginMapper.selectUserId(request_login.getUser_id()).getPassword().equals(request_login.getPassword())) {
				return 1;  //登录成功
			}
			else return 2;  //密码错误
		}
		else return 3;   //该账号不存在
	}
	
}
