
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css")),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css")),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css")),format.raw/*15.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*16.33*/routes/*16.39*/.Assets.at("css/DataTable.css")),format.raw/*16.70*/("""'>	
	
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
		<script src='"""),_display_(/*126.17*/routes/*126.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*126.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*128.17*/routes/*128.23*/.Assets.at("js/bootstrap.js")),format.raw/*128.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*130.17*/routes/*130.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*130.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*132.17*/routes/*132.23*/.Assets.at("js/MisScripts.js")),format.raw/*132.53*/("""'></script>

		<script src='"""),_display_(/*134.17*/routes/*134.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*134.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
		   """),format.raw/*138.6*/("""$('#example').DataTable( """),format.raw/*138.31*/("""{"""),format.raw/*138.32*/("""
		       """),format.raw/*139.10*/(""""language": """),format.raw/*139.22*/("""{"""),format.raw/*139.23*/("""
		           """),format.raw/*140.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*141.10*/("""}"""),format.raw/*141.11*/("""
		  	"""),format.raw/*142.6*/("""}"""),format.raw/*142.7*/(""");
  		"""),format.raw/*143.5*/("""}"""),format.raw/*143.6*/(""");
		</script>
	</body>
	</html>

""")))}))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 02:35:42 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/users.scala.html
                  HASH: a5af579a7501caab6c964071ecfa6d46e638a44f
                  MATRIX: 745->1|855->16|885->21|899->28|952->73|991->75|1029->87|1251->282|1266->288|1324->325|1387->361|1402->367|1455->399|1518->435|1533->441|1585->472|1648->508|1663->514|1718->548|1782->585|1797->591|1849->622|5356->4101|5372->4107|5431->4144|5510->4195|5526->4201|5577->4230|5656->4281|5672->4287|5733->4326|5816->4381|5832->4387|5884->4417|5943->4448|5959->4454|6018->4491|6107->4551|6137->4552|6172->4559|6226->4584|6256->4585|6296->4596|6337->4608|6367->4609|6411->4624|6519->4703|6549->4704|6584->4711|6613->4712|6649->4720|6678->4721
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|157->126|157->126|157->126|159->128|159->128|159->128|161->130|161->130|161->130|163->132|163->132|163->132|165->134|165->134|165->134|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|172->141|172->141|173->142|173->142|174->143|174->143
                  -- GENERATED --
              */
          