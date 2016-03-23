package com.sinky;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestAction {

	
	   @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
	   
	   
	   @RequestMapping("/index")
	   public ModelAndView index()
	   {
		   return new ModelAndView("index");
	   }
}
