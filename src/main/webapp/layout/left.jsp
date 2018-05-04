<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar">
		<!-- <li class="active"> -->
		<li><a href="${pageContext.request.contextPath }/getUserPageList">사용자 리스트(구현중)</a></li>
		<li><a href="${pageContext.request.contextPath }/studentList">학생 리스트</a></li>
		<li><a href="${pageContext.request.contextPath }/connection/lotto.jsp">lotto</a></li>
		<%-- 
		<%
			Cookie[] cookies = request.getCookies();
			/* 
			for(Cookie cookie : cookies) {
		  out.print("<li>" + cookie.getName()  + " : " + cookie.getValue() + "</li>");
			}
			 */
			for(int i=0; i<cookies.length; i++)
				out.print("<li>" + cookies[i].getName()  + " : " + cookies[i].getValue() + "</li>");
		%>
		--%>
	</ul>
</div>