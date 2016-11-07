
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
				<p class="lead"><strong>BIENVENIDO A SIMUSOFT</strong></p>
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
						<th><div align=center>PRODUCTO</div></th>
						<th><div align=center>PRECIO</div></th>
						<th><div align=center>TIPO</div></th>							
						<th><div align=center>STOCK</div></th>	
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*51.7*/for(ciudad <- ciudades) yield /*51.30*/{_display_(Seq[Any](format.raw/*51.31*/("""
						"""),format.raw/*52.7*/("""<tr>
							<td>"""),_display_(/*53.13*/ciudad/*53.19*/.idciudad),format.raw/*53.28*/("""</td>
							<td>"""),_display_(/*54.13*/ciudad/*54.19*/.cod_ciudad),format.raw/*54.30*/("""</td>
							<td>"""),_display_(/*55.13*/ciudad/*55.19*/.nombre),format.raw/*55.26*/("""</td>
							<td>"""),_display_(/*56.13*/ciudad/*56.19*/.pais),format.raw/*56.24*/("""</td>
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
                  DATE: Mon Nov 07 15:47:12 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/index.scala.html
                  HASH: 64f0793316932f0534903de29ee50784b99b63de
                  MATRIX: 760->1|887->33|915->36|929->43|982->88|1021->90|1059->102|1279->295|1294->301|1352->338|1415->374|1430->380|1483->412|1546->448|1561->454|1613->485|1676->521|1691->527|1746->561|1810->598|1825->604|1877->635|2926->1658|2965->1681|3004->1682|3039->1690|3084->1708|3099->1714|3129->1723|3175->1742|3190->1748|3222->1759|3268->1778|3283->1784|3311->1791|3357->1810|3372->1816|3398->1821|3989->2382|4023->2389|4145->2484|4160->2490|4218->2527|4294->2576|4309->2582|4359->2611|4435->2660|4450->2666|4510->2705|4568->2736|4583->2742|4641->2779|4726->2836|4755->2837|4789->2844|4842->2869|4871->2870|4910->2881|4950->2893|4979->2894|5022->2909|5129->2988|5158->2989|5192->2996|5220->2997|5255->3005|5283->3006|5352->3045
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|98->67|99->68|106->75|106->75|106->75|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|119->88|119->88|120->89|120->89|121->90|121->90|126->95
                  -- GENERATED --
              */
          