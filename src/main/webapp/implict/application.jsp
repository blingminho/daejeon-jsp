<%@page import="java.util.Enumeration"%>
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
	application.getContextPath();
	application.getServletContextName();
	application.getServerInfo();
	application.getMajorVersion();
	application.getMinorVersion();
	
	application.setAttribute("userId", "JSP_APPLICATION");
	String admin = application.getInitParameter("ADMIN");
	String adminSub = application.getInitParameter("ADMINSUB");
	
	Enumeration<String> enums = application.getInitParameterNames();
	
	while(enums.hasMoreElements()){
		String paramName = enums.nextElement();
		out.write("paramName : " + paramName + "<br>");
	}
	
%>
application.getContextPath() : <%=application.getContextPath() %><br>
application.getServletContextName() : <%=application.getServletContextName() %><br>
application.getServerInfo() : <%=application.getServerInfo() %><br>
application.getMajorVersion() : <%=application.getMajorVersion() %><br>
application.getMinorVersion() : <%=application.getMinorVersion() %><br>

admin : <%=admin %><br>
adminSub : <%=adminSub %><br>


</body>
</html>