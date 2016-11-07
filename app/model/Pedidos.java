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
public class Pedidos {
    @Id @GeneratedValue
    public Long idpedidos;
    @NotNull
    public String ciudad_origen;
    @NotNull
    public String ciudad_destino;
    @NotNull
    public DateTime fecha_registro;
    @NotNull
    public Long persona_idpersona;

    private Pedidos(){

    }

    public Pedidos(Long idpedidos, String ciudad_origen, String ciudad_destino, DateTime fecha_registro, Long persona_idpersona){
        this.idpedidos=idpedidos;
        this.ciudad_origen=ciudad_origen;
        this.ciudad_destino=ciudad_destino;
        this.fecha_registro=fecha_registro;
        this.persona_idpersona=persona_idpersona;                    
    }
    
        
    public static List<Pedidos> getAll(){                   
        TypedQuery<Pedidos> query = JPA.em().createQuery(
           "FROM Pedidos", Pedidos.class);
        return query.getResultList();                  
    }


}
