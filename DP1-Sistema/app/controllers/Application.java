package controllers;

import models.Ciudades;
import models.Vuelos;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import play.mvc.Security;

@Security.Authenticated(SecuredC.class)
public class Application extends Controller {
    @play.db.jpa.Transactional(readOnly=true)
    public static Result index() {            
        return ok(views.html.index.render(Ciudades.getAll()));
    }
    @play.db.jpa.Transactional(readOnly=true)
    public static Result simulation() {            
        return ok(views.html.simulation.render(Ciudades.getAll(),Vuelos.getAll()));
    }

    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
