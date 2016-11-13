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
public class Ciudades {
    @Id
    @NotNull
    public String cod_ciudad;
    @NotNull
    public String nombre;
    @NotNull
    public String pais;
    @NotNull
    public String abreviado;
    @NotNull
    public int capacidad_almacen;    


    private Ciudades(){

    }

    public Ciudades(String cod_ciudad, String nombre, String pais, String abreviado, int capacidad_almacen){        
        this.cod_ciudad=cod_ciudad;
        this.nombre=nombre;
        this.pais=pais;
        this.abreviado=abreviado;            
        this.capacidad_almacen=capacidad_almacen;            
    }
    
    public static List<Ciudades> getAll(){                   
        TypedQuery<Ciudades> query = JPA.em().createQuery(
           "FROM Ciudades", Ciudades.class);
        return query.getResultList();                  
    }

    public void save(){
        JPA.em().persist(this);
        JPA.em().flush();
    }
}
