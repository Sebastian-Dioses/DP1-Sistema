
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
                  DATE: Wed Nov 16 02:08:38 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/newCiudad.scala.html
                  HASH: 89b743ef1bc58f4a4274177159a19020f1411d32
                  MATRIX: 760->1|872->18|900->21|914->28|942->48|981->50|1017->60|1262->278|1277->284|1335->321|1397->356|1412->362|1465->394|1527->429|1542->435|1594->466|1656->501|1671->507|1726->541|2241->1028|2270->1029|2299->1030|2328->1031|2369->1044|2398->1045|2427->1046|2523->1116|2564->1148|2604->1150|2644->1162|2859->1350|2873->1355|2909->1370|2949->1382|2994->1397|3030->1407|3069->1437|3109->1439|3149->1451|3363->1638|3377->1643|3411->1656|3451->1668|3496->1683|3532->1693|3570->1722|3610->1724|3650->1736|3861->1920|3875->1925|3908->1937|3948->1949|3993->1964|4031->1975|6452->4368|6468->4374|6508->4392
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|78->47|79->48|81->50|81->50|81->50|82->51|84->53|84->53|84->53|85->54|86->55|89->58|149->118|149->118|149->118
                  -- GENERATED --
              */
          