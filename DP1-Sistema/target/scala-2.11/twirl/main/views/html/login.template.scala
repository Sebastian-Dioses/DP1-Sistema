
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

            """),_display_(/*26.14*/if(flash.containsKey("success"))/*26.46*/ {_display_(Seq[Any](format.raw/*26.48*/("""
                """),format.raw/*27.17*/("""<div class="alert alert-success fade in text-center">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>¡Éxito!</strong> """),_display_(/*29.47*/flash/*29.52*/.get("success")),format.raw/*29.67*/("""
                """),format.raw/*30.17*/("""</div>
            """)))}),format.raw/*31.14*/("""

            """),_display_(/*33.14*/if(flash.containsKey("error"))/*33.44*/ {_display_(Seq[Any](format.raw/*33.46*/("""
                """),format.raw/*34.17*/("""<div class="alert alert-danger fade in text-center">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>¡Error!</strong> """),_display_(/*36.47*/flash/*36.52*/.get("error")),format.raw/*36.65*/("""
                """),format.raw/*37.17*/("""</div>
            """)))}),format.raw/*38.14*/("""

            """),_display_(/*40.14*/if(flash.containsKey("info"))/*40.43*/ {_display_(Seq[Any](format.raw/*40.45*/("""
                """),format.raw/*41.17*/("""<div class="alert alert-info fade in text-center">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>¡Info!</strong> """),_display_(/*43.46*/flash/*43.51*/.get("info")),format.raw/*43.63*/("""
                """),format.raw/*44.17*/("""</div>
            """)))}),format.raw/*45.14*/("""

            """),format.raw/*47.13*/("""<form class="m-t" role="form" id="login-form" method="POST" action=""""),_display_(/*47.82*/controllers/*47.93*/.routes.SessionC.authenticate()),format.raw/*47.124*/("""" novalidate>

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
                                        
            </div>                                          
    	</div>      
    </div>
	
	<!--Pie de págna-->
		
	<!-- JQuery -->
		<script src='"""),_display_(/*89.17*/routes/*89.23*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*89.60*/("""'></script>
		<!-- Bootstrap -->
		<script src='"""),_display_(/*91.17*/routes/*91.23*/.Assets.at("js/bootstrap.js")),format.raw/*91.52*/("""'></script>	
		<!-- BXSlider -->
		<script src='"""),_display_(/*93.17*/routes/*93.23*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*93.62*/("""'></script>		

	</body>
	</html>

""")))}),format.raw/*98.2*/("""
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
                  DATE: Fri Nov 25 10:46:08 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/login.scala.html
                  HASH: 77c9e348756d8b1571e3dfcaee912258a406a4f0
                  MATRIX: 745->1|855->16|883->19|897->26|950->71|989->73|1025->83|1239->270|1254->276|1312->313|1374->348|1389->354|1442->386|1504->421|1519->427|1571->458|1633->493|1648->499|1703->533|1766->569|1781->575|1833->606|2230->976|2271->1008|2311->1010|2356->1027|2581->1225|2595->1230|2631->1245|2676->1262|2727->1282|2769->1297|2808->1327|2848->1329|2893->1346|3117->1543|3131->1548|3165->1561|3210->1578|3261->1598|3303->1613|3341->1642|3381->1644|3426->1661|3647->1855|3661->1860|3694->1872|3739->1889|3790->1909|3832->1923|3928->1992|3948->2003|4001->2034|5820->3826|5835->3832|5893->3869|5969->3918|5984->3924|6034->3953|6110->4002|6125->4008|6185->4047|6250->4082
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|57->26|57->26|57->26|58->27|60->29|60->29|60->29|61->30|62->31|64->33|64->33|64->33|65->34|67->36|67->36|67->36|68->37|69->38|71->40|71->40|71->40|72->41|74->43|74->43|74->43|75->44|76->45|78->47|78->47|78->47|78->47|120->89|120->89|120->89|122->91|122->91|122->91|124->93|124->93|124->93|129->98
                  -- GENERATED --
              */
          