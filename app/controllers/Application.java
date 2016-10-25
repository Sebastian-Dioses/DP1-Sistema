package controllers;

import play.mvc.*;

import views.html.*;


public class Application extends Controller {
    
    public static Result index() {            
        return ok(views.html.index.render("Titulo"));
    }
    

    public static Result test(){
        return ok(views.html.registrarPedido.render("YA SALIO LA BIENVENIDA PAPA"));
    }
    

    public static Result simulation() {            
        return ok(views.html.simulation.render("Titulo"));
    }

    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }
<<<<<<< HEAD
=======
	
	public static Result users() {            
        return ok(views.html.users.render("Titulo"));
    }
>>>>>>> origin/JL

}
