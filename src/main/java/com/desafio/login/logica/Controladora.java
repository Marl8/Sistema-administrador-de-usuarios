
package com.desafio.login.logica;

import com.desafio.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
        // String mensaje = "";
        Usuario user = null;
        
        List <Usuario> listaUsuarios = controlPersis.mostrarUsuarios();
        
        for (Usuario us : listaUsuarios) {
            
            if (us.getNombreUsuario().equals(usuario)) {
                if (us.getPassword().equals(contrasenia)) {
                    
                   // mensaje = "Usuario y contraseña correctos. Bienvenido/a!!";
                   user = us;
                   return user;
                }else {
                  //  mensaje = "Contraseña incorrecta"
                  user = null;
                  return user;
                }
            }else {
                user = null;
               // mensaje = "Usuario inexistente";
            }
        }
        return user;
    }
    public List<Usuario> traerUsuarios() {
       
        return controlPersis.mostrarUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String password, String rolRecibido) {
        
        Usuario us = new Usuario();
        
        us.setNombreUsuario(usuario);
        us.setPassword(password);
        
        Rol rolEncontrado = new Rol();
        
        rolEncontrado = this.traerRoles(rolRecibido);
        if (rolEncontrado != null){
            us.setRol(rolEncontrado);
        }
        
        int id = this.buscarUlimoId();
         
        // Seteo el ID de forma manual (al Último ID registrado le asigno el siguiente número)
        us.setId(id + 1);
        
        controlPersis.crearUsuario(us);
    }

    private Rol traerRoles(String rolRecibido) {
        List<Rol> roles =  controlPersis.traerRoles();
        
        for(Rol rol : roles){
            if(rol.getRolName().equals(rolRecibido)){
                return rol;
            }
        }
        return null;
    }
    
    // Método para buscar el último ID del Usuario registrado en la base de datos

    private int buscarUlimoId() {
        List<Usuario> listaUsuario = this.traerUsuarios();
        
        // Accedo al objeto Usuario que se encuentra como último elemento de la lista
        Usuario us = listaUsuario.get(listaUsuario.size()-1);
        
        // Accedo al ID de ese último Usuario
        return us.getId();      
    }

    public void borrarUsuario(int idUsuario) {
       controlPersis.eliminarUsuario(idUsuario);
    }

    public Usuario traerUsuario(int idUsuario) {
        
     return controlPersis.traerUsuario(idUsuario);
    }

    public void editarUsuario(Usuario user, String usuario, String password, String rol) {
       
        user.setNombreUsuario(usuario);
        user.setPassword(password);
        
        Rol rolEncontrado = new Rol();
        
        rolEncontrado = this.traerRoles(rol);
        if (rolEncontrado != null){
            user.setRol(rolEncontrado);
        }
        
        controlPersis.editarUsuario(user);
    }
}
