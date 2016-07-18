<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Candidaturas</title>
</head>
<body>
<%
	int aluno = (int) request.getAttribute("aluno");
	if (aluno != 0){
		out.println("<h3>Existem: "+aluno+" alunos que se candidataram a este tema!</h3>");	
	}
	else {
		out.println("<h3>Não há nenhum candidato a este tema!</h3>");
	}

%>
</body>
</html>