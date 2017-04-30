<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestão Stand</title>

<link type="text/css" rel="stylesheet" href="css/index.css">
<link type="text/css" rel="stylesheet" href="css/criarConta.css">

</head>
<body>

	<%
		String userName = null;
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("user")){
					userName = cookie.getValue();
				}
			}
		}
		
		if(userName == null) response.sendRedirect("entrarContaCliente.jsp");
	%>

	<header>
		<div class="cel50 logotipo">
			<a href="./">LOGOTIPO</a>
		</div>
		<div class="cel50 headerMenu">
			<ul>
				<li><a href="#"><%=userName %></a></li>
				<li>/</li>
				<li><a href="HLogout">Logout</a></li>
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
			<div class="formCriarConta">
				<h3>Detalhes Conta</h3>

			</div>
		</div>
	</main>
	<footer>
		<p>Website criado pela <a href="#">Equipa TPSI1116</a>.</p>
	</footer>
</body>
</html>