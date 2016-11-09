
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
        <!-- Servicios -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(/*63.23*/routes/*63.29*/.Application.index()),format.raw/*63.49*/("""' class="dropdown-toggle btn-lg" role="button">
              Principal 
            </a>           
          </li>
        </ul>
        
        <!-- Ambientes -->
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

        <!-- Actividades -->
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

        <!-- Talleres -->
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
        
         <!-- Proveedores -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(/*113.23*/routes/*113.29*/.Application.simulation()),format.raw/*113.54*/("""' class="dropdown-toggle btn-lg" role="button">
              Simulación 
            </a>           
          </li>
        </ul>

        <!-- Concesionarias -->
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
        
        <ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
            <!--"""),format.raw/*135.17*/("""{"""),format.raw/*135.18*/("""!!Auth::user()->name!!"""),format.raw/*135.40*/("""}"""),format.raw/*135.41*/("""--> <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*138.28*/("""{"""),format.raw/*138.29*/("""!!URL::to('/cuenta')!!"""),format.raw/*138.51*/("""}"""),format.raw/*138.52*/("""" title="Ir a cuenta" target="_self">Mi Cuenta</a></li>
              <li><a href=""""),format.raw/*139.28*/("""{"""),format.raw/*139.29*/("""!!URL::to('/password/change')!!"""),format.raw/*139.60*/("""}"""),format.raw/*139.61*/("""" title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href=""""),format.raw/*140.28*/("""{"""),format.raw/*140.29*/("""!!URL::to('/logout')!!"""),format.raw/*140.51*/("""}"""),format.raw/*140.52*/("""" title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(/*151.2*/content),format.raw/*151.9*/("""
"""),format.raw/*152.1*/("""</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(/*159.45*/routes/*159.51*/.Assets.at("images/logo-min.png")),format.raw/*159.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*164.63*/routes/*164.69*/.Assets.at("images/punto.png")),format.raw/*164.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*169.63*/routes/*169.69*/.Assets.at("images/punto.png")),format.raw/*169.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*171.63*/routes/*171.69*/.Assets.at("images/punto.png")),format.raw/*171.99*/("""'  width="3px" height="3px"></img></span></li>
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
                  DATE: Tue Nov 08 18:24:52 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                  HASH: 8a9463c90fac14f8e3fef2b273adc53096a869c2
                  MATRIX: 778->1|903->31|933->35|1110->185|1138->186|1179->200|1275->268|1304->269|1411->347|1441->348|1483->362|1534->385|1563->386|1624->419|1653->420|1695->434|1753->464|1782->465|1895->549|1925->550|1967->564|2035->604|2064->605|2186->698|2216->699|2258->713|2314->741|2343->742|2406->777|2435->778|2477->792|2525->812|2554->813|2605->836|2634->837|2663->838|2894->1041|2923->1042|2969->1060|3042->1105|3071->1106|3117->1124|3228->1207|3257->1208|3286->1209|3319->1214|3348->1215|3394->1233|3452->1263|3481->1264|3523->1278|3552->1279|3581->1280|3614->1285|3643->1286|3689->1304|3743->1330|3772->1331|3809->1341|3838->1342|3867->1344|5210->2660|5225->2666|5281->2700|5512->2904|5527->2910|5568->2930|6077->3412|6092->3418|6131->3436|6253->3531|6268->3537|6307->3555|6431->3652|6446->3658|6483->3674|6969->4133|6984->4139|7023->4157|7144->4251|7159->4257|7197->4274|7699->4748|7715->4754|7754->4771|7876->4865|7892->4871|7930->4887|8206->5135|8222->5141|8269->5166|9106->5974|9136->5975|9187->5997|9217->5998|9403->6155|9433->6156|9484->6178|9514->6179|9627->6263|9657->6264|9717->6295|9747->6296|9879->6399|9909->6400|9960->6422|9990->6423|10257->6663|10285->6670|10315->6672|10539->6868|10555->6874|10610->6907|10933->7202|10949->7208|11001->7238|11382->7591|11398->7597|11450->7627|11668->7817|11684->7823|11736->7853
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|87->56|87->56|87->56|94->63|94->63|94->63|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|121->90|121->90|121->90|122->91|122->91|122->91|135->104|135->104|135->104|136->105|136->105|136->105|144->113|144->113|144->113|166->135|166->135|166->135|166->135|169->138|169->138|169->138|169->138|170->139|170->139|170->139|170->139|171->140|171->140|171->140|171->140|182->151|182->151|183->152|190->159|190->159|190->159|195->164|195->164|195->164|200->169|200->169|200->169|202->171|202->171|202->171
                  -- GENERATED --
              */
          