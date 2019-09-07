package com.shop.service.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.shop.mapper.Shopmapper;
import com.shop.model.classinfo;
import com.shop.service.Shopservice;

import model.userinfo;


@Service
public class ShopserviceImp implements Shopservice{

	@Resource
	private Shopmapper shopmapper;
	
	@Override
	public void getUserinfo(HttpServletRequest req,HttpServletResponse res) {
		// TODO Auto-generated method stub
		System.out.println("7777");
		String name = req.getParameter("name");
		 ArrayList<userinfo> users=shopmapper.CheckUserInfo();
		 
		System.out.println(users.get(0).getUsername());
	}

	
	public Map<String, Object> getvalue(HttpServletRequest req, HttpServletResponse res) {
		Map<String, Object> d = new HashMap<String, Object>();
		ArrayList<classinfo> c = shopmapper.getvalue();
		d.put("count", 10);
		d.put("row", c);
		return d;
	}

}
