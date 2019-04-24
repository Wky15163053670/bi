package com.bi.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bi.pojo.login.Login;
import com.bi.service.LoginService;
import com.bi.service.UserService;
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
	public String submitLogin(Login request_login,HttpServletRequest request,HttpSession session) {
		//创建model对象
		ModelAndView mv = new ModelAndView();
		//获取IP地址哦
		String ip = new GetIp().getIp(request);
		System.out.println(request_login);
		session.setAttribute("user", request_login);
		
		int return_result = loginService.selectUserId(request_login, ip);
		if(return_result == 3) {
			//判断该账号不存在
			mv.addObject(return_result);
			return "/login/Login";
		}
		else if(return_result == 2){
			//判断该账号密码错误
			mv.addObject(request_login);
			return "/login/Login";
		}
		else if(return_result == 1) {
			//判断密码是否正确
			return "redirect:/listUser";
		}
		else return "/login/Login";
	}
}
