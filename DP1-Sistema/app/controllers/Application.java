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

	public static class Paquete{
		public Long id;
		public Long fecha;
		public String hora;
		public String origen;
		public String destino;
		public String ruta;
	}

	
	public static Result requestPackage(Long scale, Long time){
		//Se debe correr todos los paquetes que calcen en ese periodo de tiempo y escala
		
		Gson gson = new Gson();
		BufferArchivos baPedidos = new BufferArchivos();
		
        try (Reader reader = new FileReader( Play.application().getFile("/conf/pedidosArutear.json"))) {
			baPedidos=gson.fromJson(reader, BufferArchivos.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		String [] pedidos = null;
		if(scale==1){
			pedidos = baPedidos.getListaPedidosEscala1().get(toIntExact(time));
		}else if(scale==3){
			pedidos = baPedidos.getListaPedidosEscala2().get(toIntExact(time));		
		}else{
			pedidos = baPedidos.getListaPedidosEscala3().get(toIntExact(time));
		}
		
		GestorCiudades gc=GestorCiudades.getInstance();
		
		Logger.info("Cantidad paquetes: "+pedidos.length+"-"+time);
		for(int i=0;i<pedidos.length;i++){
			String [] datosPaquete = pedidos[i].trim().split("-");//0:fecha 1:hora 2: ciudad origen 3: ciudad fin			
			//Logger.info(datosPaquete[0]);
			//Logger.info(datosPaquete[1]);
			//Logger.info(datosPaquete[2]);
			//Logger.info(datosPaquete[3]);
			
			
			RutaEscogida mejorRuta=gc.DFS(datosPaquete[2],datosPaquete[3],1,datosPaquete[1],1,datosPaquete[0]);
			
			if(mejorRuta.getEstadoRuta()==0){//0 es Factible
				Logger.info("Numpedido: "+i+" "+pedidos[i]+" Ruta: "+ mejorRuta.imprimirRecorrido());
			}else{
				Logger.info("Numpedido: "+i+" No se encontro ruta - Ciudad Origen: "+ datosPaquete[2]+" Ciudad Fin: "+datosPaquete[3]);
			}
		}
		
		Paquete pk = new Paquete();
		pk.hora="12:20";
		pk.origen="ABCD";
		pk.destino="EFGH";
		
		return ok(Json.toJson(pk));
	}
	
    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
