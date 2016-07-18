<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, br.ifrn.meutcc.modelo.Tema" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Meu TCC</title>
<link href="css/index.css" rel="stylesheet" />
<link href="css/materialize.min.css" rel="stylesheet" />
</head>
<body>
	<nav class="light-blue lighten-1" role="navigation">
    	<div class="nav-wrapper container"><a id="logo-container" href="/MeuTCC/ListTemas" class="brand-logo">MeuTCC</a>
    	</div>
	</nav>
	<div class="container quadro">
		<h3 class="header center grey-text">Listagem dos Temas Disponíveis para TCC</h3>
		<ul>
		<%
			List<Tema> temas = (List<Tema>) request.getAttribute("temas");
			if (temas != null && !temas.isEmpty()) {
				for(Tema t: temas) {					
					out.println("<li><a class=\"waves-effect waves-light btn\" href=\"/MeuTCC/ViewTema?id="+t.getId()+
							"\">["+t.getId()+"] "+t.getTitulo()+"</a> : <a class=\"waves-effect blue lighten-4 btn\" href=\"/MeuTCC/ViewAluno?id="+t.getId()+
							"\">Candidatar-se</a> <a class=\"waves-effect orange lighten-4 btn\" href=\"/MeuTCC/ViewCandidaturas?id="+t.getId()+
							"\">Lista de Candidaturas</a> <a class=\"waves-effect red lighten-3 btn\" href=\"/MeuTCC/ViewOrientadorTema?id="+t.getId()+
							"\">Orientador</a></li>");
				}
				} else {
					out.println("<li>Nenhum tema cadastrado para o referido curso!</li>");
			}
		%>
	</ul>
</div>



<script src="js/materialize.min.js" type="text/javascript"></script>
</body>
</html>