package UI.Controlador;

import Dominio.Usuario.Usuario;
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

    ControladorRegistroUsuario(final RegistroUsuario vista) {
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
               usuario = new Usuario(nombre,prApellido,sgApellido,email,pass);
               
            }
        });
    }
    
    
}
