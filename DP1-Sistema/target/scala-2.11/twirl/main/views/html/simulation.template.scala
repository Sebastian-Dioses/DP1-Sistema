
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

class simulation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/layouts/*3.9*/.headerandfooter("Welcome to Play Framework")/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/("""
    
    """),format.raw/*5.5*/("""<!DOCTYPE html>
    <html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel='stylesheet' href='"""),_display_(/*12.39*/routes/*12.45*/.Assets.at("css/jquery.bxslider.css")),format.raw/*12.82*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*13.39*/routes/*13.45*/.Assets.at("css/MisEstilos.css")),format.raw/*13.77*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*14.39*/routes/*14.45*/.Assets.at("css/bootstrap.css")),format.raw/*14.76*/("""'>
        <link rel='stylesheet' href='"""),_display_(/*15.39*/routes/*15.45*/.Assets.at("css/font-awesome.css")),format.raw/*15.79*/("""'>    
        <link rel='stylesheet' href='"""),_display_(/*16.39*/routes/*16.45*/.Assets.at("css/DataTable.css")),format.raw/*16.76*/("""'>   
              <script src="https://www.amcharts.com/lib/3/ammap.js"></script>
<script src="https://www.amcharts.com/lib/3/maps/js/worldLow.js"></script>
        <script>
var targetSVG = "M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z";

// svg path for plane icon
var planeSVG = "m2,106h28l24,30h72l-44,-133h35l80,132h98c21,0 21,34 0,34l-98,0 -80,134h-35l43,-133h-71l-24,30h-28l15,-47";

var map = AmCharts.makeChart( "chartdiv", """),format.raw/*25.43*/("""{"""),format.raw/*25.44*/("""
  """),format.raw/*26.3*/(""""type": "map",
  "dataProvider": """),format.raw/*27.19*/("""{"""),format.raw/*27.20*/("""
    """),format.raw/*28.5*/(""""map": "worldLow",
    "zoomLevel": 3.5,
    "zoomLongitude": -55,
    "zoomLatitude": 42,

    "lines": [ """),format.raw/*33.16*/("""{"""),format.raw/*33.17*/("""
     """),format.raw/*34.6*/(""""id": "Dublin-Santiago de Chile",
     "arc": -0.85,
     "alpha": 0.3,
     "latitudes": [40.099, -33.448],
     "longitudes": [-83.114, -70.669],
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/(""", """),format.raw/*39.8*/("""{"""),format.raw/*39.9*/("""
     """),format.raw/*40.6*/(""""id": "Lima-Berlin",
     "arc": -0.85,
     "alpha": 0.3,
     "latitudes": [-12.046, 52.52],
     "longitudes": [-77.042, 13.404],
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/(""", """),format.raw/*45.8*/("""{"""),format.raw/*45.9*/("""
     """),format.raw/*46.6*/(""""id": "Dublin-Lisboa",
     "arc": -0.85,
     "alpha": 0.3,
     "latitudes": [40.099, 38.722],
     "longitudes": [-83.114, -9.139],
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/(""" """),format.raw/*51.7*/("""],
    "images": [ """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
        """),format.raw/*53.9*/(""""svgPath": targetSVG,
        "longitude": -74.072,
        "title": "Bogota",
        "latitude": 4.711
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""", """),format.raw/*57.8*/("""{"""),format.raw/*57.9*/("""
        """),format.raw/*58.9*/(""""svgPath": targetSVG,
        "longitude": -78.468,
        "title": "Quito",
        "latitude": -0.181
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""", """),format.raw/*62.8*/("""{"""),format.raw/*62.9*/("""
        """),format.raw/*63.9*/(""""svgPath": targetSVG,
        "longitude": -66.904,
        "title": "Caracas",
        "latitude": 10.481
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""", """),format.raw/*67.8*/("""{"""),format.raw/*67.9*/("""
        """),format.raw/*68.9*/(""""svgPath": targetSVG,
        "longitude": -51.925,
        "title": "Brasilia",
        "latitude": -14.235
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""", """),format.raw/*72.8*/("""{"""),format.raw/*72.9*/("""
        """),format.raw/*73.9*/(""""svgPath": targetSVG,
        "longitude": -77.042,
        "title": "Lima",
        "latitude": -12.046
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""", """),format.raw/*77.8*/("""{"""),format.raw/*77.9*/("""
        """),format.raw/*78.9*/(""""svgPath": targetSVG,
        "longitude": -68.119,
        "title": "La Paz",
        "latitude": -16.489
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""", """),format.raw/*82.8*/("""{"""),format.raw/*82.9*/("""
        """),format.raw/*83.9*/(""""svgPath": targetSVG,
        "longitude": -70.669,
        "title": "Santiago de Chile",
        "latitude": -33.448
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/(""", """),format.raw/*87.8*/("""{"""),format.raw/*87.9*/("""
        """),format.raw/*88.9*/(""""svgPath": targetSVG,
        "longitude": -58.381,
        "title": "Buenos Aires",
        "latitude": -34.603
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/(""", """),format.raw/*92.8*/("""{"""),format.raw/*92.9*/("""
        """),format.raw/*93.9*/(""""svgPath": targetSVG,
        "longitude": -57.575,
        "title": "Asunción",
        "latitude": -25.263
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/(""", """),format.raw/*97.8*/("""{"""),format.raw/*97.9*/("""
        """),format.raw/*98.9*/(""""svgPath": targetSVG,
        "longitude": -56.164,
        "title": "Montevideo",
        "latitude": -34.901
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/(""", """),format.raw/*102.8*/("""{"""),format.raw/*102.9*/("""
        """),format.raw/*103.9*/(""""svgPath": targetSVG,
        "longitude": 19.818,
        "title": "Tirana",
        "latitude": 41.327
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/(""", """),format.raw/*107.8*/("""{"""),format.raw/*107.9*/("""
        """),format.raw/*108.9*/(""""svgPath": targetSVG,
        "longitude": 13.404,
        "title": "Berlin",
        "latitude": 52.52
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/(""", """),format.raw/*112.8*/("""{"""),format.raw/*112.9*/("""
        """),format.raw/*113.9*/(""""svgPath": targetSVG,
        "longitude": 16.373,
        "title": "Viena",
        "latitude": 48.208
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""", """),format.raw/*117.8*/("""{"""),format.raw/*117.9*/("""
        """),format.raw/*118.9*/(""""svgPath": targetSVG,
        "longitude": 4.351,
        "title": "Bruselas",
        "latitude": 50.85
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""", """),format.raw/*122.8*/("""{"""),format.raw/*122.9*/("""
        """),format.raw/*123.9*/(""""svgPath": targetSVG,
        "longitude": 27.561,
        "title": "Minsk",
        "latitude": 53.904
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/(""", """),format.raw/*127.8*/("""{"""),format.raw/*127.9*/("""
        """),format.raw/*128.9*/(""""svgPath": targetSVG,
        "longitude": 23.321,
        "title": "Sofia",
        "latitude": 42.697
    """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/(""", """),format.raw/*132.8*/("""{"""),format.raw/*132.9*/("""
        """),format.raw/*133.9*/(""""svgPath": targetSVG,
        "longitude": 14.437,
        "title": "Praga",
        "latitude": 50.075
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/(""", """),format.raw/*137.8*/("""{"""),format.raw/*137.9*/("""
        """),format.raw/*138.9*/(""""svgPath": targetSVG,
        "longitude": 15.981,
        "title": "Zagreb",
        "latitude": 45.815
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/(""", """),format.raw/*142.8*/("""{"""),format.raw/*142.9*/("""
        """),format.raw/*143.9*/(""""svgPath": targetSVG,
        "longitude": 12.568,
        "title": "Copenhague",
        "latitude": 55.676
    """),format.raw/*147.5*/("""}"""),format.raw/*147.6*/(""", """),format.raw/*147.8*/("""{"""),format.raw/*147.9*/("""
        """),format.raw/*148.9*/(""""svgPath": targetSVG,
        "longitude": 17.107,
        "title": "Bratislava",
        "latitude": 48.148
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""", """),format.raw/*152.8*/("""{"""),format.raw/*152.9*/("""
        """),format.raw/*153.9*/(""""svgPath": targetSVG,
        "longitude": 14.505,
        "title": "Liubliana",
        "latitude": 46.056
    """),format.raw/*157.5*/("""}"""),format.raw/*157.6*/(""", """),format.raw/*157.8*/("""{"""),format.raw/*157.9*/("""
        """),format.raw/*158.9*/(""""svgPath": targetSVG,
        "longitude": -3.703,
        "title": "Madrid",
        "latitude": 40.416
    """),format.raw/*162.5*/("""}"""),format.raw/*162.6*/(""", """),format.raw/*162.8*/("""{"""),format.raw/*162.9*/("""
        """),format.raw/*163.9*/(""""svgPath": targetSVG,
        "longitude": 24.753,
        "title": "Tallin",
        "latitude": 59.436
    """),format.raw/*167.5*/("""}"""),format.raw/*167.6*/(""", """),format.raw/*167.8*/("""{"""),format.raw/*167.9*/("""
        """),format.raw/*168.9*/(""""svgPath": targetSVG,
        "longitude": 24.938,
        "title": "Helsinki",
        "latitude": 60.169
    """),format.raw/*172.5*/("""}"""),format.raw/*172.6*/(""", """),format.raw/*172.8*/("""{"""),format.raw/*172.9*/("""
        """),format.raw/*173.9*/(""""svgPath": targetSVG,
        "longitude": 2.352,
        "title": "Paris",
        "latitude": 48.856
    """),format.raw/*177.5*/("""}"""),format.raw/*177.6*/(""", """),format.raw/*177.8*/("""{"""),format.raw/*177.9*/("""
        """),format.raw/*178.9*/(""""svgPath": targetSVG,
        "longitude": 23.727,
        "title": "Atenas",
        "latitude": 37.983
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/(""", """),format.raw/*182.8*/("""{"""),format.raw/*182.9*/("""
        """),format.raw/*183.9*/(""""svgPath": targetSVG,
        "longitude": 4.895,
        "title": "Amsterdam",
        "latitude": 52.37
    """),format.raw/*187.5*/("""}"""),format.raw/*187.6*/(""", """),format.raw/*187.8*/("""{"""),format.raw/*187.9*/("""
        """),format.raw/*188.9*/(""""svgPath": targetSVG,
        "longitude": 19.04,
        "title": "Budapest",
        "latitude": 47.497
    """),format.raw/*192.5*/("""}"""),format.raw/*192.6*/(""", """),format.raw/*192.8*/("""{"""),format.raw/*192.9*/("""
        """),format.raw/*193.9*/(""""svgPath": targetSVG,
        "longitude": -83.114,
        "title": "Dublin",
        "latitude": 40.099
    """),format.raw/*197.5*/("""}"""),format.raw/*197.6*/(""", """),format.raw/*197.8*/("""{"""),format.raw/*197.9*/("""
        """),format.raw/*198.9*/(""""svgPath": targetSVG,
        "longitude": 24.753,
        "title": "Tallin",
        "latitude": 59.436
    """),format.raw/*202.5*/("""}"""),format.raw/*202.6*/(""", """),format.raw/*202.8*/("""{"""),format.raw/*202.9*/("""
        """),format.raw/*203.9*/(""""svgPath": targetSVG,
        "longitude": -21.817,
        "title": "Reykjavik",
        "latitude": 64.126
    """),format.raw/*207.5*/("""}"""),format.raw/*207.6*/(""", """),format.raw/*207.8*/("""{"""),format.raw/*207.9*/("""
        """),format.raw/*208.9*/(""""svgPath": targetSVG,
        "longitude": 12.496,
        "title": "Roma",
        "latitude": 41.902
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/(""", """),format.raw/*212.8*/("""{"""),format.raw/*212.9*/("""
        """),format.raw/*213.9*/(""""svgPath": targetSVG,
        "longitude": 24.105,
        "title": "Riga",
        "latitude": 56.949
    """),format.raw/*217.5*/("""}"""),format.raw/*217.6*/(""", """),format.raw/*217.8*/("""{"""),format.raw/*217.9*/("""
        """),format.raw/*218.9*/(""""svgPath": targetSVG,
        "longitude": 6.129,
        "title": "Luxemburgo",
        "latitude": 49.815
    """),format.raw/*222.5*/("""}"""),format.raw/*222.6*/(""", """),format.raw/*222.8*/("""{"""),format.raw/*222.9*/("""
        """),format.raw/*223.9*/(""""svgPath": targetSVG,
        "longitude": 14.514,
        "title": "LaValletta",
        "latitude": 35.898
    """),format.raw/*227.5*/("""}"""),format.raw/*227.6*/(""", """),format.raw/*227.8*/("""{"""),format.raw/*227.9*/("""
        """),format.raw/*228.9*/(""""svgPath": targetSVG,
        "longitude": 10.752,
        "title": "Oslo",
        "latitude": 59.913
    """),format.raw/*232.5*/("""}"""),format.raw/*232.6*/(""", """),format.raw/*232.8*/("""{"""),format.raw/*232.9*/("""
        """),format.raw/*233.9*/(""""svgPath": targetSVG,
        "longitude": 21.012,
        "title": "Varsovia",
        "latitude": 52.229
    """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/(""", """),format.raw/*237.8*/("""{"""),format.raw/*237.9*/("""
        """),format.raw/*238.9*/(""""svgPath": targetSVG,
        "longitude": -9.139,
        "title": "Lisboa",
        "latitude": 38.722
    """),format.raw/*242.5*/("""}"""),format.raw/*242.6*/(""", """),format.raw/*242.8*/("""{"""),format.raw/*242.9*/("""
        """),format.raw/*243.9*/(""""svgPath": targetSVG,
        "longitude": -0.127,
        "title": "Londres",
        "latitude": 51.507
    """),format.raw/*247.5*/("""}"""),format.raw/*247.6*/(""", """),format.raw/*247.8*/("""{"""),format.raw/*247.9*/("""
        """),format.raw/*248.9*/(""""svgPath": targetSVG,
        "longitude": 18.068,
        "title": "Estocolmo",
        "latitude": 59.329
    """),format.raw/*252.5*/("""}"""),format.raw/*252.6*/(""", """),format.raw/*252.8*/("""{"""),format.raw/*252.9*/("""
        """),format.raw/*253.9*/(""""svgPath": targetSVG,
        "longitude": 7.447,
        "title": "Berna",
        "latitude": 46.947
    """),format.raw/*257.5*/("""}"""),format.raw/*257.6*/(""", """),format.raw/*257.8*/("""{"""),format.raw/*257.9*/("""
      """),format.raw/*258.7*/(""""id": "plane1",
      "svgPath": planeSVG,
      "positionOnLine": 0,
      "color": "#585869",
      "longitude": -500,
      "latitude": -500,
      "flipDirection": true,
      "loop": true,
      "scale": 0.03,
      "positionScale": 1.8
    """),format.raw/*268.5*/("""}"""),format.raw/*268.6*/(""", """),format.raw/*268.8*/("""{"""),format.raw/*268.9*/("""
      """),format.raw/*269.7*/(""""id": "plane2",
      "svgPath": planeSVG,
      "positionOnLine": 0,
      "color": "#585869",
      "longitude": -500,
      "latitude": -500,
      "flipDirection": true,
      "loop": true,
      "scale": 0.03,
      "positionScale": 1.8
    """),format.raw/*279.5*/("""}"""),format.raw/*279.6*/(""", """),format.raw/*279.8*/("""{"""),format.raw/*279.9*/("""
      """),format.raw/*280.7*/(""""id": "plane3",
      "svgPath": planeSVG,
      "positionOnLine": 0,
      "color": "#585869",
      "longitude": -500,
      "latitude": -500,
      "flipDirection": true,
      "loop": true,
      "scale": 0.03,
      "positionScale": 1.8
    """),format.raw/*290.5*/("""}"""),format.raw/*290.6*/(""" """),format.raw/*290.7*/("""]
  """),format.raw/*291.3*/("""}"""),format.raw/*291.4*/(""",

  "areasSettings": """),format.raw/*293.20*/("""{"""),format.raw/*293.21*/("""
    """),format.raw/*294.5*/(""""unlistedAreasColor": "#8dd9ef"
  """),format.raw/*295.3*/("""}"""),format.raw/*295.4*/(""",

  "imagesSettings": """),format.raw/*297.21*/("""{"""),format.raw/*297.22*/("""
    """),format.raw/*298.5*/(""""color": "#585869",
    "rollOverColor": "#585869",
    "selectedColor": "#585869",
    "pauseDuration": 0.2,
    "animationDuration": 8,
    "adjustAnimationSpeed": true
  """),format.raw/*304.3*/("""}"""),format.raw/*304.4*/(""",

  "linesSettings": """),format.raw/*306.20*/("""{"""),format.raw/*306.21*/("""
    """),format.raw/*307.5*/(""""color": "#585869",
    "alpha": 0.4
  """),format.raw/*309.3*/("""}"""),format.raw/*309.4*/(""",

  "listeners": [ """),format.raw/*311.18*/("""{"""),format.raw/*311.19*/("""
    """),format.raw/*312.5*/(""""event": "init",
    "method": function( e ) """),format.raw/*313.29*/("""{"""),format.raw/*313.30*/("""

      """),format.raw/*315.7*/("""// get map object
      var map = e.chart;

      // start first plane immediately
      var plane1 = map.getObjectById( "plane1" );
      plane1.lineId = "Dublin-Santiago de Chile";
      plane1.animateAlong();

      // delay the second plane by 1 second
      setTimeout( function() """),format.raw/*324.30*/("""{"""),format.raw/*324.31*/("""
        """),format.raw/*325.9*/("""var plane2 = map.getObjectById( "plane2" );
        plane2.lineId = "Lima-Berlin";
        plane2.animateAlong();
      """),format.raw/*328.7*/("""}"""),format.raw/*328.8*/(""", 1000 );

      // and the third one by 2 seconds
      setTimeout( function() """),format.raw/*331.30*/("""{"""),format.raw/*331.31*/("""
        """),format.raw/*332.9*/("""var plane3 = map.getObjectById( "plane3" );
        plane3.lineId = "Dublin-Lisboa";
        plane3.animateAlong();
      """),format.raw/*335.7*/("""}"""),format.raw/*335.8*/(""", 2000 );
    """),format.raw/*336.5*/("""}"""),format.raw/*336.6*/("""
  """),format.raw/*337.3*/("""}"""),format.raw/*337.4*/(""" """),format.raw/*337.5*/("""]

"""),format.raw/*339.1*/("""}"""),format.raw/*339.2*/(""" """),format.raw/*339.3*/(""");
        </script>   
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

 <div id="chartdiv" style="width: 100%; background-color:#d5eff7; height: 500px;"></div>
      
    <div class="content" style="max-width: 100%;">
        <!-- Utilizando Bootstrap -->           
        <br/>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 withoutpadding" >
<!--                    <img style="text-align:center;margin: 0 auto;display: block;" class="img-responsive" src=""""),_display_(/*362.116*/routes/*362.122*/.Assets.at("images/simulation.gif")),format.raw/*362.157*/(""""/> -->
                    
                </div>
            </div>
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



        <script src='"""),_display_(/*399.23*/routes/*399.29*/.Assets.at("js/jquery-1.11.3.min.js")),format.raw/*399.66*/("""'></script>
        <!-- Bootstrap -->
        <script src='"""),_display_(/*401.23*/routes/*401.29*/.Assets.at("js/bootstrap.js")),format.raw/*401.58*/("""'></script>    
        <!-- BXSlider -->
        <script src='"""),_display_(/*403.23*/routes/*403.29*/.Assets.at("js/jquery.bxslider.min.js")),format.raw/*403.68*/("""'></script>      
        <!-- Mis Scripts -->
        <script src='"""),_display_(/*405.23*/routes/*405.29*/.Assets.at("js/MisScripts.js")),format.raw/*405.59*/("""'></script>

        <script src='"""),_display_(/*407.23*/routes/*407.29*/.Assets.at("js/jquery.dataTables.js")),format.raw/*407.66*/("""'></script>
        <script>
        $(document).ready(function() """),format.raw/*409.38*/("""{"""),format.raw/*409.39*/("""
           """),format.raw/*410.12*/("""$('#example').DataTable( """),format.raw/*410.37*/("""{"""),format.raw/*410.38*/("""
               """),format.raw/*411.16*/(""""language": """),format.raw/*411.28*/("""{"""),format.raw/*411.29*/("""
                   """),format.raw/*412.20*/(""""url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
               """),format.raw/*413.16*/("""}"""),format.raw/*413.17*/("""
            """),format.raw/*414.13*/("""}"""),format.raw/*414.14*/(""");
        """),format.raw/*415.9*/("""}"""),format.raw/*415.10*/(""");
        </script>
    </body>
    </html>

""")))}),format.raw/*420.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object simulation extends simulation_Scope0.simulation
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Nov 13 19:04:15 COT 2016
=======
                  DATE: Mon Nov 14 18:04:34 COT 2016
>>>>>>> marcelo
                  SOURCE: C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/app/views/simulation.scala.html
                  HASH: 1fbc57eb6d74a4359e0f5b3d031f4bfc399df55e
                  MATRIX: 755->1|865->16|895->21|909->28|962->73|1001->75|1039->87|1291->312|1306->318|1364->355|1433->397|1448->403|1501->435|1570->477|1585->483|1637->514|1706->556|1721->562|1776->596|1849->642|1864->648|1916->679|2585->1320|2614->1321|2645->1325|2707->1359|2736->1360|2769->1366|2909->1478|2938->1479|2972->1486|3156->1643|3184->1644|3213->1646|3241->1647|3275->1654|3444->1796|3472->1797|3501->1799|3529->1800|3563->1807|3734->1951|3762->1952|3790->1953|3838->1973|3867->1974|3904->1984|4044->2097|4072->2098|4101->2100|4129->2101|4166->2111|4306->2224|4334->2225|4363->2227|4391->2228|4428->2238|4570->2353|4598->2354|4627->2356|4655->2357|4692->2367|4836->2484|4864->2485|4893->2487|4921->2488|4958->2498|5098->2611|5126->2612|5155->2614|5183->2615|5220->2625|5362->2740|5390->2741|5419->2743|5447->2744|5484->2754|5637->2880|5665->2881|5694->2883|5722->2884|5759->2894|5907->3015|5935->3016|5964->3018|5992->3019|6029->3029|6173->3146|6201->3147|6230->3149|6258->3150|6295->3160|6442->3279|6471->3280|6501->3282|6530->3283|6568->3293|6709->3406|6738->3407|6768->3409|6797->3410|6835->3420|6975->3532|7004->3533|7034->3535|7063->3536|7101->3546|7241->3658|7270->3659|7300->3661|7329->3662|7367->3672|7508->3785|7537->3786|7567->3788|7596->3789|7634->3799|7774->3911|7803->3912|7833->3914|7862->3915|7900->3925|8040->4037|8069->4038|8099->4040|8128->4041|8166->4051|8306->4163|8335->4164|8365->4166|8394->4167|8432->4177|8573->4290|8602->4291|8632->4293|8661->4294|8699->4304|8844->4421|8873->4422|8903->4424|8932->4425|8970->4435|9115->4552|9144->4553|9174->4555|9203->4556|9241->4566|9385->4682|9414->4683|9444->4685|9473->4686|9511->4696|9652->4809|9681->4810|9711->4812|9740->4813|9778->4823|9919->4936|9948->4937|9978->4939|10007->4940|10045->4950|10188->5065|10217->5066|10247->5068|10276->5069|10314->5079|10453->5190|10482->5191|10512->5193|10541->5194|10579->5204|10720->5317|10749->5318|10779->5320|10808->5321|10846->5331|10988->5445|11017->5446|11047->5448|11076->5449|11114->5459|11256->5573|11285->5574|11315->5576|11344->5577|11382->5587|11524->5701|11553->5702|11583->5704|11612->5705|11650->5715|11791->5828|11820->5829|11850->5831|11879->5832|11917->5842|12062->5959|12091->5960|12121->5962|12150->5963|12188->5973|12327->6084|12356->6085|12386->6087|12415->6088|12453->6098|12592->6209|12621->6210|12651->6212|12680->6213|12718->6223|12862->6339|12891->6340|12921->6342|12950->6343|12988->6353|13133->6470|13162->6471|13192->6473|13221->6474|13259->6484|13398->6595|13427->6596|13457->6598|13486->6599|13524->6609|13667->6724|13696->6725|13726->6727|13755->6728|13793->6738|13934->6851|13963->6852|13993->6854|14022->6855|14060->6865|14202->6979|14231->6980|14261->6982|14290->6983|14328->6993|14472->7109|14501->7110|14531->7112|14560->7113|14598->7123|14737->7234|14766->7235|14796->7237|14825->7238|14861->7246|15145->7502|15174->7503|15204->7505|15233->7506|15269->7514|15553->7770|15582->7771|15612->7773|15641->7774|15677->7782|15961->8038|15990->8039|16019->8040|16052->8045|16081->8046|16134->8070|16164->8071|16198->8077|16261->8112|16290->8113|16344->8138|16374->8139|16408->8145|16615->8324|16644->8325|16697->8349|16727->8350|16761->8356|16830->8397|16859->8398|16910->8420|16940->8421|16974->8427|17049->8473|17079->8474|17117->8484|17441->8779|17471->8780|17509->8790|17660->8913|17689->8914|17801->8997|17831->8998|17869->9008|18022->9133|18051->9134|18094->9149|18123->9150|18155->9154|18184->9155|18213->9156|18246->9161|18275->9162|18304->9163|19097->9927|19114->9933|19172->9968|20510->11278|20526->11284|20585->11321|20676->11384|20692->11390|20743->11419|20837->11485|20853->11491|20914->11530|21013->11601|21029->11607|21081->11637|21146->11674|21162->11680|21221->11717|21318->11785|21348->11786|21390->11799|21444->11824|21474->11825|21520->11842|21561->11854|21591->11855|21641->11876|21755->11961|21785->11962|21828->11976|21858->11977|21898->11989|21928->11990|22011->12042
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|56->25|56->25|57->26|58->27|58->27|59->28|64->33|64->33|65->34|70->39|70->39|70->39|70->39|71->40|76->45|76->45|76->45|76->45|77->46|82->51|82->51|82->51|83->52|83->52|84->53|88->57|88->57|88->57|88->57|89->58|93->62|93->62|93->62|93->62|94->63|98->67|98->67|98->67|98->67|99->68|103->72|103->72|103->72|103->72|104->73|108->77|108->77|108->77|108->77|109->78|113->82|113->82|113->82|113->82|114->83|118->87|118->87|118->87|118->87|119->88|123->92|123->92|123->92|123->92|124->93|128->97|128->97|128->97|128->97|129->98|133->102|133->102|133->102|133->102|134->103|138->107|138->107|138->107|138->107|139->108|143->112|143->112|143->112|143->112|144->113|148->117|148->117|148->117|148->117|149->118|153->122|153->122|153->122|153->122|154->123|158->127|158->127|158->127|158->127|159->128|163->132|163->132|163->132|163->132|164->133|168->137|168->137|168->137|168->137|169->138|173->142|173->142|173->142|173->142|174->143|178->147|178->147|178->147|178->147|179->148|183->152|183->152|183->152|183->152|184->153|188->157|188->157|188->157|188->157|189->158|193->162|193->162|193->162|193->162|194->163|198->167|198->167|198->167|198->167|199->168|203->172|203->172|203->172|203->172|204->173|208->177|208->177|208->177|208->177|209->178|213->182|213->182|213->182|213->182|214->183|218->187|218->187|218->187|218->187|219->188|223->192|223->192|223->192|223->192|224->193|228->197|228->197|228->197|228->197|229->198|233->202|233->202|233->202|233->202|234->203|238->207|238->207|238->207|238->207|239->208|243->212|243->212|243->212|243->212|244->213|248->217|248->217|248->217|248->217|249->218|253->222|253->222|253->222|253->222|254->223|258->227|258->227|258->227|258->227|259->228|263->232|263->232|263->232|263->232|264->233|268->237|268->237|268->237|268->237|269->238|273->242|273->242|273->242|273->242|274->243|278->247|278->247|278->247|278->247|279->248|283->252|283->252|283->252|283->252|284->253|288->257|288->257|288->257|288->257|289->258|299->268|299->268|299->268|299->268|300->269|310->279|310->279|310->279|310->279|311->280|321->290|321->290|321->290|322->291|322->291|324->293|324->293|325->294|326->295|326->295|328->297|328->297|329->298|335->304|335->304|337->306|337->306|338->307|340->309|340->309|342->311|342->311|343->312|344->313|344->313|346->315|355->324|355->324|356->325|359->328|359->328|362->331|362->331|363->332|366->335|366->335|367->336|367->336|368->337|368->337|368->337|370->339|370->339|370->339|393->362|393->362|393->362|430->399|430->399|430->399|432->401|432->401|432->401|434->403|434->403|434->403|436->405|436->405|436->405|438->407|438->407|438->407|440->409|440->409|441->410|441->410|441->410|442->411|442->411|442->411|443->412|444->413|444->413|445->414|445->414|446->415|446->415|451->420
                  -- GENERATED --
              */
          