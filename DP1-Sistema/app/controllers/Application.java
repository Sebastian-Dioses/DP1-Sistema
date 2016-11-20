package controllers;

import models.Ciudades;
import models.Vuelos;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import play.libs.Json;

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

	public static class DummmyClass{
		public Long a;
		public Long b;
	}

	
	public static Result requestPackage(Long scale, Long time){
		DummmyClass dc= new DummmyClass();
		dc.a = scale;
		dc.b = time;
		
		return ok(Json.toJson(dc));
	}
	
    public static Result login() {            
        return ok(views.html.login.render("Titulo"));
    }   
    
}
