
package com.desafio.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombreUsuario;
    private String password;
    
    // Relación bidireccional JPA
    @ManyToOne
    // foreign key
    @JoinColumn(name = "fk_rol")
    private Rol rol;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String password, Rol rol) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol = rol;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    
}
