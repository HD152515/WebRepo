<!-- 1. Directive tag(지시자) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>first JSP</title>
</head>
<body>
<%-- 2.Comment tag(JSP 주석) --%>

<%-- 3.Declaration tag(선언부) --%>
<%! private static final String DEFAULT_NAME = "Guest"; %>


<%-- 4.Scriptlet tag(스크립틀릿) --%>
<%
	// java 코드를 그대로 작성
	
	String name = request.getParameter("name");
	if(name == null) name = DEFAULT_NAME;
	//out.println("<h1>Hello, " + name + "</>h1");
%>

<%-- 5.Expression tag(표현식) --%>
<h1>Hello, <%=name %></h1>


</body>
</html>