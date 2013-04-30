<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ page import="project.data.*" %>
 <%@ page import="project.data.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CSS Free Templates with jQuery Slider</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<!--[if IE 6]>
		<script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/functions.js" type="text/javascript" charset="utf-8"></script>

</head>
<body>
  
	<!-- Begin Wrapper -->
	<div id="wrapper">
		<!-- Begin Inner -->
		<div class="inner">
			<!-- Begin Header -->
			<div id="header">
				<div class="header-inner">
					<!-- Begin Shell -->
					<div class="shell">
						<h1 id="logo"><a class="notext" href="#">World of TShirts</a></h1>
						<div id="account">
							<a class="view-account1" title="View Account" href="#">Bonjour <!-- --></a>
							
						</div>
						<!-- Begin Navigation -->
						<div id="navigation">
							<ul>
								
								<li><a class="cat"href="#" title="My Account Page"><span>Catégorie</span></a></li>
								<li><a class="client" title="Store Page"><span>Client</span></a></li>
								<li><a href="#" title="Contact Page"><span>Message</span></a></li>
                                <li><a href="#" title="Contact Page"><span>Compte</span></a></li>
                                <li><a href="#" title="Contact Page"><span>Deconnexion</span></a></li>
							</ul>
							<div class="cl">&nbsp;</div>
						</div>
						<!-- End Navigation -->
						<div class="cl">&nbsp;</div>
					</div>
					<!-- End Shell -->
				</div>
			</div>
			<!-- End Header -->
			<!-- Begin Shell -->
			<div class="shell">
				<!-- Begin Main -->
			  <div id="main">
					<!-- Begin Sidebar -->
			    <div id="sidebar">
						<ul>
							<!-- Begin Widget -->
							<li class="widget">
								<h2>Categories</h2>
								<ul>
									<li><a href="#" title="Category 1">Categorie 1</a></li>
									<li><a href="#" title="Category 2">Categorie 2</a></li>
									<li><a href="#" title="Category 3">Categorie 3</a></li>
									<li><a href="#" title="Category 4">Categorie 4</a></li>
									<li><a href="#" title="Category 5">Categorie 5</a></li>
									<li><a href="#" title="Category 6">Categorie 6</a></li>
									<li><a href="#" title="Category 7">Categorie 7</a></li>
									<li><a href="#" title="Category 8">Categorie 8</a></li>
								</ul>
							</li>
							<!-- End Widget -->
							<!-- Begin Widget -->
							<li class="widget">
								<h2>Recherche</h2>
								<div id="search">
									<form action="#" method="get" accept-charset="utf-8">
									  Entrez un nom de produit
								    <input type="text" class="blink" name="keyword" />
										<label>Categorie</label>
										<select size="1" name="category">
											<option value="default">-- Selectionnez Categorie --</option>
											<option value="Categorie1">Categorie 1</option>
											<option value="Categorie2">Categorie 2</option>
											<option value="Categorie3">Categorie 3</option>
											<option value="Categorie4">Categorie 4</option>
											<option value="Categorie5">Categorie 5</option>
											<option value="Categorie6">Categorie 6</option>
											<option value="Categorie7">Categorie7</option>
											<option value="Categorie8">Categorie 8</option>
										</select>
										<div class="price">
											<label>Prix </label>
											<select size="1" name="price">
												<option value="10">10</option>
												<option value="20">20</option>
												<option value="30">30</option>
												<option value="40">40</option>
												<option value="50">50</option>
												<option value="60">60</option>
												<option value="70">70</option>
												<option value="80">80</option>
												<option value="90">90</option>
												<option value="100">100</option>
											</select>
											<label>Dh   et:</label>
											<select size="1" name="to">
											  <option value="50">50</option>
											  <option value="60">60</option>
											  <option value="70">70</option>
											  <option value="80">80</option>
											  <option value="90">90</option>
											  <option value="100">100</option>
											  <option value="200">200</option>
											  <option value="300">300</option>
											  <option value="400">400</option>
											  <option value="500">500</option>
										  </select><label>Dh</label>
											<div class="cl">&nbsp;</div>
										</div>
										<span class="button"><input type="submit" value="Search" /></span>
										<div class="cl">&nbsp;</div>
									</form>
									
								</div>
							</li>
							<!-- End Widget -->
						</ul>
		      </div>
					
					<!-- End Sidebar -->
					<!-- Begin Content --><!-- End Content -->
			         <div id="midelBar"> 
			   
                   
					
					
					 <%@ include file="clientFragments/listClients.jspf" %>
					  <!-- categories -->
					  <c:choose><c:when test="${requestScope.requestedForm == 1 }">
					 <%@ include file="catFragments/listCats.jspf" %>
					 </c:when>
					 <c:when test="${requestScope.requestedForm == 2 }">
					 <%@ include file="catFragments/manCategorie.jspf" %>
					 </c:when>
					 </c:choose>
				
					  
					
					
					 </div>
			        <div class="cl">&nbsp;</div>
				  <!-- Begin Products Slider -->
				  <!-- End Products Slider -->
				  <!-- Begin Home Boxes -->
				  <!-- End Home Boxes -->
			  </div>
				<!-- End Main -->
				<!-- Begin Footer -->
				<div id="footer">
					<p class="bottom-menu"><a href="#" title="Home Page">Home</a><span>|</span><a href="#" title="Support Page">Support</a><span>|</span><a href="#" title="My Account Page">My Account</a><span>|</span><a href="#" title="Store Page">The Store</a><span>|</span><a href="#" title="Contact Page">Contact</a></p>
					<p>&copy; 2013 Réalisé Par : <a href="http://www.fsr.ac.ma/">LP Qualité Logiciel</a></p>
					<div class="cl">&nbsp;</div>
				</div>
				<!-- End Footer -->
			</div>
			<!-- End Shell -->

		</div>
		<!-- End Inner -->
	</div>
	<!-- End Wrapper -->
</body>
</html>
</html>