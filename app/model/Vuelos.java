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
public class Vuelos {
    @Id @GeneratedValue
    public Long id;
    @NotNull
    public String ciudad_origen;
    @NotNull
    public String ciudad_destino;
    @NotNull
    public DateTime hora_salida;
    @NotNull
    public DateTime hora_llegada;

    private Vuelos(){

    }

    public Vuelos(String ciudad_origen, String ciudad_destino, DateTime hora_salida, DateTime hora_llegada){
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


}
