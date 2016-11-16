package controllers;

import models.Pedidos;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.pedido.*;

import play.Logger;
//import org.joda.time.LocalDateTime;
//import org.joda.time.DateTime;
import java.util.Date;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.JPA;

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
           
            pedido.save();

            flash("success", "El pedido fue creado con éxito");
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
