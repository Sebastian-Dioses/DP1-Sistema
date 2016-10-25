
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


	<div class="content" style="max-width: 100%;">
		<!-- Utilizando Bootstrap -->			
		<br/><br/>
		<div class="container">
			<div class="row">
	  			<div class="col-sm-12 withoutpadding" >
	                <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(Seq[Any](/*31.109*/routes/*31.115*/.Assets.at("images/simulation.gif"))),format.raw/*31.150*/(""""/>
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
		<script src='"""),_display_(Seq[Any](/*143.17*/routes/*143.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*143.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*145.17*/routes/*145.23*/.Assets.at("js/bootstrap.js"))),format.raw/*145.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*147.17*/routes/*147.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*147.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*149.17*/routes/*149.23*/.Assets.at("js/MisScripts.js"))),format.raw/*149.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*151.17*/routes/*151.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*151.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*154.32*/("""{"""),format.raw/*154.33*/("""
		   $('#example').DataTable( """),format.raw/*155.31*/("""{"""),format.raw/*155.32*/("""
		       "language": """),format.raw/*156.22*/("""{"""),format.raw/*156.23*/("""
		           "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*158.10*/("""}"""),format.raw/*158.11*/("""
		  	"""),format.raw/*159.6*/("""}"""),format.raw/*159.7*/(""");
  		"""),format.raw/*160.5*/("""}"""),format.raw/*160.6*/(""");
		</script>
	</body>
	</html>

""")))})),format.raw/*165.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 24 22:37:59 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/simulation.scala.html
                    HASH: ee21f82078c3f71152b84d1096a4f40fafdf562a
                    MATRIX: 779->1|888->16|927->21|941->28|994->73|1033->75|1276->282|1291->288|1350->325|1422->361|1437->367|1491->399|1563->435|1578->441|1631->472|1703->508|1718->514|1774->548|1847->585|1862->591|1915->622|2309->979|2325->985|2383->1020|6066->4666|6082->4672|6142->4709|6230->4760|6246->4766|6298->4795|6386->4846|6402->4852|6464->4891|6556->4946|6572->4952|6625->4982|6693->5013|6709->5019|6769->5056|6858->5116|6888->5117|6949->5149|6979->5150|7031->5173|7061->5174|7184->5268|7214->5269|7249->5276|7278->5277|7314->5285|7343->5286|7415->5326
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|59->31|59->31|59->31|171->143|171->143|171->143|173->145|173->145|173->145|175->147|175->147|175->147|177->149|177->149|177->149|179->151|179->151|179->151|182->154|182->154|183->155|183->155|184->156|184->156|186->158|186->158|187->159|187->159|188->160|188->160|193->165
                    -- GENERATED --
                */
            