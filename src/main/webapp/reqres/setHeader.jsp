<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Pragma", "no-cache");//http 1.0 cache 설정
	response.setHeader("Cache-Control", "no-cache");//fire-fox를 제외한 브라우저
	response.addHeader("Cache-Control", "no-store");//fire-fox 브라우저
	response.setDateHeader("Expires", 1L);//만료일자
	
%>
</body>
</html>