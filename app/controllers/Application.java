package controllers;

import models.Ciudades;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

@play.db.jpa.Transactional(readOnly=true)
public class Application extends Controller {
    
    public static Result index() {            
        return ok(views.html.index.render(Ciudades.getAll()));
    }

    public static Result simulation() {            
        return ok(views.html.simulation.render("Titulo"));
    }

    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }	
	
}
