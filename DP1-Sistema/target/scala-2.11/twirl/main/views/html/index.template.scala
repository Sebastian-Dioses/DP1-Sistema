
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Ciudades],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ciudades:List[models.Ciudades]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*10.33*/routes/*10.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*10.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.at("css/MisEstilos.css")),format.raw/*11.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/bootstrap.css")),format.raw/*12.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/font-awesome.css")),format.raw/*13.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/DataTable.css")),format.raw/*14.70*/("""'>			
	</head>
	<body>
	
	<!---Cuerpo -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12 text-center">
				<p class="lead"><strong>AEROPUERTOS</strong></p>
			</div>
		</div>
	</div>	
	<!--Pie de págna-->
	
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
						<th><div align=center>CÓDIGO</div></th>
						<th><div align=center>CIUDAD</div></th>
						<th><div align=center>PAÍS</div></th>							
						<th><div align=center>CAP. ALMACÉN</div></th>	
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*51.7*/for(ciudad <- ciudades) yield /*51.30*/{_display_(Seq[Any](format.raw/*51.31*/("""
						"""),format.raw/*52.7*/("""<tr>
							<td>"""),_display_(/*53.13*/ciudad/*53.19*/.cod_ciudad),format.raw/*53.30*/("""</td>
							<td>"""),_display_(/*54.13*/ciudad/*54.19*/.nombre),format.raw/*54.26*/("""</td>
							<td>"""),_display_(/*55.13*/ciudad/*55.19*/.pais),format.raw/*55.24*/("""</td>
							<td>"""),_display_(/*56.13*/ciudad/*56.19*/.capacidad_almacen),format.raw/*56.37*/("""</td>
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
					""")))}),format.raw/*67.7*/("""
					"""),format.raw/*68.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>

	<!-- JQuery -->
	<script src='"""),_display_(/*75.16*/routes/*75.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*75.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*77.16*/routes/*77.22*/.Assets.at("js/bootstrap.js")),format.raw/*77.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*79.16*/routes/*79.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*79.61*/("""'></script>
	
	<script src='"""),_display_(/*81.16*/routes/*81.22*/.Assets.at("js/jquery.dataTables.js")),format.raw/*81.59*/("""'></script>

	<script>
		$(document).ready(function() """),format.raw/*84.32*/("""{"""),format.raw/*84.33*/("""
		   """),format.raw/*85.6*/("""$('#example').DataTable( """),format.raw/*85.31*/("""{"""),format.raw/*85.32*/("""
		       """),format.raw/*86.10*/(""""language": """),format.raw/*86.22*/("""{"""),format.raw/*86.23*/("""
		           """),format.raw/*87.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*88.10*/("""}"""),format.raw/*88.11*/("""
		  	"""),format.raw/*89.6*/("""}"""),format.raw/*89.7*/(""");
  		"""),format.raw/*90.5*/("""}"""),format.raw/*90.6*/(""");
	</script>
	</body>
	</html>

""")))}),format.raw/*95.2*/("""
"""))
      }
    }
  }

  def render(ciudades:List[models.Ciudades]): play.twirl.api.HtmlFormat.Appendable = apply(ciudades)

  def f:((List[models.Ciudades]) => play.twirl.api.HtmlFormat.Appendable) = (ciudades) => apply(ciudades)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 19:04:05 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/index.scala.html
                  HASH: 21445a5acffc95a406710c3337ed063e92c6506b
                  MATRIX: 760->1|887->33|915->36|929->43|982->88|1021->90|1059->102|1279->295|1294->301|1352->338|1415->374|1430->380|1483->412|1546->448|1561->454|1613->485|1676->521|1691->527|1746->561|1810->598|1825->604|1877->635|2921->1653|2960->1676|2999->1677|3034->1685|3079->1703|3094->1709|3126->1720|3172->1739|3187->1745|3215->1752|3261->1771|3276->1777|3302->1782|3348->1801|3363->1807|3402->1825|3993->2386|4027->2393|4149->2488|4164->2494|4222->2531|4298->2580|4313->2586|4363->2615|4439->2664|4454->2670|4514->2709|4572->2740|4587->2746|4645->2783|4730->2840|4759->2841|4793->2848|4846->2873|4875->2874|4914->2885|4954->2897|4983->2898|5026->2913|5133->2992|5162->2993|5196->3000|5224->3001|5259->3009|5287->3010|5356->3049
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|98->67|99->68|106->75|106->75|106->75|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|119->88|119->88|120->89|120->89|121->90|121->90|126->95
                  -- GENERATED --
              */
          