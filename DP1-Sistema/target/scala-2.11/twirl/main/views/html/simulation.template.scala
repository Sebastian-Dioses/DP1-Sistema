
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
<div style="display:none" >
                <table id="ciudades_tabla">
                    <tbody>
                    """),_display_(/*36.22*/for(ciudad <- ciudades) yield /*36.45*/{_display_(Seq[Any](format.raw/*36.46*/("""
                        """),format.raw/*37.25*/("""<tr>
                            <td>"""),_display_(/*38.34*/ciudad/*38.40*/.cod_ciudad),format.raw/*38.51*/("""</td>
                            <td>"""),_display_(/*39.34*/ciudad/*39.40*/.nombre),format.raw/*39.47*/("""</td>
                            <td>"""),_display_(/*40.34*/ciudad/*40.40*/.pais),format.raw/*40.45*/("""</td>
                            <td>"""),_display_(/*41.34*/ciudad/*41.40*/.latitud),format.raw/*41.48*/("""</td>
                            <td>"""),_display_(/*42.34*/ciudad/*42.40*/.longitud),format.raw/*42.49*/("""</td>
                            <td>"""),_display_(/*43.34*/ciudad/*43.40*/.huso),format.raw/*43.45*/("""</td>
                        </tr>
                    """)))}),format.raw/*45.22*/("""
                    """),format.raw/*46.21*/("""</tbody>                         

                </table>
 
                <table id="vuelos_tabla">
                    <tbody>
                    """),_display_(/*52.22*/for(vuelo <- vuelos) yield /*52.42*/{_display_(Seq[Any](format.raw/*52.43*/("""
                        """),format.raw/*53.25*/("""<tr>
                            <td>"""),_display_(/*54.34*/vuelo/*54.39*/.id),format.raw/*54.42*/("""</td>
                            <td>"""),_display_(/*55.34*/vuelo/*55.39*/.ciudad_origen),format.raw/*55.53*/("""</td>
                            <td>"""),_display_(/*56.34*/vuelo/*56.39*/.ciudad_destino),format.raw/*56.54*/("""</td>
                            <td>"""),_display_(/*57.34*/vuelo/*57.39*/.hora_salida),format.raw/*57.51*/("""</td>
                            <td>"""),_display_(/*58.34*/vuelo/*58.39*/.hora_llegada),format.raw/*58.52*/("""</td>
                        </tr>
                    """)))}),format.raw/*60.22*/("""
                    """),format.raw/*61.21*/("""</tbody>                         

                </table>
</div>
 <div id="chartdiv" style="width: 100%; background-color:#d5eff7; height: 500px;"></div>



    <div class="content" style="max-width: 100%;">
        <!-- Utilizando Bootstrap -->           
        <br/>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 withoutpadding" >
<!--                    <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(/*75.116*/routes/*75.122*/.Assets.at("images/simulation.gif")),format.raw/*75.157*/(""""/> -->
                    
                </div>
            </div>
        </div>          
<div id="controls">
  <input type="button" value="play/pause" onclick="togglePlay();" />
  &nbsp;&nbsp;&nbsp;
  Current frame: <span id="frame">0</span>
</div>     
        <br/><br/><br/>
        <div class="container">
            <div class="btn-group btn-group-justified">
                <a type="button" class="btn btn-primary">Iniciar</a>
                <a type="button" class="btn btn-primary">Ver Resultados</a>             
                <div class="btn-group">
                    <select class="form-control" id="sel1" >
                        <option>Duración de la Simulación</option>
                        <option>20 min.</option>
                        <option>1 hora</option>
                        <option>3 horas</option>
                        <option>Indefinido</option>
                    </select>
                </div>
            </div>
        </div>      
    </div>      
    

    <!--Pie de págna-->
        
    <!-- JQuery -->

<script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
<script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

  <script src='https://code.jquery.com/jquery-1.11.2.min.js'></script>



        <script src='"""),_display_(/*116.23*/routes/*116.29*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*116.66*/("""'></script>
        <!-- Bootstrap -->
        <script src='"""),_display_(/*118.23*/routes/*118.29*/.Assets.at("js/bootstrap.js")),format.raw/*118.58*/("""'></script>    
        <!-- BXSlider -->
        <script src='"""),_display_(/*120.23*/routes/*120.29*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*120.68*/("""'></script>      
        <!-- Mis Scripts -->
        <script src='"""),_display_(/*122.23*/routes/*122.29*/.Assets.at("js/MisScripts.js")),format.raw/*122.59*/("""'></script>

        <script src='"""),_display_(/*124.23*/routes/*124.29*/.Assets.at("js/jquery.dataTables.js")),format.raw/*124.66*/("""'></script>
        <script src='"""),_display_(/*125.23*/routes/*125.29*/.Assets.at("js/simulacion.js")),format.raw/*125.59*/("""'></script>
        <script>
        $(document).ready(function() """),format.raw/*127.38*/("""{"""),format.raw/*127.39*/("""
           """),format.raw/*128.12*/("""$('#example').DataTable( """),format.raw/*128.37*/("""{"""),format.raw/*128.38*/("""
               """),format.raw/*129.16*/(""""language": """),format.raw/*129.28*/("""{"""),format.raw/*129.29*/("""
                   """),format.raw/*130.20*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
               """),format.raw/*131.16*/("""}"""),format.raw/*131.17*/("""
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/(""");
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/(""");
        </script>
    </body>
    </html>

""")))}),format.raw/*138.2*/("""
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
                  DATE: Tue Nov 15 23:59:24 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/simulation.scala.html
                  HASH: bc3c4057757b3e40bf840c0f724b0a53fe35628e
                  MATRIX: 790->1|944->60|976->67|990->74|1043->119|1082->121|1120->133|1372->358|1387->364|1445->401|1514->443|1529->449|1582->481|1651->523|1666->529|1718->560|1787->602|1802->608|1857->642|1930->688|1945->694|1997->725|2597->1298|2636->1321|2675->1322|2729->1348|2795->1387|2810->1393|2842->1404|2909->1444|2924->1450|2952->1457|3019->1497|3034->1503|3060->1508|3127->1548|3142->1554|3171->1562|3238->1602|3253->1608|3283->1617|3350->1657|3365->1663|3391->1668|3481->1727|3531->1749|3717->1908|3753->1928|3792->1929|3846->1955|3912->1994|3926->1999|3950->2002|4017->2042|4031->2047|4066->2061|4133->2101|4147->2106|4183->2121|4250->2161|4264->2166|4297->2178|4364->2218|4378->2223|4412->2236|4502->2295|4552->2317|5100->2837|5116->2843|5173->2878|6679->4356|6695->4362|6754->4399|6845->4462|6861->4468|6912->4497|7006->4563|7022->4569|7083->4608|7182->4679|7198->4685|7250->4715|7315->4752|7331->4758|7390->4795|7453->4830|7469->4836|7521->4866|7618->4934|7648->4935|7690->4948|7744->4973|7774->4974|7820->4991|7861->5003|7891->5004|7941->5025|8055->5110|8085->5111|8128->5125|8158->5126|8198->5138|8228->5139|8311->5191
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|37->6|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|91->60|92->61|106->75|106->75|106->75|147->116|147->116|147->116|149->118|149->118|149->118|151->120|151->120|151->120|153->122|153->122|153->122|155->124|155->124|155->124|156->125|156->125|156->125|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|162->131|162->131|163->132|163->132|164->133|164->133|169->138
                  -- GENERATED --
              */
          