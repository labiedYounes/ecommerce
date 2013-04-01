<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="catServ" method="get">
<table>

  <tr>
    <td>nom Categorie</td>
    <td><input type="text" name="nom"></td>
  </tr>
  <tr>
    <td>discription</td>
    <td><input type="text" name="discription"></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input type="submit" value="ok" ></td>
    
  </tr>
</table>
<input type="hidden" name ="callVar" value="2" >
</form>

</body>
</html>