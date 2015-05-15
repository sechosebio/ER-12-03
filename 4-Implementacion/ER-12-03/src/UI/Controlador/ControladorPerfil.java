
package UI.Controlador;

import Dominio.Usuario.Usuario;
import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pablo Paz (pablo.paz)
 */
public class ControladorPerfil {

    public ControladorPerfil(final Perfil vista) {
        
        vista.setVerPerfilListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario perfil = vista.getSelectedUserAmigos();
                Perfil p = new Perfil(perfil);
                new ControladorPerfil(p);
                vista.dispose();
                p.setVisible(true);
            }
        });
    }

}
