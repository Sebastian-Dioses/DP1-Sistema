package controllers;

import models.Ciudades;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.ciudad.*;

import play.Logger;
import org.joda.time.LocalDateTime;
import org.joda.time.DateTime;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.JPA;

import play.mvc.Security;

@Security.Authenticated(SecuredC.class)
public class CiudadesC extends Controller {
    @play.db.jpa.Transactional(readOnly=true)        
	public static Result index() {            
        return ok(views.html.ciudad.index.render(Ciudades.getAll()));
    }

	public static Result newO() {            
        return ok(views.html.ciudad.newCiudad.render("Titulo"));
    }

    @play.db.jpa.Transactional
    public static Result create() {
        try{
            DynamicForm requestData = Form.form().bindFromRequest();

            String cod_ciudad = requestData.get("cod_ciudad");
            String nombre = requestData.get("nombre");
            String pais = requestData.get("pais");
            String abreviado = requestData.get("abreviado");
            int capacidad_almacen = Integer.parseInt(requestData.get("capacidad_almacen"));
            
            Ciudades city = new Ciudades(cod_ciudad, nombre, pais, abreviado, capacidad_almacen); 
           
            city.save();

            flash("success", "El pedido fue creado con éxito");
            return redirect(controllers.routes.CiudadesC.index());

        }catch (Exception e){

            Logger.error(e.getMessage());
            flash("error", "Ocurrió un Error");
            return redirect(controllers.routes.CiudadesC.index());
        }

    }
	
    @play.db.jpa.Transactional      
    public static Result delete(String idCiudad) {            
        Ciudades.delete(idCiudad);
        return ok(views.html.ciudad.index.render(Ciudades.getAll()));
    }
}
