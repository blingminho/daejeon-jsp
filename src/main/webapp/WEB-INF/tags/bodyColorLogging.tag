<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="color" type="java.lang.String" required="true"%>
<%@ attribute name="length" type="java.lang.Integer" required="false"%>
<c:set var="length" value="${length == null ? 10 : length }"/>

<font color="${color == null ? "red" : color }">
	<c:forEach begin="1" end="${length }">
		<c:out value="="/>
	</c:forEach>
</font>

<jsp:doBody></jsp:doBody>