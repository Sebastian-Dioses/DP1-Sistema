
package views.html.persona

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Personas],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(personas:List[models.Personas]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>PERSONAS</title>
		<meta charset="UTF-8">

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css")),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css")),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css")),format.raw/*14.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/DataTable.css")),format.raw/*15.70*/("""'>	
	
	</head>
	<body>
	

	<!---Cuerpo -->
	<div class="container">
		<div class="row">
			<div class="col-sm-12 text-center">
				<p class="lead"><strong>PERSONAS</strong></p>				
			</div>
		</div>
	</div>
	
	"""),_display_(/*30.3*/if(flash.containsKey("success"))/*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
        """),format.raw/*31.9*/("""<div class="alert alert-success fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Éxito!</strong> """),_display_(/*33.39*/flash/*33.44*/.get("success")),format.raw/*33.59*/("""
        """),format.raw/*34.9*/("""</div>
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/if(flash.containsKey("error"))/*37.36*/ {_display_(Seq[Any](format.raw/*37.38*/("""
        """),format.raw/*38.9*/("""<div class="alert alert-danger fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Error!</strong> """),_display_(/*40.39*/flash/*40.44*/.get("error")),format.raw/*40.57*/("""
        """),format.raw/*41.9*/("""</div>
    """)))}),format.raw/*42.6*/("""

    """),_display_(/*44.6*/if(flash.containsKey("info"))/*44.35*/ {_display_(Seq[Any](format.raw/*44.37*/("""
        """),format.raw/*45.9*/("""<div class="alert alert-info fade in text-center">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>¡Info!</strong> """),_display_(/*47.38*/flash/*47.43*/.get("info")),format.raw/*47.55*/("""
        """),format.raw/*48.9*/("""</div>
    """)))}),format.raw/*49.6*/("""

	"""),format.raw/*51.2*/("""<div class="table-responsive">
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
						<th><div align=center>USUARIO</div></th>
						<th><div align=center>DNI</div></th>
						<th><div align=center>CORREO</div></th>						
						<th><div align=center>EDITAR</div></th>
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*73.7*/for(persona <- personas) yield /*73.31*/{_display_(Seq[Any](format.raw/*73.32*/("""
						"""),format.raw/*74.7*/("""<tr>
							<td>"""),_display_(/*75.13*/persona/*75.20*/.id),format.raw/*75.23*/("""</td>
							<td>"""),_display_(/*76.13*/persona/*76.20*/.nombre),format.raw/*76.27*/("""</td>
							<td>"""),_display_(/*77.13*/persona/*77.20*/.dni),format.raw/*77.24*/("""</td>							
							<td>"""),_display_(/*78.13*/persona/*78.20*/.correo),format.raw/*78.27*/("""</td>							
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*83.68*/routes/*83.74*/.PersonasC.delete(persona.id)),format.raw/*83.103*/("""' ><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*86.7*/("""
					"""),format.raw/*87.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*97.17*/routes/*97.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*97.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*99.17*/routes/*99.23*/.Assets.at("js/bootstrap.js")),format.raw/*99.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*101.17*/routes/*101.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*101.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*103.17*/routes/*103.23*/.Assets.at("js/MisScripts.js")),format.raw/*103.53*/("""'></script>

		<script src='"""),_display_(/*105.17*/routes/*105.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*105.60*/("""'></script>
		
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

""")))}))
      }
    }
  }

  def render(personas:List[models.Personas]): play.twirl.api.HtmlFormat.Appendable = apply(personas)

  def f:((List[models.Personas]) => play.twirl.api.HtmlFormat.Appendable) = (personas) => apply(personas)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 20:03:14 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/persona/index.scala.html
                  HASH: c9185f9be0027eea1a765e973cf181222b3ea616
                  MATRIX: 768->1|895->33|923->36|937->43|990->88|1029->90|1067->102|1288->296|1303->302|1361->339|1424->375|1439->381|1492->413|1555->449|1570->455|1622->486|1685->522|1700->528|1755->562|1819->599|1834->605|1886->636|2139->863|2180->895|2220->897|2257->907|2468->1091|2482->1096|2518->1111|2555->1121|2598->1134|2633->1143|2672->1173|2712->1175|2749->1185|2959->1368|2973->1373|3007->1386|3044->1396|3087->1409|3122->1418|3160->1447|3200->1449|3237->1459|3444->1639|3458->1644|3491->1656|3528->1666|3571->1679|3603->1684|4342->2397|4382->2421|4421->2422|4456->2430|4501->2448|4517->2455|4541->2458|4587->2477|4603->2484|4631->2491|4677->2510|4693->2517|4718->2521|4771->2547|4787->2554|4815->2561|5096->2815|5111->2821|5162->2850|5298->2956|5332->2963|5484->3088|5499->3094|5557->3131|5635->3182|5650->3188|5700->3217|5779->3268|5795->3274|5856->3313|5939->3368|5955->3374|6007->3404|6066->3435|6082->3441|6141->3478|6230->3538|6260->3539|6295->3546|6349->3571|6379->3572|6419->3583|6460->3595|6490->3596|6534->3611|6642->3690|6672->3691|6707->3698|6736->3699|6772->3707|6801->3708
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|80->49|82->51|104->73|104->73|104->73|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|114->83|114->83|114->83|117->86|118->87|128->97|128->97|128->97|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|142->111|143->112|143->112|144->113|144->113|145->114|145->114
                  -- GENERATED --
              */
          