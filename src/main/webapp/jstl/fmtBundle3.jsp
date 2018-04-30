<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="/include/jquery.jsp" %>
<%
	String language = request.getParameter("language");
	if(language == null)
		language = "ko";
	
	request.setAttribute("language", language);
%>
<script type="text/javascript">
$(function(){
	$('select').on('change', function(){
		$('form').submit();
	})
	
	$("select option[value=${language }]").prop("selected", true);
	
})
</script>
</head>
<body>
language parameter : ${language }<br>
<!--
1.locale 설정
2.bundle 설정
3.message 이용
-->
<fmt:setLocale value="${language }"/>
<fmt:bundle basename="resource.message">
	<fmt:message key="GREETING"/>
</fmt:bundle>
<br>
<form action="fmtBundle3.jsp">
	<select name="language">
		<option value="ko">한국어</option>
		<option value="ja">일어</option>
		<option value="en">영어</option>
	</select>
	<!-- 
	<input type="submit" value="언어변경">
	 -->
</form>

</body>
</html>