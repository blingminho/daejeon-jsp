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
	request.equals(pageContext.getRequest());
	application.equals(pageContext.getServletContext());
	session.equals(pageContext.getSession());
	response.equals(pageContext.getResponse());
	out.equals(pageContext.getOut());
%>

<!-- request -->
request.equals(pageContext.getRequest()) : <%=request.equals(pageContext.getRequest()) %><br>

<!-- application -->
application.equals(pageContext.getServletContext()) : <%=application.equals(pageContext.getServletContext()) %><br>

<!-- session -->
session.equals(pageContext.getSession()) : <%=session.equals(pageContext.getSession()) %><br>

<!-- response -->
response.equals(pageContext.getResponse()) : <%=response.equals(pageContext.getResponse()) %><br>

<!-- out -->
out.equals(pageContext.getOut()) : <%=out.equals(pageContext.getOut()) %><br>

</body>
</html>