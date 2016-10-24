
package views.html

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
        <a href=""""),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""!!URL::to('/admin-registros')!!"""),format.raw/*56.50*/("""}"""),format.raw/*56.51*/("""" class="navbar-brand"><img alt="Brand" class="img-responsive" src=""""),format.raw/*56.119*/("""{"""),format.raw/*56.120*/("""!!URL::to('/images/logo.png')!!"""),format.raw/*56.151*/("""}"""),format.raw/*56.152*/("""" ></a>
      </div>

      <div class="collapse navbar-collapse" id="navbar1">
        <!-- Servicios -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Servicios <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href=""""),format.raw/*67.30*/("""{"""),format.raw/*67.31*/("""!!URL::to('/servicios/index')!!"""),format.raw/*67.62*/("""}"""),format.raw/*67.63*/("""" title="Consultar servicio" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*68.30*/("""{"""),format.raw/*68.31*/("""!!URL::to('/servicios/new')!!"""),format.raw/*68.60*/("""}"""),format.raw/*68.61*/("""" title="Registrar nuevo servicio" target="_self">Registrar</a></li>
                <li><a href=""""),format.raw/*69.30*/("""{"""),format.raw/*69.31*/("""!!URL::to('/select/sede')!!"""),format.raw/*69.58*/("""}"""),format.raw/*69.59*/("""" title="Agregar Servicio a Sede" target="_self">Agregar Servicios a Sede</a></li>
            </ul>
          </li>
        </ul>
        
        <!-- Ambientes -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Ambientes <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*81.28*/("""{"""),format.raw/*81.29*/("""!!URL::to('/ambiente/index')!!"""),format.raw/*81.59*/("""}"""),format.raw/*81.60*/("""" title="Consultar ambiente" target="_self">Consultar</a></li>
              <li><a href=""""),format.raw/*82.28*/("""{"""),format.raw/*82.29*/("""!!URL::to('/ambiente/new')!!"""),format.raw/*82.57*/("""}"""),format.raw/*82.58*/("""" title="Consultar ambiente" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>

        <!-- Actividades -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" role="button" >
              Actividades <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href=""""),format.raw/*94.30*/("""{"""),format.raw/*94.31*/("""!!URL::to('/actividad/index')!!"""),format.raw/*94.62*/("""}"""),format.raw/*94.63*/("""" title="Consultar actividades" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*95.30*/("""{"""),format.raw/*95.31*/("""!!URL::to('/actividad/new')!!"""),format.raw/*95.60*/("""}"""),format.raw/*95.61*/("""" title="Consultar ambiente" target="_self">Registrar</a></li>
                <li><a href=""""),format.raw/*96.30*/("""{"""),format.raw/*96.31*/("""!!URL::to('/actividad/newEvento')!!"""),format.raw/*96.66*/("""}"""),format.raw/*96.67*/("""" title="Consultar ambiente" target="_self">Registrar Evento</a></li>
            </ul>
          </li>
        </ul>

        <!-- Talleres -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="btn btn-lg dropdown-toggle" data-toggle="dropdown" role="button" >
              Talleres <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href=""""),format.raw/*108.30*/("""{"""),format.raw/*108.31*/("""!!URL::to('/taller/index')!!"""),format.raw/*108.59*/("""}"""),format.raw/*108.60*/("""" title="Consultar talleres" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*109.30*/("""{"""),format.raw/*109.31*/("""!!URL::to('/taller/new')!!"""),format.raw/*109.57*/("""}"""),format.raw/*109.58*/("""" title="Registrar talleres" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
        
         <!-- Proveedores -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Proveedores <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*121.30*/("""{"""),format.raw/*121.31*/("""!!URL::to('/proveedor/index')!!"""),format.raw/*121.62*/("""}"""),format.raw/*121.63*/("""">Consultar</a></li>
                <li><a href=""""),format.raw/*122.30*/("""{"""),format.raw/*122.31*/("""!!URL::to('/proveedor/new')!!"""),format.raw/*122.60*/("""}"""),format.raw/*122.61*/("""">Registrar</a></li>  
                <li><a href=""""),format.raw/*123.30*/("""{"""),format.raw/*123.31*/("""!!URL::to('/servicioProveedor/index')!!"""),format.raw/*123.70*/("""}"""),format.raw/*123.71*/("""">Servicios de proveedores</a></li>              
                <li><a href=""""),format.raw/*124.30*/("""{"""),format.raw/*124.31*/("""!!URL::to('/ingreso-producto/index')!!"""),format.raw/*124.69*/("""}"""),format.raw/*124.70*/("""">Solicitud de Productos</a></li>
                <li><a href=""""),format.raw/*125.30*/("""{"""),format.raw/*125.31*/("""!!URL::to('/ingreso-servicio/index')!!"""),format.raw/*125.69*/("""}"""),format.raw/*125.70*/("""">Solicitud de Servicios</a></li>
            </ul>
          </li>
        </ul>

        <!-- Concesionarias -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Concesionarias <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*137.30*/("""{"""),format.raw/*137.31*/("""!!URL::to('/concesionaria/index')!!"""),format.raw/*137.66*/("""}"""),format.raw/*137.67*/("""">Consultar</a></li>
                <li><a href=""""),format.raw/*138.30*/("""{"""),format.raw/*138.31*/("""!!URL::to('/concesionaria/new')!!"""),format.raw/*138.64*/("""}"""),format.raw/*138.65*/("""">Registrar</a></li>                
            </ul>
          </li>
        </ul>

        <!-- Productos -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Productos <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*150.30*/("""{"""),format.raw/*150.31*/("""!!URL::to('/producto/index')!!"""),format.raw/*150.61*/("""}"""),format.raw/*150.62*/("""">Productos</a></li>
                <li><a href=""""),format.raw/*151.30*/("""{"""),format.raw/*151.31*/("""!!URL::to('/producto/new')!!"""),format.raw/*151.59*/("""}"""),format.raw/*151.60*/("""">Registrar</a></li>
                <li><a href=""""),format.raw/*152.30*/("""{"""),format.raw/*152.31*/("""!!URL::to('/venta-producto/index')!!"""),format.raw/*152.67*/("""}"""),format.raw/*152.68*/("""">Venta de productos</a></li>
            </ul>
          </li>
        </ul>
        
        <!-- Promociones -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
              Promociones <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">    
                <li><a href=""""),format.raw/*164.30*/("""{"""),format.raw/*164.31*/("""!!URL::to('/promociones/index')!!"""),format.raw/*164.64*/("""}"""),format.raw/*164.65*/("""" title="Consultar promociones" target="_self">Consultar</a></li>
                <li><a href=""""),format.raw/*165.30*/("""{"""),format.raw/*165.31*/("""!!URL::to('/promociones/new')!!"""),format.raw/*165.62*/("""}"""),format.raw/*165.63*/("""" title="Consultar ambiente" target="_self">Registrar</a></li>
            </ul>
          </li>
        </ul>
            
        <ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
            <a href="#" class="dropdown-toggle btn-lg" data-toggle="dropdown" role="button">
            """),format.raw/*173.13*/("""{"""),format.raw/*173.14*/("""!!Auth::user()->name!!"""),format.raw/*173.36*/("""}"""),format.raw/*173.37*/(""" <span class="glyphicon glyphicon-user"><span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),format.raw/*176.28*/("""{"""),format.raw/*176.29*/("""!!URL::to('/cuenta')!!"""),format.raw/*176.51*/("""}"""),format.raw/*176.52*/("""" title="Ir a cuenta" target="_self">Mi Cuenta</a></li>
              <li><a href=""""),format.raw/*177.28*/("""{"""),format.raw/*177.29*/("""!!URL::to('/password/change')!!"""),format.raw/*177.60*/("""}"""),format.raw/*177.61*/("""" title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href=""""),format.raw/*178.28*/("""{"""),format.raw/*178.29*/("""!!URL::to('/logout')!!"""),format.raw/*178.51*/("""}"""),format.raw/*178.52*/("""" title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(Seq[Any](/*189.2*/content)),format.raw/*189.9*/("""
</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content clearfix">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src=""""),format.raw/*197.44*/("""{"""),format.raw/*197.45*/("""!!URL::to('images/logo-min.png')!!"""),format.raw/*197.79*/("""}"""),format.raw/*197.80*/("""" title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src=""""),format.raw/*202.62*/("""{"""),format.raw/*202.63*/("""!!URL::to('/images/punto.png')!!"""),format.raw/*202.95*/("""}"""),format.raw/*202.96*/("""" width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src=""""),format.raw/*207.62*/("""{"""),format.raw/*207.63*/("""!!URL::to('/images/punto.png')!!"""),format.raw/*207.95*/("""}"""),format.raw/*207.96*/("""" width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src=""""),format.raw/*209.62*/("""{"""),format.raw/*209.63*/("""!!URL::to('/images/punto.png')!!"""),format.raw/*209.95*/("""}"""),format.raw/*209.96*/("""" width="3px" height="3px"></img></span></li>
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
                    DATE: Mon Oct 24 17:59:43 COT 2016
                    SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/app/views/headerandfooter.scala.html
                    HASH: 4a9725260c703cb2afdba359059459bb3f4b89d7
                    MATRIX: 789->1|913->31|1094->185|1122->186|1232->268|1261->269|1368->347|1398->348|1463->385|1492->386|1553->419|1582->420|1654->464|1683->465|1796->549|1826->550|1908->604|1937->605|2059->698|2089->699|2159->741|2188->742|2251->777|2280->778|2342->812|2371->813|2422->836|2451->837|2683->1041|2712->1042|2803->1105|2832->1106|2961->1207|2990->1208|3024->1214|3053->1215|3129->1263|3158->1264|3200->1278|3229->1279|3263->1285|3292->1286|3364->1330|3393->1331|3430->1341|3459->1342|4735->2590|4764->2591|4823->2622|4852->2623|4949->2691|4979->2692|5039->2723|5069->2724|5513->3140|5542->3141|5601->3172|5630->3173|5751->3266|5780->3267|5837->3296|5866->3297|5993->3396|6022->3397|6077->3424|6106->3425|6609->3900|6638->3901|6696->3931|6725->3932|6844->4023|6873->4024|6929->4052|6958->4053|7444->4511|7473->4512|7532->4543|7561->4544|7685->4640|7714->4641|7771->4670|7800->4671|7921->4764|7950->4765|8013->4800|8042->4801|8530->5260|8560->5261|8617->5289|8647->5290|8769->5383|8799->5384|8854->5410|8884->5411|9379->5877|9409->5878|9469->5909|9499->5910|9579->5961|9609->5962|9667->5991|9697->5992|9779->6045|9809->6046|9877->6085|9907->6086|10016->6166|10046->6167|10113->6205|10143->6206|10236->6270|10266->6271|10333->6309|10363->6310|10826->6744|10856->6745|10920->6780|10950->6781|11030->6832|11060->6833|11122->6866|11152->6867|11608->7294|11638->7295|11697->7325|11727->7326|11807->7377|11837->7378|11894->7406|11924->7407|12004->7458|12034->7459|12099->7495|12129->7496|12590->7928|12620->7929|12682->7962|12712->7963|12837->8059|12867->8060|12927->8091|12957->8092|13304->8410|13334->8411|13385->8433|13415->8434|13598->8588|13628->8589|13679->8611|13709->8612|13822->8696|13852->8697|13912->8728|13942->8729|14074->8832|14104->8833|14155->8855|14185->8856|14461->9096|14490->9103|14725->9309|14755->9310|14818->9344|14848->9345|15171->9639|15201->9640|15262->9672|15292->9673|15673->10025|15703->10026|15764->10058|15794->10059|16011->10247|16041->10248|16102->10280|16132->10281
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|52->24|54->26|54->26|55->27|55->27|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|95->67|95->67|95->67|95->67|96->68|96->68|96->68|96->68|97->69|97->69|97->69|97->69|109->81|109->81|109->81|109->81|110->82|110->82|110->82|110->82|122->94|122->94|122->94|122->94|123->95|123->95|123->95|123->95|124->96|124->96|124->96|124->96|136->108|136->108|136->108|136->108|137->109|137->109|137->109|137->109|149->121|149->121|149->121|149->121|150->122|150->122|150->122|150->122|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|153->125|153->125|153->125|153->125|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|178->150|178->150|178->150|178->150|179->151|179->151|179->151|179->151|180->152|180->152|180->152|180->152|192->164|192->164|192->164|192->164|193->165|193->165|193->165|193->165|201->173|201->173|201->173|201->173|204->176|204->176|204->176|204->176|205->177|205->177|205->177|205->177|206->178|206->178|206->178|206->178|217->189|217->189|225->197|225->197|225->197|225->197|230->202|230->202|230->202|230->202|235->207|235->207|235->207|235->207|237->209|237->209|237->209|237->209
                    -- GENERATED --
                */
            