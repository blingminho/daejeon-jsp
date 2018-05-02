<%@tag import="java.sql.ResultSet"%>
<%@tag import="java.sql.PreparedStatement"%>
<%@tag import="java.sql.DriverManager"%>
<%@tag import="java.sql.Connection"%>
<%@tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="code" required="true" type="java.lang.String"%>

<%
	String url = "jdbc:oracle:thin:@localhost:1521:XE";// 오라클 접속 URL
	String user = "pc17";// 자신의 오라클 계정
	String password = "java";
	String driverClass = "oracle.jdbc.driver.OracleDriver";

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	StringBuffer sql = new StringBuffer();
	sql.append("SELECT PROD_ID, PROD_NAME ");
	sql.append("	FROM PROD ");
	sql.append("	WHERE PROD_LGU = ?");
	

	long startTime = System.currentTimeMillis();

	try {
		Class.forName(driverClass);

		conn = DriverManager.getConnection(url, user, password);
		ps = conn.prepareStatement(sql.toString());
		ps.setString(1, code);
		rs = ps.executeQuery();
	
		//출력
		StringBuilder sb = new StringBuilder();
		sb.append("<select name='code'>");
		while(rs.next()) {
			sb.append("<option value='"+ rs.getString("prod_id") +"'>" + rs.getString("prod_name"));
		}
		sb.append("</select>");
		out.print(sb.toString());
		
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {

	}
%>