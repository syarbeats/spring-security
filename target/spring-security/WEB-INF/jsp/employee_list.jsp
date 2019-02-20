<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
    <table>
    <thead>
    	<tr>
    		<th>ID</th>
    		<th>NAMA</th>
    		<th>SALARY</th>
    	</tr>
    </thead>
    
	<c:forEach items="${empList}" var="employee"> 
	  <tr>
	  	<td>${employee.id}</td>
	    <td>${employee.name}</td>
	    <td>${employee.salary}</td>  
	   </tr>
	</c:forEach>
	</table>
</body>
</html>