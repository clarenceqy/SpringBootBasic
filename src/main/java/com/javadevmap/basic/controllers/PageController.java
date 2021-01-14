package com.javadevmap.basic.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.javadevmap.basic.models.User;
import com.javadevmap.basic.models.UserService;

@Controller
@RequestMapping(value = "/page")
public class PageController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "/welcome")
	public ModelAndView welcome(){
		ModelAndView modelAndView = new ModelAndView("welcome");
		return modelAndView;
	}
	@RequestMapping(value = "/createuser")
	public ModelAndView createUser() {
		ModelAndView modelAndview = new ModelAndView("createuser");
		modelAndview.addObject("user",new User());
		return modelAndview;
	}
	@RequestMapping(value = "/save")
	public ModelAndView save(@Valid User user,BindingResult result,Model model) {
		if(result != null && result.hasErrors()) {
			ModelAndView modelandview = new ModelAndView("createuser");
			modelandview.addObject(model);
			return modelandview;
		}else {
			userservice.add(user);
			List<User> list = userservice.getList();
			ModelAndView modelandview = new ModelAndView("save");
			modelandview.addObject("list",list);
			return modelandview;
		}
	}

}
