<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
<div>
	<table>
		<c:forEach var="t" items="${list }">
			<tr>
				<td>${t.id }</td>
				<td>${t.name }</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>