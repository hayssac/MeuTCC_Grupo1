<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno</title>
</head>
<body>
	<%
	boolean aluno = (boolean) request.getAttribute("aluno");
	if (aluno == true) {
		out.println("<h3>Inserido!</h3>");
	} else {
		out.println("<h3>Não há nada para mostrar!</h3>");
	}
%>
</body>
</html>