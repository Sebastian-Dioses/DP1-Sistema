
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object simulation_Scope0 {
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

class simulation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Ciudades],List[models.Vuelos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ciudades:List[models.Ciudades],vuelos:List[models.Vuelos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""


"""),_display_(/*4.2*/layouts/*4.9*/.headerandfooter("Welcome to Play Framework")/*4.54*/ {_display_(Seq[Any](format.raw/*4.56*/("""
    
    """),format.raw/*6.5*/("""<!DOCTYPE html>
    <html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel='stylesheet' href='"""),_display_(/*13.39*/routes/*13.45*/.Assets.at("css/jquery.bxslider.css")),format.raw/*13.82*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*14.39*/routes/*14.45*/.Assets.at("css/MisEstilos.css")),format.raw/*14.77*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*15.39*/routes/*15.45*/.Assets.at("css/bootstrap.css")),format.raw/*15.76*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*16.39*/routes/*16.45*/.Assets.at("css/font-awesome.css")),format.raw/*16.79*/("""'>    
        <link rel='stylesheet' href='"""),_display_(/*17.39*/routes/*17.45*/.Assets.at("css/DataTable.css")),format.raw/*17.76*/("""'>   
        <link rel='stylesheet' href='"""),_display_(/*18.39*/routes/*18.45*/.Assets.at("css/simulacion.css")),format.raw/*18.77*/("""'>   
              <script src="https://www.amcharts.com/lib/3/ammap.js"></script>
<script src="https://www.amcharts.com/lib/3/maps/js/worldLow.js"></script>
    </head>
    <body>
    <!---Cuerpo -->
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <p class="lead"><strong>SIMULACIÓN</strong></p>             
            </div>
        </div>
    </div>

 <div id="chartdiv" style="background-color:#d5eff7; height: 500px;"></div>
   
 <div id="maplog"></div>

         <div class="container" id="contain">
            <div class="btn-group btn-group-justified">
                <a type="button" class="btn btn-primary" onclick="togglePlay();">Iniciar/Pausar</a>
                <a type="button" class="btn btn-primary">Ver Resultados</a>             
                <div class="btn-group">
                    <select class="form-control" id="selVel" >
                        <option>1 seg-1 hora</option>
                        <option>1 seg-5 horas</option>
                        <option>1 seg-10 horas</option>
                    </select>
                </div>
            </div>
        </div> 
             
  
       
    
<div style="display:none" >
                <table id="ciudades_tabla">
                    <tbody>
                    """),_display_(/*56.22*/for(ciudad <- ciudades) yield /*56.45*/{_display_(Seq[Any](format.raw/*56.46*/("""
                        """),format.raw/*57.25*/("""<tr>
                            <td>"""),_display_(/*58.34*/ciudad/*58.40*/.cod_ciudad),format.raw/*58.51*/("""</td>
                            <td>"""),_display_(/*59.34*/ciudad/*59.40*/.nombre),format.raw/*59.47*/("""</td>
                            <td>"""),_display_(/*60.34*/ciudad/*60.40*/.pais),format.raw/*60.45*/("""</td>
                            <td>"""),_display_(/*61.34*/ciudad/*61.40*/.latitud),format.raw/*61.48*/("""</td>
                            <td>"""),_display_(/*62.34*/ciudad/*62.40*/.longitud),format.raw/*62.49*/("""</td>
                            <td>"""),_display_(/*63.34*/ciudad/*63.40*/.huso),format.raw/*63.45*/("""</td>
                        </tr>
                    """)))}),format.raw/*65.22*/("""
                    """),format.raw/*66.21*/("""</tbody>                         

                </table>
 
                <table id="vuelos_tabla">
                    <tbody>
                    """),_display_(/*72.22*/for(vuelo <- vuelos) yield /*72.42*/{_display_(Seq[Any](format.raw/*72.43*/("""
                        """),format.raw/*73.25*/("""<tr>
                            <td>"""),_display_(/*74.34*/vuelo/*74.39*/.id),format.raw/*74.42*/("""</td>
                            <td>"""),_display_(/*75.34*/vuelo/*75.39*/.ciudad_origen),format.raw/*75.53*/("""</td>
                            <td>"""),_display_(/*76.34*/vuelo/*76.39*/.ciudad_destino),format.raw/*76.54*/("""</td>
                            <td>"""),_display_(/*77.34*/vuelo/*77.39*/.hora_salida),format.raw/*77.51*/("""</td>
                            <td>"""),_display_(/*78.34*/vuelo/*78.39*/.hora_llegada),format.raw/*78.52*/("""</td>
                        </tr>
                    """)))}),format.raw/*80.22*/("""
                    """),format.raw/*81.21*/("""</tbody>                         

                </table>
</div>
    <!--Pie de págna-->
        
    <!-- JQuery -->

<script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
<script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

  <script src='https://code.jquery.com/jquery-1.11.2.min.js'></script>



        <script src='"""),_display_(/*97.23*/routes/*97.29*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*97.66*/("""'></script>
        <!-- Bootstrap -->
        <script src='"""),_display_(/*99.23*/routes/*99.29*/.Assets.at("js/bootstrap.js")),format.raw/*99.58*/("""'></script>    
        <!-- BXSlider -->
        <script src='"""),_display_(/*101.23*/routes/*101.29*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*101.68*/("""'></script>      
        <!-- Mis Scripts -->
        <script src='"""),_display_(/*103.23*/routes/*103.29*/.Assets.at("js/MisScripts.js")),format.raw/*103.59*/("""'></script>

        <script src='"""),_display_(/*105.23*/routes/*105.29*/.Assets.at("js/jquery.dataTables.js")),format.raw/*105.66*/("""'></script>
        <script src='"""),_display_(/*106.23*/routes/*106.29*/.Assets.at("js/simulacion.js")),format.raw/*106.59*/("""'></script>
        <script>
        $(document).ready(function() """),format.raw/*108.38*/("""{"""),format.raw/*108.39*/("""
           """),format.raw/*109.12*/("""$('#example').DataTable( """),format.raw/*109.37*/("""{"""),format.raw/*109.38*/("""
               """),format.raw/*110.16*/(""""language": """),format.raw/*110.28*/("""{"""),format.raw/*110.29*/("""
                   """),format.raw/*111.20*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
               """),format.raw/*112.16*/("""}"""),format.raw/*112.17*/("""
            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/(""");
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/(""");
        </script>
    </body>
    </html>

""")))}),format.raw/*119.2*/("""
"""))
      }
    }
  }

  def render(ciudades:List[models.Ciudades],vuelos:List[models.Vuelos]): play.twirl.api.HtmlFormat.Appendable = apply(ciudades,vuelos)

  def f:((List[models.Ciudades],List[models.Vuelos]) => play.twirl.api.HtmlFormat.Appendable) = (ciudades,vuelos) => apply(ciudades,vuelos)

  def ref: this.type = this

}


}

/**/
object simulation extends simulation_Scope0.simulation
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 02:08:36 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/simulation.scala.html
                  HASH: 0f5f0b50a6a8c138006f5c63013c32c992cd6cfa
                  MATRIX: 790->1|944->60|976->67|990->74|1043->119|1082->121|1120->133|1372->358|1387->364|1445->401|1514->443|1529->449|1582->481|1651->523|1666->529|1718->560|1787->602|1802->608|1857->642|1930->688|1945->694|1997->725|2069->770|2084->776|2137->808|3533->2177|3572->2200|3611->2201|3665->2227|3731->2266|3746->2272|3778->2283|3845->2323|3860->2329|3888->2336|3955->2376|3970->2382|3996->2387|4063->2427|4078->2433|4107->2441|4174->2481|4189->2487|4219->2496|4286->2536|4301->2542|4327->2547|4417->2606|4467->2628|4653->2787|4689->2807|4728->2808|4782->2834|4848->2873|4862->2878|4886->2881|4953->2921|4967->2926|5002->2940|5069->2980|5083->2985|5119->3000|5186->3040|5200->3045|5233->3057|5300->3097|5314->3102|5348->3115|5438->3174|5488->3196|6022->3703|6037->3709|6095->3746|6185->3809|6200->3815|6250->3844|6344->3910|6360->3916|6421->3955|6520->4026|6536->4032|6588->4062|6653->4099|6669->4105|6728->4142|6791->4177|6807->4183|6859->4213|6956->4281|6986->4282|7028->4295|7082->4320|7112->4321|7158->4338|7199->4350|7229->4351|7279->4372|7393->4457|7423->4458|7466->4472|7496->4473|7536->4485|7566->4486|7649->4538
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|37->6|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|87->56|87->56|87->56|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|96->65|97->66|103->72|103->72|103->72|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|112->81|128->97|128->97|128->97|130->99|130->99|130->99|132->101|132->101|132->101|134->103|134->103|134->103|136->105|136->105|136->105|137->106|137->106|137->106|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|142->111|143->112|143->112|144->113|144->113|145->114|145->114|150->119
                  -- GENERATED --
              */
          