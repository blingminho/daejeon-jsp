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
	request.setAttribute("code", "06");
%>

<c:choose>
	<c:when test="${code == '01'}">
		code : ${code }<br>
	</c:when>
	<c:when test="${code == '02'}">
		code : ${code }<br>
	</c:when>
	<c:when test="${code == '03'}">
		code : ${code }<br>
	</c:when>
	<c:when test="${code == '04'}">
		code : ${code }<br>
	</c:when>
	<c:when test="${code == '05'}">
		code : ${code }<br>
	</c:when>
	
	<c:otherwise>code : 99<br></c:otherwise>
</c:choose>



</body>
</html>