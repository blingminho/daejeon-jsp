<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<tags:logging/><br>

business logic<br>

<tags:logging/><br>
<tags:colorLogging color="blue"/><br>
<tags:colorLogging color="blue" length="1"/><br>

<h2>bodyColorLogging</h2>
<tags:bodyColorLogging color="blue">
	<c:forEach begin="1" end="10" var="i">
		<c:out value="${i}"></c:out>
	</c:forEach>
</tags:bodyColorLogging>


</body>
</html>