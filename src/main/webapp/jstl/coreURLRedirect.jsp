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
	<h2>start coreURLRedirect.jsp</h2>
	<c:redirect url="coreURL_target.jsp">
		<c:param name="userId" value="brown"></c:param>
	</c:redirect>
	<h2>end coreURLRedirect.jsp</h2>
</body>
</html>