<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('select').on('change', function(){
		alert($(this).val('language'));
		$('form').submit();
	})
})
</script>
</head>
<body>
<c:set var="userId" value="brown" scope="session"/>
userId : ${userId }
<br>
<hr>
<%
	String lang = request.getParameter("language");
	if(lang == null)
		lang = "ko";
%>
<form action="<%=request.getContextPath()%>/jstl/fmtBundle2.jsp">
	<select name="language">
		<option value="ko" <%if(lang.equals("ko")) out.print("selected");%>>한국어</option>
		<option value="ja" <%if(lang.equals("ja")) out.print("selected");%>>일어</option>
		<option value="en" <%if(lang.equals("en")) out.print("selected");%>>영어</option>
	</select>
</form>
<span hidden="true">${language }</span>
<hr>

<fmt:setLocale value="${language }"/>
<fmt:bundle basename="resource.message">
	<fmt:message key="GREETING"/><br>
	<fmt:message key="USERLOGIN">
		<fmt:param value="${userId }"/>
		<fmt:param value="123"/>
	</fmt:message><br>
</fmt:bundle>
<fmt:setBundle basename="resource.message" var="message"/>
<fmt:message bundle="${message }" key="GREETING"/>
<hr>
</body>
</html>