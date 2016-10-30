
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object registrarPedido extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    <!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR PEDIDO</title>
    	<meta charset="UTF-8">
    
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css"))),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css"))),format.raw/*15.73*/("""'>
    	
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
				<input type="hidden" name="_token" value=""""),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""{"""),format.raw/*33.49*/(""" csrf_token() """),format.raw/*33.63*/("""}"""),format.raw/*33.64*/("""}"""),format.raw/*33.65*/("""">
				
				<!-- Mensajes de error de validación del Request -->
				<div class="col-sm-4"></div>
				

				<br/>
				<br/>
				<div class="form-group">
			  		<div class="text-center">
			  			<font color="red"> 
			  				(*) Dato Obligatorio
			  			</font>
			  			
			  		</div>
			  	</div>
			  	</br>
			  	</br>	

				<!-- INICIO INCIIO -->				                       				
				<div class="form-group required">
		    		<label for="clienteOrigen_input" class="col-sm-4 control-label">Cliente Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="cliente_origen" name="cliente_origen" placeholder="Cliente Origen" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
		    		<a class="btn btn-info" name="buscarCliente" href="#"  title="Buscar Cliente" data-toggle="modal" data-target="#modalBuscarCliente"><i name="buscarCliente" class="glyphicon glyphicon-search"></i></a>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadOrigen_input" class="col-sm-4 control-label">Ciudad Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" placeholder="Ciudad Origen" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
		    		<a class="btn btn-info" name="buscarCiudad" href="#"  title="Buscar Ciudad" data-toggle="modal" data-target="#modalBuscarCiudad"><i name="buscarCiudad" class="glyphicon glyphicon-search"></i></a>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadDestino_input" class="col-sm-4 control-label">Ciudad Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" placeholder="Ciudad Destino" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
		    		<a class="btn btn-info" name="buscarCiudad" href="#"  title="Buscar Ciudad" data-toggle="modal" data-target="#modalBuscarCiudad"><i name="buscarCiudad" class="glyphicon glyphicon-search"></i></a>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="cantidadPaquetesInput" class="col-sm-4 control-label" >Cantidad de Paquetes</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="cantidadInput" name="cantidad" placeholder="Cantidad de Paquetes" onkeypress="return inputLimiter(event,'Numbers')"  onkeypress="myFunction()">
			    	</div>			      					      		
			  	</div>	
			  
		  		<div class="form-group required">
		    		<label for="tipoDestino" class="col-sm-4 control-label">Tipo de Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="tipoDestino" name="tipoDestino" placeholder="Tipo de Destino" readonly>
		    		</div>		    		
		  		</div>			  				 
			  	
			  				  								
					<!-- FIN FIN FIN  -->				
			
				</br>
			  	</br>
				<div class="btn-inline">
					<div class="btn-group col-sm-5"></div>
					
					<div class="btn-group ">
						<input class="btn btn-primary" type="submit" value="Confirmar">
					</div>
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

""")))})),format.raw/*128.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
<<<<<<< HEAD
                    DATE: Tue Oct 25 16:02:08 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/registrarPedido.scala.html
=======
                    DATE: Tue Oct 25 17:51:39 COT 2016
=======
                    DATE: Tue Oct 25 18:51:54 COT 2016
>>>>>>> origin/JL
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/registrarPedido.scala.html
>>>>>>> origin/JL
                    HASH: 089db95362d988dab3f573c15e8aae07549421e9
                    MATRIX: 784->1|895->18|934->23|948->30|976->50|1015->52|1284->285|1299->291|1358->328|1430->364|1445->370|1499->402|1571->438|1586->444|1639->475|1711->511|1726->517|1782->551|2311->1052|2340->1053|2369->1054|2411->1068|2440->1069|2469->1070|6331->4900
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|61->33|61->33|61->33|61->33|61->33|61->33|156->128
                    -- GENERATED --
                */
            