<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String lineRangers = "brown,sally,cony,moon,james,jesica";
	request.setAttribute("lineRangers", lineRangers);
%>

<c:forTokens items="${lineRangers }" delims="," var="ranger">
	${ranger }<br>
</c:forTokens>


</body>
</html>