package com.bi.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bi.mapper.LoginMapper;
import com.bi.pojo.login.Login;
import com.bi.service.UserService;

@Controller
@RequestMapping()
public class login {

	@Autowired
	UserService userService;

	
	@Autowired
	private LoginMapper loginMapper;
	
	
	
	//跳转login
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		//controller跳转jsp
		mav.setViewName("/login/Login");
		return mav;
	}
	
	//由jsp返回controller层数据，然后进行判断是否登录
	@RequestMapping("/submitLogin")
	public String submitLogin(Login login) {
		//controller跳转controller
		Login loginService = loginMapper.selectUserId(login.getUser_id());
		
		if(login.getUser_id().equals(loginService.getUser_id())) {
			if(login.getPassword().equals(loginService.getPassword())) {
				return "redirect:/listUser";
			}
			return "/login/Login";
		}
		return "/login/Login";
	}
}
