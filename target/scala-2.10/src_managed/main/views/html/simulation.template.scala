
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object simulation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    <!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css"))),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css"))),format.raw/*15.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*16.33*/routes/*16.39*/.Assets.at("css/DataTable.css"))),format.raw/*16.70*/("""'>	
	
	</head>
	<body>
	

	<!---Cuerpo -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12 text-center">
				<p class="lead"><strong>SIMULACIÓN</strong></p>				
			</div>
		</div>
	</div>

	<div class="content" style="max-width: 100%;">
		<!-- Utilizando Bootstrap -->			
		<br/>
		<div class="container">
			<div class="row">
	  			<div class="col-sm-12 withoutpadding" >
	                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(Seq[Any](/*37.109*/routes/*37.115*/.Assets.at("images/simulation.gif"))),format.raw/*37.150*/(""""/>
	  			</div>
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
						<th><div align=center>N° DE PEDIDO</div></th>
						<th><div align=center>CLIENTE</div></th>
						<th><div align=center>N° DE PAQUETES</div></th>
						<th><div align=center>ESTADO</div></th>							
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					
						<tr>
							<td>1</td>
							<td>Marcelo Milera</td>
							<td>10</td>			
							<td>En espera</td>
							<td>
				              <a class="btn btn-info"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info"  title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar"><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
						<tr>
							<td>2</td>
							<td>Sebastian</td>
							<td>20</td>			
							<td>En vuelo</td>
							<td>
				              <a class="btn btn-info"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info"  title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar"><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
			            <tr>
							<td>3</td>
							<td>José Luis Gil</td>
							<td>2</td>			
							<td>En espera</td>
							<td>
				              <a class="btn btn-info"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info"  title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar"><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
			            <tr>
							<td>4</td>
							<td>Nilton Guerra</td>
							<td>10</td>			
							<td>En espera</td>
							<td>
				              <a class="btn btn-info"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info"  title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar"><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					</tbody>												
			</table>
		</div>		
	</div>
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(Seq[Any](/*138.17*/routes/*138.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*138.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*140.17*/routes/*140.23*/.Assets.at("js/bootstrap.js"))),format.raw/*140.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*142.17*/routes/*142.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*142.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*144.17*/routes/*144.23*/.Assets.at("js/MisScripts.js"))),format.raw/*144.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*146.17*/routes/*146.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*146.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*149.32*/("""{"""),format.raw/*149.33*/("""
		   $('#example').DataTable( """),format.raw/*150.31*/("""{"""),format.raw/*150.32*/("""
		       "language": """),format.raw/*151.22*/("""{"""),format.raw/*151.23*/("""
		           "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*153.10*/("""}"""),format.raw/*153.11*/("""
		  	"""),format.raw/*154.6*/("""}"""),format.raw/*154.7*/(""");
  		"""),format.raw/*155.5*/("""}"""),format.raw/*155.6*/(""");
		</script>
	</body>
	</html>

""")))})),format.raw/*160.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 07:12:29 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                    HASH: 5f56b475cd59225a886e247f08b9cef59e11fba6
                    MATRIX: 779->1|888->16|925->19|939->26|992->71|1031->73|1265->271|1280->277|1339->314|1410->349|1425->355|1479->387|1550->422|1565->428|1618->459|1689->494|1704->500|1760->534|1832->570|1847->576|1900->607|2440->1110|2456->1116|2514->1151|5746->4346|5762->4352|5822->4389|5908->4438|5924->4444|5976->4473|6062->4522|6078->4528|6140->4567|6230->4620|6246->4626|6299->4656|6365->4685|6381->4691|6441->4728|6527->4785|6557->4786|6617->4817|6647->4818|6698->4840|6728->4841|6849->4933|6879->4934|6913->4940|6942->4941|6977->4948|7006->4949|7073->4984
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|65->37|65->37|65->37|166->138|166->138|166->138|168->140|168->140|168->140|170->142|170->142|170->142|172->144|172->144|172->144|174->146|174->146|174->146|177->149|177->149|178->150|178->150|179->151|179->151|181->153|181->153|182->154|182->154|183->155|183->155|188->160
                    -- GENERATED --
                */
            