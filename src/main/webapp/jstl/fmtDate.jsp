<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
fmtDate.jsp<br>
date : ${date }<br>

<h2>type 비교</h2>
<fmt:formatDate value="${date }" type="both" dateStyle="full"/><br>
<fmt:formatDate value="${date }" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${date }" type="time" dateStyle="full"/><br>
<hr>
<h2>dateStyle 비교</h2>
<fmt:formatDate value="${date }" type="both" dateStyle="full"/><br>
<fmt:formatDate value="${date }" type="both" dateStyle="medium"/><br>
<fmt:formatDate value="${date }" type="both" dateStyle="short"/><br>

<fmt:formatDate value="${date }" type="both" pattern="yyyy-MM-dd"/><br>
<hr>
<h2>parseDate</h2>
stringDate : ${stringDate }<br>
parseDate : <fmt:parseDate value="${stringDate }" pattern="yyyy-MM-dd HH:mm:ss"/>

<hr>
<h2>timeZoneArray</h2>
<fmt:setTimeZone value="Hongkong" var="timeZone"/>
timeZone : ${timeZone }<br>
timeZone date : ${timeZone }<br>
<br>
<c:forEach items="${timeZoneArray }" var="timeZoneStr">
	timeZoneStr : ${timeZoneStr }<br>
</c:forEach>
</body>
</html>