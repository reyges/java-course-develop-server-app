<%@ page import="ru.parsentev.services.UserService" %>
<%@ page import="ru.parsentev.models.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: parsentev
  Date: 18.03.2016
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title></title>
	<c:forEach items="${cookie}" var="currentCookie">
		<c:if test="${currentCookie.value.name == 'color'}">
			<style>
				body {
					background-color: ${currentCookie.value.value};
				}
			</style>
		</c:if>
	</c:forEach>
</head>
<body>
Welcome back, ${sessionScope.login}, ${sessionScope.role} <a href="${pageContext.servletContext.contextPath}/logout">logout</a>
<div>Users</div>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.login}</td>
		</tr>
	</c:forEach>
</table>

<form action="${pageContext.servletContext.contextPath}/user" method="post">
	Id:<input name="id" type="text">
	Name:<input name="name" type="text">
	<input type="submit">
</form>

</body>
</html>
