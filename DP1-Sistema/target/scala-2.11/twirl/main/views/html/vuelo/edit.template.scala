
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
                  DATE: Tue Nov 15 23:59:28 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/vuelo/edit.scala.html
                  HASH: e5cfdce078c10f0ad1b4b7c33e65de43e81dcdd4
                  MATRIX: 756->1|873->23|903->28|917->35|945->55|984->57|1022->69|1274->294|1289->300|1347->337|1410->373|1425->379|1478->411|1541->447|1556->453|1608->484|1671->520|1686->526|1741->560|1823->615|1838->621|1890->652|2419->1153|2448->1154|2477->1155|2506->1156|2547->1169|2576->1170|2605->1171|3294->1832|3309->1837|3334->1840|3700->2178|3715->2183|3751->2197|4130->2548|4145->2553|4182->2568|5552->3910|5568->3916|5606->3932|5818->4116|5834->4122|5893->4159|5972->4210|5988->4216|6039->4245|6118->4296|6134->4302|6195->4341|6278->4396|6294->4402|6346->4432|6405->4463|6421->4469|6480->4506|6539->4537|6555->4543|6603->4569|6660->4598|6676->4604|6727->4633|6816->4693|6846->4694|6882->4702|6947->4739|6976->4740
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|64->33|64->33|64->33|64->33|64->33|64->33|64->33|87->56|87->56|87->56|94->63|94->63|94->63|101->70|101->70|101->70|131->100|131->100|131->100|144->113|144->113|144->113|146->115|146->115|146->115|148->117|148->117|148->117|150->119|150->119|150->119|152->121|152->121|152->121|154->123|154->123|154->123|155->124|155->124|155->124|157->126|157->126|158->127|159->128|159->128
                  -- GENERATED --
              */
          