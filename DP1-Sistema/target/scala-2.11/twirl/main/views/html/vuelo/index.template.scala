
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
	
	"""),_display_(/*30.3*/if(flash.containsKey("success"))/*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
        """),format.raw/*31.9*/("""<div class="alert alert-success fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Éxito!</strong> """),_display_(/*33.39*/flash/*33.44*/.get("success")),format.raw/*33.59*/("""
        """),format.raw/*34.9*/("""</div>
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/if(flash.containsKey("error"))/*37.36*/ {_display_(Seq[Any](format.raw/*37.38*/("""
        """),format.raw/*38.9*/("""<div class="alert alert-danger fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Error!</strong> """),_display_(/*40.39*/flash/*40.44*/.get("error")),format.raw/*40.57*/("""
        """),format.raw/*41.9*/("""</div>
    """)))}),format.raw/*42.6*/("""

    """),_display_(/*44.6*/if(flash.containsKey("info"))/*44.35*/ {_display_(Seq[Any](format.raw/*44.37*/("""
        """),format.raw/*45.9*/("""<div class="alert alert-info fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Info!</strong> """),_display_(/*47.38*/flash/*47.43*/.get("info")),format.raw/*47.55*/("""
        """),format.raw/*48.9*/("""</div>
    """)))}),format.raw/*49.6*/("""

	"""),format.raw/*51.2*/("""<div class="table-responsive">
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
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*73.7*/for(vuelo <- vuelos) yield /*73.27*/{_display_(Seq[Any](format.raw/*73.28*/("""
						"""),format.raw/*74.7*/("""<tr>
							<td>"""),_display_(/*75.13*/vuelo/*75.18*/.ciudad_origen),format.raw/*75.32*/("""</td>
							<td>"""),_display_(/*76.13*/vuelo/*76.18*/.ciudad_destino),format.raw/*76.33*/("""</td>
							<td>"""),_display_(/*77.13*/vuelo/*77.18*/.hora_salida.format("HH:mm")),format.raw/*77.46*/("""</td>							
							<td>"""),_display_(/*78.13*/vuelo/*78.18*/.hora_llegada.format("HH:mm")),format.raw/*78.47*/("""</td>
							<td>
				              <a class="btn btn-info" href='"""),_display_(/*80.50*/routes/*80.56*/.VuelosC.edit(vuelo.id)),format.raw/*80.79*/("""' title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*83.68*/routes/*83.74*/.VuelosC.delete(vuelo.id)),format.raw/*83.99*/("""' ><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*86.7*/("""
					"""),format.raw/*87.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*96.36*/routes/*96.42*/.VuelosC.newO()),format.raw/*96.57*/("""' title="Registrar Plan de Vuelo" >Registrar Plan de Vuelo<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*104.17*/routes/*104.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*104.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*106.17*/routes/*106.23*/.Assets.at("js/bootstrap.js")),format.raw/*106.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*108.17*/routes/*108.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*108.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*110.17*/routes/*110.23*/.Assets.at("js/MisScripts.js")),format.raw/*110.53*/("""'></script>

		<script src='"""),_display_(/*112.17*/routes/*112.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*112.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*115.32*/("""{"""),format.raw/*115.33*/("""
		   """),format.raw/*116.6*/("""$('#example').DataTable( """),format.raw/*116.31*/("""{"""),format.raw/*116.32*/("""
		       """),format.raw/*117.10*/(""""language": """),format.raw/*117.22*/("""{"""),format.raw/*117.23*/("""
		           """),format.raw/*118.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*119.10*/("""}"""),format.raw/*119.11*/("""
		  	"""),format.raw/*120.6*/("""}"""),format.raw/*120.7*/(""");
  		"""),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""");
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
                  DATE: Tue Nov 15 19:14:52 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/vuelo/index.scala.html
                  HASH: f54b3725df0f31fc1541cfa67399452e39d89901
                  MATRIX: 764->1|887->29|915->32|929->39|982->84|1021->86|1059->98|1285->297|1300->303|1358->340|1421->376|1436->382|1489->414|1552->450|1567->456|1619->487|1682->523|1697->529|1752->563|1816->600|1831->606|1883->637|2141->869|2182->901|2222->903|2259->913|2470->1097|2484->1102|2520->1117|2557->1127|2600->1140|2635->1149|2674->1179|2714->1181|2751->1191|2961->1374|2975->1379|3009->1392|3046->1402|3089->1415|3124->1424|3162->1453|3202->1455|3239->1465|3446->1645|3460->1650|3493->1662|3530->1672|3573->1685|3605->1690|4356->2415|4392->2435|4431->2436|4466->2444|4511->2462|4525->2467|4560->2481|4606->2500|4620->2505|4656->2520|4702->2539|4716->2544|4765->2572|4818->2598|4832->2603|4882->2632|4978->2701|4993->2707|5037->2730|5242->2908|5257->2914|5303->2939|5439->3045|5473->3052|5698->3250|5713->3256|5749->3271|5963->3457|5979->3463|6038->3500|6117->3551|6133->3557|6184->3586|6263->3637|6279->3643|6340->3682|6423->3737|6439->3743|6491->3773|6550->3804|6566->3810|6625->3847|6714->3907|6744->3908|6779->3915|6833->3940|6863->3941|6903->3952|6944->3964|6974->3965|7018->3980|7126->4059|7156->4060|7191->4067|7220->4068|7256->4076|7285->4077
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|80->49|82->51|104->73|104->73|104->73|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|114->83|114->83|114->83|117->86|118->87|127->96|127->96|127->96|135->104|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|141->110|141->110|141->110|143->112|143->112|143->112|146->115|146->115|147->116|147->116|147->116|148->117|148->117|148->117|149->118|150->119|150->119|151->120|151->120|152->121|152->121
                  -- GENERATED --
              */
          