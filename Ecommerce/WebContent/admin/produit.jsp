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
                   <c:choose>
                     <c:when test="${requestScope.requestedForm == 1}">
					  <%@ include file="produitFragments/listProduits.jspf" %>
					 </c:when>
					  <c:when test="${requestScope.requestedForm == 2}" >
                      <%@ include file="produitFragments/afficherProd.jspf" %>
                     </c:when>
                     <c:when test="${requestScope.requestedForm == 3}" >  
                      <%@ include file="produitFragments/manProduit.jspf" %>
                     </c:when>
                       
					 
					</c:choose>

</body>
</html>