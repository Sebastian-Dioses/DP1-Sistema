
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrarPedido_Scope0 {
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

class registrarPedido extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR PEDIDO</title>
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

""")))}),format.raw/*128.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object registrarPedido extends registrarPedido_Scope0.registrarPedido
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 20:03:13 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/registrarPedido.scala.html
                  HASH: 276c6f5cd87696f418d044bb9610a883ce17c8b6
                  MATRIX: 765->1|877->18|907->23|921->30|949->50|988->52|1026->64|1274->285|1289->291|1347->328|1410->364|1425->370|1478->402|1541->438|1556->444|1608->475|1671->511|1686->517|1741->551|2270->1052|2299->1053|2328->1054|2357->1055|2398->1068|2427->1069|2456->1070|6317->4900
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|159->128
                  -- GENERATED --
              */
          