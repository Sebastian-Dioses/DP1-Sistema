
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
                  DATE: Tue Nov 15 23:59:26 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                  HASH: 3bb641fd1eb31d57b913dd35b8ca5f48e6d8feea
                  MATRIX: 778->1|903->31|933->35|1110->185|1138->186|1179->200|1275->268|1304->269|1411->347|1441->348|1483->362|1534->385|1563->386|1624->419|1653->420|1695->434|1753->464|1782->465|1895->549|1925->550|1967->564|2035->604|2064->605|2186->698|2216->699|2258->713|2314->741|2343->742|2406->777|2435->778|2477->792|2525->812|2554->813|2605->836|2634->837|2663->838|2894->1041|2923->1042|2969->1060|3042->1105|3071->1106|3117->1124|3228->1207|3257->1208|3286->1209|3319->1214|3348->1215|3394->1233|3452->1263|3481->1264|3523->1278|3552->1279|3581->1280|3614->1285|3643->1286|3689->1304|3743->1330|3772->1331|3809->1341|3838->1342|3867->1344|5210->2660|5225->2666|5281->2700|5512->2904|5527->2910|5568->2930|6082->3417|6097->3423|6136->3441|6258->3536|6273->3542|6312->3560|6436->3657|6451->3663|6488->3679|6971->4135|6986->4141|7025->4159|7146->4253|7161->4259|7199->4276|7700->4749|7716->4755|7755->4772|7877->4866|7893->4872|7931->4888|8428->5357|8444->5363|8491->5388|8628->5497|8644->5503|8691->5528|9683->6492|9699->6498|9741->6518|9857->6606|9873->6612|9921->6638|10053->6742|10069->6748|10109->6766|10324->6954|10352->6961|10382->6963|10606->7159|10622->7165|10677->7198|11000->7493|11016->7499|11068->7529|11449->7882|11465->7888|11517->7918|11735->8108|11751->8114|11803->8144
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|87->56|87->56|87->56|94->63|94->63|94->63|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|121->90|121->90|121->90|122->91|122->91|122->91|135->104|135->104|135->104|136->105|136->105|136->105|148->117|148->117|148->117|149->118|149->118|149->118|174->143|174->143|174->143|175->144|175->144|175->144|176->145|176->145|176->145|187->156|187->156|188->157|195->164|195->164|195->164|200->169|200->169|200->169|205->174|205->174|205->174|207->176|207->176|207->176
                  -- GENERATED --
              */
          