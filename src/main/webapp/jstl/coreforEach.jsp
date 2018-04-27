<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="student.model.StudentVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}
td, th {
	border: 1px solid black;
}
</style>
</head>
<body>
<!-- List<StudentVO>객체 임의 생성 -->
<%
	List<StudentVO> studentList = new ArrayList<StudentVO>();
	
	studentList.add(new StudentVO("1", "brown"));
	studentList.add(new StudentVO("2", "sally"));
	studentList.add(new StudentVO("3", "cony"));
	studentList.add(new StudentVO("4", "moon"));
	studentList.add(new StudentVO("5", "james"));
	
	request.setAttribute("studentList", studentList);
%>

<h1>c:forEach를 통해 화면에 출력</h1>
<table>
	<tr>
		<th>index</th>
		<th>번호</th>
		<th>이름</th>
	</tr>
<c:forEach items="${studentList}" var="studentVo" varStatus="loopStatus">
	<tr>
		<td>${loopStatus.index }</td>
		<td>${studentVo.stud_no }</td>
		<td>${studentVo.stud_name }</td>
	</tr>
</c:forEach>
</table>

<br><hr><br>

<c:forEach begin="1" end="10" var="i">
	${i }<br>
</c:forEach>

<br><hr><br>

<c:forEach begin="1" end="10" var="i" step="3">
	${i }<br>
</c:forEach>

<br><hr><br>

<h2>forEach map</h2>
<%
	Map<String, String> map = new HashMap<String, String>();
	map.put("no", "1");
	map.put("name", "brown");
	map.put("home", "대전시");
	
	request.setAttribute("map", map);
%>

<c:forEach items="${map }" var="m">
	${m.key } / ${m.value } <br>
</c:forEach>



</body>
</html>