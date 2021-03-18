<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page  isELIgnored="false"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h2>How can i help you ?</h2>
	<%-- 	<%
		String firstName = (String) request.getAttribute("fName");
		String lastName = (String) request.getAttribute("lName");
		String dateTime=(String)request.getAttribute("date");
	%> --%>
	<!--  Expression Language  -->
	<h2>
		First Name :${fname}
		<%-- <%=firstName%> --%>
	</h2>
	<h2>
		Last Name : ${lName}
		<%-- <%=lastName%> --%>
	</h2>
	<h2>
		Date And Time Now : ${date}
		<%-- <%=dateTime%> --%>
		<hr>
		<h2><c:forEach var="item" items="${f}">
		
		<c:out value="${item}"></c:out>
		
		</c:forEach></h2>
	</h2>
</body>
</html>