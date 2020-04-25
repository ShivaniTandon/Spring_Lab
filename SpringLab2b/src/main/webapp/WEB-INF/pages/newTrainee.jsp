<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddTrainee</title>
</head>
<body>
<div style="border:1px solid blue">
<h2>Enter trainee details</h2>

<form action="addTrainee" method="post">
<label>Trainee Id:</label>
<input type="text" name="traineeId" placeholder="Id">
<br>
<label>Trainee Name:</label>
<input type="text" name="traineeName" placeholder="Name">
<br>
<label>Trainee Location:</label>
<input type="radio" name="traineeLocation" value="Chennai"/>Chennai
<input type="radio" name="traineeLocation" value="Bangalore"/>Bangalore
<input type="radio" name="traineeLocation" value="Pune"/>Pune
<input type="radio" name="traineeLocation" value="Mumbai"/>Mumbai
<br>
<table>
<tr><td>Trainee Domain:-</td>
<td><select name="traineeDomain">
<option value="Java">Java</option>
<option value=".Net">.Net</option>
<option value="Android">Android</option>
</select></td></tr>
<tr><td><input type="submit" name="AddTrainee" value="AddTrainee"/></td>
</table>

</form>


</div>
</body>
</html>