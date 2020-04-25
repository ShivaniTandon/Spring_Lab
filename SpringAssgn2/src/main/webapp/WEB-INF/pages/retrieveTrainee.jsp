<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Retrieve Trainee</h2>
<form action="retrieve" method="post">
<table>
<tr><td>Please enter trainee Id:-</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="Retrieve"/></td></tr>
</table>
</form>
<br><br>
<table border="2 px">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>

<tr>
<td>${t.traineeId}</td>
<td>${t.traineeName}</td>
<td>${t.traineeLocation}</td>
<td>${t.traineeDomain}</td></tr>
</table>

</body>
</html>