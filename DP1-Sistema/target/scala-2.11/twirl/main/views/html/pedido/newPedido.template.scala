
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
						<a href='"""),_display_(/*86.17*/routes/*86.23*/.PedidosC.index()),format.raw/*86.40*/("""' class="btn btn-info">Cancelar</a>
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
                  DATE: Wed Nov 16 02:29:39 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/pedido/newPedido.scala.html
                  HASH: 77da0cc382eba6b6f8c4c49ef0d2754b35191086
                  MATRIX: 760->1|872->18|900->21|914->28|942->48|981->50|1017->60|1258->274|1273->280|1331->317|1393->352|1408->358|1461->390|1523->425|1538->431|1590->462|1652->497|1667->503|1722->537|2233->1020|2262->1021|2291->1022|2320->1023|2361->1036|2390->1037|2419->1038|4099->2691|4114->2697|4152->2714|4343->2878|4358->2884|4416->2921|4491->2968|4507->2974|4558->3003|4633->3050|4649->3056|4710->3095|4795->3152|4811->3158|4863->3188
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|117->86|117->86|117->86|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105
                  -- GENERATED --
              */
          