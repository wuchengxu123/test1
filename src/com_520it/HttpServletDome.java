package com_520it;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//获取请求的方式
		System.out.println(req.getMethod());
		//获取请求的资源名称
		System.out.println(req.getRequestURI());
		//获取url
		System.out.println(req.getRequestURL());
		//返回当前项目的上下文路径
		System.out.println(req.getContextPath());
		//获取访问的ip地址
		System.out.println(req.getRemoteAddr());
		//获取请求头
		System.out.println(req.getHeader("User-Agent"));
		//获取指定参数的名字
		System.out.println(req.getParameter("age"));
	}

			

}
