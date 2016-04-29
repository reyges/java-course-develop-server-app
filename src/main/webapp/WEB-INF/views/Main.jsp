<%--
  Created by IntelliJ IDEA.
  User: parsentev
  Date: 18.03.2016
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title></title>
</head>
<body>

<c:choose>
	<c:when test="${sessionScope.login == null}">
		New user
		<form action="${pageContext.servletContext.contextPath}/login" method="post">
			login : <input type="text" name="login"><br>
			password : <input type="password" name="password"><br>
			<input type="submit">
		</form>
	</c:when>
	<c:otherwise>
		Welcome back, ${sessionScope.login}. <a href="${pageContext.servletContext.contextPath}/logout">logout</a>
	</c:otherwise>
</c:choose>
<div><a href="${pageContext.servletContext.contextPath}/user">Users</a></div>
<div>
	<form action="${pageContext.servletContext.contextPath}/color" method="post">
		<select name="color">
			<option value="gray">gray</option>
			<option value="white">white</option>
		</select>
		<input type="submit" value="Submit">
	</form>
</div>
</body>
</html>
