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

<h2>start coreURL.jsp</h2>
<c:import url="coreURL_target.jsp">
	<c:param name="userId" value="brown"/>
</c:import>
<h2>end coreURL.jsp</h2>

<h2>start naver search coreURL.jsp</h2>
	<c:import url="https://search.naver.com/search.naver?">
		<c:param name="query" value="라인 레인져스"></c:param>
	</c:import>
<h2>end naver search coreURL.jsp</h2>


</body>
</html>