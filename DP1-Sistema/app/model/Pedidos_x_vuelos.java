package models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;
import org.joda.time.DateTime;
import play.db.jpa.JPA;

import java.util.Date;
import java.util.List;


@Entity
public class Pedidos_x_vuelos {
    @Id @GeneratedValue
    public Long pedidos_id;
    @NotNull
    public String pedidos_personas_id;
    @NotNull
    public String vuelos_id;
    @NotNull
    public DateTime fecha_salida;
    @NotNull
    public DateTime fecha_llegada;

    private Pedidos_x_vuelos(){

    }

    public Pedidos_x_vuelos(Long pedidos_id, String pedidos_personas_id, String vuelos_id, DateTime fecha_salida, DateTime fecha_llegada){
        this.pedidos_id=pedidos_id;
        this.pedidos_personas_id=pedidos_personas_id;
        this.vuelos_id=vuelos_id;        
        this.fecha_salida=fecha_salida;
        this.fecha_llegada=fecha_llegada;                    
    }
    
        
    public static List<Pedidos_x_vuelos> getAll(){                   
        TypedQuery<Pedidos_x_vuelos> query = JPA.em().createQuery(
           "FROM Pedidos_x_vuelos", Pedidos_x_vuelos.class);
        return query.getResultList();                  
    }


}
