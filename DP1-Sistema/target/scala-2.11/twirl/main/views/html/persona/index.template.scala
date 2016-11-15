
package views.html.persona

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Personas],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(personas:List[models.Personas]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>PERSONAS</title>
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
				<p class="lead"><strong>PERSONAS</strong></p>				
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
						<th><div align=center>DNI</div></th>
						<th><div align=center>CORREO</div></th>
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*54.7*/for(persona <- personas) yield /*54.31*/{_display_(Seq[Any](format.raw/*54.32*/("""
						"""),format.raw/*55.7*/("""<tr>
							<td>"""),_display_(/*56.13*/persona/*56.20*/.id),format.raw/*56.23*/("""</td>
							<td>"""),_display_(/*57.13*/persona/*57.20*/.nombre),format.raw/*57.27*/("""</td>
							<td>"""),_display_(/*58.13*/persona/*58.20*/.dni),format.raw/*58.24*/("""</td>							
							<td>"""),_display_(/*59.13*/persona/*59.20*/.correo),format.raw/*59.27*/("""</td>
							<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*67.68*/routes/*67.74*/.PersonasC.delete(persona.id)),format.raw/*67.103*/("""' ><i class="glyphicon glyphicon-remove"></i></a>    
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

  def render(personas:List[models.Personas]): play.twirl.api.HtmlFormat.Appendable = apply(personas)

  def f:((List[models.Personas]) => play.twirl.api.HtmlFormat.Appendable) = (personas) => apply(personas)

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
                  DATE: Mon Nov 14 19:26:12 COT 2016
>>>>>>> marcelo
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/persona/index.scala.html
                  HASH: ee37c5e06d792327eaf26e405a3b8bdfac31a981
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2895->1619|2935->1643|2974->1644|3009->1652|3054->1670|3070->1677|3094->1680|3140->1699|3156->1706|3184->1713|3230->1732|3246->1739|3271->1743|3324->1769|3340->1776|3368->1783|3797->2185|3812->2191|3863->2220|3999->2326|4033->2333|4185->2458|4200->2464|4258->2501|4336->2552|4351->2558|4401->2587|4479->2638|4494->2644|4554->2683|4636->2738|4651->2744|4702->2774|4760->2805|4775->2811|4833->2848|4921->2908|4950->2909|4984->2916|5037->2941|5066->2942|5105->2953|5145->2965|5174->2966|5217->2981|5324->3060|5353->3061|5387->3068|5415->3069|5450->3077|5478->3078
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|98->67|98->67|98->67|101->70|102->71|112->81|112->81|112->81|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|128->97|129->98|129->98
                  -- GENERATED --
              */
          