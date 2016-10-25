package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    public static Result index() {
        //return ok(views.html.index.render("YA SALIO LA BIENVENIDA PAPA"));
        return ok(views.html.index.render(""));
    }
    
    public static Result test(){
        return ok(views.html.registrarPedido.render("YA SALIO LA BIENVENIDA PAPA"));
    }
    
}
