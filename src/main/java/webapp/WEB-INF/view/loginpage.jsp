<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


	<!-- This is a Best Practice..use form:form for auth by spring framework
		 Default User name field: username
		 Default password field : password
		 Spring will read the field names and auth via the Spring Security Filters
		 
		 Context Root & Context Path are basically the same thing
	 -->
	<h3>Custom Login Page</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateUser"
				method="POST"> <!--  must be a POST method -->
		<p>
		User name: <input type="text" name="username" />
		</p>
		<p>
		Password: <input type="password" name="password" />
		</p>
		<input type="submit" value="Login" />
				
	</form:form>

</body>
</html>