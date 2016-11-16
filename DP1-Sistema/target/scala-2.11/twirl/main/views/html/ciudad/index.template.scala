
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
	"""),_display_(/*27.3*/if(flash.containsKey("success"))/*27.35*/ {_display_(Seq[Any](format.raw/*27.37*/("""
        """),format.raw/*28.9*/("""<div class="alert alert-success fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Éxito!</strong> """),_display_(/*30.39*/flash/*30.44*/.get("success")),format.raw/*30.59*/("""
        """),format.raw/*31.9*/("""</div>
    """)))}),format.raw/*32.6*/("""

    """),_display_(/*34.6*/if(flash.containsKey("error"))/*34.36*/ {_display_(Seq[Any](format.raw/*34.38*/("""
        """),format.raw/*35.9*/("""<div class="alert alert-danger fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Error!</strong> """),_display_(/*37.39*/flash/*37.44*/.get("error")),format.raw/*37.57*/("""
        """),format.raw/*38.9*/("""</div>
    """)))}),format.raw/*39.6*/("""

    """),_display_(/*41.6*/if(flash.containsKey("info"))/*41.35*/ {_display_(Seq[Any](format.raw/*41.37*/("""
        """),format.raw/*42.9*/("""<div class="alert alert-info fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Info!</strong> """),_display_(/*44.38*/flash/*44.43*/.get("info")),format.raw/*44.55*/("""
        """),format.raw/*45.9*/("""</div>
    """)))}),format.raw/*46.6*/("""
            
	
	"""),format.raw/*49.2*/("""<div class="table-responsive">
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
						<th><div align=center>NOMBRE CORTO</div></th>
						<th><div align=center>CAP. ALMACÉN</div></th>
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*72.7*/for(ciudad <- ciudades) yield /*72.30*/{_display_(Seq[Any](format.raw/*72.31*/("""
						"""),format.raw/*73.7*/("""<tr>
							<td>"""),_display_(/*74.13*/ciudad/*74.19*/.cod_ciudad),format.raw/*74.30*/("""</td>
							<td>"""),_display_(/*75.13*/ciudad/*75.19*/.nombre),format.raw/*75.26*/("""</td>
							<td>"""),_display_(/*76.13*/ciudad/*76.19*/.pais),format.raw/*76.24*/("""</td>
							<td>"""),_display_(/*77.13*/ciudad/*77.19*/.abreviado),format.raw/*77.29*/("""</td>
							<td>"""),_display_(/*78.13*/ciudad/*78.19*/.capacidad_almacen),format.raw/*78.37*/("""</td>							
							<td>
				              <a class="btn btn-info" href='"""),_display_(/*80.50*/routes/*80.56*/.CiudadesC.edit(ciudad.cod_ciudad)),format.raw/*80.90*/("""' title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*83.68*/routes/*83.74*/.CiudadesC.delete(ciudad.cod_ciudad)),format.raw/*83.110*/("""'><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*86.7*/("""
					"""),format.raw/*87.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*96.36*/routes/*96.42*/.CiudadesC.newO()),format.raw/*96.59*/("""' title="Registrar Aeropuerto" >Registrar Aeropuerto<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!-- JQuery -->
	<script src='"""),_display_(/*102.16*/routes/*102.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*102.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*104.16*/routes/*104.22*/.Assets.at("js/bootstrap.js")),format.raw/*104.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*106.16*/routes/*106.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*106.61*/("""'></script>
	
	<script src='"""),_display_(/*108.16*/routes/*108.22*/.Assets.at("js/jquery.dataTables.js")),format.raw/*108.59*/("""'></script>

	<script>
		$(document).ready(function() """),format.raw/*111.32*/("""{"""),format.raw/*111.33*/("""
		   """),format.raw/*112.6*/("""$('#example').DataTable( """),format.raw/*112.31*/("""{"""),format.raw/*112.32*/("""
		       """),format.raw/*113.10*/(""""language": """),format.raw/*113.22*/("""{"""),format.raw/*113.23*/("""
		           """),format.raw/*114.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*115.10*/("""}"""),format.raw/*115.11*/("""
		  	"""),format.raw/*116.6*/("""}"""),format.raw/*116.7*/(""");
  		"""),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""");
	</script>
	</body>
	</html>

""")))}),format.raw/*122.2*/("""
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
                  DATE: Wed Nov 16 02:08:37 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/index.scala.html
                  HASH: adaaceeaac5786d39e104cca4b508ec716667c98
                  MATRIX: 767->1|894->33|921->35|935->42|988->87|1027->89|1063->99|1277->286|1292->292|1350->329|1412->364|1427->370|1480->402|1542->437|1557->443|1609->474|1671->509|1686->515|1741->549|1804->585|1819->591|1871->622|2127->852|2168->884|2208->886|2244->895|2453->1077|2467->1082|2503->1097|2539->1106|2581->1118|2614->1125|2653->1155|2693->1157|2729->1166|2937->1347|2951->1352|2985->1365|3021->1374|3063->1386|3096->1393|3134->1422|3174->1424|3210->1433|3415->1611|3429->1616|3462->1628|3498->1637|3540->1649|3584->1666|4364->2420|4403->2443|4442->2444|4476->2451|4520->2468|4535->2474|4567->2485|4612->2503|4627->2509|4655->2516|4700->2534|4715->2540|4741->2545|4786->2563|4801->2569|4832->2579|4877->2597|4892->2603|4931->2621|5032->2695|5047->2701|5102->2735|5304->2910|5319->2916|5377->2952|5509->3054|5542->3060|5758->3249|5773->3255|5811->3272|5986->3419|6002->3425|6061->3462|6136->3509|6152->3515|6203->3544|6278->3591|6294->3597|6355->3636|6412->3665|6428->3671|6487->3708|6570->3762|6600->3763|6634->3769|6688->3794|6718->3795|6757->3805|6798->3817|6828->3818|6871->3832|6978->3910|7008->3911|7042->3917|7071->3918|7106->3925|7135->3926|7200->3960
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|80->49|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|114->83|114->83|114->83|117->86|118->87|127->96|127->96|127->96|133->102|133->102|133->102|135->104|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|145->114|146->115|146->115|147->116|147->116|148->117|148->117|153->122
                  -- GENERATED --
              */
          