package com_520it;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/req")
public class ZhuCeDome extends HttpServlet{

	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");//设置请求编码,只对post请求有效
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("sex"));
		System.out.println(Arrays.toString(req.getParameterValues("aihao")));
		System.out.println(req.getParameter("city"));
		System.out.println(req.getParameter("js"));
		
	}
	
	


}
