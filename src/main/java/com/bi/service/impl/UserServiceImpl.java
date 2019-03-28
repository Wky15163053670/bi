package com.bi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.mapper.LoginMapper;
import com.bi.mapper.UserMapper;
import com.bi.pojo.User;
import com.bi.pojo.login.Login;
import com.bi.service.UserService;


////判定该类为service
@Service
public class UserServiceImpl implements UserService {
	
	////创建mapper类映射对象
	@Autowired
	UserMapper userMapper;
	
	
	public List<User> list() {
		// TODO Auto-generated method stub
		//调用该mapper类映射的对象的list放法
		return userMapper.list();
	}

	
}
