<%@page import="java.io.IOException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../include/jquery.jsp"%>
</head>
<body>
	<%
		String name = "";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";// 오라클 접속 URL
		String user = "pc17";// 자신의 오라클 계정
		String password = "java";
		String driverClass = "oracle.jdbc.driver.OracleDriver";

		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;

		try {

			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);

			statement = conn.createStatement();

			StringBuffer sql = new StringBuffer();
			sql.append("select * from ( ");
			sql.append("	select * from student_lotto ");
			sql.append("	order by DBMS_RANDOM.RANDOM ");
			sql.append(") where rownum = 1");

			rs = statement.executeQuery(sql.toString());

			rs.next();
			int no = rs.getInt(1);
			name = rs.getString(2);

			out.print("<div id='input' style='display:none'>no : " + no + " / name : " + name + "</div>");

			out.print("<canvas id='myCanvas' width='200' height='200'></canvas>");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			statement.close();
			conn.close();
		}
	%>

	<div></div>


</body>
<script>
	$(function(){
		var input = $('#input');
		
		
		var canvas = document.getElementById("myCanvas");
		var ctx = canvas.getContext("2d");
		ctx.beginPath();
		ctx.arc(100, 100, 100, 0, 2 * Math.PI);
		ctx.font = "12px Arial";
		ctx.fillText("<%=name%>",10,100);
		ctx.stroke();
		
	})
</script>
</html>