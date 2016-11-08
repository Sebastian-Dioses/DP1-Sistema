
package views.html.pedido

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Pedidos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pedidos:List[models.Pedidos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
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
						<th><div align=center>ID</div></th>
						<th><div align=center>ORIGEN</div></th>
						<th><div align=center>DESTINO</div></th>							
						<th><div align=center>REMITENTE</div></th>	
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*51.7*/for(pedido <- pedidos) yield /*51.29*/{_display_(Seq[Any](format.raw/*51.30*/("""
						"""),format.raw/*52.7*/("""<tr>
							<td>"""),_display_(/*53.13*/pedido/*53.19*/.id),format.raw/*53.22*/("""</td>
							<td>"""),_display_(/*54.13*/pedido/*54.19*/.ciudad_origen),format.raw/*54.33*/("""</td>
							<td>"""),_display_(/*55.13*/pedido/*55.19*/.ciudad_destino),format.raw/*55.34*/("""</td>							
							<td>"""),_display_(/*56.13*/pedido/*56.19*/.personas_id),format.raw/*56.31*/("""</td>
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

  def render(pedidos:List[models.Pedidos]): play.twirl.api.HtmlFormat.Appendable = apply(pedidos)

  def f:((List[models.Pedidos]) => play.twirl.api.HtmlFormat.Appendable) = (pedidos) => apply(pedidos)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 11:30:36 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/pedido/index.scala.html
                  HASH: 47014363a7565ecfd6870fdb7dc93f9683f9d4fc
                  MATRIX: 766->1|891->31|919->34|933->41|986->86|1025->88|1063->100|1283->293|1298->299|1356->336|1419->372|1434->378|1487->410|1550->446|1565->452|1617->483|1680->519|1695->525|1750->559|1814->596|1829->602|1881->633|2931->1657|2969->1679|3008->1680|3043->1688|3088->1706|3103->1712|3127->1715|3173->1734|3188->1740|3223->1754|3269->1773|3284->1779|3320->1794|3373->1820|3388->1826|3421->1838|4012->2399|4046->2406|4168->2501|4183->2507|4241->2544|4317->2593|4332->2599|4382->2628|4458->2677|4473->2683|4533->2722|4591->2753|4606->2759|4664->2796|4749->2853|4778->2854|4812->2861|4865->2886|4894->2887|4933->2898|4973->2910|5002->2911|5045->2926|5152->3005|5181->3006|5215->3013|5243->3014|5278->3022|5306->3023|5375->3062
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|98->67|99->68|106->75|106->75|106->75|108->77|108->77|108->77|110->79|110->79|110->79|112->81|112->81|112->81|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|119->88|119->88|120->89|120->89|121->90|121->90|126->95
                  -- GENERATED --
              */
          