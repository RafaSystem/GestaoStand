<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestão Stand</title>

<link type="text/css" rel="stylesheet" href="css/index.css">

</head>
<body>

	<%
		String userName = null;
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null){
			response.sendRedirect("detalhesCliente.jsp");
		}
	
	%>

	<header>
		<div class="cel50 logotipo">
			<a href="./">LOGOTIPO</a>
		</div>
		<div class="cel50 headerMenu">
			<ul>
				<li><a href="entrarContaCliente.jsp">Entrar</a></li>
				<li>/</li>
				<li><a href="criarContaCliente.jsp">Registar</a></li>
			</ul>
		</div>
	</header>
	<nav>
		<div class="navMenu">
			<ul>
				<li><a href="#">Menu</a></li>
				<li><a href="#">Menu</a></li>
				<li><a href="#">Menu</a></li>
			</ul>
		</div>
	</nav>
	<main>
		<div class="mainContainer">
			<h4>Main</h4>
		</div>
	</main>
	<footer>
		<p>Website criado pela <a href="#">Equipa TPSI1116</a>.</p>
	</footer>
</body>
</html>