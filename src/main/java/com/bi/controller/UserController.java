package com.bi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bi.pojo.User;
import com.bi.service.UserService;

@Controller
@RequestMapping("")
public class UserController {

	@Autowired
	UserService userService;
	
	//为该对象设置路径
	@RequestMapping("listUser")
	public ModelAndView listUser() {
		//新建一个ModelAndView对象，为其传入参数
		ModelAndView mav = new ModelAndView();
		//从service层获取数据当道List<User>中
		List<User> userList = userService.list();
		//放入参数
		mav.addObject(userList);
		//将该数据要显示的jsp文件路径
		mav.setViewName("userList");
		//返回ModelAndView参数
		return mav;
	}
	
	@RequestMapping("login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        	
		mav.setViewName("/login/Login");

        return mav;
    }  
	
	
	
}
