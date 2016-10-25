
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

""")))})))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 17:51:39 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/users.scala.html
                    HASH: c976eaaf8e004592076f47c30731b3f8e2fd0a26
                    MATRIX: 774->1|883->16|922->21|936->28|989->73|1028->75|1271->282|1286->288|1345->325|1417->361|1432->367|1486->399|1558->435|1573->441|1626->472|1698->508|1713->514|1769->548|1842->585|1857->591|1910->622|5426->4101|5442->4107|5502->4144|5590->4195|5606->4201|5658->4230|5746->4281|5762->4287|5824->4326|5916->4381|5932->4387|5985->4417|6053->4448|6069->4454|6129->4491|6218->4551|6248->4552|6309->4584|6339->4585|6391->4608|6421->4609|6544->4703|6574->4704|6609->4711|6638->4712|6674->4720|6703->4721
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|154->126|154->126|154->126|156->128|156->128|156->128|158->130|158->130|158->130|160->132|160->132|160->132|162->134|162->134|162->134|165->137|165->137|166->138|166->138|167->139|167->139|169->141|169->141|170->142|170->142|171->143|171->143
                    -- GENERATED --
                */
            