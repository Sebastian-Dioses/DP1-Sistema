
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
				<p class="lead"><strong>AEROPUERTOS</strong></p>
			</div>
		</div>
	</div>	
	<!--Pie de págna-->
	
	"""),_display_(/*28.3*/if(flash.containsKey("success"))/*28.35*/ {_display_(Seq[Any](format.raw/*28.37*/("""
		"""),format.raw/*29.3*/("""<div class="alert alert-success fade in text-center">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>¡Éxito!</strong> """),_display_(/*31.30*/flash/*31.35*/.get("success")),format.raw/*31.50*/("""
		"""),format.raw/*32.3*/("""</div>
	""")))}),format.raw/*33.3*/("""

	"""),_display_(/*35.3*/if(flash.containsKey("error"))/*35.33*/ {_display_(Seq[Any](format.raw/*35.35*/("""
		"""),format.raw/*36.3*/("""<div class="alert alert-danger fade in text-center">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>¡Error!</strong> """),_display_(/*38.30*/flash/*38.35*/.get("error")),format.raw/*38.48*/("""
		"""),format.raw/*39.3*/("""</div>
	""")))}),format.raw/*40.3*/("""

	"""),format.raw/*42.2*/("""<div class="table-responsive">
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
					"""),_display_(/*65.7*/for(ciudad <- ciudades) yield /*65.30*/{_display_(Seq[Any](format.raw/*65.31*/("""
						"""),format.raw/*66.7*/("""<tr>
							<td>"""),_display_(/*67.13*/ciudad/*67.19*/.cod_ciudad),format.raw/*67.30*/("""</td>
							<td>"""),_display_(/*68.13*/ciudad/*68.19*/.nombre),format.raw/*68.26*/("""</td>
							<td>"""),_display_(/*69.13*/ciudad/*69.19*/.pais),format.raw/*69.24*/("""</td>
							<td>"""),_display_(/*70.13*/ciudad/*70.19*/.capacidad_almacen),format.raw/*70.37*/("""</td>
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
					""")))}),format.raw/*81.7*/("""
					"""),format.raw/*82.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>

	<!-- JQuery -->
	<script src='"""),_display_(/*89.16*/routes/*89.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*89.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*91.16*/routes/*91.22*/.Assets.at("js/bootstrap.js")),format.raw/*91.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*93.16*/routes/*93.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*93.61*/("""'></script>
	
	<script src='"""),_display_(/*95.16*/routes/*95.22*/.Assets.at("js/jquery.dataTables.js")),format.raw/*95.59*/("""'></script>

	<script>
		$(document).ready(function() """),format.raw/*98.32*/("""{"""),format.raw/*98.33*/("""
		   """),format.raw/*99.6*/("""$('#example').DataTable( """),format.raw/*99.31*/("""{"""),format.raw/*99.32*/("""
		       """),format.raw/*100.10*/(""""language": """),format.raw/*100.22*/("""{"""),format.raw/*100.23*/("""
		           """),format.raw/*101.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*102.10*/("""}"""),format.raw/*102.11*/("""
		  	"""),format.raw/*103.6*/("""}"""),format.raw/*103.7*/(""");
  		"""),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""");
	</script>
	</body>
	</html>

""")))}),format.raw/*109.2*/("""
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
                  DATE: Mon Nov 14 23:25:11 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/index.scala.html
                  HASH: 2987c5e80d674d6a3815ff498a75f3d35fc37fd9
                  MATRIX: 760->1|887->33|915->36|929->43|982->88|1021->90|1059->102|1279->295|1294->301|1352->338|1415->374|1430->380|1483->412|1546->448|1561->454|1613->485|1676->521|1691->527|1746->561|1810->598|1825->604|1877->635|2149->881|2190->913|2230->915|2261->919|2454->1085|2468->1090|2504->1105|2535->1109|2575->1119|2607->1125|2646->1155|2686->1157|2717->1161|2909->1326|2923->1331|2957->1344|2988->1348|3028->1358|3060->1363|3859->2136|3898->2159|3937->2160|3972->2168|4017->2186|4032->2192|4064->2203|4110->2222|4125->2228|4153->2235|4199->2254|4214->2260|4240->2265|4286->2284|4301->2290|4340->2308|4931->2869|4965->2876|5087->2971|5102->2977|5160->3014|5236->3063|5251->3069|5301->3098|5377->3147|5392->3153|5452->3192|5510->3223|5525->3229|5583->3266|5668->3323|5697->3324|5731->3331|5784->3356|5813->3357|5853->3368|5894->3380|5924->3381|5968->3396|6076->3475|6106->3476|6141->3483|6170->3484|6206->3492|6235->3493|6305->3532
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|59->28|59->28|59->28|60->29|62->31|62->31|62->31|63->32|64->33|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|71->40|73->42|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|112->81|113->82|120->89|120->89|120->89|122->91|122->91|122->91|124->93|124->93|124->93|126->95|126->95|126->95|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|133->102|133->102|134->103|134->103|135->104|135->104|140->109
                  -- GENERATED --
              */
          