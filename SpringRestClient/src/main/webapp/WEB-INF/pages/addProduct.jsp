<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
<div style="width:500px; height:500px;">
<form action="add" method="post">
Product Id:<input type="text" name="prodId" placeholder="Product Id"/>
<br>
Product Name:<input type="text" name="prodName" placeholder="Product Name"/>
<br>
Product Price:<input type="text" name="prodPrice" placeholder="Product Price"/>
<br>
<input type="submit" name="s" value="Add Product"/>
</form>

<p>${msg}</p>
</div>


</body>
</html>