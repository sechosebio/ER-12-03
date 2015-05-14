package Dominio.Usuario;

import Dominio.Muro.GestorEntradas;
import Dominio.Muro.Muro;
import ServiciosTecnicos.Persistencia.Persistencia;
import java.util.List;

/**
 *
 * @author jose
 */
public class GestorUsuarios {
    GestorEntradas gEntradas = new GestorEntradas();
    Persistencia persistencia = new Persistencia();
    
    /**
     * Método para obtener los usuarios de la red social
     * @return Lista de todos los usuarios de la red social
     */
    public List<Usuario> getUsuarios(){
        return persistencia.getUsuarios();
    }
    /**
     * Método para registrar un usuario en el sistema
     * @param nombre Nombre del usuario
     * @param pApellido Primer apellido del usuario
     * @param sApellido Segundo apellido del usuario
     * @param email Email del usuario con el que iniciará sesión
     * @param contrasena Contraseña
     * @return Usuario registrado en el sistema
     */
    public Usuario registrarUsuario(String nombre, String pApellido, String 
            sApellido, String email, String contrasena ){
        
        Usuario usuario = new Usuario(nombre,pApellido,sApellido,email,contrasena);
        persistencia.addUser(usuario);
        return usuario;
    }
    /**
     * Método para comprobar la existencia de un usuario
     * @param email Email del usuario a comprobar
     * @return True si existe, False caso contrario
     */
    public boolean existeUsuario(String email){
        return persistencia.existeUsuario(email);
    }
    /**
     * Método para aceptar una invitación de amistad
     * @param invitado Usuario que recibe la invitación
     * @param invitador Usuario que envía la invitación
     */
    
    public void aceptarAmistad(Usuario invitado, Usuario invitador){
        invitado.addAmigo(invitador);
        invitador.addAmigo(invitado);
        invitado.eliminarPeticionRecibida(invitador);
    }
    /**
     * Método para rechazar una petición de amistad
     * @param invitado Usuario que recibir la invitación de amistad
     * @param invitador Usuario que envía la invitación de amistad
     * @return Invitaciones actuales del usuario invitado después de rechazar
     */
    public List<Usuario> rechazarAmistad(Usuario invitado, Usuario invitador){
          return invitado.rechazarPeticionAmistad(invitador);
    }
    
    /**
     * Método para obtener el perfil de un usuario a partir del email
     * @param email Email del usuario del que se desea obtener el perfil
     * @return Perfil del usuario
     */
    public Usuario obtenerPerfil(String email){
        
        return persistencia.getUser(email);
    }
    
    /**
     * Método para obtener la lista de amigos de un usuario dado
     * @param u Usuario del que se desea obtener la lista de amigos
     * @return Lista de amigos
     */
    public List<Usuario> obtenerListaAmigos(Usuario u){
        
        return u.getAmigos();
    }
      
    /**
     * 
     * @param invitador
     * @param invitado
     * @return 
     */
    public List<Usuario> solicitarAmistad(Usuario invitador, Usuario invitado){
        
        return invitador.enviarPeticionAmistad(invitado);
    }
    /**
     * Método para obtener el muro de un usuario dado
     * @param u Usuario del que se desea obtener el muro
     * @return Muro del usuario
     */
    public Muro obtenerMuro(Usuario u){ 
        return u.getMuro();
    }
    
    
    
}
