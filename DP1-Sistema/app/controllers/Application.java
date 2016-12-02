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
	public static boolean pausa=false;

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
		public String id;
		public String fecha;
		public String hora;
		public String origen;
		public String destino;
		public Integer factible;
		public Integer stop;
	}
	public static Result action(String act){
		if (act.equals("1")){
			pausa=false;
		}
		else{
			pausa=true;
		}
		SimpleChat.notifyAll(act);
		return ok(act);
	}	

	public static Result requestPackage(Long scale, Long time){
		//Se debe correr todos los paquetes que calcen en ese periodo de tiempo y escala
		Logger.info("Escala: "+scale+" Time: "+time);
		
		BufferArchivos baPedidos = BufferArchivos.getInstance();
		
		TreeMap<Integer,String[]> listaPedidosEscala=null;
		if(scale==1)
			listaPedidosEscala = baPedidos.getListaPedidosEscala1();
		else
			listaPedidosEscala = baPedidos.getListaPedidosEscala2();		

		
		Logger.info("Cantidad horas en escala: "+listaPedidosEscala.size());
			
		GestorCiudades gc=GestorCiudades.getInstance();
		Logger.info("Se leyo informacion con exito");	
		
		String [] pedidos = null;
		pedidos = listaPedidosEscala.get(toIntExact(time));
		
		Paquete pk = new Paquete();
		if(toIntExact(time)==listaPedidosEscala.size()){
			pk.stop=1;//para que el front sepa que ya se debe terminar de iterar
		}else{
			pk.stop=0;//para que en el front sepa que se seguira iterando
		}
		pk.factible=0;

		
		
		
		Logger.info("Cantidad paquetes: "+pedidos.length+"-"+time);
		Gson gson = new Gson();
		
		Boolean todosFactibles=true;
		for(int i=0;i<pedidos.length && todosFactibles && !pausa;i++){			
			String [] datosPaquete = pedidos[i].trim().split("-");//0:id 1:fecha 2:hora 3:ciudad origen 4:ciudad fin					
			Logger.info("Va a entrar a DFS");
			RutaEscogida mejorRuta=gc.DFS(datosPaquete[3],datosPaquete[4],1,datosPaquete[2],1,datosPaquete[1]);
			Logger.info("Salio de DFS");
			String resultado=null;
			if(mejorRuta.getEstadoRuta()==0){//0 es Factible
				resultado="Numpedido: "+i+" "+pedidos[i]+" Ruta: "+ mejorRuta.imprimirRecorrido();
				String resultadoJSON=(String)gson.toJson(mejorRuta, RutaEscogida.class);
				SimpleChat.notifyAll(resultadoJSON);//Acá se podría mandar un Json con los datos del paquete
				
			}else{
				/*Logger.info("Entro aca Estado: "+mejorRuta.getEstadoRuta());
				Logger.info("Id: "+datosPaquete[0]);
				Logger.info("fecha: "+datosPaquete[1]);
				Logger.info("Hora: "+datosPaquete[2]);
				Logger.info("Ciudad Origen: "+datosPaquete[3]);
				Logger.info("Ciudad Fin: "+datosPaquete[4]);*/
				
				if(mejorRuta.getEstadoRuta()!=1){//Si se cae por condición de capacidades
					todosFactibles=false;
					Logger.info("Entro aca Estado: "+mejorRuta.getEstadoRuta());
					pk.factible=mejorRuta.getEstadoRuta();
					pk.stop=1;//para que el front sepa que ya se debe terminar de iterar
					pk.id=datosPaquete[0];
					pk.fecha=datosPaquete[1];
					pk.hora=datosPaquete[2];
					pk.origen=datosPaquete[3];
					pk.destino=datosPaquete[4];
				}
				resultado="Numpedido: "+i+" No se encontro ruta - Ciudad Origen: "+ datosPaquete[3]+" Ciudad Fin: "+datosPaquete[4];	
			}	
			//SimpleChat.notifyAll(resultado);
			Logger.info(resultado);
		}
		return ok(Json.toJson(pk));
	}
	
	
    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
