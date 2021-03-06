<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, br.ifrn.meutcc.modelo.Tema" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    			<li><a href="inserirTema.jsp">Cadastrar novo tema</a></li>
    		</ul>
    	</div>
	</nav>
	<div class="container quadro">
		<h3 class="header center green-text text-darken-4">Listagem dos Temas Disponíveis para TCC</h3>
		<table class="striped responsive-table">
			<thead class="centered">
				<tr>
              		<!-- <th data-field="id">ID</th> -->
              		<th data-field="titulo">Assunto</th>
              		<th data-field="descricao">Descrição</th>
              		<th data-field="orientador">Orientador</th>
              		<th data-field="acoes">Ações</th>
          		</tr>
			</thead>
			<tbody>
				<%
				List<Tema> temas = (List<Tema>) request.getAttribute("temas");
				if( temas != null && !temas.isEmpty()) {
					for (Tema t: temas) {
						out.println("<tr>");
						out.println("<td>" + t.getTitulo() + "</td>");
						out.println("<td>" + t.getDescricao() + "</td>");
						out.println("<td>"+ t.getNomeOrientador() +"</td>");
						out.println("<td>");
						out.println("<a class=\"waves-effect waves-light btn\" href=\"/MeuTCC/ViewAlunoCandidatou?id="+t.getId()+ "\"> Candidatar-se</a>");
						out.println("<a class=\"waves-effect waves-light btn\" href=\"/MeuTCC/ViewTemaCandidaturas?id="+t.getId()+	"\">Lista de Candidaturas</a>");
						out.println("</td>");
						out.println("</tr>");
					}
				}
				%>
			</tbody>
		</table>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js" type="text/javascript"></script>
</body>
</html>