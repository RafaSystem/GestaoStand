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
			<div class="formCriarConta">
				<h3>Criar Conta</h3>
				<form action="HClienteOn" method="post">
					<label>
						Nome:
						<input type="text" name="c_nome" placeholder="Ex: Nuno">
					</label>
					<label>
						Password:
						<input type="password" name="c_pass" placeholder="******">
					</label>
					<label>
						E-mail:
						<input type="email" name="c_email" placeholder="Ex: nuno@email">
					</label>
					<label>
						Morada:
						<input type="text" name="c_morada" placeholder="Ex: Rua do Português">
					</label>
					<label>
						Localidade:
						<input type="text" name="c_localidade" placeholder="Ex: Barreiro">
					</label>
					<label>
						Código Postal:
						<input type="text" name="c_codigoPostal" placeholder="Ex: 2830-264">
					</label>
					<label>
						Contacto:
						<input type="text" name="c_contacto" placeholder="Ex: 920000000">
					</label>
					<label>
						Cartão de cidadão:
						<input type="text" name="c_cc" placeholder="Ex: 87654321">
						<input type="text" name="c_cc2" placeholder="Ex: 8">
						<input type="text" name="c_cc3" placeholder="ZZ8">
					</label>
					<label>
						<button type="submit" name="submit" value="addClOn">Criar</button>
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