
package views.html.usuario

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Usuarios],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios:List[models.Usuarios]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>USUARIOS</title>
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
				<p class="lead"><strong>USUARIOS</strong></p>				
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
						<th><div align=center>ID</div></th>
						<th><div align=center>USUARIO</div></th>
						<th><div align=center>PERSONA</div></th>
						<th><div align=center>CORREO</div></th>
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*74.7*/for(usuario <- usuarios) yield /*74.31*/{_display_(Seq[Any](format.raw/*74.32*/("""
						"""),format.raw/*75.7*/("""<tr>
							<td>"""),_display_(/*76.13*/usuario/*76.20*/.id),format.raw/*76.23*/("""</td>
							<td>"""),_display_(/*77.13*/usuario/*77.20*/.nombre),format.raw/*77.27*/("""</td>							
							<td>"""),_display_(/*78.13*/usuario/*78.20*/.persona.nombre),format.raw/*78.35*/("""</td>
							<td>"""),_display_(/*79.13*/usuario/*79.20*/.persona.correo),format.raw/*79.35*/("""</td>
							<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*87.68*/routes/*87.74*/.UsuariosC.delete(usuario.id)),format.raw/*87.103*/("""'><i class="glyphicon glyphicon-remove"></i></a>    
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
				<a class="btn btn-info" href='"""),_display_(/*100.36*/routes/*100.42*/.UsuariosC.newO()),format.raw/*100.59*/("""' title="Registrar Usuario" >Registrar Usuario<i class="glyphicon" ></i> </a>	
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

  def render(usuarios:List[models.Usuarios]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[models.Usuarios]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 12:40:25 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/usuario/index.scala.html
                  HASH: 6a6dae68f611eebe682ee7a01e1d6128bbb59160
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2139->863|2180->895|2220->897|2257->907|2468->1091|2482->1096|2518->1111|2555->1121|2598->1134|2633->1143|2672->1173|2712->1175|2749->1185|2959->1368|2973->1373|3007->1386|3044->1396|3087->1409|3122->1418|3160->1447|3200->1449|3237->1459|3444->1639|3458->1644|3491->1656|3528->1666|3571->1679|3603->1684|4388->2443|4428->2467|4467->2468|4502->2476|4547->2494|4563->2501|4587->2504|4633->2523|4649->2530|4677->2537|4730->2563|4746->2570|4782->2585|4828->2604|4844->2611|4880->2626|5309->3028|5324->3034|5375->3063|5510->3168|5544->3175|5770->3373|5786->3379|5825->3396|6027->3570|6043->3576|6102->3613|6181->3664|6197->3670|6248->3699|6327->3750|6343->3756|6404->3795|6487->3850|6503->3856|6555->3886|6614->3917|6630->3923|6689->3960|6778->4020|6808->4021|6843->4028|6897->4053|6927->4054|6967->4065|7008->4077|7038->4078|7082->4093|7190->4172|7220->4173|7255->4180|7284->4181|7320->4189|7349->4190
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|80->49|82->51|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|118->87|118->87|118->87|121->90|122->91|131->100|131->100|131->100|139->108|139->108|139->108|141->110|141->110|141->110|143->112|143->112|143->112|145->114|145->114|145->114|147->116|147->116|147->116|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|154->123|154->123|155->124|155->124|156->125|156->125
                  -- GENERATED --
              */
          