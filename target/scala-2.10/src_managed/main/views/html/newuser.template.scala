
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
object newuser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    <!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR USUARIO</title>
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
    					<strong>REGISTRAR USUARIO</strong>
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
		    		<label for="clienteOrigen_input" class="col-sm-4 control-label">Cuenta</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="cliente_origen" name="cliente_origen" placeholder="Cliente Origen" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadOrigen_input" class="col-sm-4 control-label">Ciudad Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" placeholder="Ciudad Origen" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadDestino_input" class="col-sm-4 control-label">Ciudad Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" placeholder="Ciudad Destino" onkeypress="return inputLimiter(event,'Numbers')" readonly>
		    		</div>
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

""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 18:53:07 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/newuser.scala.html
                    HASH: 12f77df2e614c83605df3cf3d6deffbacd32e6bb
                    MATRIX: 776->1|887->18|926->23|940->30|968->50|1007->52|1277->286|1292->292|1351->329|1423->365|1438->371|1492->403|1564->439|1579->445|1632->476|1704->512|1719->518|1775->552|2305->1054|2334->1055|2363->1056|2405->1070|2434->1071|2463->1072
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|61->33|61->33|61->33|61->33|61->33|61->33
                    -- GENERATED --
                */
            