<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList, model.Stand" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Stands</title>
</head>
<body>
<table width="80%">
<tr>
	<th>Nome</th>
	<th>Contacto</th>
</tr>
<%
	ArrayList ar = (ArrayList) request.getAttribute("listaStand");

	for (int i=0; i < ar.size(); i++){
		Stand s = (Stand) ar.get(i);
		
		out.append("<tr>");
		out.append("<td>"+ s.getNome() +"</td>");
		out.append("<td>"+ s.getContacto() +"</td>");
		out.append("</tr>");
	}

%>
</body>
</html>