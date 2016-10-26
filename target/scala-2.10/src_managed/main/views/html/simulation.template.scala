
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
		<script src='"""),_display_(Seq[Any](/*64.17*/routes/*64.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*64.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*66.17*/routes/*66.23*/.Assets.at("js/bootstrap.js"))),format.raw/*66.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*68.17*/routes/*68.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*68.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*70.17*/routes/*70.23*/.Assets.at("js/MisScripts.js"))),format.raw/*70.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*72.17*/routes/*72.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*72.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*75.32*/("""{"""),format.raw/*75.33*/("""
		   $('#example').DataTable( """),format.raw/*76.31*/("""{"""),format.raw/*76.32*/("""
		       "language": """),format.raw/*77.22*/("""{"""),format.raw/*77.23*/("""
		           "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*79.10*/("""}"""),format.raw/*79.11*/("""
		  	"""),format.raw/*80.6*/("""}"""),format.raw/*80.7*/(""");
  		"""),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
		</script>
	</body>
	</html>

""")))})),format.raw/*86.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
<<<<<<< HEAD
                    DATE: Tue Oct 25 16:02:08 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
=======
                    DATE: Tue Oct 25 17:51:39 COT 2016
=======
                    DATE: Tue Oct 25 18:51:54 COT 2016
>>>>>>> origin/JL
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
>>>>>>> origin/JL
                    HASH: 963fdaa461022842e85bdf9965652d973bc34eda
                    MATRIX: 779->1|888->16|927->21|941->28|994->73|1033->75|1276->282|1291->288|1350->325|1422->361|1437->367|1491->399|1563->435|1578->441|1631->472|1703->508|1718->514|1774->548|1847->585|1862->591|1915->622|2476->1146|2492->1152|2550->1187|3235->1836|3250->1842|3309->1879|3396->1930|3411->1936|3462->1965|3549->2016|3564->2022|3625->2061|3716->2116|3731->2122|3783->2152|3850->2183|3865->2189|3924->2226|4012->2286|4041->2287|4101->2319|4130->2320|4181->2343|4210->2344|4332->2438|4361->2439|4395->2446|4423->2447|4458->2455|4486->2456|4557->2496
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|65->37|65->37|65->37|92->64|92->64|92->64|94->66|94->66|94->66|96->68|96->68|96->68|98->70|98->70|98->70|100->72|100->72|100->72|103->75|103->75|104->76|104->76|105->77|105->77|107->79|107->79|108->80|108->80|109->81|109->81|114->86
                    -- GENERATED --
                */
            