<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meu TCC</title>
<link href="css/index.css" rel="stylesheet" />
<link href="css/materialize.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
	<nav class="light-blue cyan darken-4" role="navigation">
    	<div class="nav-wrapper container">
    		<a id="logo-container" href="/MeuTCC/ListTemas" class="brand-logo">MeuTCC</a>
    	</div>
	</nav>
	<div class="container quadro">
	<h3 class="header center grey-text">Cadastrar Tema</h3>
	<div class="row">
		<div class="col s8 offset-s2">
			<%if(request.getAttribute("error") != null){
			out.println("<script>alert(\"Voc� atingiu o limite de temas que pode cadastrar.\")</script>");
			}
			%>
			<form action='InserirTema' method='POST'>
				<div class="row">
					<div class="input-field">
						<input id="titulo" name="titulo" data-success="V�lido" data-wrong="Digite corretamente" type="text" class="validate" required />
						<label>T�tulo</label>
					</div>
					<div class="input-field">
						<textarea id="descricao" name="descricao" data-success="V�lido" data-wrong="Digite corretamente" class="materialize-textarea" required></textarea>
						<label>Descri��o</label>
					</div>
					<div class="input-field">
						<select class="browser-default" name="idCurso" required>
    						<option value="" disabled selected>Escolha o curso:</option>
    						<option value="3">TADS</option>
    						<option value="4">Redes</option> <!-- O valor do value tem que bater no banco -->
  						</select>
  					</div>
  					<div class="input-field">
  						<button class="btn waves-effect waves-light" type="submit" name="action">Enviar</button>
  					</div>
				</div>
			</form>
		</div>
	</div>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js" type="text/javascript"></script>
</body>
</html>
