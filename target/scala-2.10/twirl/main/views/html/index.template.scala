
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
		<link rel='stylesheet' href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css")),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css")),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css")),format.raw/*14.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/DataTable.css")),format.raw/*15.70*/("""'>	
	
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
		<script src='"""),_display_(/*31.17*/routes/*31.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*31.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*33.17*/routes/*33.23*/.Assets.at("js/bootstrap.js")),format.raw/*33.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*35.17*/routes/*35.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*35.62*/("""'></script>		

	</body>
	</html>

""")))}),format.raw/*40.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 02:35:40 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/index.scala.html
                  HASH: 108814a25e7d2f1751f94b0b919dfa367ffd5f71
                  MATRIX: 745->1|855->16|885->21|899->28|952->73|991->75|1029->87|1249->280|1264->286|1322->323|1385->359|1400->365|1453->397|1516->433|1531->439|1583->470|1646->506|1661->512|1716->546|1780->583|1795->589|1847->620|2168->914|2183->920|2241->957|2319->1008|2334->1014|2384->1043|2462->1094|2477->1100|2537->1139|2607->1179
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|62->31|62->31|62->31|64->33|64->33|64->33|66->35|66->35|66->35|71->40
                  -- GENERATED --
              */
          