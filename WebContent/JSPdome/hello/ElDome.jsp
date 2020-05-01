<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	pageContext.setAttribute("msg1", "pagecontextvalue");
	request.setAttribute("msg1", "requestvalue");
	session.setAttribute("msg1", "sessionvalue");
	application.setAttribute("msg", "applicationvalue");
%>
${msg}
;
</body>
</html>