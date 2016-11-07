
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
              <li><a href="#" title="Clientes" target="_self">Clientes</a></li>
              <li><a href="#" title="Aviones" target="_self">Aviones</a></li>
              <li><a href="#" title="Aeropuertos" target="_self">Aeropuertos/Almacenes</a></li>
              <li><a href="#" title="Planes de Vuelo" target="_self">Planes de Vuelo</a></li>
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
                <li><a href='"""),_display_(/*91.31*/routes/*91.37*/.Application.users()),format.raw/*91.57*/("""' title="Consultar usuarios" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*92.31*/routes/*92.37*/.Application.newuser()),format.raw/*92.59*/("""' title="Registrar Usuario" target="_self">Registrar</a></li>
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
                <li><a href="#" title="Consultar talleres" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*106.31*/routes/*106.37*/.Application.test()),format.raw/*106.56*/("""' title="Registrar talleres" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
        
         <!-- Proveedores -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(/*114.23*/routes/*114.29*/.Application.simulation()),format.raw/*114.54*/("""' class="dropdown-toggle btn-lg" role="button">
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
            <!--"""),format.raw/*136.17*/("""{"""),format.raw/*136.18*/("""!!Auth::user()->name!!"""),format.raw/*136.40*/("""}"""),format.raw/*136.41*/("""--> <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*139.28*/("""{"""),format.raw/*139.29*/("""!!URL::to('/cuenta')!!"""),format.raw/*139.51*/("""}"""),format.raw/*139.52*/("""" title="Ir a cuenta" target="_self">Mi Cuenta</a></li>
              <li><a href=""""),format.raw/*140.28*/("""{"""),format.raw/*140.29*/("""!!URL::to('/password/change')!!"""),format.raw/*140.60*/("""}"""),format.raw/*140.61*/("""" title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href=""""),format.raw/*141.28*/("""{"""),format.raw/*141.29*/("""!!URL::to('/logout')!!"""),format.raw/*141.51*/("""}"""),format.raw/*141.52*/("""" title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(/*152.2*/content),format.raw/*152.9*/("""
"""),format.raw/*153.1*/("""</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content ">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(/*160.45*/routes/*160.51*/.Assets.at("images/logo-min.png")),format.raw/*160.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*165.63*/routes/*165.69*/.Assets.at("images/punto.png")),format.raw/*165.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*170.63*/routes/*170.69*/.Assets.at("images/punto.png")),format.raw/*170.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*172.63*/routes/*172.69*/.Assets.at("images/punto.png")),format.raw/*172.99*/("""'  width="3px" height="3px"></img></span></li>
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
                  DATE: Mon Nov 07 15:50:20 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                  HASH: cb3ddb9f313af043f1537b2d94d62f4eefbf2d86
                  MATRIX: 778->1|903->31|933->35|1110->185|1138->186|1179->200|1275->268|1304->269|1411->347|1441->348|1483->362|1534->385|1563->386|1624->419|1653->420|1695->434|1753->464|1782->465|1895->549|1925->550|1967->564|2035->604|2064->605|2186->698|2216->699|2258->713|2314->741|2343->742|2406->777|2435->778|2477->792|2525->812|2554->813|2605->836|2634->837|2663->838|2894->1041|2923->1042|2969->1060|3042->1105|3071->1106|3117->1124|3228->1207|3257->1208|3286->1209|3319->1214|3348->1215|3394->1233|3452->1263|3481->1264|3523->1278|3552->1279|3581->1280|3614->1285|3643->1286|3689->1304|3743->1330|3772->1331|3809->1341|3838->1342|3867->1344|5210->2660|5225->2666|5281->2700|5512->2904|5527->2910|5568->2930|6793->4128|6808->4134|6849->4154|6970->4248|6985->4254|7028->4276|7624->4844|7640->4850|7681->4869|7957->5117|7973->5123|8020->5148|8857->5956|8887->5957|8938->5979|8968->5980|9154->6137|9184->6138|9235->6160|9265->6161|9378->6245|9408->6246|9468->6277|9498->6278|9630->6381|9660->6382|9711->6404|9741->6405|10008->6645|10036->6652|10066->6654|10291->6851|10307->6857|10362->6890|10685->7185|10701->7191|10753->7221|11134->7574|11150->7580|11202->7610|11420->7800|11436->7806|11488->7836
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|49->18|49->18|50->19|50->19|50->19|51->20|52->21|52->21|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|87->56|87->56|87->56|94->63|94->63|94->63|122->91|122->91|122->91|123->92|123->92|123->92|137->106|137->106|137->106|145->114|145->114|145->114|167->136|167->136|167->136|167->136|170->139|170->139|170->139|170->139|171->140|171->140|171->140|171->140|172->141|172->141|172->141|172->141|183->152|183->152|184->153|191->160|191->160|191->160|196->165|196->165|196->165|201->170|201->170|201->170|203->172|203->172|203->172
                  -- GENERATED --
              */
          