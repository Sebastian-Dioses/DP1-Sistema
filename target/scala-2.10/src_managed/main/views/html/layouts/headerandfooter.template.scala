
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
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Principal <span class="caret"></span>
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
              <li><a href=""""),format.raw/*76.28*/("""{"""),format.raw/*76.29*/("""!!URL::to('/ambiente/index')!!"""),format.raw/*76.59*/("""}"""),format.raw/*76.60*/("""" title="Consultar ambiente" target="_self">Consultar</a></li>
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
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Simulación <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*116.30*/("""{"""),format.raw/*116.31*/("""!!URL::to('/proveedor/index')!!"""),format.raw/*116.62*/("""}"""),format.raw/*116.63*/("""">Consultar</a></li>
                <li><a href=""""),format.raw/*117.30*/("""{"""),format.raw/*117.31*/("""!!URL::to('/proveedor/new')!!"""),format.raw/*117.60*/("""}"""),format.raw/*117.61*/("""">Registrar</a></li>  
                <li><a href=""""),format.raw/*118.30*/("""{"""),format.raw/*118.31*/("""!!URL::to('/servicioProveedor/index')!!"""),format.raw/*118.70*/("""}"""),format.raw/*118.71*/("""">Servicios de proveedores</a></li>              
                <li><a href=""""),format.raw/*119.30*/("""{"""),format.raw/*119.31*/("""!!URL::to('/ingreso-producto/index')!!"""),format.raw/*119.69*/("""}"""),format.raw/*119.70*/("""">Solicitud de Productos</a></li>
                <li><a href=""""),format.raw/*120.30*/("""{"""),format.raw/*120.31*/("""!!URL::to('/ingreso-servicio/index')!!"""),format.raw/*120.69*/("""}"""),format.raw/*120.70*/("""">Solicitud de Servicios</a></li>
            </ul>
          </li>
        </ul>

        <!-- Concesionarias -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Reportes <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*132.30*/("""{"""),format.raw/*132.31*/("""!!URL::to('/concesionaria/index')!!"""),format.raw/*132.66*/("""}"""),format.raw/*132.67*/("""">Consultar</a></li>
                <li><a href=""""),format.raw/*133.30*/("""{"""),format.raw/*133.31*/("""!!URL::to('/concesionaria/new')!!"""),format.raw/*133.64*/("""}"""),format.raw/*133.65*/("""">Registrar</a></li>                
            </ul>
          </li>
        </ul>
        
        <ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
            <!--"""),format.raw/*141.17*/("""{"""),format.raw/*141.18*/("""!!Auth::user()->name!!"""),format.raw/*141.40*/("""}"""),format.raw/*141.41*/("""--> <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*144.28*/("""{"""),format.raw/*144.29*/("""!!URL::to('/cuenta')!!"""),format.raw/*144.51*/("""}"""),format.raw/*144.52*/("""" title="Ir a cuenta" target="_self">Mi Cuenta</a></li>
              <li><a href=""""),format.raw/*145.28*/("""{"""),format.raw/*145.29*/("""!!URL::to('/password/change')!!"""),format.raw/*145.60*/("""}"""),format.raw/*145.61*/("""" title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href=""""),format.raw/*146.28*/("""{"""),format.raw/*146.29*/("""!!URL::to('/logout')!!"""),format.raw/*146.51*/("""}"""),format.raw/*146.52*/("""" title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(Seq[Any](/*157.2*/content)),format.raw/*157.9*/("""
</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content clearfix">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(Seq[Any](/*165.45*/routes/*165.51*/.Assets.at("images/logo-min.png"))),format.raw/*165.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*170.63*/routes/*170.69*/.Assets.at("images/punto.png"))),format.raw/*170.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*175.63*/routes/*175.69*/.Assets.at("images/punto.png"))),format.raw/*175.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(Seq[Any](/*177.63*/routes/*177.69*/.Assets.at("images/punto.png"))),format.raw/*177.99*/("""'  width="3px" height="3px"></img></span></li>
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
                    DATE: Mon Oct 24 18:55:58 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                    HASH: 7f397fff72bf580fdde53d6b9339267d05ff29a7
                    MATRIX: 797->1|921->31|1102->185|1130->186|1240->268|1269->269|1376->347|1406->348|1471->385|1500->386|1561->419|1590->420|1662->464|1691->465|1804->549|1834->550|1916->604|1945->605|2067->698|2097->699|2167->741|2196->742|2259->777|2288->778|2350->812|2379->813|2430->836|2459->837|2691->1041|2720->1042|2811->1105|2840->1106|2969->1207|2998->1208|3032->1214|3061->1215|3137->1263|3166->1264|3208->1278|3237->1279|3271->1285|3300->1286|3372->1330|3401->1331|3438->1341|3467->1342|4743->2590|4772->2591|4831->2622|4860->2623|4966->2692|4982->2698|5039->2732|5802->3467|5831->3468|5889->3498|5918->3499|6037->3590|6066->3591|6122->3619|6151->3620|6634->4075|6663->4076|6722->4107|6751->4108|6875->4204|6904->4205|6961->4234|6990->4235|7111->4328|7140->4329|7203->4364|7232->4365|7719->4823|7749->4824|7806->4852|7836->4853|7958->4946|7988->4947|8043->4973|8073->4974|8567->5439|8597->5440|8657->5471|8687->5472|8767->5523|8797->5524|8855->5553|8885->5554|8967->5607|8997->5608|9065->5647|9095->5648|9204->5728|9234->5729|9301->5767|9331->5768|9424->5832|9454->5833|9521->5871|9551->5872|10008->6300|10038->6301|10102->6336|10132->6337|10212->6388|10242->6389|10304->6422|10334->6423|10655->6715|10685->6716|10736->6738|10766->6739|10952->6896|10982->6897|11033->6919|11063->6920|11176->7004|11206->7005|11266->7036|11296->7037|11428->7140|11458->7141|11509->7163|11539->7164|11815->7404|11844->7411|12088->7618|12104->7624|12160->7657|12492->7952|12508->7958|12561->7988|12951->8341|12967->8347|13020->8377|13247->8567|13263->8573|13316->8603
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|104->76|104->76|104->76|104->76|105->77|105->77|105->77|105->77|117->89|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|131->103|131->103|131->103|131->103|132->104|132->104|132->104|132->104|144->116|144->116|144->116|144->116|145->117|145->117|145->117|145->117|146->118|146->118|146->118|146->118|147->119|147->119|147->119|147->119|148->120|148->120|148->120|148->120|160->132|160->132|160->132|160->132|161->133|161->133|161->133|161->133|169->141|169->141|169->141|169->141|172->144|172->144|172->144|172->144|173->145|173->145|173->145|173->145|174->146|174->146|174->146|174->146|185->157|185->157|193->165|193->165|193->165|198->170|198->170|198->170|203->175|203->175|203->175|205->177|205->177|205->177
                    -- GENERATED --
                */
            