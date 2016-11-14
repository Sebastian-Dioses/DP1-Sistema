
package views.html.pedido

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object detail_Scope0 {
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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Pedidos,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pedido: models.Pedidos):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>DETALLE DE PEDIDO</title>
    	<meta charset="UTF-8">
    
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css")),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css")),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css")),format.raw/*15.73*/("""'>
    	
    </head>
    <body>

    <!---Cuerpo -->
    <main class="main">
    	<div class="content" style="max-width: 100%;">
    		<!-- Utilizando Bootstrap -->
    		<br/><br/>
    		<div class="container">
    			<div class="col-sm-12 text-left lead">
    					<strong>REGISTRAR PEDIDO</strong>
    			</div>		
    		</div>
    		<div class="container">
			
			<form method="POST" action="add" class="form-horizontal form-border">
				<input type="hidden" name="_token" value=""""),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""{"""),format.raw/*33.49*/(""" """),format.raw/*33.50*/("""csrf_token() """),format.raw/*33.63*/("""}"""),format.raw/*33.64*/("""}"""),format.raw/*33.65*/("""">
				
				<!-- Mensajes de error de validación del Request -->
				<div class="col-sm-4"></div>
				

				<br/>
				<br/>
				
			  	</br>
			  	</br>	

				<!-- INICIO INCIO-->				                       				
				<div class="form-group">
		    		<label for="clienteOrigen_input" class="col-sm-4 control-label">Código del pedido:</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" disabled="true" value=""""),_display_(/*49.116*/pedido/*49.122*/.id),format.raw/*49.125*/("""">
		    		</div>		    	
		  		</div>

				<div class="form-group">
		    		<label for="clienteOrigen_input" class="col-sm-3 control-label">Origen:</label>
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">Código</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" disabled="true" value=""""),_display_(/*57.116*/pedido/*57.122*/.ciudadOrigen.cod_ciudad),format.raw/*57.146*/("""">
		    		</div>		    	
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">Ciudad</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" disabled="true" value=""""),_display_(/*61.116*/pedido/*61.122*/.ciudadOrigen.nombre),format.raw/*61.142*/("""">
		    		</div>
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">País</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" disabled="true" value=""""),_display_(/*65.116*/pedido/*65.122*/.ciudadOrigen.pais),format.raw/*65.140*/("""">
		    		</div>
		  		</div>
		  				  		
		  		<div class="form-group">
		    		<label for="clienteDestino_input" class="col-sm-3 control-label">Destino:</label>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">Código</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" disabled="true" value=""""),_display_(/*73.118*/pedido/*73.124*/.ciudadDestino.cod_ciudad),format.raw/*73.149*/("""">
		    		</div>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">Ciudad</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" disabled="true" value=""""),_display_(/*77.118*/pedido/*77.124*/.ciudadDestino.nombre),format.raw/*77.145*/("""">
		    		</div>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">País</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" disabled="true" value=""""),_display_(/*81.118*/pedido/*81.124*/.ciudadDestino.pais),format.raw/*81.143*/("""">
		    		</div>
		  		</div>		  				  	

		  		<div class="form-group">
		    		<label for="ciudadDestino_input" class="col-sm-3 control-label">Remitente:</label>
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">ID</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" disabled="true" value=""""),_display_(/*89.112*/pedido/*89.118*/.persona.id),format.raw/*89.129*/("""">
		    		</div>		    	
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">DNI</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" disabled="true" value=""""),_display_(/*93.112*/pedido/*93.118*/.persona.dni),format.raw/*93.130*/("""">
		    		</div>
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">Nombre</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" disabled="true" value=""""),_display_(/*97.112*/pedido/*97.118*/.persona.nombre),format.raw/*97.133*/("""">
		    		</div>
		  		</div>		  				  

		  		<div class="form-group">
		    		<label for="fecha_input" class="col-sm-4 control-label">Fecha de Registro:</label>
		    		<div class="col-sm-4">
		      			<input type="text" class="form-control" id="fecha" name="fecha" disabled="true" value=""""),_display_(/*104.100*/pedido/*104.106*/.fecha_registro.format("dd/MM/YYYY")),format.raw/*104.142*/("""">
		    		</div>
		    		<label for="fecha_input" class="col-sm-1 control-label">Hora</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="fecha" name="fecha" disabled="true" value=""""),_display_(/*108.100*/pedido/*108.106*/.fecha_registro.format("HH:mm")),format.raw/*108.137*/("""">
		    		</div>
		  		</div>
			  	
					<!-- FIN FIN FIN  -->				
			
				</br>
			  	</br>
				<div class="btn-inline">
					<div class="btn-group col-sm-5"></div>									
					<div class="btn-group">						
						<a href="#" onclick="history.go(-1)" class="btn btn-info">Cancelar</a>
					</div>
				</div>
				</br>
				</br>

				
				
			</form>
		</div>
        </div>		
    
    <!-- JQuery -->
    	<script src="js/jquery-1.11.3.min.js"></script>
    	<!-- Bootstrap -->
    	<script type="text/javascript" src="js/bootstrap.js"></script>
    	<!-- BXSlider -->
    	<script src="js/jquery.bxslider.min.js"></script>
    	<!-- Mis Scripts -->
    	<script src="js/MisScripts.js"></script>
    
    
    </body>
    </html>

""")))}))
      }
    }
  }

  def render(pedido:models.Pedidos): play.twirl.api.HtmlFormat.Appendable = apply(pedido)

  def f:((models.Pedidos) => play.twirl.api.HtmlFormat.Appendable) = (pedido) => apply(pedido)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 23:29:38 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/detail.scala.html
                  HASH: 440f2e98176ff2e56bf1ff27cf9f44f097c6f066
                  MATRIX: 762->1|881->25|911->30|925->37|953->57|992->59|1030->71|1279->293|1294->299|1352->336|1415->372|1430->378|1483->410|1546->446|1561->452|1613->483|1676->519|1691->525|1746->559|2275->1060|2304->1061|2333->1062|2362->1063|2403->1076|2432->1077|2461->1078|2990->1579|3006->1585|3031->1588|3456->1985|3472->1991|3518->2015|3808->2277|3824->2283|3866->2303|4148->2557|4164->2563|4204->2581|4641->2990|4657->2996|4704->3021|4990->3279|5006->3285|5049->3306|5334->3563|5350->3569|5391->3588|5817->3986|5833->3992|5866->4003|6150->4259|6166->4265|6200->4277|6480->4529|6496->4535|6533->4550|6863->4851|6880->4857|6939->4893|7197->5122|7214->5128|7268->5159
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|80->49|80->49|80->49|88->57|88->57|88->57|92->61|92->61|92->61|96->65|96->65|96->65|104->73|104->73|104->73|108->77|108->77|108->77|112->81|112->81|112->81|120->89|120->89|120->89|124->93|124->93|124->93|128->97|128->97|128->97|135->104|135->104|135->104|139->108|139->108|139->108
                  -- GENERATED --
              */
          