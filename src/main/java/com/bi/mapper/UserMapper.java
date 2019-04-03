package com.bi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bi.pojo.User;

public interface UserMapper {
	//打印数据
	@Select("select * from user_t")
	public List<User> list();
}
