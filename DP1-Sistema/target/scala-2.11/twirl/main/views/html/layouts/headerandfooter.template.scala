
package views.html.layouts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object headerandfooter_Scope0 {
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

class headerandfooter extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<link href='https://fonts.googleapis.com/css?family=Lato:700' rel='stylesheet' type='text/css'>


<script>
        function inputLimiter(e,allow) """),format.raw/*7.40*/("""{"""),format.raw/*7.41*/("""
            """),format.raw/*8.13*/("""var AllowableCharacters = '';

            if (allow == 'Letters')"""),format.raw/*10.36*/("""{"""),format.raw/*10.37*/("""AllowableCharacters=' ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz';"""),format.raw/*10.115*/("""}"""),format.raw/*10.116*/("""
            """),format.raw/*11.13*/("""if (allow == 'Numbers')"""),format.raw/*11.36*/("""{"""),format.raw/*11.37*/("""AllowableCharacters='1234567890';"""),format.raw/*11.70*/("""}"""),format.raw/*11.71*/("""
            """),format.raw/*12.13*/("""if (allow == 'NameCharacters')"""),format.raw/*12.43*/("""{"""),format.raw/*12.44*/("""AllowableCharacters=' ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-.\'._';"""),format.raw/*12.128*/("""}"""),format.raw/*12.129*/("""
            """),format.raw/*13.13*/("""if (allow == 'NameCharactersAndNumbers')"""),format.raw/*13.53*/("""{"""),format.raw/*13.54*/("""AllowableCharacters='1234567890 ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-\'_.';"""),format.raw/*13.147*/("""}"""),format.raw/*13.148*/("""
            """),format.raw/*14.13*/("""if (allow == 'DoubleFormat')"""),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""AllowableCharacters='1234567890,.';"""),format.raw/*14.77*/("""}"""),format.raw/*14.78*/("""
            """),format.raw/*15.13*/("""if (allow == 'Nulo')"""),format.raw/*15.33*/("""{"""),format.raw/*15.34*/("""AllowableCharacters='';"""),format.raw/*15.57*/("""}"""),format.raw/*15.58*/(""" """),format.raw/*15.59*/("""//sirve para colocarle a las fechas deben ser obligatoriamente ingresadas por el picker

            var k = document.all?parseInt(e.keyCode): parseInt(e.which);
            if (k!=13 && k!=8 && k!=0)"""),format.raw/*18.39*/("""{"""),format.raw/*18.40*/("""
                """),format.raw/*19.17*/("""if ((e.ctrlKey==false) && (e.altKey==false)) """),format.raw/*19.62*/("""{"""),format.raw/*19.63*/("""
                """),format.raw/*20.17*/("""return (AllowableCharacters.indexOf(String.fromCharCode(k))!=-1);
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/(""" """),format.raw/*21.19*/("""else """),format.raw/*21.24*/("""{"""),format.raw/*21.25*/("""
                """),format.raw/*22.17*/("""return true;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""" """),format.raw/*24.15*/("""else """),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
                """),format.raw/*25.17*/("""return true;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
"""),format.raw/*28.1*/("""</script>



<!--Cabecera- Se separará espacio para el input de busqueda antes de la cabecera de menu-->
<header class="header">
        <div class="content clearfix">
        <!--Input de buscador de la parte superior derecha-->
        <nav class="search">
            <div class="search_box">
                <form action="#" id="search-box" method="get">
                    <label class="hidden" for="inputbusqueda">Buscar</label>
                    <input type="text" placeholder="Ingresa tu búsqueda" id="inputbusqueda" name="conte">
                    <span class="glyphicon glyphicon-search" href="#"></span>
                </form>
            </div>
        </nav>
    </div>
    <nav class="navbar navbar-default">
    <div class="container" id="menuadminregistros">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar1" aria-expanded="false">
          <span class="sr-only">Menu</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a href="#" class="navbar-brand"><img alt="Brand" class="img-responsive" src='"""),_display_(/*56.88*/routes/*56.94*/.Assets.at("/images/logoSimu.png")),format.raw/*56.128*/("""' ></a>
      </div>

      <div class="collapse navbar-collapse" id="navbar1">
        <!-- Principal -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(/*63.23*/routes/*63.29*/.Application.index()),format.raw/*63.49*/("""' class="dropdown-toggle btn-lg" role="button">
              Principal 
            </a>           
          </li>
        </ul>
        
        <!-- Mantenimientos -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Mantenimientos <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href='"""),_display_(/*76.29*/routes/*76.35*/.PersonasC.index()),format.raw/*76.53*/("""' title="Personas" target="_self">Personas</a></li>              
              <li><a href='"""),_display_(/*77.29*/routes/*77.35*/.CiudadesC.index()),format.raw/*77.53*/("""' title="Aeropuertos" target="_self">Aeropuertos/Almacenes</a></li>
              <li><a href='"""),_display_(/*78.29*/routes/*78.35*/.VuelosC.index()),format.raw/*78.51*/("""' title="Planes de Vuelo" target="_self">Planes de Vuelo</a></li>
            </ul>
          </li>
        </ul>

        <!-- Usuarios -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" role="button" >
              Usuarios <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href='"""),_display_(/*90.31*/routes/*90.37*/.UsuariosC.index()),format.raw/*90.55*/("""' title="Consultar usuarios" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*91.31*/routes/*91.37*/.UsuariosC.newO()),format.raw/*91.54*/("""' title="Registrar Usuario" target="_self">Registrar</a></li>
                </li>
            </ul>
          </li>
        </ul>

        <!-- Pedidos -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" role="button" >
              Pedidos <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href='"""),_display_(/*104.31*/routes/*104.37*/.PedidosC.index()),format.raw/*104.54*/("""' title="Consultar talleres" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*105.31*/routes/*105.37*/.PedidosC.newO()),format.raw/*105.53*/("""' title="Registrar talleres" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
        
         <!-- Simulacion -->
         <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" role="button" >
              Enrutamiento <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href='"""),_display_(/*117.31*/routes/*117.37*/.Application.simulation()),format.raw/*117.62*/("""' title="Ejecutar Enrutamiento" target="_self">Ejecutar Enrutamiento</a></li>
                <li><a href='"""),_display_(/*118.31*/routes/*118.37*/.Application.simulation()),format.raw/*118.62*/("""' title="Ejecutar Simulación" target="_self">Ejecutar Simulación</a></li>
            </ul>
          </li>
        </ul>

        <!-- Reportes -->
        <!--
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Reportes <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href="#">Reporte 1</a></li>
                <li><a href="#">Reporte 2</a></li>
            </ul>
          </li>
        </ul>
        -->
        <ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <!--<li><a href='"""),_display_(/*143.33*/routes/*143.39*/.UsuariosC.account()),format.raw/*143.59*/("""' title="Ir a cuenta" target="_self">Mi Cuenta</a></li>-->
              <li><a href='"""),_display_(/*144.29*/routes/*144.35*/.SessionC.changePassword()),format.raw/*144.61*/("""' title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href='"""),_display_(/*145.29*/routes/*145.35*/.SessionC.logout()),format.raw/*145.53*/("""' title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(/*156.2*/content),format.raw/*156.9*/("""
"""),format.raw/*157.1*/("""</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(/*164.45*/routes/*164.51*/.Assets.at("images/logo-min.png")),format.raw/*164.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*169.63*/routes/*169.69*/.Assets.at("images/punto.png")),format.raw/*169.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*174.63*/routes/*174.69*/.Assets.at("images/punto.png")),format.raw/*174.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*176.63*/routes/*176.69*/.Assets.at("images/punto.png")),format.raw/*176.99*/("""'  width="3px" height="3px"></img></span></li>
                </ul>
                    
            </div>
        </div>
    </div>
</footer>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object headerandfooter extends headerandfooter_Scope0.headerandfooter
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:08:38 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                  HASH: 9382791c837b77a00d60b44c65ac79faf76f54a7
                  MATRIX: 778->1|903->31|931->33|1104->179|1132->180|1172->193|1266->259|1295->260|1402->338|1432->339|1473->352|1524->375|1553->376|1614->409|1643->410|1684->423|1742->453|1771->454|1884->538|1914->539|1955->552|2023->592|2052->593|2174->686|2204->687|2245->700|2301->728|2330->729|2393->764|2422->765|2463->778|2511->798|2540->799|2591->822|2620->823|2649->824|2877->1024|2906->1025|2951->1042|3024->1087|3053->1088|3098->1105|3208->1187|3237->1188|3266->1189|3299->1194|3328->1195|3373->1212|3430->1241|3459->1242|3500->1255|3529->1256|3558->1257|3591->1262|3620->1263|3665->1280|3718->1305|3747->1306|3783->1315|3812->1316|3840->1317|5155->2605|5170->2611|5226->2645|5450->2842|5465->2848|5506->2868|6007->3342|6022->3348|6061->3366|6182->3460|6197->3466|6236->3484|6359->3580|6374->3586|6411->3602|6882->4046|6897->4052|6936->4070|7056->4163|7071->4169|7109->4186|7597->4646|7613->4652|7652->4669|7773->4762|7789->4768|7827->4784|8312->5241|8328->5247|8375->5272|8511->5380|8527->5386|8574->5411|9541->6350|9557->6356|9599->6376|9714->6463|9730->6469|9778->6495|9909->6598|9925->6604|9965->6622|10169->6799|10197->6806|10226->6807|10443->6996|10459->7002|10514->7035|10832->7325|10848->7331|10900->7361|11276->7709|11292->7715|11344->7745|11560->7933|11576->7939|11628->7969
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|87->56|87->56|87->56|94->63|94->63|94->63|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|121->90|121->90|121->90|122->91|122->91|122->91|135->104|135->104|135->104|136->105|136->105|136->105|148->117|148->117|148->117|149->118|149->118|149->118|174->143|174->143|174->143|175->144|175->144|175->144|176->145|176->145|176->145|187->156|187->156|188->157|195->164|195->164|195->164|200->169|200->169|200->169|205->174|205->174|205->174|207->176|207->176|207->176
                  -- GENERATED --
              */
          