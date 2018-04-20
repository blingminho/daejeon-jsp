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
<span>1.스클립틀릿 + html코드 + 표현식</span>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>별명</th>
		</tr>
		<%
			List<StudentVO> studentList = (List<StudentVO>) request.getAttribute("studentList");
			for (StudentVO studentVO : studentList) {
		%>
		<tr>
			<td><%=studentVO.getStud_no()%></td>
			<td><%=studentVO.getStud_name()%></td>
			<td><%=studentVO.getStud_alias()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<span>2.스클립틀릿 안에서 out 객체</span>
	<%
		StringBuilder tmp = new StringBuilder();
		
		tmp.append("<table border='1'>");
		tmp.append("<tr>");
		tmp.append("<th>학생번호</th>");
		tmp.append("<th>학생이름</th>");
		tmp.append("<th>학생별명</th>");
		tmp.append("</tr>");
		
		for (StudentVO studentVO : studentList) {
			tmp.append("<tr>");
			
			tmp.append("<td>" + studentVO.getStud_no() + "</td>");
			tmp.append("<td>" + studentVO.getStud_name() + "</td>");
			tmp.append("<td>" + studentVO.getStud_alias() + "</td>");
	
			tmp.append("</tr>");
		}
		tmp.append("</table>");
		
		out.print(tmp.toString());
	%>
	
</body>
</html>