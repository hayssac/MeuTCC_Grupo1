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
    		<ul id="nav-mobile" class="right hide-on-med-and-down">
    			<li><a href="/MeuTCC/ViewTemaCadastro">Cadastrar novo tema</a></li>
    		</ul>
    	</div>
	</nav>
	<div class="container quadro">
	<h3 class="header center grey-text">Cadastrar Tema</h3>
	<div class="row">
		<div class="col s8 offset-s2">
			<form>
				<div class="row">
					<div class="input-field">
						<input id="id" name="id" data-success="Válido" data-wrong="Digite um número" type="number" class="validate" required />
						<label>ID</label>
					</div>
					<div class="input-field">
						<input id="titulo" name="titulo" data-success="Válido" data-wrong="Digite corretamente" type="text" class="validate" required />
						<label>Título</label>
					</div>
					<div class="input-field">
						<textarea id="descricao" name="descricao" data-success="Válido" data-wrong="Digite corretamente" class="materialize-textarea" required></textarea>
						<label>Descrição</label>
					</div>
					<div class="input-field">
						<input id="idcurso" name="idcurso" data-success="Válido" data-wrong="Digite um número" type="number" class="validate" required />
						<label>Curso</label>
    				</div>
					<div class="input-field">
						<input id="idorientador" name="idorientador" data-success="Válido" data-wrong="Digite um número" type="number" class="validate" required/>
						<label>Orientador</label>
					</div>
					<div class="input-field">
						<a class="waves-effect waves-light btn" type="submit">Enviar</a>
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