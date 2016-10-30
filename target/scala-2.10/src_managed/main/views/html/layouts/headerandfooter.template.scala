
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
        <a href="#" class="navbar-brand"><img alt="Brand" class="img-responsive" src='"""),_display_(Seq[Any](/*56.88*/routes/*56.94*/.Assets.at("/images/logoSimu.png"))),format.raw/*56.128*/("""' ></a>
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
                <li><a href='"""),_display_(Seq[Any](/*91.31*/routes/*91.37*/.Application.users())),format.raw/*91.57*/("""' title="Consultar usuarios" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(Seq[Any](/*92.31*/routes/*92.37*/.Application.newuser())),format.raw/*92.59*/("""' title="Registrar Usuario" target="_self">Registrar</a></li>
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
                    DATE: Sun Oct 30 11:55:42 COT 2016
                    SOURCE: C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: 1c588eb6945330311da31df210e6370a76775cb4
                    MATRIX: 797->1|921->31|1102->185|1130->186|1240->268|1269->269|1376->347|1406->348|1471->385|1500->386|1561->419|1590->420|1662->464|1691->465|1804->549|1834->550|1916->604|1945->605|2067->698|2097->699|2167->741|2196->742|2259->777|2288->778|2350->812|2379->813|2430->836|2459->837|2691->1041|2720->1042|2811->1105|2840->1106|2969->1207|2998->1208|3032->1214|3061->1215|3137->1263|3166->1264|3208->1278|3237->1279|3271->1285|3300->1286|3372->1330|3401->1331|3438->1341|3467->1342|4821->2660|4836->2666|4893->2700|5133->2904|5148->2910|5190->2930|6424->4128|6439->4134|6481->4154|6611->4248|6626->4254|6670->4276|7275->4844|7291->4850|7333->4869|7618->5117|7634->5123|7682->5148|8519->5956|8549->5957|8600->5979|8630->5980|8816->6137|8846->6138|8897->6160|8927->6161|9040->6245|9070->6246|9130->6277|9160->6278|9292->6381|9322->6382|9373->6404|9403->6405|9679->6645|9708->6652|9952->6859|9968->6865|10024->6898|10356->7193|10372->7199|10425->7229|10815->7582|10831->7588|10884->7618|11111->7808|11127->7814|11180->7844
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|91->63|91->63|91->63|119->91|119->91|119->91|120->92|120->92|120->92|134->106|134->106|134->106|142->114|142->114|142->114|164->136|164->136|164->136|164->136|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|180->152|180->152|188->160|188->160|188->160|193->165|193->165|193->165|198->170|198->170|198->170|200->172|200->172|200->172
                    -- GENERATED --
                */
            