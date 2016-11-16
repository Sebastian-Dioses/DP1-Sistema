
package views.html.ciudad

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newCiudad_Scope0 {
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

class newCiudad extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR AEROPUERTO</title>
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
    					<strong>REGISTRAR AEROPUERTO</strong>
    			</div>		
    		</div>
    		<div class="container">
			
			<form method="POST" action="add" class="form-horizontal form-border">
				<input type="hidden" name="_token" value=""""),format.raw/*33.47*/("""{"""),format.raw/*33.48*/("""{"""),format.raw/*33.49*/(""" """),format.raw/*33.50*/("""csrf_token() """),format.raw/*33.63*/("""}"""),format.raw/*33.64*/("""}"""),format.raw/*33.65*/("""">
				
				<!-- Mensajes de error de validación del Request -->
				"""),_display_(/*36.6*/if(flash.containsKey("success"))/*36.38*/ {_display_(Seq[Any](format.raw/*36.40*/("""
			        """),format.raw/*37.12*/("""<div class="alert alert-success fade in text-center">
			            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			            <strong>¡Éxito!</strong> """),_display_(/*39.42*/flash/*39.47*/.get("success")),format.raw/*39.62*/("""
			        """),format.raw/*40.12*/("""</div>
			    """)))}),format.raw/*41.9*/("""

			    """),_display_(/*43.9*/if(flash.containsKey("error"))/*43.39*/ {_display_(Seq[Any](format.raw/*43.41*/("""
			        """),format.raw/*44.12*/("""<div class="alert alert-danger fade in text-center">
			            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			            <strong>¡Error!</strong> """),_display_(/*46.42*/flash/*46.47*/.get("error")),format.raw/*46.60*/("""
			        """),format.raw/*47.12*/("""</div>
			    """)))}),format.raw/*48.9*/("""

			    """),_display_(/*50.9*/if(flash.containsKey("info"))/*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
			        """),format.raw/*51.12*/("""<div class="alert alert-info fade in text-center">
			            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			            <strong>¡Info!</strong> """),_display_(/*53.41*/flash/*53.46*/.get("info")),format.raw/*53.58*/("""
			        """),format.raw/*54.12*/("""</div>
			    """)))}),format.raw/*55.9*/("""
				

				"""),format.raw/*58.5*/("""<br/>
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
		    		<label for="cod_ciudad" class="col-sm-4 control-label">Código de ciudad</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="cod_ciudad" name="cod_ciudad" placeholder="Código de ciudad" required onkeypress="return inputLimiter(event,'Letters')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="nombre" class="col-sm-4 control-label">Nombre</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required onkeypress="return inputLimiter(event,'Letters')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="pais" class="col-sm-4 control-label">País</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="pais" name="pais" placeholder="País" required onkeypress="return inputLimiter(event,'Letters')">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="abreviado" class="col-sm-4 control-label">Nombre Abreviado</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="abreviado" name="abreviado" placeholder="Nombre Abreviado" required onkeypress="return inputLimiter(event,'Letters')">
			    	</div>			      					      		
			  	</div>	
			  
		  		<div class="form-group required">
			    	<label for="capacidad_almacen" class="col-sm-4 control-label">Capacidad del almacen</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="capacidad_almacen" name="capacidad_almacen" placeholder="Capacidad del almacen" required onkeypress="return inputLimiter(event,'Numbers')">
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
						<a href='"""),_display_(/*118.17*/routes/*118.23*/.CiudadesC.index()),format.raw/*118.41*/("""' class="btn btn-info">Cancelar</a>
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
object newCiudad extends newCiudad_Scope0.newCiudad
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Tue Nov 15 17:19:01 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/newCiudad.scala.html
=======
                  DATE: Tue Nov 15 20:03:14 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/ciudad/newCiudad.scala.html
>>>>>>> 24dff40eaed1b655d957aba2eef3eba483c90e50
                  HASH: 31ef6c9e294de4ff5b6a354649c991641800cae5
                  MATRIX: 760->1|872->18|902->23|916->30|944->50|983->52|1021->64|1273->289|1288->295|1346->332|1409->368|1424->374|1477->406|1540->442|1555->448|1607->479|1670->515|1685->521|1740->555|2273->1060|2302->1061|2331->1062|2360->1063|2401->1076|2430->1077|2459->1078|2558->1151|2599->1183|2639->1185|2680->1198|2897->1388|2911->1393|2947->1408|2988->1421|3034->1437|3072->1449|3111->1479|3151->1481|3192->1494|3408->1683|3422->1688|3456->1701|3497->1714|3543->1730|3581->1742|3619->1771|3659->1773|3700->1786|3913->1972|3927->1977|3960->1989|4001->2002|4047->2018|4088->2032|6569->4485|6585->4491|6625->4509
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|78->47|79->48|81->50|81->50|81->50|82->51|84->53|84->53|84->53|85->54|86->55|89->58|149->118|149->118|149->118
                  -- GENERATED --
              */
          