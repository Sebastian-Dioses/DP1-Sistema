
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
						<a href='"""),_display_(/*93.17*/routes/*93.23*/.VuelosC.index()),format.raw/*93.39*/("""' class="btn btn-info">Cancelar</a>
					</div>
				</div>
				</br>
				</br>

				
				
			</form>
		</div>
        </div>		
    
    <!-- JQuery -->
    	<script src='"""),_display_(/*106.20*/routes/*106.26*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*106.63*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*108.17*/routes/*108.23*/.Assets.at("js/bootstrap.js")),format.raw/*108.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*110.17*/routes/*110.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*110.62*/("""'></script>		
		<!-- Mis Scripts -->
		<script src='"""),_display_(/*112.17*/routes/*112.23*/.Assets.at("js/MisScripts.js")),format.raw/*112.53*/("""'></script>

		<script src='"""),_display_(/*114.17*/routes/*114.23*/.Assets.at("js/jquery.dataTables.js")),format.raw/*114.60*/("""'></script>

		<script src='"""),_display_(/*116.17*/routes/*116.23*/.Assets.at("js/jquery.js")),format.raw/*116.49*/("""'></script>
		<script src='"""),_display_(/*117.17*/routes/*117.23*/.Assets.at("js/timepicki.js")),format.raw/*117.52*/("""'></script>
    	<script>
		  $(document).ready(function()"""),format.raw/*119.33*/("""{"""),format.raw/*119.34*/("""
		    """),format.raw/*120.7*/("""$(".time_element").timepicki();
		  """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""");
		</script>
    
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
                  DATE: Tue Nov 15 17:19:10 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/vuelo/newVuelo.scala.html
                  HASH: ca00ff9f6912a40c37348e44b83cdc5e9b70b44b
                  MATRIX: 757->1|869->18|899->23|913->30|941->50|980->52|1018->64|1273->292|1288->298|1346->335|1409->371|1424->377|1477->409|1540->445|1555->451|1607->482|1670->518|1685->524|1740->558|1822->613|1837->619|1889->650|2418->1151|2447->1152|2476->1153|2505->1154|2546->1167|2575->1168|2604->1169|5106->3644|5121->3650|5158->3666|5370->3850|5386->3856|5445->3893|5524->3944|5540->3950|5591->3979|5670->4030|5686->4036|5747->4075|5830->4130|5846->4136|5898->4166|5957->4197|5973->4203|6032->4240|6091->4271|6107->4277|6155->4303|6212->4332|6228->4338|6279->4367|6368->4427|6398->4428|6434->4436|6499->4473|6528->4474
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|64->33|64->33|64->33|64->33|64->33|64->33|64->33|124->93|124->93|124->93|137->106|137->106|137->106|139->108|139->108|139->108|141->110|141->110|141->110|143->112|143->112|143->112|145->114|145->114|145->114|147->116|147->116|147->116|148->117|148->117|148->117|150->119|150->119|151->120|152->121|152->121
                  -- GENERATED --
              */
          