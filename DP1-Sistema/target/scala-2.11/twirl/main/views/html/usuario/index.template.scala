
package views.html.usuario

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Usuarios],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios:List[models.Usuarios]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/layouts/*2.9*/.headerandfooter("Welcome to Play Framework")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    
    """),format.raw/*4.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>USUARIOS</title>
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
				<p class="lead"><strong>USUARIOS</strong></p>				
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
						<th><div align=center>PERSONA</div></th>
						<th><div align=center>CORREO</div></th>
						<!--<th><div align=center>DETALLE</div></th>
						<th><div align=center>EDITAR</div></th>-->
						<th><div align=center>ELIMINAR</div></th>
					</thead>

											
					<tbody>
					"""),_display_(/*74.7*/for(usuario <- usuarios) yield /*74.31*/{_display_(Seq[Any](format.raw/*74.32*/("""
						"""),format.raw/*75.7*/("""<tr>
							<td>"""),_display_(/*76.13*/usuario/*76.20*/.id),format.raw/*76.23*/("""</td>
							<td>"""),_display_(/*77.13*/usuario/*77.20*/.nombre),format.raw/*77.27*/("""</td>							
							<td>"""),_display_(/*78.13*/usuario/*78.20*/.persona.nombre),format.raw/*78.35*/("""</td>
							<td>"""),_display_(/*79.13*/usuario/*79.20*/.persona.correo),format.raw/*79.35*/("""</td>
							<!--<td>
				              <a class="btn btn-info" href="#"  title="Detalle" ><i class="glyphicon glyphicon-list-alt"></i></a>
				            </td>
							<td>
				              <a class="btn btn-info" href="#" title="Editar" ><i class="glyphicon glyphicon-pencil"></i></a>
				            </td>-->
				            <td>
				              <a class="btn btn-info"  title="Eliminar" href='"""),_display_(/*87.68*/routes/*87.74*/.UsuariosC.delete(usuario.id)),format.raw/*87.103*/("""'><i class="glyphicon glyphicon-remove"></i></a>    
				            </td>
			            </tr>
					""")))}),format.raw/*90.7*/("""
					"""),format.raw/*91.6*/("""</tbody>						
					
			</table>			
		</div>		
	</div>
	<br/>
	<div class="container">		
		<div class="form-group">
			<div class="col-sm-16 text-right">
				<a class="btn btn-info" href='"""),_display_(/*100.36*/routes/*100.42*/.UsuariosC.newO()),format.raw/*100.59*/("""' title="Registrar Usuario" >Registrar Usuario<i class="glyphicon" ></i> </a>	
			</div>
		</div>		
	</div>

	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*108.17*/routes/*108.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*108.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*110.17*/routes/*110.23*/.Assets.at("js/bootstrap.js")),format.raw/*110.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*112.17*/routes/*112.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*112.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*114.17*/routes/*114.23*/.Assets.at("js/MisScripts.js")),format.raw/*114.53*/("""'></script>

		<script src='"""),_display_(/*116.17*/routes/*116.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*116.60*/("""'></script>
		
		<script>
		$(document).ready(function() """),format.raw/*119.32*/("""{"""),format.raw/*119.33*/("""
		   """),format.raw/*120.6*/("""$('#example').DataTable( """),format.raw/*120.31*/("""{"""),format.raw/*120.32*/("""
		       """),format.raw/*121.10*/(""""language": """),format.raw/*121.22*/("""{"""),format.raw/*121.23*/("""
		           """),format.raw/*122.14*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
		       """),format.raw/*123.10*/("""}"""),format.raw/*123.11*/("""
		  	"""),format.raw/*124.6*/("""}"""),format.raw/*124.7*/(""");
  		"""),format.raw/*125.5*/("""}"""),format.raw/*125.6*/(""");
		</script>
	</body>
	</html>

""")))}))
      }
    }
  }

  def render(usuarios:List[models.Usuarios]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[models.Usuarios]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:29:39 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/usuario/index.scala.html
                  HASH: 4802a727f1ce22f9b7ccd99b85a481a56dac2aa1
                  MATRIX: 768->1|895->33|922->35|936->42|989->87|1028->89|1064->99|1278->286|1293->292|1351->329|1413->364|1428->370|1481->402|1543->437|1558->443|1610->474|1672->509|1687->515|1742->549|1805->585|1820->591|1872->622|2110->834|2151->866|2191->868|2227->877|2436->1059|2450->1064|2486->1079|2522->1088|2564->1100|2597->1107|2636->1137|2676->1139|2712->1148|2920->1329|2934->1334|2968->1347|3004->1356|3046->1368|3079->1375|3117->1404|3157->1406|3193->1415|3398->1593|3412->1598|3445->1610|3481->1619|3523->1631|3553->1634|4322->2377|4362->2401|4401->2402|4435->2409|4479->2426|4495->2433|4519->2436|4564->2454|4580->2461|4608->2468|4660->2493|4676->2500|4712->2515|4757->2533|4773->2540|4809->2555|5237->2956|5252->2962|5303->2991|5435->3093|5468->3099|5685->3288|5701->3294|5740->3311|5934->3477|5950->3483|6009->3520|6086->3569|6102->3575|6153->3604|6230->3653|6246->3659|6307->3698|6388->3751|6404->3757|6456->3787|6513->3816|6529->3822|6588->3859|6674->3916|6704->3917|6738->3923|6792->3948|6822->3949|6861->3959|6902->3971|6932->3972|6975->3986|7082->4064|7112->4065|7146->4071|7175->4072|7210->4079|7239->4080
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|71->40|71->40|71->40|72->41|73->42|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|80->49|82->51|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|118->87|118->87|118->87|121->90|122->91|131->100|131->100|131->100|139->108|139->108|139->108|141->110|141->110|141->110|143->112|143->112|143->112|145->114|145->114|145->114|147->116|147->116|147->116|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|154->123|154->123|155->124|155->124|156->125|156->125
                  -- GENERATED --
              */
          