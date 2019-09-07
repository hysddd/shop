package com.shop.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.shop.model.classinfo;
import com.shop.service.Shopservice;
//接口层
@Controller
@RequestMapping("/first")
public class shopController {
	
	@Resource
	private Shopservice shopservice;
	
	
	@RequestMapping("/getvalue")
	@ResponseBody  //把返回的参数转为json格式
	private Map<String, Object> shopping(HttpServletRequest req,HttpServletResponse res) {  
		Map<String, Object> a = shopservice.getvalue(req,res);
		return a;
	}
	
	@RequestMapping("/1")
	@ResponseBody  //把返回的参数转为json格式
	private String ToIndex(HttpServletRequest req,HttpServletResponse res) {  
		System.out.println("231");
		return "MyJsp";
	}
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	
	}
	
}
