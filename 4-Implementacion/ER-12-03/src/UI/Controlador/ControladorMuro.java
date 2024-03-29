
package UI.Controlador;

import Dominio.Muro.GestorEntradas;
import Dominio.Usuario.GestorUsuarios;
import Dominio.Usuario.Usuario;
import UI.Interfaz.Muro;
import UI.Interfaz.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            }
        });
        
        vista.setAceptarAmistadListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario remitente = vista.getSelectedUserPeticiones();
                gUsuarios.aceptarAmistad(usuario, remitente);
            }
        });
        
         vista.setRechazarPeticion(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Usuario remitente = vista.getSelectedUserPeticiones();
               gUsuarios.rechazarAmistad(usuario, remitente);
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
        
        vista.setEnviarPeticion(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               int destinatarioInt = vista.getSelectedUser();
               Usuario destinatario = vista.getUsuariosRestantes().get(destinatarioInt);
               gUsuarios.solicitarAmistad(usuario, destinatario);
            }
        });
        
        vista.setVerUsuarioListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               int destinatarioInt = vista.getSelectedUser();
               Usuario destinatario = vista.getUsuariosRestantes().get(destinatarioInt);
               Perfil p = new Perfil(destinatario);
               new ControladorPerfil(p);
               p.setVisible(true);
            }
        });
       
    }
    
}
