package com.bi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bi.mapper.LoginMapper;
import com.bi.mapper.UserMapper;
import com.bi.pojo.User;
import com.bi.pojo.login.Login;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private LoginMapper loginMapper;
	
	
	 @Test 
	 public void testLists() {
		 
		Login login = loginMapper.selectUserId("root");
		 
		System.out.println(login.toString());
	 }
	 
}
