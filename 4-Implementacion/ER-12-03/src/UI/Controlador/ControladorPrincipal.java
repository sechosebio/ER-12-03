package UI.Controlador;

import Dominio.Muro.GestorEntradas;
import Dominio.Usuario.GestorUsuarios;
import Dominio.Usuario.Usuario;
import UI.Interfaz.Muro;
import UI.Interfaz.Perfil;
import UI.Interfaz.Principal;
import UI.Interfaz.RegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ControladorPrincipal {
    
    Principal vista;
    GestorUsuarios gUsuarios;
    Muro muro;

    public ControladorPrincipal(Principal ventanaPrincipal, final GestorUsuarios gUsuarios, final GestorEntradas gEntradas) {
        this.vista = ventanaPrincipal;
        this.gUsuarios = gUsuarios;
        this.muro = muro;
        
        vista.setIniciarSesionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String email = vista.getEmail();
                 
                if(gUsuarios.existeUsuario(email)){
                    Usuario usuario = gUsuarios.obtenerPerfil(email);
                    
                    List<Usuario> todosUsuarios = gUsuarios.getUsuarios();
                    Muro m = new Muro(usuario,todosUsuarios);
                    m.setVisible(true);
                    new ControladorMuro(m, usuario, gUsuarios, gEntradas);
                }else{
                    JOptionPane.showMessageDialog(vista, "Usuario no existe");
                    System.out.println("No existe");
                }
            }
        });
        
        vista.setNuevoUsuarioListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroUsuario vntRegistroUsuario = new RegistroUsuario();
                vntRegistroUsuario.setVisible(true);
                new ControladorRegistroUsuario(vntRegistroUsuario, gUsuarios, gEntradas);
            }
        });
        
    }
    
    
    
}
