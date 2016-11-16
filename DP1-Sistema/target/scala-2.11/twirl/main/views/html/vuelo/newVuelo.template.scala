
package views.html.vuelo

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newVuelo_Scope0 {
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

class newVuelo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR PLAN DE VUELO</title>
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
    					<strong>REGISTRAR PLAN DE VUELO</strong>
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
		    		<label for="ciudad_origen" class="col-sm-4 control-label">Ciudad de Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" placeholder="Ciudad de Origen" required onkeypress="return inputLimiter(event,'Letters')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudad_destino" class="col-sm-4 control-label">Ciudad de Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" placeholder="Ciudad de Destino" required onkeypress="return inputLimiter(event,'Letters')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="hora_salida" class="col-sm-4 control-label">Hora de Salida</label>
		    		<div class="col-sm-5">
		      			<input type="time" class="form-control" id="hora_salida" name="hora_salida" placeholder="Hora de Salida" required onkeypress="return inputLimiter(event,'Nulo')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="hora_llegada" class="col-sm-4 control-label">Hora de Llegada</label>
			    	<div class="col-sm-5">
			      		<input type="time" class="form-control" id="hora_llegada" name="hora_llegada" placeholder="Hora de Llegada" required onkeypress="return inputLimiter(event,'Nulo')">
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
						<a href='"""),_display_(/*91.17*/routes/*91.23*/.VuelosC.index()),format.raw/*91.39*/("""' class="btn btn-info">Cancelar</a>
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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object newVuelo extends newVuelo_Scope0.newVuelo
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 20:03:14 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/vuelo/newVuelo.scala.html
                  HASH: c012ae83d2481bea4bf5adef4908a3328380aa12
                  MATRIX: 757->1|869->18|899->23|913->30|941->50|980->52|1018->64|1273->292|1288->298|1346->335|1409->371|1424->377|1477->409|1540->445|1555->451|1607->482|1670->518|1685->524|1740->558|2276->1066|2305->1067|2334->1068|2363->1069|2404->1082|2433->1083|2462->1084|4750->3345|4765->3351|4802->3367
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|122->91|122->91|122->91
                  -- GENERATED --
              */
          