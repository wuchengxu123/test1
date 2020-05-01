package com_520it;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServleet implements javax.servlet.Servlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
	}

	public String getServletInfo() {
		return null;
	}

	public void destroy() {
		System.out.println("destroy");
		
	}


}
