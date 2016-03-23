package com.sinky.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sinky.entity.UserDto;
import com.sinky.service.UserService;

@Controller
@RequestMapping("/admin") 
public class AdminAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/listUser")
	public ModelAndView info()
	{
		List<UserDto> list = userService.getAllUser();
	    ModelAndView mv = new ModelAndView("admin/listUser");
	    mv.addObject("listUser", list);
		return mv;
	}
}
