<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
<body>
<div class="container">
<form action="${pageContext.request.contextPath}/Login2" method="post">
<fieldset>
	Enter Username:<input type="text" name="username"/><br>	
	Enter password:<input type="password" name="password"><br>
	<input type="hidden" value="add" name="perform">
	
	<button class="btn btn-primary" type="submit">Register</button>
	<button class="btn btn-primary" type="reset">Reset</button><br>
	
	
</fieldset>	
</form>
</div>

</body>
</html>