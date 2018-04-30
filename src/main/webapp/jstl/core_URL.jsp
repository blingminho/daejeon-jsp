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
url : <c:url value="coreSet.jsp" var="url"/>${url}<br>

url : <c:url value="coreSet.jsp" var="url">
	<c:param name="userId" value="brown"/>
</c:url>
${url }<br>
</body>
</html>