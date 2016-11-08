
package views.html.ciudad

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
                  DATE: Tue Nov 08 06:26:06 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/ciudad/index.scala.html
                  HASH: 21445a5acffc95a406710c3337ed063e92c6506b
                  MATRIX: 767->1|894->33|922->36|936->43|989->88|1028->90|1066->102|1286->295|1301->301|1359->338|1422->374|1437->380|1490->412|1553->448|1568->454|1620->485|1683->521|1698->527|1753->561|1817->598|1832->604|1884->635|2928->1653|2967->1676|3006->1677|3041->1685|3086->1703|3101->1709|3133->1720|3179->1739|3194->1745|3222->1752|3268->1771|3283->1777|3309->1782|3355->1801|3370->1807|3409->1825|4000->2386|4034->2393|4156->2488|4171->2494|4229->2531|4305->2580|4320->2586|4370->2615|4446->2664|4461->2670|4521->2709|4579->2740|4594->2746|4652->2783|4737->2840|4766->2841|4800->2848|4853->2873|4882->2874|4921->2885|4961->2897|4990->2898|5033->2913|5140->2992|5169->2993|5203->3000|5231->3001|5266->3009|5294->3010|5363->3049
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|98->67|99->68|106->75|106->75|106->75|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|119->88|119->88|120->89|120->89|121->90|121->90|126->95
                  -- GENERATED --
              */
          