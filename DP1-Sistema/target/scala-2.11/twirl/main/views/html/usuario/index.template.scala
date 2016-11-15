
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
		"""),format.raw/*31.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>¡Éxito!</strong> """),_display_(/*33.30*/flash/*33.35*/.get("success")),format.raw/*33.50*/("""
		"""),format.raw/*34.3*/("""</div>
	""")))}),format.raw/*35.3*/("""

	"""),_display_(/*37.3*/if(flash.containsKey("error"))/*37.33*/ {_display_(Seq[Any](format.raw/*37.35*/("""
		"""),format.raw/*38.3*/("""<div class="alert alert-danger fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>¡Error!</strong> Indicates a dangerous or potentially negative action.
		</div>
	""")))}),format.raw/*42.3*/("""

	"""),format.raw/*44.2*/("""<div class="table-responsive">
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
					"""),_display_(/*67.7*/for(usuario <- usuarios) yield /*67.31*/{_display_(Seq[Any](format.raw/*67.32*/("""
						"""),format.raw/*68.7*/("""<tr>
							<td>"""),_display_(/*69.13*/usuario/*69.20*/.id),format.raw/*69.23*/("""</td>
							<td>"""),_display_(/*70.13*/usuario/*70.20*/.nombre),format.raw/*70.27*/("""</td>							
							<td>"""),_display_(/*71.13*/usuario/*71.20*/.persona.nombre),format.raw/*71.35*/("""</td>
							<td>"""),_display_(/*72.13*/usuario/*72.20*/.persona.correo),format.raw/*72.35*/("""</td>
							<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*80.68*/routes/*80.74*/.UsuariosC.delete(usuario.id)),format.raw/*80.103*/("""'><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*83.7*/("""
					"""),format.raw/*84.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*94.17*/routes/*94.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*94.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*96.17*/routes/*96.23*/.Assets.at("js/bootstrap.js")),format.raw/*96.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*98.17*/routes/*98.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*98.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*100.17*/routes/*100.23*/.Assets.at("js/MisScripts.js")),format.raw/*100.53*/("""'></script>

		<script src='"""),_display_(/*102.17*/routes/*102.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*102.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*105.32*/("""{"""),format.raw/*105.33*/("""
		   """),format.raw/*106.6*/("""$('#example').DataTable( """),format.raw/*106.31*/("""{"""),format.raw/*106.32*/("""
		       """),format.raw/*107.10*/(""""language": """),format.raw/*107.22*/("""{"""),format.raw/*107.23*/("""
		           """),format.raw/*108.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*109.10*/("""}"""),format.raw/*109.11*/("""
		  	"""),format.raw/*110.6*/("""}"""),format.raw/*110.7*/(""");
  		"""),format.raw/*111.5*/("""}"""),format.raw/*111.6*/(""");
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
<<<<<<< HEAD
                  DATE: Sun Nov 13 19:04:21 COT 2016
=======
                  DATE: Mon Nov 14 18:04:38 COT 2016
>>>>>>> marcelo
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/usuario/index.scala.html
                  HASH: d040e0b8cfde0baa1469fd6c53bf877505b10bcc
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2139->863|2180->895|2220->897|2251->901|2432->1055|2446->1060|2482->1075|2513->1079|2553->1089|2585->1095|2624->1125|2664->1127|2695->1131|2944->1350|2976->1355|3761->2114|3801->2138|3840->2139|3875->2147|3920->2165|3936->2172|3960->2175|4006->2194|4022->2201|4050->2208|4103->2234|4119->2241|4155->2256|4201->2275|4217->2282|4253->2297|4682->2699|4697->2705|4748->2734|4883->2839|4917->2846|5069->2971|5084->2977|5142->3014|5220->3065|5235->3071|5285->3100|5363->3151|5378->3157|5438->3196|5521->3251|5537->3257|5589->3287|5648->3318|5664->3324|5723->3361|5812->3421|5842->3422|5877->3429|5931->3454|5961->3455|6001->3466|6042->3478|6072->3479|6116->3494|6224->3573|6254->3574|6289->3581|6318->3582|6354->3590|6383->3591
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|73->42|75->44|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|111->80|111->80|111->80|114->83|115->84|125->94|125->94|125->94|127->96|127->96|127->96|129->98|129->98|129->98|131->100|131->100|131->100|133->102|133->102|133->102|136->105|136->105|137->106|137->106|137->106|138->107|138->107|138->107|139->108|140->109|140->109|141->110|141->110|142->111|142->111
                  -- GENERATED --
              */
          