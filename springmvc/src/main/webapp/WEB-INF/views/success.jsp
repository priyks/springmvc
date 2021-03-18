<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h2>${headtitle}</h2>
<h2>${descone}</h2>
<h2>You Successfully Signed In</h2>
<h2>Email id : ${user.email}</h2>
<h2>User Name : ${user.userName}</h2>
<h2>Password : ${user.password}</h2>
</body>
</html>