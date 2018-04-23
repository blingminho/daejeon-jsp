<%@page import="org.apache.commons.dbcp2.BasicDataSource"%>
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
</head>
<body>
	<%
		String url = "jdbc:oracle:thin:@localhost:1521:XE";// 오라클 접속 URL
		String user = "pc17";// 자신의 오라클 계정
		String password = "java";
		String driverClass = "oracle.jdbc.driver.OracleDriver";

		Connection conn = null;

		long startTime = System.currentTimeMillis();
		long midTime = 0L;
		BasicDataSource bd = null;
		try {
			Class.forName(driverClass);
			
			//connection pool 생성
			bd = new BasicDataSource();
			bd.setUrl(url);
			bd.setUsername(user);
			bd.setPassword(password);
			bd.setInitialSize(10);
			
			midTime = System.currentTimeMillis();
			
			//loop 반복 10회
			for (int i = 0; i < 10; i++) {
				conn = bd.getConnection();
				out.print(i + " : " + conn.getSchema() + "<br>");
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		bd.close();
		long endTime = System.currentTimeMillis();
		out.print("basicDatasource init duration : " + (midTime - startTime) + "<br>");
		out.print("basicDatasource getConnection duration : " + (endTime - midTime) + "<br>");
		out.print("duration : " + (endTime - startTime) + "<br>");
	%>
</body>
</html>