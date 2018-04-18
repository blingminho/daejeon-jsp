<%@ page language="java" contentType="application/vnd.ms-excel; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Content-Disposition", "attachment; filename=line.xls");
		response.setContentType("application/vnd.ms-excel");
	%>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>별명</th>
		</tr>
		<tr>
			<td>1</td>
			<td>brown</td>
			<td>브라운</td>
		</tr>
		<tr>
			<td>2</td>
			<td>sally</td>
			<td>샐리</td>
		</tr>
	</table>
</body>
</html>