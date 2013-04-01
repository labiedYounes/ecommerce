<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ page import="project.data.*" %>
 <%@ page import="project.data.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose><c:when test="${requestScope.prod == null }">
<table>

<form method="get" action="servProduit">
  <tr>
    <td>nom produit</td>
    <td><input type="text" name="nom"></td>
  </tr>
  <tr>
    <td>discription</td>
    <td><input type="text" name="discription"></td>
  </tr>
  <tr>
    <td>QT</td>
    <td><input type="text" name="qt" value="1"></td>
  </tr>
  <tr>
    <td>Image</td>
    <td><input type="file"  name="img"></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input type="submit" value="ok" >
    <input type="hidden" name="callVar" value="2"></form></td>
 </tr>
</table>
</c:when>
<c:otherwise>
<table>

<form method="get" action="servProduit">
  <tr>
    <td>nom produit</td>
    <td><input type="text" name="nom" value='<c:out value="${requestScope.prod.nom}"></c:out>'></td>
  </tr>
  <tr>
    <td>discription</td>
    <td><input type="text" name="discription" value='<c:out value="${requestScope.prod.discription}"></c:out>'></td>
  </tr>
  <tr>
    <td>QT</td>
    <td><input type="text" name="qt" value='<c:out value="${requestScope.prod.qt}"></c:out>'></td>
  </tr>
  <tr>
    <td>Image</td>
    <td><input type="file"  name="img" value='<c:out value="${requestScope.prod.img}"></c:out>'></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input type="submit" value="ok" >
    <input type="hidden" name="callVar" value="4">
    <input type="hidden" name="idProd" value='<c:out value="${requestScope.prod.id}"></c:out>'></form></td>
 </tr>
</table>
</c:otherwise>
</c:choose>


</body>
</html>