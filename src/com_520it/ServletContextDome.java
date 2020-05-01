package com_520it;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//演示ServletContext接口中的方法
@WebServlet("/aaa")
public class ServletContextDome extends HttpServlet{
	private static final long serialVersionUID = 1L;
		protected void service(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			//获取ServletContext对象的三种方法
				//1.通过父类的的方法获取
			ServletContext a=super.getServletContext();
				//2.通过请求对象获取
			ServletContext b=req.getServletContext();
				//3.通过session获取
			ServletContext c=req.getSession().getServletContext();
			/* 
			 *常用方法
			 * */
			//获取真实路径
			System.out.println(a.getRealPath("/WebContent/login.html"));//E:\eclipse\webdemo\WebContent\WebContent\login.html
			//获取上下文路径 web.xml中context中path的值
			System.out.println(a.getContextPath());///pac
			//获取全局的初始化参数
			System.out.println(a.getInitParameter("encoding"));
		}

}
