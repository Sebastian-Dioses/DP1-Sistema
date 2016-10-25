
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
object users extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
						<th><div align=center>CUENTA</div></th>
						<th><div align=center>NOMBRE</div></th>
						<th><div align=center>APELLIDO</div></th>
						<th><div align=center>TIPO DE CUENTA</div></th>							
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					
						<tr>
							<td>s.dioses</td>
							<td>Sebastián</td>
							<td>Dioses</td>			
							<td>Administrador</td>
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
							<td>m.milera</td>
							<td>Marcelo</td>
							<td>Milera</td>			
							<td>Administrador</td>
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
							<td>n.guerra</td>
							<td>Nilton</td>
							<td>Guerra</td>			
							<td>Cliente</td>
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
							<td>j.gil</td>
							<td>José</td>
							<td>Gil</td>			
							<td>Cliente</td>
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
		<script src='"""),_display_(Seq[Any](/*126.17*/routes/*126.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*126.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*128.17*/routes/*128.23*/.Assets.at("js/bootstrap.js"))),format.raw/*128.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*130.17*/routes/*130.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*130.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(Seq[Any](/*132.17*/routes/*132.23*/.Assets.at("js/MisScripts.js"))),format.raw/*132.53*/("""'></script>

		<script src='"""),_display_(Seq[Any](/*134.17*/routes/*134.23*/.Assets.at("js/jquery.dataTables.js"))),format.raw/*134.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
		   $('#example').DataTable( """),format.raw/*138.31*/("""{"""),format.raw/*138.32*/("""
		       "language": """),format.raw/*139.22*/("""{"""),format.raw/*139.23*/("""
		           "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*141.10*/("""}"""),format.raw/*141.11*/("""
		  	"""),format.raw/*142.6*/("""}"""),format.raw/*142.7*/(""");
  		"""),format.raw/*143.5*/("""}"""),format.raw/*143.6*/(""");
		</script>
	</body>
	</html>

""")))})),format.raw/*148.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 10:20:58 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/users.scala.html
                    HASH: f3d59817d25e188ebe9645434d775c942cf1d5d7
                    MATRIX: 774->1|883->16|920->19|934->26|987->71|1026->73|1260->271|1275->277|1334->314|1405->349|1420->355|1474->387|1545->422|1560->428|1613->459|1684->494|1699->500|1755->534|1827->570|1842->576|1895->607|5301->3976|5317->3982|5377->4019|5463->4068|5479->4074|5531->4103|5617->4152|5633->4158|5695->4197|5785->4250|5801->4256|5854->4286|5920->4315|5936->4321|5996->4358|6082->4415|6112->4416|6172->4447|6202->4448|6253->4470|6283->4471|6404->4563|6434->4564|6468->4570|6497->4571|6532->4578|6561->4579|6628->4614
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|154->126|154->126|154->126|156->128|156->128|156->128|158->130|158->130|158->130|160->132|160->132|160->132|162->134|162->134|162->134|165->137|165->137|166->138|166->138|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143|176->148
                    -- GENERATED --
                */
            