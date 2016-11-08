
package views.html.vuelo

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Vuelos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vuelos:List[models.Vuelos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>PLAN DE VUELO</title>
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
				<p class="lead"><strong>PLAN DE VUELO</strong></p>				
			</div>
		</div>
	</div>
	

	<div class="table-responsive">
		<div class="container">
			<div class="form-group">
			  		<div class="text-right">
			  			<font color="black"> 
			  				Filtra por todos los campos
			  			</font>
			  			
			  		</div>
			</div>
			<table class="table table-bordered table-hover text-center display" id="example">
					<thead class="active" data-sortable="true">
						<th><div align=center>ORIGEN</div></th>
						<th><div align=center>DESTINO</div></th>
						<th><div align=center>HORA SALIDA</div></th>
						<th><div align=center>HORA LLEGADA</div></th>
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*54.7*/for(vuelo <- vuelos) yield /*54.27*/{_display_(Seq[Any](format.raw/*54.28*/("""
						"""),format.raw/*55.7*/("""<tr>
							<td>"""),_display_(/*56.13*/vuelo/*56.18*/.ciudad_origen),format.raw/*56.32*/("""</td>
							<td>"""),_display_(/*57.13*/vuelo/*57.18*/.ciudad_destino),format.raw/*57.33*/("""</td>
							<td>"""),_display_(/*58.13*/vuelo/*58.18*/.hora_salida.format("HH:mm")),format.raw/*58.46*/("""</td>							
							<td>"""),_display_(/*59.13*/vuelo/*59.18*/.hora_llegada.format("HH:mm")),format.raw/*59.47*/("""</td>
							<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" data-href="#" data-toggle="modal" data-target="#modalEliminar"><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*70.7*/("""
					"""),format.raw/*71.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*81.17*/routes/*81.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*81.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*83.17*/routes/*83.23*/.Assets.at("js/bootstrap.js")),format.raw/*83.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*85.17*/routes/*85.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*85.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*87.17*/routes/*87.23*/.Assets.at("js/MisScripts.js")),format.raw/*87.53*/("""'></script>

		<script src='"""),_display_(/*89.17*/routes/*89.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*89.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*92.32*/("""{"""),format.raw/*92.33*/("""
		   """),format.raw/*93.6*/("""$('#example').DataTable( """),format.raw/*93.31*/("""{"""),format.raw/*93.32*/("""
		       """),format.raw/*94.10*/(""""language": """),format.raw/*94.22*/("""{"""),format.raw/*94.23*/("""
		           """),format.raw/*95.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*96.10*/("""}"""),format.raw/*96.11*/("""
		  	"""),format.raw/*97.6*/("""}"""),format.raw/*97.7*/(""");
  		"""),format.raw/*98.5*/("""}"""),format.raw/*98.6*/(""");
		</script>
	</body>
	</html>

""")))}))
      }
    }
  }

  def render(vuelos:List[models.Vuelos]): play.twirl.api.HtmlFormat.Appendable = apply(vuelos)

  def f:((List[models.Vuelos]) => play.twirl.api.HtmlFormat.Appendable) = (vuelos) => apply(vuelos)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 17:09:25 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/vuelo/index.scala.html
                  HASH: aa513a8039244065f24d6d9e27c803a532fa7502
                  MATRIX: 764->1|887->29|915->32|929->39|982->84|1021->86|1059->98|1285->297|1300->303|1358->340|1421->376|1436->382|1489->414|1552->450|1567->456|1619->487|1682->523|1697->529|1752->563|1816->600|1831->606|1883->637|2915->1643|2951->1663|2990->1664|3025->1672|3070->1690|3084->1695|3119->1709|3165->1728|3179->1733|3215->1748|3261->1767|3275->1772|3324->1800|3377->1826|3391->1831|3441->1860|4032->2421|4066->2428|4218->2553|4233->2559|4291->2596|4369->2647|4384->2653|4434->2682|4512->2733|4527->2739|4587->2778|4669->2833|4684->2839|4735->2869|4793->2900|4808->2906|4866->2943|4954->3003|4983->3004|5017->3011|5070->3036|5099->3037|5138->3048|5178->3060|5207->3061|5250->3076|5357->3155|5386->3156|5420->3163|5448->3164|5483->3172|5511->3173
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|101->70|102->71|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|128->97|129->98|129->98
                  -- GENERATED --
              */
          