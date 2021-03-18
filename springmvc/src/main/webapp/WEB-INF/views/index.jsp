<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Spring MVC Project</title>
</head>
<body>
<h2>Priyanka</h2>
<%String name=(String) request.getAttribute("name");
  Integer id=(Integer) request.getAttribute("id");
  List<String> list=(List<String>) request.getAttribute("f");
%>
<h2>My Brother's name is : <%=name%><br>
    his Id is : <%=id %> <br>
    his FriendList is here : <%=list %>
</h2>

</body>
</html>