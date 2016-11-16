
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
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*74.7*/for(vuelo <- vuelos) yield /*74.27*/{_display_(Seq[Any](format.raw/*74.28*/("""
						"""),format.raw/*75.7*/("""<tr>
							<td>"""),_display_(/*76.13*/vuelo/*76.18*/.ciudad_origen),format.raw/*76.32*/("""</td>
							<td>"""),_display_(/*77.13*/vuelo/*77.18*/.ciudad_destino),format.raw/*77.33*/("""</td>
							<td>"""),_display_(/*78.13*/vuelo/*78.18*/.hora_salida.format("HH:mm")),format.raw/*78.46*/("""</td>							
							<td>"""),_display_(/*79.13*/vuelo/*79.18*/.hora_llegada.format("HH:mm")),format.raw/*79.47*/("""</td>
							<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*87.68*/routes/*87.74*/.VuelosC.delete(vuelo.id)),format.raw/*87.99*/("""' ><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*90.7*/("""
					"""),format.raw/*91.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*100.36*/routes/*100.42*/.VuelosC.newO()),format.raw/*100.57*/("""' title="Registrar Plan de Vuelo" >Registrar Plan de Vuelo<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*108.17*/routes/*108.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*108.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*110.17*/routes/*110.23*/.Assets.at("js/bootstrap.js")),format.raw/*110.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*112.17*/routes/*112.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*112.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*114.17*/routes/*114.23*/.Assets.at("js/MisScripts.js")),format.raw/*114.53*/("""'></script>

		<script src='"""),_display_(/*116.17*/routes/*116.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*116.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*119.32*/("""{"""),format.raw/*119.33*/("""
		   """),format.raw/*120.6*/("""$('#example').DataTable( """),format.raw/*120.31*/("""{"""),format.raw/*120.32*/("""
		       """),format.raw/*121.10*/(""""language": """),format.raw/*121.22*/("""{"""),format.raw/*121.23*/("""
		           """),format.raw/*122.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*123.10*/("""}"""),format.raw/*123.11*/("""
		  	"""),format.raw/*124.6*/("""}"""),format.raw/*124.7*/(""");
  		"""),format.raw/*125.5*/("""}"""),format.raw/*125.6*/(""");
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
                  DATE: Tue Nov 15 20:03:14 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/vuelo/index.scala.html
                  HASH: 933c0d160efd279b791bd1c33b00ac79340294b3
                  MATRIX: 764->1|887->29|915->32|929->39|982->84|1021->86|1059->98|1285->297|1300->303|1358->340|1421->376|1436->382|1489->414|1552->450|1567->456|1619->487|1682->523|1697->529|1752->563|1816->600|1831->606|1883->637|2141->869|2182->901|2222->903|2259->913|2470->1097|2484->1102|2520->1117|2557->1127|2600->1140|2635->1149|2674->1179|2714->1181|2751->1191|2961->1374|2975->1379|3009->1392|3046->1402|3089->1415|3124->1424|3162->1453|3202->1455|3239->1465|3446->1645|3460->1650|3493->1662|3530->1672|3573->1685|3605->1690|4404->2463|4440->2483|4479->2484|4514->2492|4559->2510|4573->2515|4608->2529|4654->2548|4668->2553|4704->2568|4750->2587|4764->2592|4813->2620|4866->2646|4880->2651|4930->2680|5359->3082|5374->3088|5420->3113|5556->3219|5590->3226|5816->3424|5832->3430|5869->3445|6083->3631|6099->3637|6158->3674|6237->3725|6253->3731|6304->3760|6383->3811|6399->3817|6460->3856|6543->3911|6559->3917|6611->3947|6670->3978|6686->3984|6745->4021|6834->4081|6864->4082|6899->4089|6953->4114|6983->4115|7023->4126|7064->4138|7094->4139|7138->4154|7246->4233|7276->4234|7311->4241|7340->4242|7376->4250|7405->4251
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|80->49|82->51|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|118->87|118->87|118->87|121->90|122->91|131->100|131->100|131->100|139->108|139->108|139->108|141->110|141->110|141->110|143->112|143->112|143->112|145->114|145->114|145->114|147->116|147->116|147->116|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|154->123|154->123|155->124|155->124|156->125|156->125
                  -- GENERATED --
              */
          