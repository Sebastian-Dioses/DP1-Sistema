
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
			  <script src="https://www.amcharts.com/lib/3/ammap.js"></script>
<script src="https://www.amcharts.com/lib/3/maps/js/worldLow.js"></script>
		<script>
            // svg path for target icon
            var targetSVG = "M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z";
            // svg path for plane icon
            var planeSVG = "m2,106h28l24,30h72l-44,-133h35l80,132h98c21,0 21,34 0,34l-98,0 -80,134h-35l43,-133h-71l-24,30h-28l15,-47";


            AmCharts.makeChart("mapdiv", """),format.raw/*26.42*/("""{"""),format.raw/*26.43*/("""
                """),format.raw/*27.17*/("""type: "map",

                dataProvider: """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""
                    """),format.raw/*30.21*/("""map: "worldLow",
                    zoomLevel: 3.5,
                    zoomLongitude: -55,
                    zoomLatitude: 42,


                    lines: ["""),format.raw/*36.29*/("""{"""),format.raw/*36.30*/("""
                        """),format.raw/*37.25*/("""id: "line1",
                        arc: -0.85,
                        alpha: 0.3,
                        latitudes: [48.8567, 43.8163, 34.3, 23],
                        longitudes: [2.3510, -79.4287, -118.15, -82]
                    """),format.raw/*42.21*/("""}"""),format.raw/*42.22*/(""", """),format.raw/*42.24*/("""{"""),format.raw/*42.25*/("""
                        """),format.raw/*43.25*/("""id: "line2",
                        alpha: 0,
                        color: "#000000",
                        latitudes: [48.8567, 43.8163, 34.3, 23],
                        longitudes: [2.3510, -79.4287, -118.15, -82]
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""],
                    images: ["""),format.raw/*49.30*/("""{"""),format.raw/*49.31*/("""
                        """),format.raw/*50.25*/("""svgPath: targetSVG,
                        title: "Paris",
                        latitude: 48.8567,
                        longitude: 2.3510
                    """),format.raw/*54.21*/("""}"""),format.raw/*54.22*/(""", """),format.raw/*54.24*/("""{"""),format.raw/*54.25*/("""
                        """),format.raw/*55.25*/("""svgPath: targetSVG,
                        title: "Toronto",
                        latitude: 43.8163,
                        longitude: -79.4287
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/(""", """),format.raw/*59.24*/("""{"""),format.raw/*59.25*/("""
                        """),format.raw/*60.25*/("""svgPath: targetSVG,
                        title: "Los Angeles",
                        latitude: 34.3,
                        longitude: -118.15
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""", """),format.raw/*64.24*/("""{"""),format.raw/*64.25*/("""
                        """),format.raw/*65.25*/("""svgPath: targetSVG,
                        title: "Havana",
                        latitude: 23,
                        longitude: -82
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/(""", """),format.raw/*69.24*/("""{"""),format.raw/*69.25*/("""
                        """),format.raw/*70.25*/("""svgPath: planeSVG,
                        positionOnLine: 0,
                        color: "#000000",
                        alpha: 0.1,
                        animateAlongLine: true,
                        lineId: "line2",
                        flipDirection: true,
                        loop: true,
                        scale: 0.03,
                        positionScale: 1.3
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/(""", """),format.raw/*80.24*/("""{"""),format.raw/*80.25*/("""
                        """),format.raw/*81.25*/("""svgPath: planeSVG,
                        positionOnLine: 0,
                        color: "#585869",
                        animateAlongLine: true,
                        lineId: "line1",
                        flipDirection: true,
                        loop: true,
                        scale: 0.03,
                        positionScale: 1.8
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/("""]
                """),format.raw/*91.17*/("""}"""),format.raw/*91.18*/(""",

                areasSettings: """),format.raw/*93.32*/("""{"""),format.raw/*93.33*/("""
                    """),format.raw/*94.21*/("""unlistedAreasColor: "#8dd9ef"
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/(""",

                imagesSettings: """),format.raw/*97.33*/("""{"""),format.raw/*97.34*/("""
                    """),format.raw/*98.21*/("""color: "#585869",
                    rollOverColor: "#585869",
                    selectedColor: "#585869",
                    pauseDuration: 0.2,
                    animationDuration: 2.5,
                    adjustAnimationSpeed: true
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/(""",

                linesSettings: """),format.raw/*106.32*/("""{"""),format.raw/*106.33*/("""
                    """),format.raw/*107.21*/("""color: "#585869",
                    alpha: 0.4
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/(""");
        </script>	
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

 <div id="mapdiv" style="width: 100%; background-color:#d5eff7; height: 500px;"></div>
      
	<div class="content" style="max-width: 100%;">
		<!-- Utilizando Bootstrap -->			
		<br/>
		<div class="container">
			<div class="row">
	  			<div class="col-sm-12 withoutpadding" >
<!-- 	                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(/*133.114*/routes/*133.120*/.Assets.at("images/simulation.gif")),format.raw/*133.155*/(""""/> -->
	                
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

<script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
<script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

  <script src='https://code.jquery.com/jquery-1.11.2.min.js'></script>



		<script src='"""),_display_(/*170.17*/routes/*170.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*170.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*172.17*/routes/*172.23*/.Assets.at("js/bootstrap.js")),format.raw/*172.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*174.17*/routes/*174.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*174.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*176.17*/routes/*176.23*/.Assets.at("js/MisScripts.js")),format.raw/*176.53*/("""'></script>

		<script src='"""),_display_(/*178.17*/routes/*178.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*178.60*/("""'></script>
		<script src='"""),_display_(/*179.17*/routes/*179.23*/.Assets.at("js/animationAmongLines.js")),format.raw/*179.62*/("""'></script>
		<script>
		$(document).ready(function() """),format.raw/*181.32*/("""{"""),format.raw/*181.33*/("""
		   """),format.raw/*182.6*/("""$('#example').DataTable( """),format.raw/*182.31*/("""{"""),format.raw/*182.32*/("""
		       """),format.raw/*183.10*/(""""language": """),format.raw/*183.22*/("""{"""),format.raw/*183.23*/("""
		           """),format.raw/*184.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*185.10*/("""}"""),format.raw/*185.11*/("""
		  	"""),format.raw/*186.6*/("""}"""),format.raw/*186.7*/(""");
  		"""),format.raw/*187.5*/("""}"""),format.raw/*187.6*/(""");
		</script>
	</body>
	</html>

""")))}),format.raw/*192.2*/("""
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
                  DATE: Tue Nov 08 12:35:52 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                  HASH: 6ef287ac11c20b1dae4be923e43ba68435e2f40a
                  MATRIX: 755->1|865->16|895->21|909->28|962->73|1001->75|1039->87|1261->282|1276->288|1334->325|1397->361|1412->367|1465->399|1528->435|1543->441|1595->472|1658->508|1673->514|1728->548|1792->585|1807->591|1859->622|2587->1322|2616->1323|2662->1341|2736->1387|2765->1388|2815->1410|3010->1577|3039->1578|3093->1604|3365->1848|3394->1849|3424->1851|3453->1852|3507->1878|3783->2126|3812->2127|3873->2160|3902->2161|3956->2187|4153->2356|4182->2357|4212->2359|4241->2360|4295->2386|4496->2559|4525->2560|4555->2562|4584->2563|4638->2589|4839->2762|4868->2763|4898->2765|4927->2766|4981->2792|5171->2954|5200->2955|5230->2957|5259->2958|5313->2984|5761->3404|5790->3405|5820->3407|5849->3408|5903->3434|6314->3817|6343->3818|6390->3837|6419->3838|6483->3874|6512->3875|6562->3897|6637->3944|6666->3945|6731->3982|6760->3983|6810->4005|7102->4268|7132->4269|7197->4305|7227->4306|7278->4328|7374->4395|7404->4396|7447->4410|7477->4411|8147->5052|8164->5058|8222->5093|9280->6123|9296->6129|9355->6166|9434->6217|9450->6223|9501->6252|9580->6303|9596->6309|9657->6348|9740->6403|9756->6409|9808->6439|9867->6470|9883->6476|9942->6513|9999->6542|10015->6548|10076->6587|10161->6643|10191->6644|10226->6651|10280->6676|10310->6677|10350->6688|10391->6700|10421->6701|10465->6716|10573->6795|10603->6796|10638->6803|10667->6804|10703->6812|10732->6813|10803->6853
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|57->26|57->26|58->27|60->29|60->29|61->30|67->36|67->36|68->37|73->42|73->42|73->42|73->42|74->43|79->48|79->48|80->49|80->49|81->50|85->54|85->54|85->54|85->54|86->55|90->59|90->59|90->59|90->59|91->60|95->64|95->64|95->64|95->64|96->65|100->69|100->69|100->69|100->69|101->70|111->80|111->80|111->80|111->80|112->81|121->90|121->90|122->91|122->91|124->93|124->93|125->94|126->95|126->95|128->97|128->97|129->98|135->104|135->104|137->106|137->106|138->107|140->109|140->109|141->110|141->110|164->133|164->133|164->133|201->170|201->170|201->170|203->172|203->172|203->172|205->174|205->174|205->174|207->176|207->176|207->176|209->178|209->178|209->178|210->179|210->179|210->179|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|215->184|216->185|216->185|217->186|217->186|218->187|218->187|223->192
                  -- GENERATED --
              */
          