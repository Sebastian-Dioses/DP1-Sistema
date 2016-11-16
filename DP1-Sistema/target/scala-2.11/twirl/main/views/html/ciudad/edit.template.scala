
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

  def render(ciudad:models.Ciudades): play.twirl.api.HtmlFormat.Appendable = apply(ciudad)

  def f:((models.Ciudades) => play.twirl.api.HtmlFormat.Appendable) = (ciudad) => apply(ciudad)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:29:38 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/ciudad/edit.scala.html
                  HASH: 698e5121235c3f545fb2b2eb0a45117d9fcaf119
                  MATRIX: 759->1|879->26|907->29|921->36|949->56|988->58|1024->68|1266->283|1281->289|1339->326|1401->361|1416->367|1469->399|1531->434|1546->440|1598->471|1660->506|1675->512|1730->546|2245->1033|2274->1034|2303->1035|2332->1036|2373->1049|2402->1050|2431->1051|2527->1121|2568->1153|2608->1155|2648->1167|2863->1355|2877->1360|2913->1375|2953->1387|2998->1402|3034->1412|3073->1442|3113->1444|3153->1456|3367->1643|3381->1648|3415->1661|3455->1673|3500->1688|3536->1698|3574->1727|3614->1729|3654->1741|3865->1925|3879->1930|3912->1942|3952->1954|3997->1969|4035->1980|4623->2540|4639->2546|4672->2557|4998->2855|5014->2861|5043->2868|5359->3156|5375->3162|5402->3167|5757->3494|5773->3500|5805->3510|6208->3884|6225->3890|6266->3908|6681->4295|6697->4301|6737->4319
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|74->43|74->43|74->43|75->44|77->46|77->46|77->46|78->47|79->48|81->50|81->50|81->50|82->51|84->53|84->53|84->53|85->54|86->55|89->58|106->75|106->75|106->75|113->82|113->82|113->82|120->89|120->89|120->89|127->96|127->96|127->96|134->103|134->103|134->103|149->118|149->118|149->118
                  -- GENERATED --
              */
          