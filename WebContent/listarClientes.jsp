<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList, model.ClienteOnline" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Clientes - Gestão Stand</title>
</head>
<body>
<table width="80%">
<tr>
	<th>Nome</th>
	<th>Password</th>
</tr>
<%
	ArrayList ar = (ArrayList) request.getAttribute("listaClientes");

	for (int i=0; i < ar.size(); i++){
		ClienteOnline co = (ClienteOnline) ar.get(i);
		
		out.append("<tr>");
		out.append("<td>"+ co.getNome() +"</td>");
		out.append("<td>"+ co.getPassword() +"</td>");
		out.append("</tr>");
	}

%>

</body>
</html>