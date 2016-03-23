package com.sinky.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sinky.service.UserService;
import com.sinky.service.imp.UserServiceImp;

@Controller
public class TestUserAction {

	
	
	   @Autowired
	   private UserService userService;
	
	   @RequestMapping("/home")
	    public ModelAndView home(@RequestParam(value="id", required=false, defaultValue="1") int id) {
		    ModelAndView mv = new ModelAndView("home");
		    mv.addObject("home", userService.getUser(id));
		    
		    //org.apache.shiro.spring.web.ShiroFilterFactoryBean
		    //org.apache.shiro.spring.web.ShiroFilterFactoryBean a;
		    
		    
		    
		   // org.springframework.jdbc.datasource.DriverManagerDataSource

	        return mv;
	    }
	   
}
