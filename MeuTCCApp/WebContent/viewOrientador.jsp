<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="br.ifrn.meutcc.modelo.Orientador" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orientador Tema</title>
</head>
<body>
	<%
	Orientador orientador = (Orientador) request.getAttribute("orientador");
	if (orientador != null) {
			out.println("<h3>Orientador Tema</h3>");
			out.println("<ul>");
			out.println("<li> IDOrientador = "+orientador.getId()+"</li>");
			out.println("<li> Nome Orientador = "+orientador.getNome()+"</li>");
			out.println("</ul>");

	} else {
		out.println("<h3>Não há nenhum orientador para este tema!</h3>");
	}
%>

</body>
</html>