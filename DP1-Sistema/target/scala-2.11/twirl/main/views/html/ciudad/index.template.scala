
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
                  DATE: Tue Nov 15 10:48:55 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/index.scala.html
                  HASH: 9211bebb7a6a962141e6fdc687c78dae8600a1d7
                  MATRIX: 767->1|894->33|922->36|936->43|989->88|1028->90|1066->102|1286->295|1301->301|1359->338|1422->374|1437->380|1490->412|1553->448|1568->454|1620->485|1683->521|1698->527|1753->561|1817->598|1832->604|1884->635|2153->878|2194->910|2234->912|2271->922|2482->1106|2496->1111|2532->1126|2569->1136|2612->1149|2647->1158|2686->1188|2726->1190|2763->1200|2973->1383|2987->1388|3021->1401|3058->1411|3101->1424|3136->1433|3174->1462|3214->1464|3251->1474|3458->1654|3472->1659|3505->1671|3542->1681|3585->1694|3632->1714|4435->2491|4474->2514|4513->2515|4548->2523|4593->2541|4608->2547|4640->2558|4686->2577|4701->2583|4729->2590|4775->2609|4790->2615|4816->2620|4862->2639|4877->2645|4908->2655|4954->2674|4969->2680|5008->2698|5111->2774|5126->2780|5181->2814|5386->2992|5401->2998|5459->3034|5594->3139|5628->3146|5853->3344|5868->3350|5906->3367|6087->3520|6103->3526|6162->3563|6239->3612|6255->3618|6306->3647|6383->3696|6399->3702|6460->3741|6519->3772|6535->3778|6594->3815|6680->3872|6710->3873|6745->3880|6799->3905|6829->3906|6869->3917|6910->3929|6940->3930|6984->3945|7092->4024|7122->4025|7157->4032|7186->4033|7222->4041|7251->4042|7321->4081
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|80->49|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|114->83|114->83|114->83|117->86|118->87|127->96|127->96|127->96|133->102|133->102|133->102|135->104|135->104|135->104|137->106|137->106|137->106|139->108|139->108|139->108|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|145->114|146->115|146->115|147->116|147->116|148->117|148->117|153->122
                  -- GENERATED --
              */
          