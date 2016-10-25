
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    <!DOCTYPE html>
	<html>
	<head>
		<title>Home Page</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*11.33*/routes/*11.39*/.Assets.at("css/jquery.bxslider.css"))),format.raw/*11.76*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("css/MisEstilos.css"))),format.raw/*12.71*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*13.33*/routes/*13.39*/.Assets.at("css/bootstrap.css"))),format.raw/*13.70*/("""'>
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Assets.at("css/font-awesome.css"))),format.raw/*14.73*/("""'>	
		<link rel='stylesheet' href='"""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("css/DataTable.css"))),format.raw/*15.70*/("""'>	
	
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
                        <a href='"""),_display_(Seq[Any](/*52.35*/routes/*52.41*/.Application.index())),format.raw/*52.61*/("""' class="btn btn-info" role="button">
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
		<script src='"""),_display_(Seq[Any](/*70.17*/routes/*70.23*/.Assets.at("js/jquery-1.11.3.min.js"))),format.raw/*70.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(Seq[Any](/*72.17*/routes/*72.23*/.Assets.at("js/bootstrap.js"))),format.raw/*72.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(Seq[Any](/*74.17*/routes/*74.23*/.Assets.at("js/jquery.bxslider.min.js"))),format.raw/*74.62*/("""'></script>		

	</body>
	</html>

""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 07:12:29 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/login.scala.html
                    HASH: 9e4418ebca3e9a7b2b822c9a352f40e0b07728ff
                    MATRIX: 774->1|883->16|920->19|934->26|987->71|1026->73|1259->270|1274->276|1333->313|1404->348|1419->354|1473->386|1544->421|1559->427|1612->458|1683->493|1698->499|1754->533|1826->569|1841->575|1894->606|3690->2366|3705->2372|3747->2392|4449->3058|4464->3064|4523->3101|4608->3150|4623->3156|4674->3185|4759->3234|4774->3240|4835->3279|4901->3314
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|80->52|80->52|80->52|98->70|98->70|98->70|100->72|100->72|100->72|102->74|102->74|102->74|107->79
                    -- GENERATED --
                */
            