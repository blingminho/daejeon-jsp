<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String language = request.getParameter("language");
	if(language == null)
		language = "ko";
	
	request.setAttribute("language", language);
	
	RequestDispatcher rd = request.getRequestDispatcher("fmtBundle.jsp");
	rd.forward(request, response);
%>