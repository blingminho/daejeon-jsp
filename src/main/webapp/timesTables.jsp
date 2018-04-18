<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String msg = "helloWorld"; %>
	<%=msg %>
	<%if(msg.equals("helloWorld")){ %>
		<h1>helloWorld</h1>
	<%} else { %>
		<h1> else</h1>
	<%} %>
	<h1>===================================</h1>
	<% for(int i = 0; i < 10; i++){ %>
		<h2><%=i %> 번째 자료</h2>
	<%} %>
	<h1>===================================</h1>
	
	<table border='1px'>
	<%for(int i = 1; i < 10; i++) { %>
		<tr>
	<%	for(int j = 2; j < 10; j++) { %>
			<td>
			<%=j %> * <%=i %> = <%=i*j %>
			</td>
	<%	} %>
		</tr>
	<%} %>
	</table>
	
	
	
	
</body>
</html>