
package views.html.ciudad

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Ciudades,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ciudad: models.Ciudades):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>EDITAR AEROPUERTO</title>
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
    					<strong>EDITAR AEROPUERTO</strong>
    			</div>		
    		</div>
    		<div class="container">
			
			<form method="POST" action="update" class="form-horizontal form-border">
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
		      			<input type="text" class="form-control" id="cod_ciudad" name="cod_ciudad" placeholder="Código de ciudad" readonly value=""""),_display_(/*75.134*/ciudad/*75.140*/.cod_ciudad),format.raw/*75.151*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="nombre" class="col-sm-4 control-label">Nombre</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" readonly value=""""),_display_(/*82.116*/ciudad/*82.122*/.nombre),format.raw/*82.129*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="pais" class="col-sm-4 control-label">País</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="pais" name="pais" placeholder="País" readonly value=""""),_display_(/*89.110*/ciudad/*89.116*/.pais),format.raw/*89.121*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="abreviado" class="col-sm-4 control-label">Nombre Abreviado</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="abreviado" name="abreviado" placeholder="Nombre Abreviado" readonly value=""""),_display_(/*96.132*/ciudad/*96.138*/.abreviado),format.raw/*96.148*/("""">
			    	</div>			      					      		
			  	</div>	
			  
		  		<div class="form-group required">
			    	<label for="capacidad_almacen" class="col-sm-4 control-label">Capacidad del almacen</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="capacidad_almacen" name="capacidad_almacen" placeholder="Capacidad del almacen" value=""""),_display_(/*103.144*/ciudad/*103.150*/.capacidad_almacen),format.raw/*103.168*/("""" onkeypress="return inputLimiter(event,'Numbers')">
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
						<a href=href='"""),_display_(/*118.22*/routes/*118.28*/.CiudadesC.index()),format.raw/*118.46*/("""' class="btn btn-info">Cancelar</a>
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

  def render(ciudad:models.Ciudades): play.twirl.api.HtmlFormat.Appendable = apply(ciudad)

  def f:((models.Ciudades) => play.twirl.api.HtmlFormat.Appendable) = (ciudad) => apply(ciudad)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Tue Nov 15 17:19:00 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/edit.scala.html
=======
                  DATE: Tue Nov 15 20:03:13 COT 2016
                  SOURCE: C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/app/views/ciudad/edit.scala.html
>>>>>>> 24dff40eaed1b655d957aba2eef3eba483c90e50
                  HASH: f110c26a16e16be14c5adc5ad23bc42f7c30e7a5
                  MATRIX: 759->1|879->26|909->31|923->38|951->58|990->60|1028->72|1277->294|1292->300|1350->337|1413->373|1428->379|1481->411|1544->447|1559->453|1611->484|1674->520|1689->526|1744->560|2277->1065|2306->1066|2335->1067|2364->1068|2405->1081|2434->1082|2463->1083|2562->1156|2603->1188|2643->1190|2684->1203|2901->1393|2915->1398|2951->1413|2992->1426|3038->1442|3076->1454|3115->1484|3155->1486|3196->1499|3412->1688|3426->1693|3460->1706|3501->1719|3547->1735|3585->1747|3623->1776|3663->1778|3704->1791|3917->1977|3931->1982|3964->1994|4005->2007|4051->2023|4092->2037|4697->2614|4713->2620|4746->2631|5079->2936|5095->2942|5124->2949|5447->3244|5463->3250|5490->3255|5852->3589|5868->3595|5900->3605|6310->3986|6327->3992|6368->4010|6803->4417|6819->4423|6859->4441
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|78->47|79->48|81->50|81->50|81->50|82->51|84->53|84->53|84->53|85->54|86->55|89->58|106->75|106->75|106->75|113->82|113->82|113->82|120->89|120->89|120->89|127->96|127->96|127->96|134->103|134->103|134->103|149->118|149->118|149->118
                  -- GENERATED --
              */
          