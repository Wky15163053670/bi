package com.bi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bi.mapper.CategoryMapper;
import com.bi.mapper.UserMapper;
import com.bi.pojo.Category;
import com.bi.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;

//	@Autowired
//	private CategoryMapper categoryMapper;

//	@Test
//	public void testList() {
//		List<Category> cs = categoryMapper.list();
//		System.out.println(cs.getClass());
//		for (Category c : cs) {
//			System.out.println(c.getId());
//		}
//
//	}

	
	 @Test 
	 public void testLists() {
		List<User> ul = userMapper.list();
		for(User u : ul) {
			System.out.println(u.toString());
		}
		 
	 }
	 
}
