<%@page import="java.util.function.ToLongBiFunction"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=new Date().toLocaleString()%>
<br>
<%
	String name="will";
	int 	age=18;
%>
<%=name %>
<br>
<%=age %>
<%!
private String name="武汉";
public void Dowork(){};
%>
</body>
</html>