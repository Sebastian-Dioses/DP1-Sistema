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
public class Usuarios {
    @Id @GeneratedValue
    public Long idusuario;
    @NotNull
    public String nombre;
    @NotNull
    public String contrasena;
    @NotNull
    public DateTime fecha_creacion;
    @NotNull
    public Long persona_idpersona;

    private Usuarios(){

    }

    public Usuarios(Long idusuario, String nombre, String contrasena, DateTime fecha_creacion, Long persona_idpersona){
        this.idusuario=idusuario;
        this.nombre=nombre;
        this.contrasena=contrasena;        
        this.fecha_creacion=fecha_creacion;
        this.persona_idpersona=persona_idpersona;                    
    }
    
        
    public static List<Usuarios> getAll(){                   
        TypedQuery<Usuarios> query = JPA.em().createQuery(
           "FROM Usuarios", Usuarios.class);
        return query.getResultList();                  
    }


}
