<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Product Info</h2>
<p>${product.prodId }</p>
<p>${product.prodName } </p>
<p>${product.prodPrice }</p>

<div style="color:blue;"> 
<c:if test="${not empty products }">
<table style="border:2 px;">
<tr><th>Product Id</th><th>Product Name</th><th>Product Price </th></tr>
<c:forEach items="${products }" var="product">
<tr> <th>${product.prodId }</th><th>${product.prodName }</th><th>${product.prodPrice }</th> </tr>
</c:forEach>
</table>

</c:if>

</div>
</body>
</html>
