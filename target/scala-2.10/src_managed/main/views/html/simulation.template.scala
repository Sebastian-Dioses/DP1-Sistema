
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
object simulation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Welcome to Play Framework")/*2.35*/ {_display_(Seq[Any](format.raw/*2.37*/("""
    
    <!DOCTYPE html>
	<html>
	<head>
		<title>Simulation</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css"))),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css"))),format.raw/*14.73*/("""'>	
		
	</head>
	<body>
	extends('layouts.headerandfooter-al-admin')

		
	section('content')

	<!---Cuerpo -->

	<main class="main">
		<div class="content" style="max-width: 100%;">
			<!-- Utilizando Bootstrap -->			
			<br/><br/>
			<div class="container">
				<div class="row">
		  			<div class="col-sm-12 withoutpadding" >
		                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(Seq[Any](/*32.110*/routes/*32.116*/.Assets.at("images/simulation.gif"))),format.raw/*32.151*/(""""/>
		  			</div>
				</div>
			</div>			
			<div class="container">
			<div class="row">
				<div class="col-sm-12 text-center">
					<div class="header">
					  <h1 style="color:green">Bienvenido <strong>USER</strong></h1>
					  <h2 style="color:green">usted se ha logueado como <strong>administrador general</strong> del Club Pappus</h2>
					</div>
					
				</div>
			</div>
		</div>	
		</div>		
	</main>

	<!--Pie de págna-->
		stop
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

""")))})),format.raw/*65.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 24 17:51:49 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                    HASH: 1d801d6637dba5d046e016d73f317269d01046a8
                    MATRIX: 869->3|910->36|949->38|1193->246|1208->252|1267->289|1339->325|1354->331|1408->363|1480->399|1495->405|1548->436|1620->472|1635->478|1691->512|2183->967|2199->973|2257->1008|3074->1794
                    LINES: 29->2|29->2|29->2|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|59->32|59->32|59->32|92->65
                    -- GENERATED --
                */
            