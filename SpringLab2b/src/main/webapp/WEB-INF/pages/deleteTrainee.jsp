<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab2</title>
</head>
<body>
<h2>Delete Operation</h2>
<form action="delete" method="post">
<table>
<tr><td>Please enter trainee Id:-</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="delete"/></td></tr>
</table>
</form>


<br><br>
<form action="deleteTrainee/${del.traineeId}"  method="post"><table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${del.traineeId}"  readonly/></td>
<td><input type="text" value="${del.traineeName}"  readonly/></td>
<td><input type="text" value="${del.traineeLocation}"  readonly/></td>
<td><input type="text" value="${del.traineeDomain}"  readonly/></td>
<td><input type="submit" Value="Delete"/></td></tr>
</table>
</form>
 
</body>
</html>