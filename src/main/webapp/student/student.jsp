<%@page import="student.model.StudentVO"%>
<%@page import="java.util.List"%>
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
	List<StudentVO> studentList = (List<StudentVO>)request.getAttribute("studentList");
	for (StudentVO studentVO : studentList) {
%>
	<h4><%=studentVO.toString() %></h4>

<%}%>

</body>
</html>