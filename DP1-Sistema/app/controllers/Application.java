package controllers;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.Logger;
import play.libs.Json;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.File;
import play.Play; 
import static java.lang.Math.toIntExact;
import java.util.*;


import play.mvc.WebSocket;
import play.mvc.WebSocket.*;
import play.mvc.LegacyWebSocket;
import play.mvc.LegacyWebSocket.*;

import play.mvc.Security;

@Security.Authenticated(SecuredC.class)
public class Application extends Controller {
    @play.db.jpa.Transactional(readOnly=true)
    public static Result index() {            
        return ok(views.html.ciudad.index.render(Ciudades.getAll()));
    }
    @play.db.jpa.Transactional(readOnly=true)
    public static Result simulation() {            
        return ok(views.html.simulation.render(Ciudades.getAll(),Vuelos.getAll()));
    }
	
	// Websocket interface
	public static LegacyWebSocket<String> socket(){
		return WebSocket.whenReady((in, out) -> {
			SimpleChat.start(in, out);
		});
	}
	
	
	
	public static class Paquete{
		public Long id;
		public Long fecha;
		public String hora;
		public String origen;
		public String destino;
		public String ruta;
		public Long stop;
	}

	
	public static Result requestPackage(Long scale, Long time){
		//Se debe correr todos los paquetes que calcen en ese periodo de tiempo y escala
		Logger.info("Escala: "+scale+" Time: "+time);
		
		BufferArchivos baPedidos = BufferArchivos.getInstance();
		
		TreeMap<Integer,String[]> listaPedidosEscala=null;
		if(1==1){
			listaPedidosEscala = baPedidos.getListaPedidosEscala1();
		}else if(scale==3){
			listaPedidosEscala = baPedidos.getListaPedidosEscala2();		
		}else{
			listaPedidosEscala = baPedidos.getListaPedidosEscala3();
		}
		
		
		Logger.info("Cantidad horas en escala: "+listaPedidosEscala.size());

		Paquete pk = new Paquete();
			
		if(toIntExact(time)==listaPedidosEscala.size()){
			Integer a=1;
			pk.stop=a.longValue();
			return ok(Json.toJson(pk));
		}
		Integer a=0;
		pk.stop=a.longValue();
		
		
		
		String [] pedidos = null;
		if(scale==1){
			pedidos = listaPedidosEscala.get(toIntExact(time));
		}else if(scale==3){
			pedidos = listaPedidosEscala.get(toIntExact(time));		
		}else{
			pedidos = listaPedidosEscala.get(toIntExact(time));
		}
		
		GestorCiudades gc=GestorCiudades.getInstance();
		
		Logger.info("Cantidad paquetes: "+pedidos.length+"-"+time);
		
		
		for(int i=0;i<pedidos.length;i++){
			String [] datosPaquete = pedidos[i].trim().split("-");//0:fecha 1:hora 2: ciudad origen 3: ciudad fin					
			
			RutaEscogida mejorRuta=gc.DFS(datosPaquete[3],datosPaquete[4],1,datosPaquete[2],1,datosPaquete[1]);
			String resultado=null;
			if(mejorRuta.getEstadoRuta()==0){//0 es Factible
				resultado="Numpedido: "+i+" "+pedidos[i]+" Ruta: "+ mejorRuta.imprimirRecorrido();
				
			}else{
				resultado="Numpedido: "+i+" No se encontro ruta - Ciudad Origen: "+ datosPaquete[3]+" Ciudad Fin: "+datosPaquete[4];
			}
			
			Logger.info(resultado);
			SimpleChat.notifyAll(resultado);//Acá se podría mandar un Json con los datos del paquete
		}

		
		pk.hora="12:20";
		pk.origen="ABCD";
		pk.destino="EFGH";
		
		return ok(Json.toJson(pk));
	}
	
	
	
    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
