package controllers;

import play.mvc.*;

import views.html.*;


public class Application extends Controller {
    
    public static Result index() {
            
        return ok(views.html.index.render("Titulo"));
    }
    
    public static Result simulation() {
            
        return ok(views.html.simulation.render());
    }
}