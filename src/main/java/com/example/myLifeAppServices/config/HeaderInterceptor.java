package com.example.myLifeAppServices.config;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HeaderInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception 
	{
		response.addHeader("START_TIME", System.currentTimeMillis() + "");
		return true;
		
	}
}
