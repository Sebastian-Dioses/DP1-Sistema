
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
<<<<<<< HEAD
                <li><a href="#" title="Consultar actividades" target="_self">Consultar</a></li>
                <li><a href="#" title="Consultar ambiente" target="_self">Registrar</a></li>
=======
                <li><a href=""""),_display_(Seq[Any](/*91.31*/routes/*91.37*/.Application.users())),format.raw/*91.57*/("""" title="Consultar usuarios" target="_self">Consultar</a></li>
                <li><a href="#" title="Registrar Usuario" target="_self">Registrar</a></li>
>>>>>>> origin/JL
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
                <li><a href='"""),_display_(Seq[Any](/*106.31*/routes/*106.37*/.Application.test())),format.raw/*106.56*/("""' title="Registrar talleres" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
        
         <!-- Proveedores -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(Seq[Any](/*114.23*/routes/*114.29*/.Application.simulation())),format.raw/*114.54*/("""' class="dropdown-toggle btn-lg" role="button">
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
"""),_display_(Seq[Any](/*152.2*/content)),format.raw/*152.9*/("""
</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content clearfix">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(Seq[Any](/*160.45*/routes/*160.51*/.Assets.at("images/logo-min.png"))),format.raw/*160.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*165.63*/routes/*165.69*/.Assets.at("images/punto.png"))),format.raw/*165.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*170.63*/routes/*170.69*/.Assets.at("images/punto.png"))),format.raw/*170.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*172.63*/routes/*172.69*/.Assets.at("images/punto.png"))),format.raw/*172.99*/("""'  width="3px" height="3px"></img></span></li>
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
<<<<<<< HEAD
                    DATE: Tue Oct 25 16:18:19 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: cc523b5940567b373f9f028b078ffcdc44a91e3f
                    MATRIX: 797->1|921->31|1102->185|1130->186|1240->268|1269->269|1376->347|1406->348|1471->385|1500->386|1561->419|1590->420|1662->464|1691->465|1804->549|1834->550|1916->604|1945->605|2067->698|2097->699|2167->741|2196->742|2259->777|2288->778|2350->812|2379->813|2430->836|2459->837|2691->1041|2720->1042|2811->1105|2840->1106|2969->1207|2998->1208|3032->1214|3061->1215|3137->1263|3166->1264|3208->1278|3237->1279|3271->1285|3300->1286|3372->1330|3401->1331|3438->1341|3467->1342|4743->2590|4772->2591|4831->2622|4860->2623|4966->2692|4982->2698|5039->2732|5279->2936|5294->2942|5336->2962|7237->4826|7253->4832|7295->4851|7580->5099|7596->5105|7644->5130|8481->5938|8511->5939|8562->5961|8592->5962|8778->6119|8808->6120|8859->6142|8889->6143|9002->6227|9032->6228|9092->6259|9122->6260|9254->6363|9284->6364|9335->6386|9365->6387|9641->6627|9670->6634|9914->6841|9930->6847|9986->6880|10318->7175|10334->7181|10387->7211|10777->7564|10793->7570|10846->7600|11073->7790|11089->7796|11142->7826
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|91->63|91->63|91->63|134->106|134->106|134->106|142->114|142->114|142->114|164->136|164->136|164->136|164->136|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|180->152|180->152|188->160|188->160|188->160|193->165|193->165|193->165|198->170|198->170|198->170|200->172|200->172|200->172
=======
                    DATE: Tue Oct 25 17:51:39 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: 43521ef05354a74e7f931b20c8b60fee04a6c29f
                    MATRIX: 797->1|921->31|1102->185|1130->186|1240->268|1269->269|1376->347|1406->348|1471->385|1500->386|1561->419|1590->420|1662->464|1691->465|1804->549|1834->550|1916->604|1945->605|2067->698|2097->699|2167->741|2196->742|2259->777|2288->778|2350->812|2379->813|2430->836|2459->837|2691->1041|2720->1042|2811->1105|2840->1106|2969->1207|2998->1208|3032->1214|3061->1215|3137->1263|3166->1264|3208->1278|3237->1279|3271->1285|3300->1286|3372->1330|3401->1331|3438->1341|3467->1342|4743->2590|4772->2591|4831->2622|4860->2623|4966->2692|4982->2698|5039->2732|5279->2936|5294->2942|5336->2962|6570->4160|6585->4166|6627->4186|7326->4848|7342->4854|7384->4873|7669->5121|7685->5127|7733->5152|8570->5960|8600->5961|8651->5983|8681->5984|8867->6141|8897->6142|8948->6164|8978->6165|9091->6249|9121->6250|9181->6281|9211->6282|9343->6385|9373->6386|9424->6408|9454->6409|9730->6649|9759->6656|10003->6863|10019->6869|10075->6902|10407->7197|10423->7203|10476->7233|10866->7586|10882->7592|10935->7622|11162->7812|11178->7818|11231->7848
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|91->63|91->63|91->63|119->91|119->91|119->91|134->106|134->106|134->106|142->114|142->114|142->114|164->136|164->136|164->136|164->136|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|180->152|180->152|188->160|188->160|188->160|193->165|193->165|193->165|198->170|198->170|198->170|200->172|200->172|200->172
>>>>>>> origin/JL
                    -- GENERATED --
                */
            