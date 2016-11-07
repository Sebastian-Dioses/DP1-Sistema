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
public class Personas {
    @Id @GeneratedValue
    public Long idpersona;
    @NotNull
    public String nombre;
    @NotNull
    public String dni;
    @NotNull
    public String correo;
    @NotNull
    public DateTime fecha_creacion;
    @NotNull
    public Long tipo_persona;

    private Personas(){

    }

    public Personas(Long idpersona, String nombre, String dni, String correo, DateTime fecha_creacion, Long tipo_persona){
        this.idpersona=idpersona;
        this.nombre=nombre;
        this.dni=dni;
        this.correo=correo;
        this.fecha_creacion=fecha_creacion;
        this.tipo_persona=tipo_persona;                    
    }
    
        
    public static List<Personas> getAll(){                   
        TypedQuery<Personas> query = JPA.em().createQuery(
           "FROM Personas", Personas.class);
        return query.getResultList();                  
    }


}
