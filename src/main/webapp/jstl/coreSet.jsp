<%@page import="student.model.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--
	localhost:8070/jsp/jstl/coreSet.jsp
	var : 변수명
	4가지 영역중 범위가 작은 영역에서 큰영역으로 순차적 검사후 자동으로 검사된값을 출력함

-->
<c:set var="userId" value="brown" scope="session"/>
userId : ${userId}<!-- var --><br>
page : <%=pageContext.getAttribute("userId") %><br>
request : <%=request.getAttribute("userId") %><br>
session : <%=session.getAttribute("userId") %><br>
application : <%=application.getAttribute("userId") %><br>
<br>
<hr>
<br>


<%
	StudentVO studentVO = new StudentVO();
	studentVO.setStud_no("1");
	studentVO.setStud_name("brown");
	studentVO.setStud_alias("bear");
	
	request.setAttribute("brownStudentVo", studentVO);
%>

before : ${brownStudentVo}<br><!-- 변경전 값 -->
<c:set target="${brownStudentVo}" property="stud_name" value="sally"/><br><!-- 값을 변경하는 절차 -->
after : ${brownStudentVo}<br><!-- 변경후 값 -->
<c:remove var="brownStudentVo"/><br>
remove : ${brownStudentVo}<br><!-- 삭제후 값 -->

</body>
</html>