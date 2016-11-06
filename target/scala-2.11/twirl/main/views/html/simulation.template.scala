
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object simulation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class simulation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css")),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css")),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css")),format.raw/*15.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*16.33*/routes/*16.39*/.Assets.at("css/DataTable.css")),format.raw/*16.70*/("""'>	
	
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
	                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(/*37.109*/routes/*37.115*/.Assets.at("images/simulation.gif")),format.raw/*37.150*/(""""/>
	  			</div>
			</div>
		</div>			

		<br/><br/><br/>
		<div class="container">
			<div class="btn-group btn-group-justified">
				<a type="button" class="btn btn-primary">Iniciar</a>
				<a type="button" class="btn btn-primary">Ver Resultados</a>				
				<div class="btn-group">
					<select class="form-control" id="sel1" >
						<option>Duración de la Simulación</option>
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
		<script src='"""),_display_(/*64.17*/routes/*64.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*64.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*66.17*/routes/*66.23*/.Assets.at("js/bootstrap.js")),format.raw/*66.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*68.17*/routes/*68.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*68.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*70.17*/routes/*70.23*/.Assets.at("js/MisScripts.js")),format.raw/*70.53*/("""'></script>

		<script src='"""),_display_(/*72.17*/routes/*72.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*72.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*75.32*/("""{"""),format.raw/*75.33*/("""
		   """),format.raw/*76.6*/("""$('#example').DataTable( """),format.raw/*76.31*/("""{"""),format.raw/*76.32*/("""
		       """),format.raw/*77.10*/(""""language": """),format.raw/*77.22*/("""{"""),format.raw/*77.23*/("""
		           """),format.raw/*78.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*79.10*/("""}"""),format.raw/*79.11*/("""
		  	"""),format.raw/*80.6*/("""}"""),format.raw/*80.7*/(""");
  		"""),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
		</script>
	</body>
	</html>

""")))}),format.raw/*86.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object simulation extends simulation_Scope0.simulation
              /*
                  -- GENERATED --
                  DATE: Sun Nov 06 16:26:57 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                  HASH: ea75e8b28e1f1f1e95b0a313d53db797a095d49c
                  MATRIX: 755->1|865->16|895->21|909->28|962->73|1001->75|1039->87|1261->282|1276->288|1334->325|1397->361|1412->367|1465->399|1528->435|1543->441|1595->472|1658->508|1673->514|1728->548|1792->585|1807->591|1859->622|2411->1146|2427->1152|2484->1187|3160->1836|3175->1842|3233->1879|3311->1930|3326->1936|3376->1965|3454->2016|3469->2022|3529->2061|3611->2116|3626->2122|3677->2152|3735->2183|3750->2189|3808->2226|3896->2286|3925->2287|3959->2294|4012->2319|4041->2320|4080->2331|4120->2343|4149->2344|4192->2359|4299->2438|4328->2439|4362->2446|4390->2447|4425->2455|4453->2456|4523->2496
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|68->37|68->37|68->37|95->64|95->64|95->64|97->66|97->66|97->66|99->68|99->68|99->68|101->70|101->70|101->70|103->72|103->72|103->72|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|110->79|110->79|111->80|111->80|112->81|112->81|117->86
                  -- GENERATED --
              */
          