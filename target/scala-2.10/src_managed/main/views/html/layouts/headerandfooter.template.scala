
package views.html.layouts

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
object headerandfooter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<link href='https://fonts.googleapis.com/css?family=Lato:700' rel='stylesheet' type='text/css'>


<script>
        function inputLimiter(e,allow) """),format.raw/*7.40*/("""{"""),format.raw/*7.41*/("""
            var AllowableCharacters = '';

            if (allow == 'Letters')"""),format.raw/*10.36*/("""{"""),format.raw/*10.37*/("""AllowableCharacters=' ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz';"""),format.raw/*10.115*/("""}"""),format.raw/*10.116*/("""
            if (allow == 'Numbers')"""),format.raw/*11.36*/("""{"""),format.raw/*11.37*/("""AllowableCharacters='1234567890';"""),format.raw/*11.70*/("""}"""),format.raw/*11.71*/("""
            if (allow == 'NameCharacters')"""),format.raw/*12.43*/("""{"""),format.raw/*12.44*/("""AllowableCharacters=' ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-.\'._';"""),format.raw/*12.128*/("""}"""),format.raw/*12.129*/("""
            if (allow == 'NameCharactersAndNumbers')"""),format.raw/*13.53*/("""{"""),format.raw/*13.54*/("""AllowableCharacters='1234567890 ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-\'_.';"""),format.raw/*13.147*/("""}"""),format.raw/*13.148*/("""
            if (allow == 'DoubleFormat')"""),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""AllowableCharacters='1234567890,.';"""),format.raw/*14.77*/("""}"""),format.raw/*14.78*/("""
            if (allow == 'Nulo')"""),format.raw/*15.33*/("""{"""),format.raw/*15.34*/("""AllowableCharacters='';"""),format.raw/*15.57*/("""}"""),format.raw/*15.58*/(""" //sirve para colocarle a las fechas deben ser obligatoriamente ingresadas por el picker

            var k = document.all?parseInt(e.keyCode): parseInt(e.which);
            if (k!=13 && k!=8 && k!=0)"""),format.raw/*18.39*/("""{"""),format.raw/*18.40*/("""
                if ((e.ctrlKey==false) && (e.altKey==false)) """),format.raw/*19.62*/("""{"""),format.raw/*19.63*/("""
                return (AllowableCharacters.indexOf(String.fromCharCode(k))!=-1);
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/(""" else """),format.raw/*21.24*/("""{"""),format.raw/*21.25*/("""
                return true;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""" else """),format.raw/*24.20*/("""{"""),format.raw/*24.21*/("""
                return true;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
</script>



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
        <a href=""""),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""!!URL::to('/admin-registros')!!"""),format.raw/*56.50*/("""}"""),format.raw/*56.51*/("""" class="navbar-brand"><img alt="Brand" class="img-responsive" src='"""),_display_(Seq[Any](/*56.120*/routes/*56.126*/.Assets.at("/images/logoSimu.png"))),format.raw/*56.160*/("""' ></a>
      </div>

      <div class="collapse navbar-collapse" id="navbar1">
        <!-- Servicios -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(Seq[Any](/*63.23*/routes/*63.29*/.Application.index())),format.raw/*63.49*/("""' class="dropdown-toggle btn-lg" role="button">
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
              <li><a href='"""),_display_(Seq[Any](/*76.29*/routes/*76.35*/.Application.simulation())),format.raw/*76.60*/("""' title="Consultar ambiente" target="_self">Consultar</a></li>
              <li><a href=""""),format.raw/*77.28*/("""{"""),format.raw/*77.29*/("""!!URL::to('/ambiente/new')!!"""),format.raw/*77.57*/("""}"""),format.raw/*77.58*/("""" title="Consultar ambiente" target="_self">Registrar</a></li>
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
                <li><a href=""""),format.raw/*89.30*/("""{"""),format.raw/*89.31*/("""!!URL::to('/actividad/index')!!"""),format.raw/*89.62*/("""}"""),format.raw/*89.63*/("""" title="Consultar actividades" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*90.30*/("""{"""),format.raw/*90.31*/("""!!URL::to('/actividad/new')!!"""),format.raw/*90.60*/("""}"""),format.raw/*90.61*/("""" title="Consultar ambiente" target="_self">Registrar</a></li>
                <li><a href=""""),format.raw/*91.30*/("""{"""),format.raw/*91.31*/("""!!URL::to('/actividad/newEvento')!!"""),format.raw/*91.66*/("""}"""),format.raw/*91.67*/("""" title="Consultar ambiente" target="_self">Registrar Evento</a></li>
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
                <li><a href=""""),format.raw/*103.30*/("""{"""),format.raw/*103.31*/("""!!URL::to('/taller/index')!!"""),format.raw/*103.59*/("""}"""),format.raw/*103.60*/("""" title="Consultar talleres" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*104.30*/("""{"""),format.raw/*104.31*/("""!!URL::to('/taller/new')!!"""),format.raw/*104.57*/("""}"""),format.raw/*104.58*/("""" title="Registrar talleres" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
        
         <!-- Proveedores -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(Seq[Any](/*112.23*/routes/*112.29*/.Application.simulation())),format.raw/*112.54*/("""' class="dropdown-toggle btn-lg" role="button">
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
                <li><a href=""""),format.raw/*125.30*/("""{"""),format.raw/*125.31*/("""!!URL::to('/concesionaria/index')!!"""),format.raw/*125.66*/("""}"""),format.raw/*125.67*/("""">Consultar</a></li>
                <li><a href=""""),format.raw/*126.30*/("""{"""),format.raw/*126.31*/("""!!URL::to('/concesionaria/new')!!"""),format.raw/*126.64*/("""}"""),format.raw/*126.65*/("""">Registrar</a></li>                
            </ul>
          </li>
        </ul>
        
        <ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
            <!--"""),format.raw/*134.17*/("""{"""),format.raw/*134.18*/("""!!Auth::user()->name!!"""),format.raw/*134.40*/("""}"""),format.raw/*134.41*/("""--> <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*137.28*/("""{"""),format.raw/*137.29*/("""!!URL::to('/cuenta')!!"""),format.raw/*137.51*/("""}"""),format.raw/*137.52*/("""" title="Ir a cuenta" target="_self">Mi Cuenta</a></li>
              <li><a href=""""),format.raw/*138.28*/("""{"""),format.raw/*138.29*/("""!!URL::to('/password/change')!!"""),format.raw/*138.60*/("""}"""),format.raw/*138.61*/("""" title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href=""""),format.raw/*139.28*/("""{"""),format.raw/*139.29*/("""!!URL::to('/logout')!!"""),format.raw/*139.51*/("""}"""),format.raw/*139.52*/("""" title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(Seq[Any](/*150.2*/content)),format.raw/*150.9*/("""
</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content clearfix">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(Seq[Any](/*158.45*/routes/*158.51*/.Assets.at("images/logo-min.png"))),format.raw/*158.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*163.63*/routes/*163.69*/.Assets.at("images/punto.png"))),format.raw/*163.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*168.63*/routes/*168.69*/.Assets.at("images/punto.png"))),format.raw/*168.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*170.63*/routes/*170.69*/.Assets.at("images/punto.png"))),format.raw/*170.99*/("""'  width="3px" height="3px"></img></span></li>
                </ul>
                    
            </div>
        </div>
    </div>
</footer>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 25 01:02:32 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: 4fb24e21ad1dff379d7e688461689248eb84a84d
                    MATRIX: 797->1|921->31|1102->185|1130->186|1240->268|1269->269|1376->347|1406->348|1471->385|1500->386|1561->419|1590->420|1662->464|1691->465|1804->549|1834->550|1916->604|1945->605|2067->698|2097->699|2167->741|2196->742|2259->777|2288->778|2350->812|2379->813|2430->836|2459->837|2691->1041|2720->1042|2811->1105|2840->1106|2969->1207|2998->1208|3032->1214|3061->1215|3137->1263|3166->1264|3208->1278|3237->1279|3271->1285|3300->1286|3372->1330|3401->1331|3438->1341|3467->1342|4743->2590|4772->2591|4831->2622|4860->2623|4966->2692|4982->2698|5039->2732|5279->2936|5294->2942|5336->2962|5854->3444|5869->3450|5916->3475|6035->3566|6064->3567|6120->3595|6149->3596|6632->4051|6661->4052|6720->4083|6749->4084|6873->4180|6902->4181|6959->4210|6988->4211|7109->4304|7138->4305|7201->4340|7230->4341|7717->4799|7747->4800|7804->4828|7834->4829|7956->4922|7986->4923|8041->4949|8071->4950|8356->5198|8372->5204|8420->5229|8928->5708|8958->5709|9022->5744|9052->5745|9132->5796|9162->5797|9224->5830|9254->5831|9575->6123|9605->6124|9656->6146|9686->6147|9872->6304|9902->6305|9953->6327|9983->6328|10096->6412|10126->6413|10186->6444|10216->6445|10348->6548|10378->6549|10429->6571|10459->6572|10735->6812|10764->6819|11008->7026|11024->7032|11080->7065|11412->7360|11428->7366|11481->7396|11871->7749|11887->7755|11940->7785|12167->7975|12183->7981|12236->8011
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|91->63|91->63|91->63|104->76|104->76|104->76|105->77|105->77|105->77|105->77|117->89|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|131->103|131->103|131->103|131->103|132->104|132->104|132->104|132->104|140->112|140->112|140->112|153->125|153->125|153->125|153->125|154->126|154->126|154->126|154->126|162->134|162->134|162->134|162->134|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|167->139|167->139|167->139|167->139|178->150|178->150|186->158|186->158|186->158|191->163|191->163|191->163|196->168|196->168|196->168|198->170|198->170|198->170
                    -- GENERATED --
                */
            