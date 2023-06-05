
package com.desafio.login.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "ROL")
    private String rolName;
    private String descripcion;
    
    // Relación bidireccional JPA
    @OneToMany(mappedBy = "rol")
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(int id, String rolName, String descripcion, List<Usuario> listaUsuarios) {
        this.id = id;
        this.rolName = rolName;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}
