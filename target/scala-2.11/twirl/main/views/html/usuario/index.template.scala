
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
						<th><div align=center>ID</div></th>
						<th><div align=center>USUARIO</div></th>
						<th><div align=center>CONTRASEÑA</div></th>													
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*53.7*/for(usuario <- usuarios) yield /*53.31*/{_display_(Seq[Any](format.raw/*53.32*/("""
						"""),format.raw/*54.7*/("""<tr>
							<td>"""),_display_(/*55.13*/usuario/*55.20*/.id),format.raw/*55.23*/("""</td>
							<td>"""),_display_(/*56.13*/usuario/*56.20*/.nombre),format.raw/*56.27*/("""</td>
							<td>"""),_display_(/*57.13*/usuario/*57.20*/.contraseña),format.raw/*57.31*/("""</td>							
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
					""")))}),format.raw/*68.7*/("""
					"""),format.raw/*69.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*79.17*/routes/*79.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*79.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*81.17*/routes/*81.23*/.Assets.at("js/bootstrap.js")),format.raw/*81.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*83.17*/routes/*83.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*83.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*85.17*/routes/*85.23*/.Assets.at("js/MisScripts.js")),format.raw/*85.53*/("""'></script>

		<script src='"""),_display_(/*87.17*/routes/*87.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*87.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*90.32*/("""{"""),format.raw/*90.33*/("""
		   """),format.raw/*91.6*/("""$('#example').DataTable( """),format.raw/*91.31*/("""{"""),format.raw/*91.32*/("""
		       """),format.raw/*92.10*/(""""language": """),format.raw/*92.22*/("""{"""),format.raw/*92.23*/("""
		           """),format.raw/*93.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*94.10*/("""}"""),format.raw/*94.11*/("""
		  	"""),format.raw/*95.6*/("""}"""),format.raw/*95.7*/(""");
  		"""),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");
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
                  DATE: Tue Nov 08 06:26:07 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/usuario/index.scala.html
                  HASH: fef7d3bb9003348beeded407ee6d85fc942a724c
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2868->1592|2908->1616|2947->1617|2982->1625|3027->1643|3043->1650|3067->1653|3113->1672|3129->1679|3157->1686|3203->1705|3219->1712|3251->1723|3849->2291|3883->2298|4035->2423|4050->2429|4108->2466|4186->2517|4201->2523|4251->2552|4329->2603|4344->2609|4404->2648|4486->2703|4501->2709|4552->2739|4610->2770|4625->2776|4683->2813|4771->2873|4800->2874|4834->2881|4887->2906|4916->2907|4955->2918|4995->2930|5024->2931|5067->2946|5174->3025|5203->3026|5237->3033|5265->3034|5300->3042|5328->3043
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|99->68|100->69|110->79|110->79|110->79|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|125->94|125->94|126->95|126->95|127->96|127->96
                  -- GENERATED --
              */
          