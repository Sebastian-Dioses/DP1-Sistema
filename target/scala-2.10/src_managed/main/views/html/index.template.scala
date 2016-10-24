
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
    
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
	extends('layouts.headerandfooter-al-admin')

		
	section('content')

	<!---Cuerpo -->

	<main class="main">
		<div class="content" style="max-width: 100%;">
			<!-- Utilizando Bootstrap -->			
			<br/><br/>
			<div class="container">
				<div class="row">
		  			<div class="col-sm-12 withoutpadding" >
		                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(Seq[Any](/*34.110*/routes/*34.116*/.Assets.at("images/simulation.gif"))),format.raw/*34.151*/(""""/>
		  			</div>
				</div>
			</div>			
		<div class="container">
			<div class="row">
				<div class="col-sm-12 text-center">
					<div class="header">
					  <h1 style="color:green">Bienvenido <strong>USER</strong></h1>
					  <h2 style="color:green">usted se ha logueado como <strong>administrador general</strong> del Club Pappus</h2>
					</div>
					
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
		
			<table class="table" id="example">
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
	</main>

	<!--Pie de págna-->
		stop
	<!-- JQuery -->
		<script src='"""),_display_(Seq[Any](/*146.17*/routes/*146.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*146.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*148.17*/routes/*148.23*/.Assets.at("js/bootstrap.js"))),format.raw/*148.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*150.17*/routes/*150.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*150.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*152.17*/routes/*152.23*/.Assets.at("js/MisScripts.js"))),format.raw/*152.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*154.17*/routes/*154.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*154.60*/("""'></script>
		
	</body>
	</html>

""")))})),format.raw/*159.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 24 12:46:36 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/index.scala.html
                    HASH: 3c6b2281184cc5d9503fb11320604bd06745f864
                    MATRIX: 774->1|885->18|924->23|965->56|1004->58|1247->265|1262->271|1321->308|1393->344|1408->350|1462->382|1534->418|1549->424|1602->455|1674->491|1689->497|1745->531|1818->568|1833->574|1886->605|2377->1059|2393->1065|2451->1100|6203->4815|6219->4821|6279->4858|6367->4909|6383->4915|6435->4944|6523->4995|6539->5001|6601->5040|6693->5095|6709->5101|6762->5131|6830->5162|6846->5168|6906->5205|6978->5245
                    LINES: 26->1|29->1|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|62->34|62->34|62->34|174->146|174->146|174->146|176->148|176->148|176->148|178->150|178->150|178->150|180->152|180->152|180->152|182->154|182->154|182->154|187->159
                    -- GENERATED --
                */
            