
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    <!DOCTYPE html>
<html>
<head>
	<title>Home Page</title>
	<meta charset="UTF-8">

	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/jquery.bxslider.css">
	<link rel="stylesheet" href="css/font-awesome.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/MisEstilos.css">
	<!-- <link rel="stylesheet" type="text/css" href="css/estilos.css"> -->
	
</head>
<body>
<!--Cabecera-->
<!---Cuerpo -->
<link href='https://fonts.googleapis.com/css?family=Lato:700' rel='stylesheet' type='text/css'>
<!--Cabecera- Se separará espacio para el input de busqueda antes de la cabecera de menu-->
<header class="header">
		<div class="content clearfix">
		<!--Input de buscador de la parte superior derecha-->
			<nav class="search">
				<div class="search_box">
					<form action="#" id="search-box" method="get">
						<label class="hidden" for="inputbusqueda">Buscar</label>
	                    <input type="text" placeholder="Ingresa tu búsqueda" id="inputbusqueda" name="conte">
	                    <span class="glyphicon glyphicon-search" href="#"></span>
					</form>
				</div>
			</nav>
		</div>
		<!--menu de opciones superior-->
		<nav class="main-menu">
			<div class="content">
				<div class="logo">
					<div class="edit-logo">
						<a href="/" title="Logo oficial de Papus Club">
							<img src="images/logo.png" alt="Logo Papus Club" href="/">
						</a>
					</div>
				</div>
				<!--Opciones de menu-->
				<nav class="menu" id="menu">
					<ul>
						<li><a href="#">PAPUS CLUB<span class="despliegue">▼</span></a>
							<ul>
								<li><a href="historia-papusclub" title="A cerca del club" target="_self">ACERCA DEL CLUB</a></li>
								<li><a href="mesa-directiva" title="Mesa directiva" target="_self">MESA DIRECTIVA</a></li>
								<li><a href="reglamento-club" title="Reglas del club" target="_self">REGLAMENTO</a></li>
							</ul>
						</li>
						<!-- Sedes -->
						<li><a href="#">SEDES<span class="despliegue">▼</span></a>
							<ul>
								<li><a href="historia-sede-callao" title="Callao" target="_self">CALLAO<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="concesiones" title="Concesiones" target="_self">CONCESIONES</a></li>
										<li><a href="servicios" title="Servicios" target="_self">SERVICIOS</a></li>
									</ul>
								</li>
								<li><a href="historia-sede-surquillo" title="Surquillo" target="_self">SURQUILLO<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="concesiones" title="Concesiones" target="_self">CONCESIONES</a></li>
										<li><a href="servicios" title="Servicios" target="_self">SERVICIOS</a></li>
										
									</ul>						
								</li>
								<li><a href="historia-sede-barranco" title="Barranco" target="_self">BARRANCO<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="concesiones" title="Concesiones" target="_self">CONCESIONES</a></li>
										<li><a href="servicios" title="Servicios" target="_self">SERVICIOS</a></li>
										
									</ul>						
								</li>
							</ul>
						</li>
						<!-- Opción Actividades -->
						<li><a href="#">ACTIVIDADES<span class="despliegue">▼</span></a>
							<ul>
								<li><a href="#" title="ir a cursos" target="_self">TALLERES<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="futbol" title="ir a futbol" target="_self">Futbol</a></li>
										<li><a href="natacion" title="ir a natacion" target="_self">Natación</a></li>
										<li><a href="karate" title="ir a karate" target="_self">Karate</a></li>
									</ul>
								</li>
								<li><a href="#" title="Actividad 2" target="_self">RELAJACION<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="yoga" title="YOGA" target="_self">YOGA</a></li>
										
									</ul>						
								</li>
								
							</ul>					
						</li>
						<!-- Opción Eventos -->
						<li><a href="#">EVENTOS<span class="despliegue">▼</span></a>
							<ul>
								<li><a href="#" title="Evento 2" target="_self">DIA DEL PADRE<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="padre" title="Evento 2-1" target="_self">VIERNES DE PADRES</a></li>
									</ul>						
								</li>
								<li><a href="#" title="Evento 3" target="_self">DIA DEL AMIGO<span class="despliegue">▼</span></a>
									<ul>
										<li><a href="amigos" title="Evento 3-1" target="_self">AMIGOS</a></li>
									</ul>						
								</li>
							</ul>
						</li>
						<!-- Opción Login -->
						<li><a href="login">LOGIN <span class="glyphicon glyphicon-user"></span> </a></li>
					</ul>
				</nav>
			</div>
    	</nav>
</header>
<!---Cuerpo -->

<!--Pie de págna-->

<footer class="footer">
	<div class="content clearfix">
		<div class="footer-1">
			<div class="logofoot">
				<img alt="Papus Club" src="images/logo-min.png" title="Papus Club">				
			</div>
			<div class="contacto">
				<ul class="info">
						<li><a href="#" title="telefono">(51) 1 523 4910</a></li>
						<li><span><img class="PointImg" src="images/punto.png" width="3px" height="3px"></img></span></li>
						<li><a href="#" title="e-mail">papus</a></li>
				</ul>
				<ul class="terminos-condiciones">
						<li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
						<li><span><img class="PointImg" src="images/punto.png" width="3px" height="3px"></img></span></li>
						<li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
						<li><span><img class="PointImg" src="images/punto.png" width="3px" height="3px"></img></span></li>
						<li><a href="#" title="MAPA DE SITIO">MAPA DE SITIO</a></li>
				</ul>
					
			</div>
		</div>
	</div>
</footer>
<main class="main">
	<div class="content" style="max-width: 100%;">
		<!-- Utilizando Bootstrap -->
		<br/><br/>
	

		<div class="container">
			<div class="row">
				<h2>PAPUS CLUB</h2>
				<br>
			<!-- col-sm-4 crea 3 columnas del mismo tamaño -->
	  			<div class="col-sm-4 nopadding">
	  			<!-- bxslider es un plugin que permite crear sucesión de imagenes -->
	                <ul class="bxslider">
	                    <li><img class="slider img-responsive" src="images/rugby.jpg" /></li>
	                    <li><img class="slider img-responsive" src="images/tennis.jpg" /></li>
	                    <li><img class="slider img-responsive" src="images/remo.jpg" /></li>
	                </ul>  						
	  			</div>
	  			<div class="col-sm-4 nopadding">
	            	<ul class="bxslider">
	               		<li><img class="slider" src="images/bungalows-1.jpg" /></li>
	                	<li><img class="slider" src="images/bungalows-2.jpg" /></li>
	                	<li><img class="slider" src="images/bungalows-3.jpg" /></li>
	            	</ul>  						 			
	  			</div>
	  			<div class="col-sm-4 nopadding">
	            	<ul class="bxslider">
	                	<li><img class="slider" src="images/ajedrez.jpg" /></li>
	                	<li><img class="slider" src="images/teatro.jpg" /></li>
	                	<li><img class="slider" src="images/contradanza.jpg" /></li>
	            	</ul>   			
	  			</div>
			</div>
		</div>			
		<div class="container">
			<div class="content">
				<div class="row">
							<a class="convenios col-sm-3 text-center" href="convenios" title="Convenios">
								<img alt="convenio" src="images/conection.png">CONVENIOS
							</a>					
				
							<a class="concesiones col-sm-3 text-center" href="concesiones" title="concesiones">
								<img alt="concesiones" src="images/restaurante.png">CONCESIONES
							</a>
					
							<a class="galeria col-sm-3 text-center" href="galeria" title="galeria">
								<img alt="galeria" src="images/image.png">GALERÍA
							</a>
							<a class="informes col-sm-3 text-center" href="informes" title="informes">
								<img alt="informes" src="images/person.png">INFORMES ASOCIADOS
							</a>
				</div>
			</div>
		</div>
	</div>		
<!-- JQuery -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Bootstrap -->
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<!-- BXSlider -->
	<script src="js/jquery.bxslider.min.js"></script>
	<!-- Mis Scripts -->
	<script src="js/MisScripts.js"></script>


</body>
</html>

""")))})),format.raw/*220.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 24 11:07:01 COT 2016
                    SOURCE: C:/Users/Sebastián/hello-play-java/DP1-Sistema/app/views/index.scala.html
                    HASH: 01f01b358f738734659c99975b69d7c29108cd92
                    MATRIX: 774->1|885->18|922->21|963->54|1002->56|9327->8349
                    LINES: 26->1|29->1|31->3|31->3|31->3|248->220
                    -- GENERATED --
                */
            