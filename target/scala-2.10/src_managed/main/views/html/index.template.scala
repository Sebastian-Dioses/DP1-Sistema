
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
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css"))),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css"))),format.raw/*14.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("css/DataTable.css"))),format.raw/*15.70*/("""'>	
	
	</head>
	<body>
	
	<!---Cuerpo -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12 text-center">
				<p class="lead"><strong>BIENVENIDO A SIMUSOFT</strong></p>				
			</div>
		</div>
	</div>	
	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(Seq[Any](/*31.17*/routes/*31.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*31.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*33.17*/routes/*33.23*/.Assets.at("js/bootstrap.js"))),format.raw/*33.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*35.17*/routes/*35.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*35.62*/("""'></script>		

	</body>
	</html>

""")))})),format.raw/*40.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Tue Oct 25 16:02:06 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/index.scala.html
=======
                    DATE: Tue Oct 25 17:51:39 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/index.scala.html
>>>>>>> origin/JL
                    HASH: b8cea344fcd29dadc81bd0da8ff74615dbe9de4f
                    MATRIX: 774->1|883->16|922->21|936->28|989->73|1028->75|1269->280|1284->286|1343->323|1415->359|1430->365|1484->397|1556->433|1571->439|1624->470|1696->506|1711->512|1767->546|1840->583|1855->589|1908->620|2238->914|2253->920|2312->957|2399->1008|2414->1014|2465->1043|2552->1094|2567->1100|2628->1139|2699->1179
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|59->31|59->31|59->31|61->33|61->33|61->33|63->35|63->35|63->35|68->40
                    -- GENERATED --
                */
            