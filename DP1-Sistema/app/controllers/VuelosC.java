package controllers;

import models.Vuelos;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.vuelo.*;

import play.Logger;
//import org.joda.time.LocalDateTime;
//import org.joda.time.DateTime;
import java.util.Date;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.JPA;


public class VuelosC extends Controller {
    
    @play.db.jpa.Transactional   
	public static Result index() {            
        return ok(views.html.vuelo.index.render(Vuelos.getAll()));
    }
    /*
	public static Result newO() {            
        return ok(views.html.vuelo.newVuelo.render("Titulo"));
    }

    @play.db.jpa.Transactional
    public static Result create() {
        try{
            DynamicForm requestData = Form.form().bindFromRequest();

            String cuenta = requestData.get("cuenta");
            String nombre = requestData.get("nombre");
            String apellido = requestData.get("apellido");
            String dni = requestData.get("dni");
            String correo = requestData.get("correo");
            
            Personas per = new Personas(nombre, dni, correo, 1);
            
            per.save();                    

            Vuelos user = new Vuelos(cuenta, "1234", per.id); 
                            
            user.save();

            flash("success", "El pedido fue creado con éxito");
            return redirect(controllers.routes.VuelosC.index());

        }catch (Exception e){

            Logger.error(e.getMessage());
            flash("error", "Ocurrió un Error");
            return redirect(controllers.routes.VuelosC.index());
        }

    }
    */
	
}
