
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
                    <select class="form-control" id="escalaTiempo" >
                        <option value="1">1 seg-1 hora</option>
                        <option value="3">1 seg-3 horas</option>
                        <option value="6">1 seg-6 horas</option>
                    </select>
                </div>
            </div>
        </div> 
             
        <div style="display:none" >
            <table id="ciudades_tabla">
                <tbody>
                """),_display_(/*53.18*/for(ciudad <- ciudades) yield /*53.41*/{_display_(Seq[Any](format.raw/*53.42*/("""
                    """),format.raw/*54.21*/("""<tr>
                        <td>"""),_display_(/*55.30*/ciudad/*55.36*/.cod_ciudad),format.raw/*55.47*/("""</td>
                        <td>"""),_display_(/*56.30*/ciudad/*56.36*/.nombre),format.raw/*56.43*/("""</td>
                        <td>"""),_display_(/*57.30*/ciudad/*57.36*/.pais),format.raw/*57.41*/("""</td>
                        <td>"""),_display_(/*58.30*/ciudad/*58.36*/.latitud),format.raw/*58.44*/("""</td>
                        <td>"""),_display_(/*59.30*/ciudad/*59.36*/.longitud),format.raw/*59.45*/("""</td>
                        <td>"""),_display_(/*60.30*/ciudad/*60.36*/.huso),format.raw/*60.41*/("""</td>
                    </tr>
                """)))}),format.raw/*62.18*/("""
                """),format.raw/*63.17*/("""</tbody>                         

            </table>

            <table id="vuelos_tabla">
                <tbody>
                """),_display_(/*69.18*/for(vuelo <- vuelos) yield /*69.38*/{_display_(Seq[Any](format.raw/*69.39*/("""
                    """),format.raw/*70.21*/("""<tr>
                        <td>"""),_display_(/*71.30*/vuelo/*71.35*/.id),format.raw/*71.38*/("""</td>
                        <td>"""),_display_(/*72.30*/vuelo/*72.35*/.ciudad_origen),format.raw/*72.49*/("""</td>
                        <td>"""),_display_(/*73.30*/vuelo/*73.35*/.ciudad_destino),format.raw/*73.50*/("""</td>
                        <td>"""),_display_(/*74.30*/vuelo/*74.35*/.hora_salida),format.raw/*74.47*/("""</td>
                        <td>"""),_display_(/*75.30*/vuelo/*75.35*/.hora_llegada),format.raw/*75.48*/("""</td>
                    </tr>
                """)))}),format.raw/*77.18*/("""
                """),format.raw/*78.17*/("""</tbody>
            </table>
        </div>
        <!--Pie de págna-->
        
        <!-- JQuery -->

        <script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
        <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
        <script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

        <script src='https://code.jquery.com/jquery-1.11.2.min.js'></script>

        <script src='"""),_display_(/*91.23*/routes/*91.29*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*91.66*/("""'></script>
        <!-- Bootstrap -->
        <script src='"""),_display_(/*93.23*/routes/*93.29*/.Assets.at("js/bootstrap.js")),format.raw/*93.58*/("""'></script>    
        <!-- BXSlider -->
        <script src='"""),_display_(/*95.23*/routes/*95.29*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*95.68*/("""'></script>      
        <!-- Mis Scripts -->
        <script src='"""),_display_(/*97.23*/routes/*97.29*/.Assets.at("js/MisScripts.js")),format.raw/*97.59*/("""'></script>

        <script src='"""),_display_(/*99.23*/routes/*99.29*/.Assets.at("js/jquery.dataTables.js")),format.raw/*99.66*/("""'></script>
        <script src='"""),_display_(/*100.23*/routes/*100.29*/.Assets.at("js/simulacion.js")),format.raw/*100.59*/("""'></script>
        <script>
        $(document).ready(function() """),format.raw/*102.38*/("""{"""),format.raw/*102.39*/("""
           """),format.raw/*103.12*/("""$('#example').DataTable( """),format.raw/*103.37*/("""{"""),format.raw/*103.38*/("""
               """),format.raw/*104.16*/(""""language": """),format.raw/*104.28*/("""{"""),format.raw/*104.29*/("""
                   """),format.raw/*105.20*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
               """),format.raw/*106.16*/("""}"""),format.raw/*106.17*/("""
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/(""");
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""");
        </script>
    </body>
    </html>

""")))}),format.raw/*113.2*/("""
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
                  DATE: Mon Nov 21 09:32:29 COT 2016
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/simulation.scala.html
                  HASH: 8fa1972660234e3783c741885c482b9cab51e8dc
                  MATRIX: 790->1|944->60|976->67|990->74|1043->119|1082->121|1120->133|1372->358|1387->364|1445->401|1514->443|1529->449|1582->481|1651->523|1666->529|1718->560|1787->602|1802->608|1857->642|1930->688|1945->694|1997->725|2069->770|2084->776|2137->808|3589->2233|3628->2256|3667->2257|3717->2279|3779->2314|3794->2320|3826->2331|3889->2367|3904->2373|3932->2380|3995->2416|4010->2422|4036->2427|4099->2463|4114->2469|4143->2477|4206->2513|4221->2519|4251->2528|4314->2564|4329->2570|4355->2575|4437->2626|4483->2644|4652->2786|4688->2806|4727->2807|4777->2829|4839->2864|4853->2869|4877->2872|4940->2908|4954->2913|4989->2927|5052->2963|5066->2968|5102->2983|5165->3019|5179->3024|5212->3036|5275->3072|5289->3077|5323->3090|5405->3141|5451->3159|5996->3677|6011->3683|6069->3720|6159->3783|6174->3789|6224->3818|6317->3884|6332->3890|6392->3929|6490->4000|6505->4006|6556->4036|6620->4073|6635->4079|6693->4116|6756->4151|6772->4157|6824->4187|6921->4255|6951->4256|6993->4269|7047->4294|7077->4295|7123->4312|7164->4324|7194->4325|7244->4346|7358->4431|7388->4432|7431->4446|7461->4447|7501->4459|7531->4460|7614->4512
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|37->6|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|93->62|94->63|100->69|100->69|100->69|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|108->77|109->78|122->91|122->91|122->91|124->93|124->93|124->93|126->95|126->95|126->95|128->97|128->97|128->97|130->99|130->99|130->99|131->100|131->100|131->100|133->102|133->102|134->103|134->103|134->103|135->104|135->104|135->104|136->105|137->106|137->106|138->107|138->107|139->108|139->108|144->113
                  -- GENERATED --
              */
          