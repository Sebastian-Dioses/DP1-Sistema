package models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
//import org.joda.time.LocalDateTime;
//import org.joda.time.DateTime;
import play.db.jpa.JPA;

import java.util.Date;
import java.util.List;


@Entity
public class Pedidos {
    @Id @GeneratedValue
    public Long id=null;
    @NotNull
    public String ciudad_origen;
    @NotNull
    public String ciudad_destino;
    @NotNull
    public Long personas_id;

    private Pedidos(){

    }

    public Pedidos(String ciudad_origen, String ciudad_destino, Long personas_id){
        this.ciudad_origen=ciudad_origen;
        this.ciudad_destino=ciudad_destino;
        this.personas_id=personas_id;                    
    }
    
        
    public static List<Pedidos> getAll(){                   
        TypedQuery<Pedidos> query = JPA.em().createQuery(
           "FROM Pedidos", Pedidos.class);
        return query.getResultList();                  
    }

    public void save(){
        JPA.em().persist(this);
        JPA.em().flush();
    }

}
