
package views.html.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editPass_Scope0 {
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

class editPass extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Usuarios,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario:models.Usuarios):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>CAMBIAR CONTRASEÑA</title>
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
    					<strong>CAMBIAR CONTRASEÑA</strong>
    			</div>		
    		</div>
    		<div class="container">
			
			<form method="POST" action="cambiarPassword" class="form-horizontal form-border">
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
		    		<label for="nombre" class="col-sm-4 control-label">Cuenta</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de Cuenta" disabled value=""""),_display_(/*56.126*/usuario/*56.133*/.nombre),format.raw/*56.140*/("""">
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="pwActual" class="col-sm-4 control-label">Contraseña actual</label>
		    		<div class="col-sm-5">
		      			<input type="password" class="form-control" id="pwActual" name="pwActual" placeholder="Contraseña actual" required>
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
		    		<label for="pwNueva" class="col-sm-4 control-label">Nueva contraseña</label>
		    		<div class="col-sm-5">
		      			<input type="password" class="form-control" id="pwNueva" name="pwNueva" placeholder="Nueva contraseña" >
		    		</div>
		  		</div>
		  		
		  		<div class="form-group required">
			    	<label for="pwNueva2" class="col-sm-4 control-label">Confirmar nueva contraseña</label>
			    	<div class="col-sm-5">
			      		<input type="password" class="form-control" id="pwNueva2" name="pwNueva2" placeholder="Confirmar nueva contraseña" required>
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

  def render(usuario:models.Usuarios): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((models.Usuarios) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object editPass extends editPass_Scope0.editPass
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 22:48:05 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/usuario/editPass.scala.html
                  HASH: bb3d67c1eb01826c6f3410c6134cfeb81913ec40
                  MATRIX: 768->1|888->26|918->31|932->38|960->58|999->60|1037->72|1287->295|1302->301|1360->338|1423->374|1438->380|1491->412|1554->448|1569->454|1621->485|1684->521|1699->527|1754->561|2297->1076|2326->1077|2355->1078|2384->1079|2425->1092|2454->1093|2483->1094|3182->1765|3199->1772|3228->1779
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|87->56|87->56|87->56
                  -- GENERATED --
              */
          