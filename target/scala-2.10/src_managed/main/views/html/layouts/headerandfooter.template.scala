
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
                <li><a href=""""),_display_(Seq[Any](/*89.31*/routes/*89.37*/.Application.users())),format.raw/*89.57*/("""" title="Consultar actividades" target="_self">Consultar</a></li>
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
                    DATE: Tue Oct 25 08:53:40 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: a7da547c4475b31d09bfba7648c24a4e0e76ec34
                    MATRIX: 797->1|921->31|1096->179|1124->180|1231->259|1260->260|1367->338|1397->339|1461->375|1490->376|1551->409|1580->410|1651->453|1680->454|1793->538|1823->539|1904->592|1933->593|2055->686|2085->687|2154->728|2183->729|2246->764|2275->765|2336->798|2365->799|2416->822|2445->823|2674->1024|2703->1025|2793->1087|2822->1088|2949->1187|2978->1188|3012->1194|3041->1195|3115->1241|3144->1242|3185->1255|3214->1256|3248->1262|3277->1263|3347->1305|3376->1306|3412->1315|3441->1316|4688->2535|4717->2536|4776->2567|4805->2568|4911->2637|4927->2643|4984->2677|5217->2874|5232->2880|5274->2900|5779->3369|5794->3375|5841->3400|5959->3490|5988->3491|6044->3519|6073->3520|6553->3964|6568->3970|6610->3990|6733->4085|6762->4086|6819->4115|6848->4116|6968->4208|6997->4209|7060->4244|7089->4245|7564->4691|7594->4692|7651->4720|7681->4721|7802->4813|7832->4814|7887->4840|7917->4841|8194->5081|8210->5087|8258->5112|8753->5578|8783->5579|8847->5614|8877->5615|8956->5665|8986->5666|9048->5699|9078->5700|9391->5984|9421->5985|9472->6007|9502->6008|9685->6162|9715->6163|9766->6185|9796->6186|9908->6269|9938->6270|9998->6301|10028->6302|10159->6404|10189->6405|10240->6427|10270->6428|10535->6657|10564->6664|10800->6863|10816->6869|10872->6902|11199->7192|11215->7198|11268->7228|11653->7576|11669->7582|11722->7612|11947->7800|11963->7806|12016->7836
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|91->63|91->63|91->63|104->76|104->76|104->76|105->77|105->77|105->77|105->77|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|131->103|131->103|131->103|131->103|132->104|132->104|132->104|132->104|140->112|140->112|140->112|153->125|153->125|153->125|153->125|154->126|154->126|154->126|154->126|162->134|162->134|162->134|162->134|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|167->139|167->139|167->139|167->139|178->150|178->150|186->158|186->158|186->158|191->163|191->163|191->163|196->168|196->168|196->168|198->170|198->170|198->170
                    -- GENERATED --
                */
            