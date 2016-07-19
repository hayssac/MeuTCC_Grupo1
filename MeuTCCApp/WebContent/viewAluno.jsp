<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno</title>
<link href="css/index.css" rel="stylesheet" />
<link href="css/materialize.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
	<nav class="light-blue cyan darken-4" role="navigation">
    	<div class="nav-wrapper container"><a id="logo-container" href="/MeuTCC/ListTemas" class="brand-logo">MeuTCC</a>
    	</div>
	</nav>
	<div class="container quadro">
	<%
	boolean aluno = (boolean) request.getAttribute("aluno");
	if (aluno == true) {
		out.println("<div class=\"row\"> <div class=\"col s6 push-s3\"> <div class=\"card-panel teal lighten-2 hoverable center\"> <i class=\"large material-icons white-text\">done</i> <span class=\"white-text\"> <p> Inserido! </p> </span> </div> </div> </div>");
		out.println("<div class=\"row\"> <div class=\"col s6 push-s3\"> <a class=\"waves-effect waves-light red lighten-3 btn\" href=\"/MeuTCC/ListTemas\"> Voltar</a> </div> </div>");
	} else {
		out.println("<div class=\"row\"> <div class=\"col s6 push-s3\"> <div class=\"card-panel teal lighten-2 hoverable center\"> <i class=\"large material-icons white-text\">error</i> <span class=\"white-text\"> <p>Nada para mostrar!</p> </span> </div> </div> </div>");
		out.println("<div class=\"row\"> <div class=\"col s6 push-s3\"> <a class=\"waves-effect waves-light red lighten-3 btn\" href=\"/MeuTCC/ListTemas\"> Voltar</a> </div> </div>");
	}
	%>
	</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js" type="text/javascript"></script>
</body>
</html>