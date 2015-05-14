
package UI.Controlador;

import Dominio.Muro.Entrada;
import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Interfaz.Muro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 *
 * @author Pablo Paz (pablo.paz)
 */
public class ControladorMuro {

    public ControladorMuro(final Muro vista, final Dominio.Muro.Muro muro) {
        
        vista.setPublicarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               String contenido = vista.getContenido();
               muro.addEntrada(new Entrada(Calendar.getInstance(), contenido));
               vista.actualizar();
            }
        });
    }
    
}
