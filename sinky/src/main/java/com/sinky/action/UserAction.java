package com.sinky.action;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sinky.entity.UserDto;

@Controller
@RequestMapping("/user") 
public class UserAction {

	@RequestMapping("/info")
	public ModelAndView info(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("user/info");
        UserDto currentUser = (UserDto)request.getSession().getAttribute("user");  
        System.out.println("当前登录的用户为[" + currentUser.getP_name() + "]");  
        request.setAttribute("currUser", currentUser);  
		return mv;
	}
}
