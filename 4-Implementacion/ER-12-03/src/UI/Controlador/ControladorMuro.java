
package UI.Controlador;

import Dominio.Muro.Entrada;
import Dominio.Muro.GestorEntradas;
import Dominio.Usuario.GestorUsuarios;
import Dominio.Usuario.Usuario;
import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Muro;
import UI.Interfaz.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 *
 * @author Pablo Paz (pablo.paz)
 */
public class ControladorMuro {

    public ControladorMuro(final Muro vista, final Usuario usuario, 
            final GestorUsuarios gUsuarios, final GestorEntradas gEntradas) {
        
        vista.setPublicarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               String contenido = vista.getContenido();
               gEntradas.publicarEntrada(usuario.getMuro(), usuario, contenido);
               vista.actualizar();
            }
        });
        
        vista.setAceptarAmistadListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario remitente = vista.getSelectedUserPeticiones();
                gUsuarios.aceptarAmistad(usuario, remitente);
                vista.actualizar();
            }
        });
        
         vista.setRechazarPeticion(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Usuario remitente = vista.getSelectedUserPeticiones();
               gUsuarios.rechazarAmistad(usuario, remitente);
               vista.actualizar();
            }
        });
         
        vista.setVerPerfilListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario perfil = vista.getSelectedUserAmigos();
                Perfil p = new Perfil(perfil);
                new ControladorPerfil(p);
                p.setVisible(true);
            }
        });
        
       
    }
    
}
