package controllers;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.pedido.*;

import play.Logger;
//import org.joda.time.LocalDateTime;
//import org.joda.time.DateTime;
import java.util.List;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.JPA;

import play.libs.Json;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.File;

import play.Play; 
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import play.mvc.Security;

@Security.Authenticated(SecuredC.class)
public class PedidosC extends Controller {
    @play.db.jpa.Transactional      
	public static Result index() {            
        return ok(views.html.pedido.index.render(Pedidos.getAll()));
    }

	public static Result newO() {            
        return ok(views.html.pedido.newPedido.render("Titulo"));
    }

    @play.db.jpa.Transactional
    public static Result create() {
        try{
            DynamicForm requestData = Form.form().bindFromRequest();

            String ciudad_origen = requestData.get("ciudad_origen");
            String ciudad_destino = requestData.get("ciudad_destino");
            Long personas_id = new Long(Integer.parseInt(requestData.get("personas_id")));
            
            Pedidos pedido = new Pedidos(ciudad_origen, ciudad_destino, personas_id); 
           
            //Aca se debe llamar al algoritmo
			Logger.info("Se lee informacion para el algoritmo");
			
			Gson gson = new Gson();
			GestorCiudades temporal= new GestorCiudades();
			try (Reader reader = new FileReader( Play.application().getFile("/conf/staff.json"))) {
				temporal=gson.fromJson(reader, GestorCiudades.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
			Logger.info("Se leyo informacion con exito");
			
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			DateFormat hourFormat = new SimpleDateFormat("HH:mm");
			
			Date date = new Date();
			
			
			RutaEscogida mejorRuta=temporal.DFS(ciudad_origen,ciudad_destino,1,hourFormat.format(date),1,dateFormat.format(date));
			
			if(mejorRuta.getEstadoRuta()==0){//0 es Factible
				pedido.save();
				
				Logger.info("Ruta: "+ mejorRuta.imprimirRecorrido());
				
				Logger.info("ID Pedido "+pedido.id);
				
				Logger.info("Longitud lista: "+mejorRuta.getListaRutaEscogida().size());
				
				for(int i=0;i<mejorRuta.getListaRutaEscogida().size();i++){
					Ruta r = mejorRuta.getListaRutaEscogida().get(i);
					Vuelos v = Vuelos.getIdByOtherValues(r.getCiudadOrigen(),r.getCiudadFin(), hourFormat.parse(r.getHoraOrigen()), hourFormat.parse(r.getHoraFin()));
					Logger.info("Se encontro vuelo");
					
					Integer tiempoEspera = mejorRuta.getTiemposEspera().get(i);
					Integer tiemposTraslado = mejorRuta.getTiemposTraslado().get(i);
					
					Pedidos_x_vuelos pXV = new Pedidos_x_vuelos(pedido.id,personas_id,v.id,i,tiempoEspera,tiemposTraslado);
					Logger.info("Se creo pedidoXvuelo");
					
					pXV.save();
					Logger.info("Se guardo pedidoXvuelo");
				}
				
				flash("success", "El pedido fue creado con éxito");
			}else{
				Logger.info("No se encontro ruta");
				flash("error", "No se encontro ruta para el paquete");
			}

            
            return redirect(controllers.routes.PedidosC.index());

        }catch (Exception e){

            Logger.error(e.getMessage());
            flash("error", "Ocurrió un Error");
            return redirect(controllers.routes.PedidosC.index());
        }

    }
	
    @play.db.jpa.Transactional      
    public static Result detail(Long idPedido) {            
        return ok(views.html.pedido.detail.render(Pedidos.getById(idPedido)));
    }

    @play.db.jpa.Transactional      
    public static Result delete(Long idPedido) {            
        Pedidos.delete(idPedido);
        return ok(views.html.pedido.index.render(Pedidos.getAll()));
    }
}
