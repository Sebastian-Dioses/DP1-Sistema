
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
            <div class="panel-body">                               
                <div class="form-group">
                    <label class="control-label col-sm-2 col-sm-offset-2 lead"><strong>Usuario:</strong></label>
                    <div class="col-md-5">
                        <input type="email" class="form-control" name="email" placeholder="Ingresa tu correo">
                    </div>
                </div>
                <br/><br/><br/>
                <div class="form-group">
                    <label class="control-label col-sm-2 col-sm-offset-2 lead"><strong>Contraseña:</strong></label>
                    <div class="col-md-5">
                        <input type="password" class="form-control" name="password" placeholder="Ingrese su contraseña">
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
                        <a href='"""),_display_(/*52.35*/routes/*52.41*/.Application.index()),format.raw/*52.61*/("""' class="btn btn-primary" role="button">
                            <i class="fa fa-btn fa-sign-in" ></i> Ingresar
                        </a>
                    </div>                        
                </div>
                
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
		<script src='"""),_display_(/*70.17*/routes/*70.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*70.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*72.17*/routes/*72.23*/.Assets.at("js/bootstrap.js")),format.raw/*72.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*74.17*/routes/*74.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*74.62*/("""'></script>		

	</body>
	</html>

""")))}),format.raw/*79.2*/("""
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
                  DATE: Mon Nov 07 15:11:49 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/login.scala.html
                  HASH: ac54b5c876575be51bbacff93cc16305b5c26e12
                  MATRIX: 745->1|855->16|885->21|899->28|952->73|991->75|1029->87|1249->280|1264->286|1322->323|1385->359|1400->365|1453->397|1516->433|1531->439|1583->470|1646->506|1661->512|1716->546|1780->583|1795->589|1847->620|3671->2417|3686->2423|3727->2443|4441->3130|4456->3136|4514->3173|4592->3224|4607->3230|4657->3259|4735->3310|4750->3316|4810->3355|4880->3395
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|83->52|83->52|83->52|101->70|101->70|101->70|103->72|103->72|103->72|105->74|105->74|105->74|110->79
                  -- GENERATED --
              */
          