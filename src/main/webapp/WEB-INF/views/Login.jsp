<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title></title>
</head>
<body>

${error_login}

<c:if test="${error_login != null}" >
	<div style="background-color: red;">
			${error_login}
	</div>
</c:if>

<form action="${pageContext.servletContext.contextPath}/login" method="post">
	<div>
		login : <input type="text" name="login">
	</div>
	<div>
		password : <input type="password" name="password">
	</div>
	<div>
		<input type="submit" value="Submit">
	</div>
</form>
</body>
</html>
