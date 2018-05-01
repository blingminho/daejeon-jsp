<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	fmtNumber.jsp<br>
	price : ${price }<br>
	
	<h2>korea</h2>
	<fmt:setLocale value="ko_KR"/>
	formatNumber(number) : <fmt:formatNumber value="${price }" type="number"/><br>
	formatNumber(currency) : <fmt:formatNumber value="${price }" type="currency"/><br>
	formatNumber(percent) : <fmt:formatNumber value="${price }" type="percent"/><br>
	formatNumber(percent) : <fmt:formatNumber value="1" type="percent"/><br>
	
	<hr>
	<h2>germany</h2>
	<fmt:setLocale value="de_DE"/>
	formatNumber(number) : <fmt:formatNumber value="${price }" type="number" var="priceDE"/><br>
	formatNumber(currency) : <fmt:formatNumber value="${price }" type="currency"/><br>
	formatNumber(percent) : <fmt:formatNumber value="${price }" type="percent"/><br>
	formatNumber(percent) : <fmt:formatNumber value="1" type="percent"/><br>
	
	priceDE : ${priceDE }
	<hr>
	
	<fmt:setLocale value="ko_KR"/>
	<h2>fmt parseNumber</h2>
	stringNumber : ${stringNumber }<br>
	fmt:parseNumber : <fmt:parseNumber value="${stringNumber}"/><br>
	
</body>
</html>