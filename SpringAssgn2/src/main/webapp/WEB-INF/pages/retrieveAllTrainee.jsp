<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h2>Retrieve all trainee</h2>


<table border="2 px">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.traineeId}</td>
<td>${item.traineeName}</td>
<td>${item.traineeLocation}</td>
<td>${item.traineeDomain}</td></tr>
</c:forEach>
</table>

</body>
</html>