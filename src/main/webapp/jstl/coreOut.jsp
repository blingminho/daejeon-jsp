<%@page import="java.io.FileReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("userId", "brown");
%>

userId : ${userId }<br>
cout : <c:out value="${userId}" default="admin" escapeXml="false"></c:out>

<br><br>
<hr>

<%
	FileReader fr = new FileReader(getServletContext().getRealPath("jstl/coreIf.jsp"));
	request.setAttribute("fr", fr);
%>

coreIf.jsp : <c:out value="${fr }"></c:out>

</body>
</html>