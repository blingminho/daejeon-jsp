<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>순번</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${boardList }" var="boardVO">
				<tr>
					<td><c:out value="${boardVO.seq }"/></td>
					<td><c:out value="${boardVO.title }"/></td>
					<td><c:out value="${boardVO.reg_id }"/></td>
					<td><fmt:formatDate value="${boardVO.reg_dt }" pattern="yyyy-MM-dd"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>