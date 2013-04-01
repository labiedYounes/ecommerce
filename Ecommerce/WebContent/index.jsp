<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site JEE</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="css\images\favicon.ico" />
	<link rel="stylesheet" href="css\style.css" type="text/css" media="all" />
	<script src="js\jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<!--[if IE 6]>
		<script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js\jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js\functions.js" type="text/javascript" charset="utf-8"></script>
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
						<h1 id="logo"><a class="notext" href="#">Notre LOGO</a></h1>
						<div id="account">
							<a class="view-account" title="View Account" href="#">Votre Pannier</a>
							<span>Articles: 4</span><span>Prix:<strong>250.90 Dh</strong></span>
						    <div class="cl">&nbsp;</div>
						</div>
						<!-- Begin Navigation -->
						<div id="navigation">
							<ul>
								<li><a href="#" title="Home "><span>Accueil</span></a></li>
                                <li><a href="#" title="Promotion"><span >Promotion</span></a></li>
								<li><a href="#" title="Service"><span>Service</span></a></li>
								<li><a href="#" title="Compte"><span>Mon compte</span></a></li>
                                <li><a href="Contact.html" title="Contact.html"><span>Contact</span></a></li>
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
								<h2>Recherche</h2>
								<div id="search">
									<form action="authentification" method="get" accept-charset="utf-8">
									 <Label> Login : </Label>
								    <input type="text" class="blink" name="login"  />
										<label>Mot de Passe</label>
									<input type="text" class="blink" name="mdp" />	
										<span ><input type="submit" value="Se connecter" /></span>
                                        <span onclick="ouvrir(400,300,'Inscription.html')" ><input type="submit" value="S'inscrire" /></span>
										<div class="cl">&nbsp;</div>
									</form>
									
								</div>
							</li>
                         
                         
                         
                         
                         
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
					<!-- Begin Content -->
					<div id="content">
						<!-- Begin Slider -->
						<div id="slider">
							<div class="slider-frame">&nbsp;</div>
							<ul class="slider-items">
								<li><img src="css\images/slide1.jpg" alt="Slide 1" /></li>
								<li><img src="css\images/slide1.jpg" alt="Slide 1" /></li>
								<li><img src="css\images/slide1.jpg" alt="Slide 1" /></li>
								<li><img src="css\images/slide1.jpg" alt="Slide 1" /></li>
								<li><img src="css\images/slide1.jpg" alt="Slide 1" /></li>
							</ul>
							<div class="cl">&nbsp;</div>
							<div class="slider-controls">
								<ul></ul>
								<div class="cl">&nbsp;</div>
							</div>
						</div>
						<!-- End Slider -->
						<!-- Begin Post -->
						<div class="post">
							<h2>Bienvenue</h2>
							<p>text text text text text, text text text text text.text text text text texttext text text text texttext text text text text,text text text text text, text text text text text, text text text text text, text text text text text,text text text text text,text text text text text, text text text text text,text text text text text.</p>
						</div>
						<!-- End Post -->
						<!-- Begin Products -->
						<div id="products">
							<div class="product">
								<img src="css\images/product-img1.jpg" alt="First TShirt Product" />
								<div class="pr-info">
									<h4>Produit 1</h4>
									<p>designation : </p>
									<span class="pr-price"><span>Dh</span>58.<sup>99</sup></span>
								</div>
							</div>
							<div class="product">
								<img src="css\images/product-img2.jpg" alt="Second TShirt Product" />
								<div class="pr-info">
									<h4>Produit 2</h4>
									<p>designation :</p>
									<span class="pr-price"><span>Dh</span>58.<sup>99</sup></span>
								</div>
							</div>
							<div class="product last">
								<img src="css\images/product-img3.jpg" alt="Third TShirt Product" />
								<div class="pr-info">
									<h4>Produit 3</h4>
									<p>designation : </p>
									<span class="pr-price"><span>Dh</span>58.<sup>99</sup></span>
								</div>
							</div>
							<div class="cl">&nbsp;</div>
						</div>
						<!-- End Products -->
					</div>
					<!-- End Content -->
					<div class="cl">&nbsp;</div>
					<!-- Begin Products Slider -->
					<div id="pr-slider">
						<ul>
							<li><a href="#"><img src="css\images/slide-img1.jpg" alt="Slide TShirt 1" /></a></li>
							<li><a href="#"><img src="css\images/slide-img2.jpg" alt="Slide TShirt 2" /></a></li>
							<li><a href="#"><img src="css\images/slide-img3.jpg" alt="Slide TShirt 3" /></a></li>
							<li><a href="#"><img src="css\images/slide-img4.jpg" alt="Slide TShirt 4" /></a></li>
							<li><a href="#"><img src="css\images/slide-img5.jpg" alt="Slide TShirt 5" /></a></li>
							<li><a href="#"><img src="css\images/slide-img6.jpg" alt="Slide TShirt 6" /></a></li>
							<li><a href="#"><img src="css\images/slide-img7.jpg" alt="Slide TShirt 7" /></a></li>
							<li><a href="#"><img src="css\images/slide-img1.jpg" alt="Slide TShirt 1" /></a></li>
							<li><a href="#"><img src="css\images/slide-img2.jpg" alt="Slide TShirt 2" /></a></li>
							<li><a href="#"><img src="css\images/slide-img3.jpg" alt="Slide TShirt 3" /></a></li>
							<li><a href="#"><img src="css\images/slide-img4.jpg" alt="Slide TShirt 4" /></a></li>
							<li><a href="#"><img src="css\images/slide-img5.jpg" alt="Slide TShirt 5" /></a></li>
							<li><a href="#"><img src="css\images/slide-img6.jpg" alt="Slide TShirt 6" /></a></li>
							<li><a href="#"><img src="css\images/slide-img7.jpg" alt="Slide TShirt 7" /></a></li>
						</ul>
						<div class="cl">&nbsp;</div>
					</div>
					<!-- End Products Slider -->
					<!-- Begin Home Boxes -->
					<div id="home-boxes">
						<!-- Begin Box -->
						<div class="box first">
							<div class="box-title">
								<img src="css\images/box-img1.png" alt="First Box Image" />
								<h4>satisfait ou rembourse</h4>
								<div class="cl">&nbsp;</div>
							</div>
							<div class="box-entry">
								<p>text text text text text.text text text text text. .text text text text text.text text text text text</p>
								<p class="more"><a href="#" title="Read More">Lire la suite</a></p>
							</div>
						</div>
						<!-- End Box -->
						<!-- Begin Box -->
						<div class="box">
							<div class="box-title">
								<img src="css\images/box-img2.png" alt="Second Box Image" />
								<h4>Service Client disponible</h4>
								<div class="cl">&nbsp;</div>
							</div>
							<div class="box-entry">
								<p>text text text text text.text text text text text. .text text text text text.text text text text text</p>
								<p class="more"><a href="#" title="Read More">Lire la suite</a></p>
						  </div>
						</div>
						<!-- End Box -->
						<!-- Begin Box -->
						<div class="box">
							<div class="box-title">
								<img src="css\images/box-img3.png" alt="Third Box Image" />
								<h4>Livraison gratuite</h4>
								<div class="cl">&nbsp;</div>
							</div>
							<div class="box-entry">
								<p>text text text text text.text text text text text. .text text text text text.text text text text text</p>
								<p class="more"><a href="#" title="Read More">Lire la suite</a></p>
							</div>
						</div>
						<!-- End Box -->
						<!-- Begin Box -->
						<div class="box">
							<div class="box-title">
								<img src="css\images\box-img4.png" alt="Fourth Box Image" />
								<h4>Large choix de produit</h4>
								<div class="cl">&nbsp;</div>
							</div>
							<div class="box-entry">
								<p>text text text text text.text text text text text. .text text text text text.text text text text text</p>
								<p class="more"><a href="#" title="Read More">Lire la suite</a></p>
						  </div>
						</div>
						<!-- End Box -->
						<div class="cl">&nbsp;</div>
					</div>
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