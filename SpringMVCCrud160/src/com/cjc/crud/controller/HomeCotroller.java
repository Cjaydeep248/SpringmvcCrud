package com.cjc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.model.Student;
import com.cjc.crud.service.HomeService;

@Controller
public class HomeCotroller 
{

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "registration";
	}
	
	
	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s)
		{
			System.out.println(s.getName());
			
			hs.saveData(s);
		
		return "login";
		}

	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname") String un,@RequestParam("password") String ps)
	{
		//int i=hs.logincheck(un,ps);
		
		
		return "success";
	}
	
	
	
	
}
	
	
	

