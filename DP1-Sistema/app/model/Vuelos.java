package models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import play.db.jpa.JPA;

import java.util.Date;
import java.util.List;


@Entity
public class Vuelos {
    @Id @GeneratedValue
    public Long id;
    @NotNull
    public String ciudad_origen;
    @NotNull
    public String ciudad_destino;
    @NotNull
    public Date hora_salida;
    @NotNull
    public Date hora_llegada;

    private Vuelos(){

    }

    public Vuelos(String ciudad_origen, String ciudad_destino, Date hora_salida, Date hora_llegada){
        this.ciudad_origen=ciudad_origen;
        this.ciudad_destino=ciudad_destino;        
        this.hora_salida=hora_salida;
        this.hora_llegada=hora_llegada;                    
    }
    
        
    public static List<Vuelos> getAll(){                   
        TypedQuery<Vuelos> query = JPA.em().createQuery(
           "FROM Vuelos", Vuelos.class);
        return query.getResultList();                  
    }

    public void save(){
        JPA.em().persist(this);
        JPA.em().flush();
    }

    public static Vuelos getById(Long id){
        
        Vuelos t = JPA.em().find(Vuelos.class, id);
        
        return t;
    }

    public static void delete(Long id){
        Vuelos p = Vuelos.getById(id);
        JPA.em().remove(p);
    }
}
