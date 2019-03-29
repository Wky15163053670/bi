package com.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bi.pojo.User;
import com.bi.service.UserService;
import com.bi.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("")
public class UserController {

	@Autowired
	UserService userService;
	
	//为该对象设置路径
	@RequestMapping("listUser")
	public ModelAndView listUser(Page page) {
		//新建一个ModelAndView对象，为其传入参数
		ModelAndView mav = new ModelAndView();
		//创建分页对象
		PageHelper.offsetPage(page.getStart(),10);
		page.setCount(10);
		//获取service数据集
		List<User> userList = userService.list();
		//对数据集进行操作，获取总页数
		int total= (int) new PageInfo<>(userList).getTotal();
		page.caculateLast(total);
		//放入参数
		mav.addObject("userList",userList);
		//将该数据要显示的jsp文件路径
		mav.setViewName("userList");
		//返回ModelAndView参数
		return mav;
	}
	

	
	
}
