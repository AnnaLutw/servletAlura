

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Empresas</title>
</head>
<body>

	<c:if test="${not empty empresa }"> 
		<h2>Empresa ${ empresa } cadastrada com sucesso</h2>
	</c:if>
	
	<c:if test="${empty empresa }"> 
		<h2>Nenhuma empresa cadastrada</h2>
	</c:if>
	
	<h1>Lista de Empresas</h1>
	<ul>
	<c:forEach items="${empresas}" var="empresa">
		
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}"> remove</a>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}"> edita</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>