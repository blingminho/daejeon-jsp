<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
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
		try {
			
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource)
			envCtx.lookup("jdbc/oracleDB");

			for(int i = 0; i < 500; i++){
				conn = ds.getConnection();
				out.print(i + " : " + conn.getSchema() + "<br>");
				conn.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		long endTime = System.currentTimeMillis();
		out.print("duration : " + (endTime - startTime) + "<br>");
	%>
</body>
</html>