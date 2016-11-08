
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
						<th><div align=center>PERSONA</div></th>
						<th><div align=center>CORREO</div></th>
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*54.7*/for(usuario <- usuarios) yield /*54.31*/{_display_(Seq[Any](format.raw/*54.32*/("""
						"""),format.raw/*55.7*/("""<tr>
							<td>"""),_display_(/*56.13*/usuario/*56.20*/.id),format.raw/*56.23*/("""</td>
							<td>"""),_display_(/*57.13*/usuario/*57.20*/.nombre),format.raw/*57.27*/("""</td>							
							<td>"""),_display_(/*58.13*/usuario/*58.20*/.persona.nombre),format.raw/*58.35*/("""</td>
							<td>"""),_display_(/*59.13*/usuario/*59.20*/.persona.correo),format.raw/*59.35*/("""</td>
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

  def render(usuarios:List[models.Usuarios]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[models.Usuarios]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 17:36:07 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/usuario/index.scala.html
                  HASH: 93bc82edaa63f62c8c5b9c8b9f003fdedc806b81
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2899->1623|2939->1647|2978->1648|3013->1656|3058->1674|3074->1681|3098->1684|3144->1703|3160->1710|3188->1717|3241->1743|3257->1750|3293->1765|3339->1784|3355->1791|3391->1806|3982->2367|4016->2374|4168->2499|4183->2505|4241->2542|4319->2593|4334->2599|4384->2628|4462->2679|4477->2685|4537->2724|4619->2779|4634->2785|4685->2815|4743->2846|4758->2852|4816->2889|4904->2949|4933->2950|4967->2957|5020->2982|5049->2983|5088->2994|5128->3006|5157->3007|5200->3022|5307->3101|5336->3102|5370->3109|5398->3110|5433->3118|5461->3119
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|101->70|102->71|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|128->97|129->98|129->98
                  -- GENERATED --
              */
          