<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa</title>
</head>
<body>

	<c:if test="${not empty empresa }"> 
		<h2>Empresa ${ empresa } cadastrada com sucesso</h2>
	</c:if>
	
	<c:if test="${empty empresa }"> 
		<h2>Nenhuma empresa cadastrada</h2>
	</c:if>
</body>
</html>
