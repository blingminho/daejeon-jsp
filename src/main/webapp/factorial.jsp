<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!public int factorial(int number) {
		if(number == 0)
			return 0;
		int result = 1;
		for(int i = number; i > 0; i-- ) {
			result *= i;
		}
		return result;
	}%>
	
	factorial(0) : <%=factorial(0) %><br>
	factorial(1) : <%=factorial(1) %><br>
	factorial(2) : <%=factorial(2) %><br>
	factorial(3) : <%=factorial(3) %><br>
	factorial(4) : <%=factorial(4) %><br>
	factorial(5) : <%=factorial(5) %><br>
</body>
</html>