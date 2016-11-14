
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
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*77.36*/routes/*77.42*/.CiudadesC.newO()),format.raw/*77.59*/("""' title="Registrar Aeropuerto" >Registrar Aeropuerto<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!-- JQuery -->
	<script src='"""),_display_(/*83.16*/routes/*83.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*83.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*85.16*/routes/*85.22*/.Assets.at("js/bootstrap.js")),format.raw/*85.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*87.16*/routes/*87.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*87.61*/("""'></script>
	
	<script src='"""),_display_(/*89.16*/routes/*89.22*/.Assets.at("js/jquery.dataTables.js")),format.raw/*89.59*/("""'></script>

	<script>
		$(document).ready(function() """),format.raw/*92.32*/("""{"""),format.raw/*92.33*/("""
		   """),format.raw/*93.6*/("""$('#example').DataTable( """),format.raw/*93.31*/("""{"""),format.raw/*93.32*/("""
		       """),format.raw/*94.10*/(""""language": """),format.raw/*94.22*/("""{"""),format.raw/*94.23*/("""
		           """),format.raw/*95.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*96.10*/("""}"""),format.raw/*96.11*/("""
		  	"""),format.raw/*97.6*/("""}"""),format.raw/*97.7*/(""");
  		"""),format.raw/*98.5*/("""}"""),format.raw/*98.6*/(""");
	</script>
	</body>
	</html>

""")))}),format.raw/*103.2*/("""
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
                  DATE: Sun Nov 13 18:57:45 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/index.scala.html
                  HASH: 34cbdb3661c27a6c838c03a360eaab872d5ede0c
                  MATRIX: 767->1|894->33|922->36|936->43|989->88|1028->90|1066->102|1286->295|1301->301|1359->338|1422->374|1437->380|1490->412|1553->448|1568->454|1620->485|1683->521|1698->527|1753->561|1817->598|1832->604|1884->635|2928->1653|2967->1676|3006->1677|3041->1685|3086->1703|3101->1709|3133->1720|3179->1739|3194->1745|3222->1752|3268->1771|3283->1777|3309->1782|3355->1801|3370->1807|3409->1825|4000->2386|4034->2393|4259->2591|4274->2597|4312->2614|4492->2767|4507->2773|4565->2810|4641->2859|4656->2865|4706->2894|4782->2943|4797->2949|4857->2988|4915->3019|4930->3025|4988->3062|5073->3119|5102->3120|5136->3127|5189->3152|5218->3153|5257->3164|5297->3176|5326->3177|5369->3192|5476->3271|5505->3272|5539->3279|5567->3280|5602->3288|5630->3289|5700->3328
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|82->51|82->51|82->51|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|98->67|99->68|108->77|108->77|108->77|114->83|114->83|114->83|116->85|116->85|116->85|118->87|118->87|118->87|120->89|120->89|120->89|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|128->97|129->98|129->98|134->103
                  -- GENERATED --
              */
          