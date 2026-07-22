<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem vindos a primeira aula de JSP </h1>
	
	<%
		String nome = "Vilson";
		out.print("Seu nome é " + nome);
	%>
	<%
		int idade = 50
	%>
	<p>
		<%
			if(idade > 18){
				out.print(nome + "vc é maior de idade");
			}
		%>
	</p>	
	<hr />
	
	<a href="cadastro.jsp">Cadastro</a>
</body>
</html>7    