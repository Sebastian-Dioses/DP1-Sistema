
///////////////////// OBTENER CIUDADES
var  cities= new Map();

var oTable = document.getElementById('ciudades_tabla');
//gets rows of table
var rowLength = oTable.rows.length;

//loops through rows    
for (i = 0; i < rowLength; i++){

   //gets cells of current row
   var ciudadFila = oTable.rows.item(i).cells;

   var codCiud=ciudadFila.item(0).innerHTML;
   var city= {
      codigo: ciudadFila.item(0).innerHTML,
      nombre: ciudadFila.item(1).innerHTML,
      pais: ciudadFila.item(2).innerHTML,
      latitud: ciudadFila.item(3).innerHTML,
      longitud: ciudadFila.item(4).innerHTML,
      huso: ciudadFila.item(5).innerHTML
   }
   cities.set(codCiud,city);
}
////////OBTENER VUELOS
var vuelos = new Array();

var oTableV = document.getElementById('vuelos_tabla');
//gets rows of table
var rowLengthV = oTableV.rows.length;

//loops through rows    
for (i = 0; i < rowLengthV; i++){
  var vueloFila = oTableV.rows.item(i).cells;
  //Procesamos la hora
  var dt = new Date(vueloFila.item(3).innerHTML);
  var horaSalida = dt.getUTCHours();
  var husoO=cities.get(vueloFila.item(1).innerHTML).huso;
  //console.log(horaSalida+"-"+husoO);
  var horaSalidaEstandar=horaSalida-husoO;
  if(horaSalidaEstandar<0) horaSalidaEstandar+=24;
  horaSalidaEstandar%=24;
  var dt2 = new Date(vueloFila.item(4).innerHTML);
  var horaLlegada = dt2.getUTCHours();
  var husoF=cities.get(vueloFila.item(2).innerHTML).huso;
  var horaLlegadaEstandar=horaLlegada-husoF;
  if(horaLlegadaEstandar<0) horaLlegadaEstandar+=24;
  horaLlegadaEstandar%=24;  
  var tiempo=horaLlegadaEstandar-horaSalidaEstandar;
  if(tiempo<0) tiempo+=24;
  var ciudadOri=cities.get(vueloFila.item(1).innerHTML);
  var ciudadFin=cities.get(vueloFila.item(2).innerHTML);
  var sla=(ciudadOri.latitud-ciudadFin.latitud)/200;
  var slo= (ciudadOri.longitud-ciudadFin.longitud)/200;
  console.log("SLA: "+sla+" SLO: "+slo);
    var vuelo={
        codigo: vueloFila.item(0).innerHTML,
        ciudadO: vueloFila.item(1).innerHTML,
        ciudadF: vueloFila.item(2).innerHTML,
        horaSalida: horaSalidaEstandar,
        horaLlegada: horaLlegadaEstandar,
        stepLatitud: sla,
        stepLongitud: slo,
        tiempo: tiempo
    }
   vuelos.push(vuelo);
   //console.log(vuelos[i]);
}
vuelos.sort(function (a, b) { //ordenamos por hora :v
  if (a.horaSalida > b.horaSalida) {
    return 1;
  }
  if (a.horaSalida < b.horaSalida) {
    return -1;
  }
  // a must be equal to b
  return 0;
});
var indicesVuelos= new Array(); //indices de vuelos segun hora
indicesVuelos.push(0);// marcamos el inicio
var ini=0;
for(var n=0;n<vuelos.length; n++){
    if(vuelos[n].horaSalida!=ini) {
      indicesVuelos.push(n);
      ini=vuelos[n].horaSalida;
    }  
}

///////GRAFICOS PARA LA SIMULACION (INICIALIZACION)
AmCharts.ready(function() {
    AmCharts.theme = AmCharts.themes.dark;
  map = new AmCharts.AmMap();
    map.path = "http://www.amcharts.com/lib/3/";

  map.areasSettings = {
    unlistedAreasColor: "#000000",
    unlistedAreasAlpha: 0.1
  };
  map.imagesSettings.balloonText = "<span style='font-size:14px;'><b>[[title]]</b>: [[value]]</span>";
  map.addTitle("Hora actual: 00:00", 14);
  var dataProvider = {
    mapVar: AmCharts.maps.worldLow,
    images: []
  }
var targetSVG = "M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5 S12.5,7.067,12.5,9z";

// svg path for plane icon

    // CREAR  PUNTOS DE LAS CIUDADES
    for (var i = 0; i < rowLength; i++) {
        var city = oTable.rows.item(i).cells;
        var cod = city.item(0).innerHTML+2000; 
        var lat = parseInt(city.item(3).innerHTML); 
        var long = parseInt(city.item(4).innerHTML); 
        var nombre = city.item(1).innerHTML; 
        dataProvider.images.push({
            id: cod,
            svgPath: targetSVG,
            longitude: long,
            title: nombre,
            latitude: lat,
            scale: 0.3
        });
    }

  map.dataProvider = dataProvider;

  map.write("chartdiv");
});

/**
 * Calculates bullet size based on its value
 */

/*
  function recursive() {
    $.get(, function() {
    }).done(function () {
    if (notFinish) {
      recursive()
    }   
    });
    
  }*/




function mostrarResultadosRuteos(data){
  //el data representa la informacion traida del algoritmo en formato Json
  //alert( data);
  var log = document.getElementById('maplog');
  log.innerHTML = log.innerHTML + "<div>Origen: "+data.origen+" Destino: "+data.destino+"<\div>";
}

function recursiveVuelosPaquetes(contador) {
  var stop=0;

  $.get( "/simulation/requestPackage?scale="+escala+"&time="+contador, function( data ) {
    stop=data.stop;
    mostrarResultadosRuteos(data);

  }).done(function () {
    if (stop==0) {
      recursiveVuelosPaquetes(contador+1);
    }   

  });
  
}


/**
 * The code responsible for animating the motion chart data
 */

// initilize variables
var currentTime = 0;
var interval;
 var inicioAviones=cities.size; 

// function to start stop
function togglePlay() {

  //var divisor=1;
  //var opcion=document.getElementById('selVel').selectedIndex;
  //if(opcion==1) divisor=5;
  //else if(opcion==2) divisor=10;

  escala=parseInt($('#escalaTiempo').val());

  var speed = 1000; // time between frames in milliseconds
  var planeSVG = "m2,106h28l24,30h72l-44,-133h35l80,132h98c21,0 21,34 0,34l-98,0 -80,134h-35l43,-133h-71l-24,30h-28l15,-47";


  // check if animation is playing (intverla is set)
  if ( interval!=undefined ) {
    
    // stop playing (clear interval)
    clearInterval( interval );
    //currentTime=0;
    interval=undefined;
    return;
  }
  var contador=0;
  // start playing
  
  recursiveVuelosPaquetes(contador);

  interval = setInterval( function () {

      // var numLineas=map.dataProvider.lines.length;
      // for(var i=0;i<)
      var hora=currentTime;
      if(currentTime<10) hora="0"+hora;
      map.titles.pop();   
      map.addTitle("Hora actual: "+ hora+":00", 14);
      //map.validateNow();      
        while (map.dataProvider.lines.length > 0) {
            map.dataProvider.lines.pop();
        } 

        
      var inicioIndex=indicesVuelos[currentTime];
      var finIndex=vuelos.length;
      if(currentTime!=23) finIndex=indicesVuelos[currentTime+1];

      ///////actualizamos aviones

      // for(var j=inicioAviones;j<map.dataProvider.images.length;j++){


      //agregamos los nuevos aviones
      for(var i=inicioIndex;i<finIndex;i++){
          var vuelo=vuelos[i];
          //datos de la ciudad origen
          var latO=cities.get(vuelo.ciudadO).latitud;
          var lonO=cities.get(vuelo.ciudadO).longitud;
          //datos de la ciudad destino
          var latF=cities.get(vuelo.ciudadF).latitud;
          var lonF=cities.get(vuelo.ciudadF).longitud;

          map.dataProvider.lines.push({
            id: i,
            arc: -0.85,
            alpha: 0.3,
            color: "#990000",
            latitudes: [ latO, latF ],
            longitudes: [ lonO, lonF ]              
          });

          //CREAR AVIONES

      }

        currentTime++;
        currentTime%=24;
      // check if maybe we need to wrap to frame 0
      // update size of each bubble for the specific frame

      // for( var i = 0; i < map.dataProvider.images.length; i++ ) {

      map.validateData();
    
  }, speed );
    
  
}