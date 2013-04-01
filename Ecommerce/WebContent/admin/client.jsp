<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Client
<table>
                    <tr><td>Login :</td> <td> ${requestScope.client.login}</td> </tr>
					<tr><td>id :</td><td>${requestScope.client.id}</td> </tr>
					<tr><td>img :</td><td>${requestScope.client.img}</td> </tr>
					<tr><td>email :</td><td>${requestScope.client.email}</td> </tr>
					 
					
					 </table>
</body>
</html>