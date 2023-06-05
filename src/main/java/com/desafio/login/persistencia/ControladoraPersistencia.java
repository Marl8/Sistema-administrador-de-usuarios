
package com.desafio.login.persistencia;

import com.desafio.login.logica.Rol;
import com.desafio.login.logica.Usuario;
import com.desafio.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> mostrarUsuarios() {
        
        List<Usuario> lista = usuarioJpa.findUsuarioEntities();
        return lista;
        // Es igual a -> SELECT * FROM usuarios
    }

    public List<Rol> traerRoles() {
       
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usuario) {
       usuarioJpa.create(usuario);
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace(System.out);
        }
    }   

    public Usuario traerUsuario(int idUsuario) {
       
      return usuarioJpa.findUsuario(idUsuario);
    }

    public void editarUsuario(Usuario user) {
        try {
            usuarioJpa.edit(user);
        } catch (Exception ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
