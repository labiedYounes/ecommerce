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
Produit
<table>
<tr><td colspan="2" align="center"><form method="get" action="servProduit"><input type="submit" value="ajouter"><input type="hidden" value="1" name="callVar"></form></td> </tr>
					 
					 
					 
					 <c:forEach items="${requestScope.listProduit}" var="produit">
					 <tr>
					 <td><c:out value="${produit.nom}"></c:out></td>
					<td><c:out value="${produit.qt}"></c:out></td>
					
					 <td><form action="servProduit" method="get"><input type="submit" value="modifier"> 
					 <input type="hidden" value="1" name="callVar">
					 <input type="hidden" name="id" value="<c:out value="${produit.id}"></c:out>">
					 </form>
					 </td>
					 <td><form action="servProduit" method="get"><input type="submit" value="supprimer"> 
					  <input type="hidden" value="3" name="callVar">
					  <input type="hidden" name="id" value="<c:out value="${produit.id}"></c:out>">
					 </form>
					 </td>
					 </tr>
					 
					 </c:forEach>
					 </table>

</body>
</html>