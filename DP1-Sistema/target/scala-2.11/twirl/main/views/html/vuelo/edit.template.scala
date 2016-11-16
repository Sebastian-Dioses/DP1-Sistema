
package views.html.vuelo

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Vuelos,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vuelo: models.Vuelos):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>EDITAR PLAN DE VUELO</title>
    	<meta charset="UTF-8">
    
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*12.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/MisEstilos.css")),format.raw/*13.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/bootstrap.css")),format.raw/*14.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/font-awesome.css")),format.raw/*15.73*/("""'>
    	<link rel="stylesheet" type="text/css" href='"""),_display_(/*16.52*/routes/*16.58*/.Assets.at("css/timepicki.css")),format.raw/*16.89*/("""'>
    </head>
    <body>

    <!---Cuerpo -->
    <main class="main">
    	<div class="content" style="max-width: 100%;">
    		<!-- Utilizando Bootstrap -->
    		<br/><br/>
    		<div class="container">
    			<div class="col-sm-12 text-left lead">
    					<strong>EDITAR PLAN DE VUELO</strong>
    			</div>		
    		</div>
    		<div class="container">
			
			<form method="POST" action="update" class="form-horizontal form-border">
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
		    		<label for="id" class="col-sm-4 control-label">ID Vuelo</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="id" name="id" placeholder="Ciudad de Origen" readonly value=""""),_display_(/*56.118*/vuelo/*56.123*/.id),format.raw/*56.126*/("""">
		    		</div>
		  		</div>

				<div class="form-group required">
		    		<label for="ciudad_origen" class="col-sm-4 control-label">Ciudad de Origen</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_origen" name="ciudad_origen" placeholder="Ciudad de Origen" readonly value=""""),_display_(/*63.140*/vuelo/*63.145*/.ciudad_origen),format.raw/*63.159*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="ciudad_destino" class="col-sm-4 control-label">Ciudad de Destino</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="ciudad_destino" name="ciudad_destino" placeholder="Ciudad de Destino" readonly value=""""),_display_(/*70.143*/vuelo/*70.148*/.ciudad_destino),format.raw/*70.163*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="hora_salida" class="col-sm-4 control-label">Hora de Salida</label>
		    		<div class="col-sm-5">
		      			<!--<input type="time" class="form-control" id="hora_salida" name="hora_salida" placeholder="Hora de Salida" required onkeypress="return inputLimiter(event,'Nulo')">-->
		      			<input type="text" id="hora_salida" name="hora_salida" class="time_element" required/>
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="hora_llegada" class="col-sm-4 control-label">Hora de Llegada</label>
			    	<div class="col-sm-5">
			      		<!--<input type="time" class="form-control" id="hora_llegada" name="hora_llegada" placeholder="Hora de Llegada" required onkeypress="return inputLimiter(event,'Nulo')">-->
			      		<input type="text" id="hora_llegada" name="hora_llegada" class="time_element" required/>
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
						<a href='"""),_display_(/*100.17*/routes/*100.23*/.VuelosC.index()),format.raw/*100.39*/("""' class="btn btn-info">Cancelar</a>
					</div>
				</div>
				</br>
				</br>

				
				
			</form>
		</div>
        </div>		
    
    <!-- JQuery -->
    	<script src='"""),_display_(/*113.20*/routes/*113.26*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*113.63*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*115.17*/routes/*115.23*/.Assets.at("js/bootstrap.js")),format.raw/*115.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*117.17*/routes/*117.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*117.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*119.17*/routes/*119.23*/.Assets.at("js/MisScripts.js")),format.raw/*119.53*/("""'></script>

		<script src='"""),_display_(/*121.17*/routes/*121.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*121.60*/("""'></script>

		<script src='"""),_display_(/*123.17*/routes/*123.23*/.Assets.at("js/jquery.js")),format.raw/*123.49*/("""'></script>
		<script src='"""),_display_(/*124.17*/routes/*124.23*/.Assets.at("js/timepicki.js")),format.raw/*124.52*/("""'></script>
    	<script>
		  $(document).ready(function()"""),format.raw/*126.33*/("""{"""),format.raw/*126.34*/("""
		    """),format.raw/*127.7*/("""$(".time_element").timepicki();
		  """),format.raw/*128.5*/("""}"""),format.raw/*128.6*/(""");
		</script>
    
    </body>
    </html>

""")))}))
      }
    }
  }

  def render(vuelo:models.Vuelos): play.twirl.api.HtmlFormat.Appendable = apply(vuelo)

  def f:((models.Vuelos) => play.twirl.api.HtmlFormat.Appendable) = (vuelo) => apply(vuelo)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:29:39 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/vuelo/edit.scala.html
                  HASH: aca02596426ae9eabf6e853aaada0590eb1f33a3
                  MATRIX: 756->1|873->23|901->26|915->33|943->53|982->55|1018->65|1263->283|1278->289|1336->326|1398->361|1413->367|1466->399|1528->434|1543->440|1595->471|1657->506|1672->512|1727->546|1808->600|1823->606|1875->637|2387->1121|2416->1122|2445->1123|2474->1124|2515->1137|2544->1138|2573->1139|3239->1777|3254->1782|3279->1785|3638->2116|3653->2121|3689->2135|4061->2479|4076->2484|4113->2499|5453->3811|5469->3817|5507->3833|5706->4004|5722->4010|5781->4047|5858->4096|5874->4102|5925->4131|6002->4180|6018->4186|6079->4225|6160->4278|6176->4284|6228->4314|6285->4343|6301->4349|6360->4386|6417->4415|6433->4421|6481->4447|6537->4475|6553->4481|6604->4510|6691->4568|6721->4569|6756->4576|6820->4612|6849->4613
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|64->33|64->33|64->33|64->33|64->33|64->33|64->33|87->56|87->56|87->56|94->63|94->63|94->63|101->70|101->70|101->70|131->100|131->100|131->100|144->113|144->113|144->113|146->115|146->115|146->115|148->117|148->117|148->117|150->119|150->119|150->119|152->121|152->121|152->121|154->123|154->123|154->123|155->124|155->124|155->124|157->126|157->126|158->127|159->128|159->128
                  -- GENERATED --
              */
          