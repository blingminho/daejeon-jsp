<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sumInput</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/sumCalculation" method="get">
		start : <input type="text" name="start"><br>
		end : <input type="text" name="end"><br>
		<button type="submit">요청하기</button>
	</form>
</body>
</html>