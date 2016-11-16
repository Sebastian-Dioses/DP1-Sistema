
package views.html.pedido

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newPedido_Scope0 {
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

class newPedido extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

				<!-- INICIO INCIO-->				                       				
				<div class="form-group required">
		    		<label for="clienteOrigen_input" class="col-sm-4 control-label">Ciudad de Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" placeholder="Ciudad de Origen" >
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadOrigen_input" class="col-sm-4 control-label">Ciudad de Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" placeholder="Ciudad de Destino" >
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudadDestino_input" class="col-sm-4 control-label">ID Persona</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="personas_id" name="personas_id" placeholder="ID de Persona" >
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
	<script src='"""),_display_(/*99.16*/routes/*99.22*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*99.59*/("""'></script>
	<!-- Bootstrap -->
	<script src='"""),_display_(/*101.16*/routes/*101.22*/.Assets.at("js/bootstrap.js")),format.raw/*101.51*/("""'></script>	
	<!-- BXSlider -->
	<script src='"""),_display_(/*103.16*/routes/*103.22*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*103.61*/("""'></script>
    	<!-- Mis Scripts -->
    	<script src='"""),_display_(/*105.20*/routes/*105.26*/.Assets.at("js/MisScripts.js")),format.raw/*105.56*/("""'></script>
    
    
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
object newPedido extends newPedido_Scope0.newPedido
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Tue Nov 15 17:38:34 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/newPedido.scala.html
                  HASH: beba8d32bca5a0fe3739033de37de6ec50146f6b
                  MATRIX: 760->1|872->18|902->23|916->30|944->50|983->52|1021->64|1269->285|1284->291|1342->328|1405->364|1420->370|1473->402|1536->438|1551->444|1603->475|1666->511|1681->517|1736->551|2265->1052|2294->1053|2323->1054|2352->1055|2393->1068|2422->1069|2451->1070|4184->2776|4199->2782|4237->2799|4441->2976|4456->2982|4514->3019|4591->3068|4607->3074|4658->3103|4735->3152|4751->3158|4812->3197|4899->3256|4915->3262|4967->3292
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|117->86|117->86|117->86|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105
=======
                  DATE: Tue Nov 15 20:03:14 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/pedido/newPedido.scala.html
                  HASH: 05189b82359be00e7b106f3355ed04075004e0ff
                  MATRIX: 760->1|872->18|902->23|916->30|944->50|983->52|1021->64|1269->285|1284->291|1342->328|1405->364|1420->370|1473->402|1536->438|1551->444|1603->475|1666->511|1681->517|1736->551|2265->1052|2294->1053|2323->1054|2352->1055|2393->1068|2422->1069|2451->1070|4386->2978|4401->2984|4459->3021|4536->3070|4552->3076|4603->3105|4680->3154|4696->3160|4757->3199|4844->3258|4860->3264|4912->3294
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105
>>>>>>> 24dff40eaed1b655d957aba2eef3eba483c90e50
                  -- GENERATED --
              */
          