package UI.Controlador;

import Dominio.Muro.Muro;
import Dominio.Usuario.GestorUsuarios;
import Dominio.Usuario.Usuario;
import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Perfil;
import UI.Interfaz.RegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jose
 */
public class ControladorRegistroUsuario {
    
    Usuario usuario;
    RegistroUsuario vista;

    ControladorRegistroUsuario(final RegistroUsuario vista, final GestorUsuarios gUsuarios) {
        this.usuario = usuario;
        this.vista = vista;
        
        vista.setRegistrarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String nombre = vista.getNombre();
               String prApellido = vista.getPrimerApellido();
               String sgApellido = vista.getSegundApellido();
               String email = vista.getEmail();
               String pass = vista.getContrasena();
               gUsuarios.registrarUsuario(nombre, prApellido, sgApellido, email, nombre);
               vista.dispose();
               Perfil perfil = new Perfil(usuario);
               perfil.setVisible(true);
               new ControladorPerfil(perfil);
            }
        });
    }
    
    
}
