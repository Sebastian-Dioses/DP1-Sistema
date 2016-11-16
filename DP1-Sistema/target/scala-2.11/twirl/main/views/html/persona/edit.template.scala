
package views.html.persona

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Personas,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persona: models.Personas):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
    	<title>REGISTRAR PERSONA</title>
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
    					<strong>REGISTRAR PERSONA</strong>
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
		    		<label for="id" class="col-sm-4 control-label">ID Persona</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="id" name="id" readonly value=""""),_display_(/*56.87*/persona/*56.94*/.id),format.raw/*56.97*/("""">
		    		</div>
		  		</div>

		  		<div class="form-group required">
		    		<label for="nombre" class="col-sm-4 control-label">Nombre</label>
		    		<div class="col-sm-5">
		      			<input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de Persona" readonly value=""""),_display_(/*63.127*/persona/*63.134*/.nombre),format.raw/*63.141*/("""">
		    		</div>
		  		</div>		  
		  		
		  		<div class="form-group required">
			    	<label for="dni" class="col-sm-4 control-label">DNI</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="dni" name="dni" placeholder="DNI de Persona" readonly value=""""),_display_(/*70.118*/persona/*70.125*/.dni),format.raw/*70.129*/("""">
			    	</div>			      					      		
			  	</div>	
			  
		  		<div class="form-group required">
			    	<label for="correo" class="col-sm-4 control-label">Correo</label>
			    	<div class="col-sm-5">
			      		<input type="text" class="form-control" id="correo" name="correo" placeholder="Correo de Persona" required onkeypress="return inputLimiter(event,'NameCharactersAndNumbers')" value=""""),_display_(/*77.194*/persona/*77.201*/.correo),format.raw/*77.208*/("""">
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
						<a href='"""),_display_(/*92.17*/routes/*92.23*/.PersonasC.index()),format.raw/*92.41*/("""' class="btn btn-info">Cancelar</a>
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

  def render(persona:models.Personas): play.twirl.api.HtmlFormat.Appendable = apply(persona)

  def f:((models.Personas) => play.twirl.api.HtmlFormat.Appendable) = (persona) => apply(persona)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:29:39 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/persona/edit.scala.html
                  HASH: b63fdd56c273a982d2a6e1fa2a0675c6b87f5af1
                  MATRIX: 760->1|881->27|909->30|923->37|951->57|990->59|1026->69|1268->284|1283->290|1341->327|1403->362|1418->368|1471->400|1533->435|1548->441|1600->472|1662->507|1677->513|1732->547|2247->1034|2276->1035|2305->1036|2334->1037|2375->1050|2404->1051|2433->1052|3074->1666|3090->1673|3114->1676|3445->1979|3462->1986|3491->1993|3817->2291|3834->2298|3860->2302|4286->2700|4303->2707|4332->2714|4696->3051|4711->3057|4750->3075
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|64->33|64->33|64->33|64->33|64->33|64->33|64->33|87->56|87->56|87->56|94->63|94->63|94->63|101->70|101->70|101->70|108->77|108->77|108->77|123->92|123->92|123->92
                  -- GENERATED --
              */
          