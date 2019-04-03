package com.bi.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bi.mapper.LoginMapper;
import com.bi.pojo.login.Login;
import com.bi.service.LoginService;
import com.bi.service.UserService;
import com.bi.service.impl.LoginServiceImpl;
import com.bi.util.GetIp;

@Controller
@RequestMapping()
public class login {

	@Autowired
	UserService userService;
	@Autowired
	LoginService loginService;
	
	//跳转login
	@RequestMapping(value="login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		//controller跳转jsp
		mav.setViewName("/login/Login");
		return mav;
	}
	
	//由jsp返回controller层数据，然后进行判断是否登录
	@RequestMapping(value="/submitLogin",method=RequestMethod.POST)
	public String submitLogin(Login request_login,HttpServletRequest request) {
		
		//获取IP地址哦
		String ip = new GetIp().getIp(request);
		int return_result = loginService.selectUserId(request_login, ip);
		System.out.println(return_result);
		if(return_result == 3) {
			//判断该账号不存在
			if(return_result == 2){
				//判断该账号密码错误
				if(return_result == 1) {
					//判断密码是否正确
					return "redirect:/listUser";
				}
				else return "/login/Login";
			}
			else return "/login/Login";
		}
		else return "/login/Login";
	}
}
