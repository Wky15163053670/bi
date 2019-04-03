package com.bi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bi.pojo.User;
import com.bi.pojo.login.Login;

public interface LoginMapper {
	//打印数据
	@Select("select * from login")
	public List<User> list();
	
	@Select("select * from login where user_id = #{user_id}")
	public Login selectUserId(@Param("user_id")String user_id);
	
}
