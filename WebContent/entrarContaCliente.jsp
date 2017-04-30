<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestão Stand</title>

<link type="text/css" rel="stylesheet" href="css/index.css">
<link type="text/css" rel="stylesheet" href="css/entrarConta.css">

</head>
<body>

	<header>
		<div class="cel50 logotipo">
			<a href="./">LOGOTIPO</a>
		</div>
		<div class="cel50 headerMenu">
			<ul>
				<li><a href="#">Login</a></li>
				<li>/</li>
				<li><a href="#">Register</a></li>
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
				<h3>Entrar Conta</h3>
				<form action="HClienteOn" method="post">
					<label>
						Nome:
						<input type="text" name="username" placeholder="Ex: Nuno">
					</label>
					<label>
						Password:
						<input type="password" name="password" placeholder="******">
					</label>
					<label>
						<button type="submit" name="submit" value="logClOn">Criar</button>
					</label>
				</form>
			</div>
		</div>
	</main>
	<footer>
		<p>Website criado pela <a href="#">Equipa TPSI1116</a>.</p>
	</footer>
</body>
</html>