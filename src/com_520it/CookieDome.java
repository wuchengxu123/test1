package com_520it;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abc")
public class CookieDome extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		Cookie a=new Cookie("username", "789456");
		resp.addCookie(a);
		PrintWriter out= resp.getWriter();
		String name1=req.getParameter("uesrname");
		out.println("你好:"+name1+"<br>");
		out.println("<a href=\"/pac/listyouxiang?name="+name1+"\">我的邮件</a>");
		
	}
	

}
