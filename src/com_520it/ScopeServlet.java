package com_520it;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//演示servlet的三大作用域
@WebServlet("/poc")
public class ScopeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
		protected void service(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			//session作用域
			Integer a=(Integer)req.getSession().getAttribute("name");
		if(a==null) {
			req.getSession().setAttribute("name", 1);
		}else {
			req.getSession().setAttribute("name", a+1);
		}
		//request作用域
		Integer b=(Integer)req.getAttribute("name");
		if(b==null) {
			req.setAttribute("name", 1);
		}else {
			req.setAttribute("name", a+1);
		}
		//application作用域
				Integer d=(Integer)req.getServletContext().getAttribute("name");
				if(d==null) {
					req.getServletContext().setAttribute("name",1);
				}else {
					req.getServletContext().setAttribute("name", a+1);
				}
		
		
		//请求转发
		req.getRequestDispatcher("/ruselt").forward(req, resp);;
		System.out.println("nihao");
		}
}
