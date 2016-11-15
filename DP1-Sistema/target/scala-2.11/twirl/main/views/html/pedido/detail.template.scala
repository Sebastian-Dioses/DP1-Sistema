
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
    					<strong>DETALLE DE PEDIDO</strong>
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
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" readonly value=""""),_display_(/*49.109*/pedido/*49.115*/.id),format.raw/*49.118*/("""">
		    		</div>		    	
		  		</div>

				<div class="form-group">
		    		<label for="clienteOrigen_input" class="col-sm-3 control-label">Origen:</label>
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">Código</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" readonly value=""""),_display_(/*57.109*/pedido/*57.115*/.ciudadOrigen.cod_ciudad),format.raw/*57.139*/("""">
		    		</div>		    	
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">Ciudad</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" readonly value=""""),_display_(/*61.109*/pedido/*61.115*/.ciudadOrigen.nombre),format.raw/*61.135*/("""">
		    		</div>
		    		<label for="clienteOrigen_input" class="col-sm-1 control-label">País</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" readonly value=""""),_display_(/*65.109*/pedido/*65.115*/.ciudadOrigen.pais),format.raw/*65.133*/("""">
		    		</div>
		  		</div>
		  				  		
		  		<div class="form-group">
		    		<label for="clienteDestino_input" class="col-sm-3 control-label">Destino:</label>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">Código</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" readonly value=""""),_display_(/*73.111*/pedido/*73.117*/.ciudadDestino.cod_ciudad),format.raw/*73.142*/("""">
		    		</div>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">Ciudad</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" readonly value=""""),_display_(/*77.111*/pedido/*77.117*/.ciudadDestino.nombre),format.raw/*77.138*/("""">
		    		</div>
		    		<label for="clienteDestino_input" class="col-sm-1 control-label">País</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" readonly value=""""),_display_(/*81.111*/pedido/*81.117*/.ciudadDestino.pais),format.raw/*81.136*/("""">
		    		</div>
		  		</div>		  				  	

		  		<div class="form-group">
		    		<label for="ciudadDestino_input" class="col-sm-3 control-label">Remitente:</label>
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">ID</label>
		    		<div class="col-sm-1">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" readonly value=""""),_display_(/*89.105*/pedido/*89.111*/.persona.id),format.raw/*89.122*/("""">
		    		</div>		    	
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">DNI</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" readonly value=""""),_display_(/*93.105*/pedido/*93.111*/.persona.dni),format.raw/*93.123*/("""">
		    		</div>
		    		<label for="ciudadDestino_input" class="col-sm-1 control-label">Nombre</label>	
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" readonly value=""""),_display_(/*97.105*/pedido/*97.111*/.persona.nombre),format.raw/*97.126*/("""">
		    		</div>
		  		</div>		  				  

		  		<div class="form-group">
		    		<label for="fecha_input" class="col-sm-4 control-label">Fecha de Registro:</label>
		    		<div class="col-sm-4">
		      			<input type="text" class="form-control" id="fecha" name="fecha" readonly value=""""),_display_(/*104.93*/pedido/*104.99*/.fecha_registro.format("dd/MM/YYYY")),format.raw/*104.135*/("""">
		    		</div>
		    		<label for="fecha_input" class="col-sm-1 control-label">Hora</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="fecha" name="fecha" readonly value=""""),_display_(/*108.93*/pedido/*108.99*/.fecha_registro.format("HH:mm")),format.raw/*108.130*/("""">
		    		</div>
		  		</div>
			  	
					<!-- FIN FIN FIN  -->				
			
				</br>
			  	</br>
				<div class="btn-inline">
					<div class="btn-group col-sm-5"></div>									
					<div class="btn-group">						
						<a href='"""),_display_(/*119.17*/routes/*119.23*/.PedidosC.index()),format.raw/*119.40*/("""' class="btn btn-info">Regresar</a>
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
                  DATE: Tue Nov 15 12:16:32 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/detail.scala.html
                  HASH: a8345563ed4b487d6b36914a73195fdfbbae221d
                  MATRIX: 762->1|881->25|911->30|925->37|953->57|992->59|1030->71|1279->293|1294->299|1352->336|1415->372|1430->378|1483->410|1546->446|1561->452|1613->483|1676->519|1691->525|1746->559|2276->1061|2305->1062|2334->1063|2363->1064|2404->1077|2433->1078|2462->1079|2984->1573|3000->1579|3025->1582|3443->1972|3459->1978|3505->2002|3788->2257|3804->2263|3846->2283|4121->2530|4137->2536|4177->2554|4607->2956|4623->2962|4670->2987|4949->3238|4965->3244|5008->3265|5286->3515|5302->3521|5343->3540|5762->3931|5778->3937|5811->3948|6088->4197|6104->4203|6138->4215|6411->4460|6427->4466|6464->4481|6786->4775|6802->4781|6861->4817|7111->5039|7127->5045|7181->5076|7448->5315|7464->5321|7503->5338
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|80->49|80->49|80->49|88->57|88->57|88->57|92->61|92->61|92->61|96->65|96->65|96->65|104->73|104->73|104->73|108->77|108->77|108->77|112->81|112->81|112->81|120->89|120->89|120->89|124->93|124->93|124->93|128->97|128->97|128->97|135->104|135->104|135->104|139->108|139->108|139->108|150->119|150->119|150->119
                  -- GENERATED --
              */
          