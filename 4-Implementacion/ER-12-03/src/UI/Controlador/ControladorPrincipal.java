package UI.Controlador;

import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jose
 */
public class ControladorPrincipal {
    
    Principal vista;
    Persistencia persistencia;

    public ControladorPrincipal(Principal ventanaPrincipal, final Persistencia persistencia) {
        this.vista = ventanaPrincipal;
        this.persistencia = persistencia;
        
        vista.setIniciarSesionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String email = vista.getEmail();
                if(persistencia.existeUsuario(email)){
                    
                }
            }
        });
        
    }
    
    
    
}
