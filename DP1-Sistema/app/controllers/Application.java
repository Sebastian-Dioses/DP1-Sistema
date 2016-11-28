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
		public String fecha;
		public String hora;
		public String origen;
		public String destino;
		public Integer factible;
		public Integer stop;
	}

	
	public static Result requestPackage(Long scale, Long time){
		//Se debe correr todos los paquetes que calcen en ese periodo de tiempo y escala
		Logger.info("Escala: "+scale+" Time: "+time);
		
		BufferArchivos baPedidos = BufferArchivos.getInstance();
		
		TreeMap<Integer,String[]> listaPedidosEscala=null;
		if(scale==1){
			listaPedidosEscala = baPedidos.getListaPedidosEscala1();
		}else if(scale==3){
			listaPedidosEscala = baPedidos.getListaPedidosEscala2();		
		}else{
			listaPedidosEscala = baPedidos.getListaPedidosEscala3();
		}
		
		Logger.info("Cantidad horas en escala: "+listaPedidosEscala.size());
			
		String [] pedidos = null;
		if(scale==1){
			pedidos = listaPedidosEscala.get(toIntExact(time));
		}else if(scale==3){
			pedidos = listaPedidosEscala.get(toIntExact(time));		
		}else{
			pedidos = listaPedidosEscala.get(toIntExact(time));
		}
		
		Paquete pk = new Paquete();
		if(toIntExact(time)==listaPedidosEscala.size()){
			pk.stop=1;//para que el front sepa que ya se debe terminar de iterar
		}else{
			pk.stop=0;//para que en el front sepa que se seguira iterando
		}
		pk.factible=0;

		
		GestorCiudades gc=GestorCiudades.getInstance();
		
		Logger.info("Cantidad paquetes: "+pedidos.length+"-"+time);
		Gson gson = new Gson();
		
		Boolean todosFactibles=true;
		for(int i=0;i<pedidos.length && todosFactibles;i++){
			String [] datosPaquete = pedidos[i].trim().split("-");//0:fecha 1:hora 2: ciudad origen 3: ciudad fin					
			
			RutaEscogida mejorRuta=gc.DFS(datosPaquete[2],datosPaquete[3],1,datosPaquete[1],1,datosPaquete[0]);
			String resultado=null;
			if(mejorRuta.getEstadoRuta()==0){//0 es Factible
				resultado="Numpedido: "+i+" "+pedidos[i]+" Ruta: "+ mejorRuta.imprimirRecorrido();
				String resultadoJSON=(String)gson.toJson(mejorRuta, RutaEscogida.class);
				SimpleChat.notifyAll(resultadoJSON);//Acá se podría mandar un Json con los datos del paquete
			}else{
				if(mejorRuta.getEstadoRuta()!=1){//Si se cae por condición de capacidades
					todosFactibles=false;
					pk.factible=mejorRuta.getEstadoRuta();
					pk.stop=1;//para que el front sepa que ya se debe terminar de iterar
					pk.fecha=datosPaquete[0];
					pk.hora=datosPaquete[1];
					pk.origen=datosPaquete[2];
					pk.destino=datosPaquete[3];
				}
				resultado="Numpedido: "+i+" No se encontro ruta - Ciudad Origen: "+ datosPaquete[2]+" Ciudad Fin: "+datosPaquete[3];	
			}			
			Logger.info(resultado);
		}
		return ok(Json.toJson(pk));
	}
	
	
    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
