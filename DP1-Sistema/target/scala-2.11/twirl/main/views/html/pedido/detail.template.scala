
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

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.Pedidos,List[models.Pedidos_x_vuelos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pedido: models.Pedidos, rutas: List[models.Pedidos_x_vuelos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

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
		    		<label for="fecha" class="col-sm-4 control-label">Fecha de Registro:</label>
		    		<div class="col-sm-4">
		      			<input type="text" class="form-control" id="fecha" name="fecha" readonly value=""""),_display_(/*104.93*/pedido/*104.99*/.fecha_registro.format("dd/MM/YYYY")),format.raw/*104.135*/("""">
		    		</div>
		    		<label for="fecha_input" class="col-sm-1 control-label">Hora</label>
		    		<div class="col-sm-2">
		      			<input type="text" class="form-control" id="fecha" name="fecha" readonly value=""""),_display_(/*108.93*/pedido/*108.99*/.fecha_registro.format("HH:mm")),format.raw/*108.130*/("""">
		    		</div>
		  		</div>		  					  		
			  				  	
			  	"""),_display_(/*112.8*/for(ruta <- rutas) yield /*112.26*/{_display_(Seq[Any](format.raw/*112.27*/("""			  		
			  		"""),format.raw/*113.8*/("""<div class="form-group">			  		
			  			<label for="ciudad1" class="col-sm-4 control-label">Ruta:</label>				  		
			  			<div class="col-sm-4">
				  			<input type="text" class="form-control" id="ciudad1" name="ciudad1" readonly 
			      			value=""""),_display_(/*117.21*/ruta/*117.25*/.vuelo.ciudad_origen),format.raw/*117.45*/(""" """),format.raw/*117.46*/("""( """),_display_(/*117.49*/ruta/*117.53*/.vuelo.hora_salida.format("HH:mm")),format.raw/*117.87*/(""" """),format.raw/*117.88*/(""") - """),_display_(/*117.93*/ruta/*117.97*/.vuelo.ciudad_destino),format.raw/*117.118*/(""" """),format.raw/*117.119*/("""( """),_display_(/*117.122*/ruta/*117.126*/.vuelo.hora_llegada.format("HH:mm")),format.raw/*117.161*/(""" """),format.raw/*117.162*/(""")">
			      		</div>
			      	</div>
			  	""")))}),format.raw/*120.8*/("""		  				  
		  		
					"""),format.raw/*122.6*/("""<!-- FIN FIN FIN  -->				
			
				</br>
			  	</br>
				<div class="btn-inline">
					<div class="btn-group col-sm-5"></div>									
					<div class="btn-group">						
						<a href='"""),_display_(/*129.17*/routes/*129.23*/.PedidosC.index()),format.raw/*129.40*/("""' class="btn btn-info">Regresar</a>
					</div>
				</div>
				</br>
				</br>

				
				
			</form>
		</div>
        </div>		
    
	<!-- JQuery -->
	<script src='"""),_display_(/*142.16*/routes/*142.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*142.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*144.16*/routes/*144.22*/.Assets.at("js/bootstrap.js")),format.raw/*144.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*146.16*/routes/*146.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*146.61*/("""'></script>
    	<script src='"""),_display_(/*147.20*/routes/*147.26*/.Assets.at("js/MisScripts.js")),format.raw/*147.56*/("""'></script>
    
    
    </body>
    </html>

""")))}))
      }
    }
  }

  def render(pedido:models.Pedidos,rutas:List[models.Pedidos_x_vuelos]): play.twirl.api.HtmlFormat.Appendable = apply(pedido,rutas)

  def f:((models.Pedidos,List[models.Pedidos_x_vuelos]) => play.twirl.api.HtmlFormat.Appendable) = (pedido,rutas) => apply(pedido,rutas)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Fri Nov 25 10:46:09 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/detail.scala.html
                  HASH: 83f1ce797867a3e1d6198ebc0ed376165628c9e6
                  MATRIX: 792->1|949->63|979->68|993->75|1021->95|1060->97|1098->109|1347->331|1362->337|1420->374|1483->410|1498->416|1551->448|1614->484|1629->490|1681->521|1744->557|1759->563|1814->597|2344->1099|2373->1100|2402->1101|2431->1102|2472->1115|2501->1116|2530->1117|3052->1611|3068->1617|3093->1620|3511->2010|3527->2016|3573->2040|3856->2295|3872->2301|3914->2321|4189->2568|4205->2574|4245->2592|4675->2994|4691->3000|4738->3025|5017->3276|5033->3282|5076->3303|5354->3553|5370->3559|5411->3578|5830->3969|5846->3975|5879->3986|6156->4235|6172->4241|6206->4253|6479->4498|6495->4504|6532->4519|6848->4807|6864->4813|6923->4849|7173->5071|7189->5077|7243->5108|7338->5176|7373->5194|7413->5195|7457->5211|7741->5467|7755->5471|7797->5491|7827->5492|7858->5495|7872->5499|7928->5533|7958->5534|7991->5539|8005->5543|8049->5564|8080->5565|8112->5568|8127->5572|8185->5607|8216->5608|8296->5657|8349->5682|8569->5874|8585->5880|8624->5897|8829->6074|8845->6080|8904->6117|8981->6166|8997->6172|9048->6201|9125->6250|9141->6256|9202->6295|9262->6327|9278->6333|9330->6363
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|80->49|80->49|80->49|88->57|88->57|88->57|92->61|92->61|92->61|96->65|96->65|96->65|104->73|104->73|104->73|108->77|108->77|108->77|112->81|112->81|112->81|120->89|120->89|120->89|124->93|124->93|124->93|128->97|128->97|128->97|135->104|135->104|135->104|139->108|139->108|139->108|143->112|143->112|143->112|144->113|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|148->117|151->120|153->122|160->129|160->129|160->129|173->142|173->142|173->142|175->144|175->144|175->144|177->146|177->146|177->146|178->147|178->147|178->147
                  -- GENERATED --
              */
          