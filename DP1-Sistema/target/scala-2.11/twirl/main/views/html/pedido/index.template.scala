
package views.html.pedido

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Pedidos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pedidos:List[models.Pedidos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>PEDIDOS</title>
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
				<p class="lead"><strong>PEDIDOS</strong></p>
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
	
	"""),format.raw/*48.2*/("""<div class="table-responsive">
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
						<th><div align=center>ID</div></th>
						<th><div align=center>ORIGEN</div></th>
						<th><div align=center>DESTINO</div></th>							
						<th><div align=center>REMITENTE</div></th>	
						<th><div align=center>DETALLE</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*70.7*/for(pedido <- pedidos) yield /*70.29*/{_display_(Seq[Any](format.raw/*70.30*/("""
						"""),format.raw/*71.7*/("""<tr>
							<td>"""),_display_(/*72.13*/pedido/*72.19*/.id),format.raw/*72.22*/("""</td>
							<td>"""),_display_(/*73.13*/pedido/*73.19*/.ciudad_origen),format.raw/*73.33*/("""</td>
							<td>"""),_display_(/*74.13*/pedido/*74.19*/.ciudad_destino),format.raw/*74.34*/("""</td>							
							<td>"""),_display_(/*75.13*/pedido/*75.19*/.persona.nombre),format.raw/*75.34*/("""</td>
							<td>
				              <a class="btn btn-info" href='"""),_display_(/*77.50*/routes/*77.56*/.PedidosC.detail(pedido.id)),format.raw/*77.83*/("""' title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>							
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*80.68*/routes/*80.74*/.PedidosC.delete(pedido.id)),format.raw/*80.101*/("""' ><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*83.7*/("""
					"""),format.raw/*84.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*93.36*/routes/*93.42*/.PedidosC.newO()),format.raw/*93.58*/("""' title="Registrar Pedido" >Registrar Pedido<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!-- JQuery -->
	<script src='"""),_display_(/*99.16*/routes/*99.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*99.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*101.16*/routes/*101.22*/.Assets.at("js/bootstrap.js")),format.raw/*101.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*103.16*/routes/*103.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*103.61*/("""'></script>
	
	<script src='"""),_display_(/*105.16*/routes/*105.22*/.Assets.at("js/jquery.dataTables.js")),format.raw/*105.59*/("""'></script>

	<script>
		$(document).ready(function() """),format.raw/*108.32*/("""{"""),format.raw/*108.33*/("""
		   """),format.raw/*109.6*/("""$('#example').DataTable( """),format.raw/*109.31*/("""{"""),format.raw/*109.32*/("""
		       """),format.raw/*110.10*/(""""language": """),format.raw/*110.22*/("""{"""),format.raw/*110.23*/("""
		           """),format.raw/*111.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*112.10*/("""}"""),format.raw/*112.11*/("""
		  	"""),format.raw/*113.6*/("""}"""),format.raw/*113.7*/(""");
  		"""),format.raw/*114.5*/("""}"""),format.raw/*114.6*/(""");
	</script>
	</body>
	</html>

""")))}),format.raw/*119.2*/("""
"""))
      }
    }
  }

  def render(pedidos:List[models.Pedidos]): play.twirl.api.HtmlFormat.Appendable = apply(pedidos)

  def f:((List[models.Pedidos]) => play.twirl.api.HtmlFormat.Appendable) = (pedidos) => apply(pedidos)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 23:59:26 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/index.scala.html
                  HASH: 07a7c53c492115d474393f59fb2c39fcac3deb40
                  MATRIX: 766->1|891->31|919->34|933->41|986->86|1025->88|1063->100|1281->291|1296->297|1354->334|1417->370|1432->376|1485->408|1548->444|1563->450|1615->481|1678->517|1693->523|1748->557|1812->594|1827->600|1879->631|2144->870|2185->902|2225->904|2262->914|2473->1098|2487->1103|2523->1118|2560->1128|2603->1141|2638->1150|2677->1180|2717->1182|2754->1192|2964->1375|2978->1380|3012->1393|3049->1403|3092->1416|3127->1425|3165->1454|3205->1456|3242->1466|3449->1646|3463->1651|3496->1663|3533->1673|3576->1686|3609->1692|4357->2414|4395->2436|4434->2437|4469->2445|4514->2463|4529->2469|4553->2472|4599->2491|4614->2497|4649->2511|4695->2530|4710->2536|4746->2551|4799->2577|4814->2583|4850->2598|4946->2667|4961->2673|5009->2700|5224->2888|5239->2894|5288->2921|5424->3027|5458->3034|5683->3232|5698->3238|5735->3254|5907->3399|5922->3405|5980->3442|6057->3491|6073->3497|6124->3526|6201->3575|6217->3581|6278->3620|6337->3651|6353->3657|6412->3694|6498->3751|6528->3752|6563->3759|6617->3784|6647->3785|6687->3796|6728->3808|6758->3809|6802->3824|6910->3903|6940->3904|6975->3911|7004->3912|7040->3920|7069->3921|7139->3960
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|79->48|101->70|101->70|101->70|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|108->77|108->77|108->77|111->80|111->80|111->80|114->83|115->84|124->93|124->93|124->93|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|142->111|143->112|143->112|144->113|144->113|145->114|145->114|150->119
                  -- GENERATED --
              */
          