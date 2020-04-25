<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Modify Trainee</h2>

<form action="modify" method="post"><table>
<tr><td>Please enter trainee Id: </td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="modify"/></td></tr>
</table>
</form>

<br><br>
<form action="modifyTrainee"  method="post" ><table> <!-- modelAttribute="trainee" -->
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${val.traineeId}" name="traineeId" /></td>
<td><input type="text" value="${val.traineeName}" name="traineeName" /></td>
<td><input type="text" value="${val.traineeLocation}" name="traineeLocation"/></td>
<td><input type="text" value="${val.traineeDomain}" name="traineeDomain"/></td>
<td><input type="submit" Value="Modify"/></td></tr>
</table>
</form>
<h3>${msg }</h3>
</body>
</html>