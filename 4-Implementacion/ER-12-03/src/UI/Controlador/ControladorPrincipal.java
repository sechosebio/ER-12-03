package UI.Controlador;

import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Muro;
import UI.Interfaz.Principal;
import UI.Interfaz.RegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ControladorPrincipal {
    
    Principal vista;
    Persistencia persistencia;
    Muro muro;

    public ControladorPrincipal(Principal ventanaPrincipal, final Persistencia persistencia) {
        this.vista = ventanaPrincipal;
        this.persistencia = persistencia;
        this.muro = muro;
        
        vista.setIniciarSesionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String email = vista.getEmail();
                 
                if(persistencia.existeUsuario(email)){
                    Dominio.Muro.Muro muro = persistencia.getUser(email).getMuro();
                    Muro m= new Muro(muro);
                    m.setVisible(true);
                    new ControladorMuro(m, persistencia, muro);
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
                new ControladorRegistroUsuario(vntRegistroUsuario, persistencia);
            }
        });
        
    }
    
    
    
}
