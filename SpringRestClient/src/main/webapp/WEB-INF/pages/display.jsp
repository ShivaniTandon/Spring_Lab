<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
</head>
<body>
<div style="width:500px; height:500px;">
<form action="view" method="post">
Product Id:<input type="text" name="prodId" placeholder="Product Id"/>
<br>
<input type="submit" name="s" value="Show Product"/>
</form>
<p>${msg}</p>
<hr>
<form action="viewAll" method="post">
<input type="submit" name="s" value="Show All Product"/>
</form>
</div>
</body>
</html>