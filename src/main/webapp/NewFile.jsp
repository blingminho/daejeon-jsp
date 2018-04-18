<%@page import="user.model.UserVO"%>
<%@page import="user.service.UserServiceInf"%>
<%@page import="user.service.UserService"%>
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
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		UserServiceInf service = new UserService();
		
		UserVO userVO = new UserVO();
		userVO.setUserId(userId);
		userVO.setPassword(password);
		
		boolean result = service.loginProcess(userVO);
	%>	
	<%	if(result){ %>
		<h1>로그인 성공</h1>	
	<%	} else { %>
		<h1>로그인 실패</h1>	
	<%	}%>
	<%=userId %>
	<%=password %>
	
	<input type="text">
	<input type="password">
	
	
	
	
	
	
</body>
</html>