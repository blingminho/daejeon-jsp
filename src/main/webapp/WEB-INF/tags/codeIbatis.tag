<%@tag import="java.util.HashMap"%>
<%@tag import="java.util.Iterator"%>
<%@tag import="java.util.Map"%>
<%@tag import="java.util.List"%>
<%@tag import="tagDao.TagsCodeDao"%>
<%@tag import="tagDao.TagsCodeDaoInf"%>
<%@tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="code" required="true" type="java.lang.String"%>

<%
	long startTime = System.currentTimeMillis();

	try {
		TagsCodeDaoInf dao = TagsCodeDao.getInstance();
		List<Map<String,String>> list = dao.getProdList(code);
		Iterator it = list.iterator();

		//출력
		StringBuilder sb = new StringBuilder();
		sb.append("<select name='code'>");
		while(it.hasNext()) {
			Map<String,String> map = (HashMap<String,String>)it.next();
			sb.append("<option value='"+ map.get("PROD_ID") +"'>" + map.get("PROD_NAME"));
		}
		sb.append("</select>");
		out.print(sb.toString());
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {

	}
%>