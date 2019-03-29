package com.bi.mapper;

import java.util.List;

import com.bi.pojo.User;
import com.bi.pojo.login.Login;

public interface LoginMapper {
	//打印数据
	public List<User> list();
	
	public Login selectUserId(String user_id);
	
}
