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
public class Usuarios {
    @Id @GeneratedValue
    public Long id=null;
    @NotNull
    public String nombre;
    @NotNull
    public String contraseña;  
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    public Personas personas_id;

    private Usuarios(){

    }

    public Usuarios(String nombre, String contraseña, Personas personas_id){
        this.nombre=nombre;
        this.contraseña=contraseña;        
        this.personas_id=personas_id;                    
    }
    
        
    public static List<Usuarios> getAll(){                   
        TypedQuery<Usuarios> query = JPA.em().createQuery(
           "FROM Usuarios", Usuarios.class);
        return query.getResultList();                  
    }

    public void save(){
        JPA.em().persist(this);
        JPA.em().flush();
    }
}
