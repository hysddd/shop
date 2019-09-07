package com.shop.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.model.classinfo;

public interface Shopservice {

	public void getUserinfo(HttpServletRequest req,HttpServletResponse res);

	public Map<String, Object> getvalue(HttpServletRequest req, HttpServletResponse res);
	
}


public users cheackRegistUser(HttpServletRequest request,HttpServletResponse res)
public users userinfo(HttpServletRequest req,HttpServletResponse res)