
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
object simulation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    <!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css"))),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css"))),format.raw/*15.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*16.33*/routes/*16.39*/.Assets.at("css/DataTable.css"))),format.raw/*16.70*/("""'>	
	
	</head>
	<body>
	

	<!---Cuerpo -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12 text-center">
				<p class="lead"><strong>SIMULACIÓN</strong></p>				
			</div>
		</div>
	</div>

	<div class="content" style="max-width: 100%;">
		<!-- Utilizando Bootstrap -->			
		<br/>
		<div class="container">
			<div class="row">
	  			<div class="col-sm-12 withoutpadding" >
	                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(Seq[Any](/*37.109*/routes/*37.115*/.Assets.at("images/simulation.gif"))),format.raw/*37.150*/(""""/>
	  			</div>
			</div>
		</div>			

		<br/><br/><br/>
		<div class="container">
			<div class="btn-group btn-group-justified">
				<a type="button" class="btn btn-primary">Iniciar</a>
				<a type="button" class="btn btn-primary">Ver Resultados</a>				
				<div class="btn-group">
					<select class="form-control" id="sel1"> Duración de la Simulación
						<option>20 min.</option>
						<option>1 hora</option>
						<option>3 horas</option>
						<option>Indefinido</option>
					</select>
				</div>
			</div>
		</div>		
	</div>		
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(Seq[Any](/*63.17*/routes/*63.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*63.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*65.17*/routes/*65.23*/.Assets.at("js/bootstrap.js"))),format.raw/*65.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*67.17*/routes/*67.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*67.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*69.17*/routes/*69.23*/.Assets.at("js/MisScripts.js"))),format.raw/*69.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*71.17*/routes/*71.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*71.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*74.32*/("""{"""),format.raw/*74.33*/("""
		   $('#example').DataTable( """),format.raw/*75.31*/("""{"""),format.raw/*75.32*/("""
		       "language": """),format.raw/*76.22*/("""{"""),format.raw/*76.23*/("""
		           "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*78.10*/("""}"""),format.raw/*78.11*/("""
		  	"""),format.raw/*79.6*/("""}"""),format.raw/*79.7*/(""");
  		"""),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""");
		</script>
	</body>
	</html>

""")))})),format.raw/*85.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 12:54:29 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                    HASH: 577c60773848cf8c559db447616b62abd45c0798
                    MATRIX: 779->1|888->16|927->21|941->28|994->73|1033->75|1276->282|1291->288|1350->325|1422->361|1437->367|1491->399|1563->435|1578->441|1631->472|1703->508|1718->514|1774->548|1847->585|1862->591|1915->622|2476->1146|2492->1152|2550->1187|3210->1811|3225->1817|3284->1854|3371->1905|3386->1911|3437->1940|3524->1991|3539->1997|3600->2036|3691->2091|3706->2097|3758->2127|3825->2158|3840->2164|3899->2201|3987->2261|4016->2262|4076->2294|4105->2295|4156->2318|4185->2319|4307->2413|4336->2414|4370->2421|4398->2422|4433->2430|4461->2431|4532->2471
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|65->37|65->37|65->37|91->63|91->63|91->63|93->65|93->65|93->65|95->67|95->67|95->67|97->69|97->69|97->69|99->71|99->71|99->71|102->74|102->74|103->75|103->75|104->76|104->76|106->78|106->78|107->79|107->79|108->80|108->80|113->85
                    -- GENERATED --
                */
            