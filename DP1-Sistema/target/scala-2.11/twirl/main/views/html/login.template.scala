
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css")),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css")),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css")),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css")),format.raw/*14.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(/*15.33*/routes/*15.39*/.Assets.at("css/DataTable.css")),format.raw/*15.70*/("""'>	
	
	</head>
	<body>
	
	<!---Cuerpo -->
	<div class="container" style="max-width:1200px">
        <div class="panel panel-default panel-login-box">
            <div class="panel-heading lead text-center" style="color: gray"><strong>S I M U &nbsp S O F T &nbsp - &nbsp L O G I N &nbsp; <p class="glyphicon glyphicon-user"></p></strong>
            </div>

            <form class="m-t" role="form" id="login-form" method="POST" action=""""),_display_(/*26.82*/controllers/*26.93*/.routes.SessionC.authenticate()),format.raw/*26.124*/("""" novalidate>

            <div class="panel-body">                               
                <div class="form-group">
                    <label class="control-label col-sm-2 col-sm-offset-2 lead"><strong>Usuario:</strong></label>
                    <div class="col-md-5">
                        <input type="email" class="form-control" name="username" id="username" placeholder="Ingresa tu correo">
                    </div>
                </div>
                <br/><br/><br/>
                <div class="form-group">
                    <label class="control-label col-sm-2 col-sm-offset-2 lead"><strong>Contraseña:</strong></label>
                    <div class="col-md-5">
                        <input type="password" class="form-control" name="password" id="password" placeholder="Ingrese su contraseña">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-md-6 col-md-offset-4">
                        <div class="checkbox">
                            <label style="color: #D8D8D8; font-size: large">
                                <input type="checkbox" name="remember"> <strong>Remember Me</strong> 
                            </label>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-md-6 text-right">
                        <input class="btn btn-primary" type="submit" value="Ingresar">
                    </div>                        
                </div>

                </form>
                
                <div class="form-group">
                    <div class="col-sm-12  text-right">
                        <a class="btn btn-link login-links" ><strong>¿No recuerdas tu contraseña?</strong></a>          
                    </div>
                </div>                
            </div>                                          
    	</div>      
    </div>
	
	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*73.17*/routes/*73.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*73.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*75.17*/routes/*75.23*/.Assets.at("js/bootstrap.js")),format.raw/*75.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*77.17*/routes/*77.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*77.62*/("""'></script>		

	</body>
	</html>

""")))}),format.raw/*82.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 18:04:33 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/login.scala.html
                  HASH: 90b263f29636910749c7584a52da57953073ee41
                  MATRIX: 745->1|855->16|885->21|899->28|952->73|991->75|1029->87|1249->280|1264->286|1322->323|1385->359|1400->365|1453->397|1516->433|1531->439|1583->470|1646->506|1661->512|1716->546|1780->583|1795->589|1847->620|2323->1069|2343->1080|2396->1111|4522->3210|4537->3216|4595->3253|4673->3304|4688->3310|4738->3339|4816->3390|4831->3396|4891->3435|4961->3475
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|57->26|57->26|57->26|104->73|104->73|104->73|106->75|106->75|106->75|108->77|108->77|108->77|113->82
                  -- GENERATED --
              */
          