package com.javadevmap.basic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/SpringBoot")
public class BasicController {
//	@Autowired
//	private IocAnimal iocFish;
//	
//	@Autowired
//	@Qualifier("iocTiger")
//	private IocAnimal iocAnimal;
//	
//	@RequestMapping(value = "/tiger",method = RequestMethod.GET)
//	public IocAnimal getTiger() {
//		return iocAnimal;
//	}
//	
//	@RequestMapping(value = "/fish",method = RequestMethod.GET)
//	public IocAnimal getFish() {
//		return iocFish;
//	}
}
