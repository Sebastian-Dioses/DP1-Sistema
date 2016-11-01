package javaguide.sql;

import javax.inject.Inject;

package controllers;

import play.mvc.*;

import views.html.*;

import com.avaje.ebean.Ebean;

import com.avaje.ebean.Transaction;

import play.data.*;

import static play.data.Form.*;

import models.*;

import javax.persistence.PersistenceException;

public class Application extends Controller {
    
    private Database db;

    @Inject
    public Application(Database db) {
        this.db = db;
    }

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
	
	public static Result users() {            
        return ok(views.html.users.render("Titulo"));
    }

	public static Result newuser() {            
        return ok(views.html.newuser.render("Titulo"));
    }
	
	public Result GO_HOME = Results.redirect(
        routes.HomeController.list(0, "name", "asc", "")
    );
    
    /**
     * Handle default path requests, redirect to computers list
     */
    public Result showDB() {
        return GO_HOME;
    }

    /**
     * Display the paginated list of computers.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public Result list(int page, String sortBy, String order, String filter) {
        return ok(
            views.html.list.render(
                Computer.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
}
