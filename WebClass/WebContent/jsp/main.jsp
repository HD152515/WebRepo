<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ page import = "org.dimigo.vo.UserVo" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blog</title>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>
<link rel = "stylesheet" href = "../css/main.css">
</head>
<body>
<div class = "navbar">
<h5><a href = "main.html">HOME</a></h5>
<ul>
<li class= "introduce">
<a class = "label" href = "introduce.jsp">Introduce</a></li>
<li class= "interest">
<a class = "label" href = "interest.jsp">Interest</a></li>
<li class= "dream">
<a class = "label" href = "dream.jsp">Dream</a></li>
    <%
       UserVo user = (UserVo) session.getAttribute("user");
       if (user == null) {
    %>
<li class= "login">
<a class = "label" href = "login.jsp">Login</a></li>
<li class= "register">
<a class = "label" href = "register.jsp1">Register</a></li>
	<% } else { %>

<li class= "login">
<a class = "label"><%= user.getName() + "님" %></a>
<li class= "register">
<form action="/WebClass/bloglogout" method="post">
<button type="submit" class = "label">Logout</button></li>
</form>
<%
       }
%>
</ul>
          
</div>
<div>
<img src = "../image/main.png" alt = "main image">
</div>
</body>
</html>