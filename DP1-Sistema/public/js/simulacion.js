var  cities= new Map();

var oTable = document.getElementById('ciudades_tabla');
//gets rows of table
var rowLength = oTable.rows.length;

//loops through rows    
for (i = 0; i < rowLength; i++){

   //gets cells of current row
   var oCells = oTable.rows.item(i).cells;

   //gets amount of cells of current row
   var cellLength = oCells.length;
   var codCiud=oCells.item(0).innerHTML;
   //loops through each cell in current row
   var values = new Array();
   for(var j = 0; j < cellLength; j++){
      /* get your cell info here */     
      values.push(oCells.item(j).innerHTML);
   }
   cities.set(codCiud,values);
}

var vuelos = new Array();

var oTableV = document.getElementById('vuelos_tabla');
//gets rows of table
var rowLengthV = oTableV.rows.length;

//loops through rows    
for (i = 0; i < rowLengthV; i++){

   //gets cells of current row
   var oCellsV = oTableV.rows.item(i).cells;

   //gets amount of cells of current row
   var cellLengthV = oCellsV.length;
   var codVuel=oCellsV.item(0).innerHTML;
   //loops through each cell in current row
   var valuesV = new Array();
   for(var j = 0; j < cellLengthV; j++){

      if(j==3){
        var dt = new Date(oCellsV.item(j).innerHTML);
        var horaSalida = dt.getUTCHours();
        var husoO=parseInt((cities.get(oCellsV.item(1).innerHTML))[5]);
        //console.log(horaSalida+"-"+husoO);
        var horaSalidaEstandar=horaSalida-husoO;
        
        if(horaSalidaEstandar<0) horaSalidaEstandar+=24;
        horaSalidaEstandar=horaSalidaEstandar%24;
        //console.log(horaSalidaEstandar);
        valuesV.push(horaSalidaEstandar);
      }
      else if (j==4) {
        var dt2 = new Date(oCellsV.item(j).innerHTML);
        var horaLlegada = dt2.getUTCHours();
        
        var husoF=parseInt((cities.get(oCellsV.item(2).innerHTML))[5]);
        //console.log(horaLlegada+"-"+husoF);
        var horaLlegadaEstandar=horaLlegada-husoF;       
        if(horaLlegadaEstandar<0) horaLlegadaEstandar+=24;
        horaLlegadaEstandar=horaLlegadaEstandar%24;
        //console.log(horaLlegadaEstandar);
        valuesV.push(horaLlegadaEstandar);
      }
      else valuesV.push(oCellsV.item(j).innerHTML);
   }
   vuelos.push(valuesV);
   //console.log(vuelos[i]);
}
vuelos.sort(function (a, b) { //ordenamos por hora :v
  if (a[3] > b[3]) {
    return 1;
  }
  if (a[3] < b[3]) {
    return -1;
  }
  // a must be equal to b
  return 0;
});
var indicesVuelos= new Array(); //indices de vuelos segun hora
indicesVuelos.push(0);// marcamos el inicio
var ini=0;
for(var n=0;n<vuelos.length; n++){
    if(vuelos[n][3]!=ini) {
      indicesVuelos.push(n);
      ini=vuelos[n][3];
    }  
}

AmCharts.ready(function() {
    AmCharts.theme = AmCharts.themes.dark;
  map = new AmCharts.AmMap();
    map.path = "http://www.amcharts.com/lib/3/";

  map.areasSettings = {
    unlistedAreasColor: "#000000",
    unlistedAreasAlpha: 0.1
  };
  map.imagesSettings.balloonText = "<span style='font-size:14px;'><b>[[title]]</b>: [[value]]</span>";

  var dataProvider = {
    mapVar: AmCharts.maps.worldLow,
    images: []
  }
var targetSVG = "M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z";

// svg path for plane icon


    // create target for each city
    for (var i = 0; i < rowLength; i++) {
        var city = oTable.rows.item(i).cells;
        var cod = city.item(0).innerHTML; 
        var lat = city.item(3).innerHTML; 
        var long = city.item(4).innerHTML; 
        var nombre = city.item(1).innerHTML; 
        dataProvider.images.push({
            id: cod,
            svgPath: targetSVG,
            longitude: long,
            title: nombre,
            latitude: lat,
        });
    }

  map.dataProvider = dataProvider;

  map.write("chartdiv");
});

/**
 * Calculates bullet size based on its value
 */

/**
 * The code responsible for animating the motion chart data
 */

// initilize variables
var currentFrame = 0;
var interval;

var contador=0;
// function to start stop
function togglePlay() {

var divisor=1;
var opcion=document.getElementById('selVel').selectedIndex;
if(opcion==1) divisor=5;
else if(opcion==2) divisor=10;
var speed = 1000/divisor; // time between frames in milliseconds

var planeSVG = "m2,106h28l24,30h72l-44,-133h35l80,132h98c21,0 21,34 0,34l-98,0 -80,134h-35l43,-133h-71l-24,30h-28l15,-47";
  
  // check if animation is playing (intverla is set)
  if ( interval ) {
    
    // stop playing (clear interval)
    clearInterval( interval );
    //currentFrame=0;
  }
  else {
    // start playing

    var log = document.getElementById('maplog');


    interval = setInterval( function () {
      // var numLineas=map.dataProvider.lines.length;
      // for(var i=0;i<)
    var hora=currentFrame;
    if(currentFrame<10) hora="0"+hora;
    map.titles.pop();   
    map.addTitle("Hora actual: "+ hora+":00", 14);
    //map.validateNow();      
      while (map.dataProvider.lines.length > 0) {
          map.dataProvider.lines.pop();
      } 
      // iterate the frame
      var inicioIndex=indicesVuelos[currentFrame];
      var finIndex=vuelos.length;
      if(currentFrame!=23) finIndex=indicesVuelos[currentFrame+1];
      for(var i=inicioIndex;i<finIndex;i++){
          var vuelo=vuelos[i];
          //datos de la ciudad origen
          var latO=(cities.get(vuelo[1]))[3];
          var lonO=(cities.get(vuelo[1]))[4];
          //datos de la ciudad destino
          var latF=(cities.get(vuelo[2]))[3];
          var lonF=(cities.get(vuelo[2]))[4];
          map.dataProvider.lines.push({
            id: i,
            arc: -0.85,
            alpha: 0.3,
            color: "#990000",
            latitudes: [ latO, latF ],
            arrow: "end",
            longitudes: [ lonO, lonF ]              
          });
              // map.dataProvider.images.push({
              //   svgPath: planeSVG,
              //   positionOnLine: 0,
              //   color: "#585869",
              //   longitude: latO,
              //   latitude: lonO,
              //   animateAlongLine: true,
              //   flipDirection: false,
              //   loop: false,
              //   scale: 0.03,
              //   positionScale: 1.8,
              //   animationDuration: 1,
              //   lineId: i
              // });

                log.innerHTML = JSON.stringify({
                "vuelo id: ":vuelos[i][0],
                "origen: ": vuelos[i][1],
                "destino: ": vuelos[i][2],
                "hora Salida ": vuelos[i][3],
                "hora Llegada ": vuelos[i][4],
              }) + "<br />" + log.innerHTML;


      }
 
        currentFrame++;
        currentFrame%=24;

        contador++;
      // check if maybe we need to wrap to frame 0
      
      
      // update size of each bubble for the specific frame

      // for( var i = 0; i < map.dataProvider.images.length; i++ ) {
      //   var image = map.dataProvider.images[i];
      //   image.value = frames[currentFrame][image.id];
      //   image.width = calcBubbleSize( frames[currentFrame][image.id] );
      //   //console.log(frames[currentFrame][image.id]);
      // }
      map.validateData();
      
      
    }, speed );
    
  }
}