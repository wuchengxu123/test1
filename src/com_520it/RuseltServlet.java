package com_520it;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ruselt")
public class RuseltServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter b= resp.getWriter();
			Integer a=(Integer)req.getSession().getAttribute("name");
			Integer c=(Integer)req.getAttribute("name");
			Integer d=(Integer)req.getServletContext().getAttribute("name");
			b.println("request="+c+"<br>");
			b.print("session="+a+"<br>");
			b.print("context="+d);
		}

}