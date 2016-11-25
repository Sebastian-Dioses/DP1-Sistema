
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
            """),format.raw/*12.13*/("""if (allow == 'SignedNumbers')"""),format.raw/*12.42*/("""{"""),format.raw/*12.43*/("""AllowableCharacters='1234567890-';"""),format.raw/*12.77*/("""}"""),format.raw/*12.78*/("""
            """),format.raw/*13.13*/("""if (allow == 'NameCharacters')"""),format.raw/*13.43*/("""{"""),format.raw/*13.44*/("""AllowableCharacters=' ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-.\'._';"""),format.raw/*13.128*/("""}"""),format.raw/*13.129*/("""
            """),format.raw/*14.13*/("""if (allow == 'NameCharactersAndNumbers')"""),format.raw/*14.53*/("""{"""),format.raw/*14.54*/("""AllowableCharacters='1234567890 ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-\'_.';"""),format.raw/*14.147*/("""}"""),format.raw/*14.148*/("""
            """),format.raw/*15.13*/("""if (allow == 'DoubleFormat')"""),format.raw/*15.41*/("""{"""),format.raw/*15.42*/("""AllowableCharacters='1234567890,.';"""),format.raw/*15.77*/("""}"""),format.raw/*15.78*/("""
            """),format.raw/*16.13*/("""if (allow == 'Nulo')"""),format.raw/*16.33*/("""{"""),format.raw/*16.34*/("""AllowableCharacters='';"""),format.raw/*16.57*/("""}"""),format.raw/*16.58*/(""" """),format.raw/*16.59*/("""//sirve para colocarle a las fechas deben ser obligatoriamente ingresadas por el picker

            var k = document.all?parseInt(e.keyCode): parseInt(e.which);
            if (k!=13 && k!=8 && k!=0)"""),format.raw/*19.39*/("""{"""),format.raw/*19.40*/("""
                """),format.raw/*20.17*/("""if ((e.ctrlKey==false) && (e.altKey==false)) """),format.raw/*20.62*/("""{"""),format.raw/*20.63*/("""
                """),format.raw/*21.17*/("""return (AllowableCharacters.indexOf(String.fromCharCode(k))!=-1);
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/(""" """),format.raw/*22.19*/("""else """),format.raw/*22.24*/("""{"""),format.raw/*22.25*/("""
                """),format.raw/*23.17*/("""return true;
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/(""" """),format.raw/*25.15*/("""else """),format.raw/*25.20*/("""{"""),format.raw/*25.21*/("""
                """),format.raw/*26.17*/("""return true;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""
"""),format.raw/*29.1*/("""</script>



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
        <a href="#" class="navbar-brand"><img alt="Brand" class="img-responsive" src='"""),_display_(/*57.88*/routes/*57.94*/.Assets.at("/images/logoSimu.png")),format.raw/*57.128*/("""' ></a>
      </div>

      <div class="collapse navbar-collapse" id="navbar1">
        <!-- Principal -->
        <ul class="nav navbar-nav">
          <li class="dropdown">
            <a href='"""),_display_(/*64.23*/routes/*64.29*/.Application.index()),format.raw/*64.49*/("""' class="dropdown-toggle btn-lg" role="button">
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
              <li><a href='"""),_display_(/*77.29*/routes/*77.35*/.PersonasC.index()),format.raw/*77.53*/("""' title="Personas" target="_self">Personas</a></li>              
              <li><a href='"""),_display_(/*78.29*/routes/*78.35*/.CiudadesC.index()),format.raw/*78.53*/("""' title="Aeropuertos" target="_self">Aeropuertos/Almacenes</a></li>
              <li><a href='"""),_display_(/*79.29*/routes/*79.35*/.VuelosC.index()),format.raw/*79.51*/("""' title="Planes de Vuelo" target="_self">Planes de Vuelo</a></li>
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
                <li><a href='"""),_display_(/*91.31*/routes/*91.37*/.UsuariosC.index()),format.raw/*91.55*/("""' title="Consultar usuarios" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*92.31*/routes/*92.37*/.UsuariosC.newO()),format.raw/*92.54*/("""' title="Registrar Usuario" target="_self">Registrar</a></li>
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
                <li><a href='"""),_display_(/*105.31*/routes/*105.37*/.PedidosC.index()),format.raw/*105.54*/("""' title="Consultar talleres" target="_self">Consultar</a></li>
                <li><a href='"""),_display_(/*106.31*/routes/*106.37*/.PedidosC.newO()),format.raw/*106.53*/("""' title="Registrar talleres" target="_self">Registrar</a></li>
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
                <li><a href='"""),_display_(/*118.31*/routes/*118.37*/.Application.simulation()),format.raw/*118.62*/("""' title="Ejecutar Enrutamiento" target="_self">Ejecutar Enrutamiento</a></li>
                <li><a href='"""),_display_(/*119.31*/routes/*119.37*/.Application.simulation()),format.raw/*119.62*/("""' title="Ejecutar Simulación" target="_self">Ejecutar Simulación</a></li>
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
              <!--<li><a href='"""),_display_(/*144.33*/routes/*144.39*/.UsuariosC.account()),format.raw/*144.59*/("""' title="Ir a cuenta" target="_self">Mi Cuenta</a></li>-->
              <li><a href='"""),_display_(/*145.29*/routes/*145.35*/.SessionC.changePassword()),format.raw/*145.61*/("""' title="Cambiar contraseña" target="_self">Cambiar mi contraseña</a></li>
              <li><a href='"""),_display_(/*146.29*/routes/*146.35*/.SessionC.logout()),format.raw/*146.53*/("""' title="LOGOUT" target="_self">Logout</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>
<!---Cuerpo -->

<main class="main">
"""),_display_(/*157.2*/content),format.raw/*157.9*/("""
"""),format.raw/*158.1*/("""</main>
<!--Pie de págna-->

<footer class="footer">
    <div class="content">
        <div class="footer-1">
            <div class="logofoot">
                <img alt="Papus Club" src='"""),_display_(/*165.45*/routes/*165.51*/.Assets.at("images/logo-min.png")),format.raw/*165.84*/("""' title="Papus Club" style="z-index: -1;">               
            </div>
            <div class="contacto">
                <ul class="info">
                        <li><a href="#" title="telefono">(51) 1 523 4910</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*170.63*/routes/*170.69*/.Assets.at("images/punto.png")),format.raw/*170.99*/("""' width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="e-mail"></a></li>
                </ul>
                <ul class="terminos-condiciones">
                        <li><a href="#" title="Terminos y Condiciones">TÉRMINOS Y CONDICIONES</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*175.63*/routes/*175.69*/.Assets.at("images/punto.png")),format.raw/*175.99*/("""'  width="3px" height="3px"></img></span></li>
                        <li><a href="#" title="Privacidad">PRIVACIDAD</a></li>
                        <li><span><img class="PointImg" src='"""),_display_(/*177.63*/routes/*177.69*/.Assets.at("images/punto.png")),format.raw/*177.99*/("""'  width="3px" height="3px"></img></span></li>
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
                  DATE: Fri Nov 25 10:46:09 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/layouts/headerandfooter.scala.html
                  HASH: 278af3fa8f54fee1063f6d9d05fd41f36ec39f5a
                  MATRIX: 778->1|903->31|931->33|1104->179|1132->180|1172->193|1266->259|1295->260|1402->338|1432->339|1473->352|1524->375|1553->376|1614->409|1643->410|1684->423|1741->452|1770->453|1832->487|1861->488|1902->501|1960->531|1989->532|2102->616|2132->617|2173->630|2241->670|2270->671|2392->764|2422->765|2463->778|2519->806|2548->807|2611->842|2640->843|2681->856|2729->876|2758->877|2809->900|2838->901|2867->902|3095->1102|3124->1103|3169->1120|3242->1165|3271->1166|3316->1183|3426->1265|3455->1266|3484->1267|3517->1272|3546->1273|3591->1290|3648->1319|3677->1320|3718->1333|3747->1334|3776->1335|3809->1340|3838->1341|3883->1358|3936->1383|3965->1384|4001->1393|4030->1394|4058->1395|5373->2683|5388->2689|5444->2723|5668->2920|5683->2926|5724->2946|6225->3420|6240->3426|6279->3444|6400->3538|6415->3544|6454->3562|6577->3658|6592->3664|6629->3680|7100->4124|7115->4130|7154->4148|7274->4241|7289->4247|7327->4264|7815->4724|7831->4730|7870->4747|7991->4840|8007->4846|8045->4862|8530->5319|8546->5325|8593->5350|8729->5458|8745->5464|8792->5489|9759->6428|9775->6434|9817->6454|9932->6541|9948->6547|9996->6573|10127->6676|10143->6682|10183->6700|10387->6877|10415->6884|10444->6885|10661->7074|10677->7080|10732->7113|11050->7403|11066->7409|11118->7439|11494->7787|11510->7793|11562->7823|11778->8011|11794->8017|11846->8047
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|50->19|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|53->22|53->22|54->23|55->24|55->24|56->25|56->25|56->25|56->25|56->25|57->26|58->27|58->27|59->28|59->28|60->29|88->57|88->57|88->57|95->64|95->64|95->64|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|122->91|122->91|122->91|123->92|123->92|123->92|136->105|136->105|136->105|137->106|137->106|137->106|149->118|149->118|149->118|150->119|150->119|150->119|175->144|175->144|175->144|176->145|176->145|176->145|177->146|177->146|177->146|188->157|188->157|189->158|196->165|196->165|196->165|201->170|201->170|201->170|206->175|206->175|206->175|208->177|208->177|208->177
                  -- GENERATED --
              */
          