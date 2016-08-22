<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='InserirTema' method='POST'>
		Titulo: <input type="text" name="titulo">
		Descricao: <input type="text" name="descricao">
		idCurso: <input type="text" name="idCurso">
		<input type="submit" value="Inserir">
	</form>
	<a href="ListTemas">Voltar</a>

</body>
</html>