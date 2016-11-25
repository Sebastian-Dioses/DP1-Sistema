
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
                  DATE: Fri Nov 25 10:46:10 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/index.scala.html
                  HASH: c68af0cd7d7229f7b855edc1320514657c327b23
                  MATRIX: 766->1|891->31|918->33|932->40|985->85|1024->87|1060->97|1272->282|1287->288|1345->325|1407->360|1422->366|1475->398|1537->433|1552->439|1604->470|1666->505|1681->511|1736->545|1799->581|1814->587|1866->618|2118->844|2159->876|2199->878|2235->887|2444->1069|2458->1074|2494->1089|2530->1098|2572->1110|2605->1117|2644->1147|2684->1149|2720->1158|2928->1339|2942->1344|2976->1357|3012->1366|3054->1378|3087->1385|3125->1414|3165->1416|3201->1425|3406->1603|3420->1608|3453->1620|3489->1629|3531->1641|3562->1645|4288->2345|4326->2367|4365->2368|4399->2375|4443->2392|4458->2398|4482->2401|4527->2419|4542->2425|4577->2439|4622->2457|4637->2463|4673->2478|4725->2503|4740->2509|4776->2524|4870->2591|4885->2597|4933->2624|5145->2809|5160->2815|5209->2842|5342->2945|5375->2951|5591->3140|5606->3146|5643->3162|5809->3301|5824->3307|5882->3344|5957->3391|5973->3397|6024->3426|6099->3473|6115->3479|6176->3518|6233->3547|6249->3553|6308->3590|6391->3644|6421->3645|6455->3651|6509->3676|6539->3677|6578->3687|6619->3699|6649->3700|6692->3714|6799->3792|6829->3793|6863->3799|6892->3800|6927->3807|6956->3808|7021->3842
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|79->48|101->70|101->70|101->70|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|108->77|108->77|108->77|111->80|111->80|111->80|114->83|115->84|124->93|124->93|124->93|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|142->111|143->112|143->112|144->113|144->113|145->114|145->114|150->119
                  -- GENERATED --
              */
          