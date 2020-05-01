package com_520it;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rew")
public class HttpServletResponseDome extends HttpServlet{

	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			//设置响应的编码格式
			resp.setCharacterEncoding("UTF-8");
			//设置mime类型
			resp.setContentType("text/html");
			PrintWriter out =resp.getWriter();
		       out.print("武汉");
		
	}
	

}
