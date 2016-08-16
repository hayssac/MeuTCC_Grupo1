<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error 404</title>
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
		<h3 class="header center grey-text">Ops :(</h3>
		<div class="row"> 
			<div class="col s6 offset-s3">
				<a href="/MeuTCC/ListTemas">
				<div class="card-panel teal lighten-2 hoverable center"> 
					<img src="img/error404.png" /> 
					<span class="white-text"> 
						<p>Error 404: Essa página (ainda) não existe!</p> 
					</span> 
				</div> 
				</a>
			</div> 
		</div>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js" type="text/javascript"></script>
</body>
</html>