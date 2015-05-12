package UI.Interfaz;

import ServiciosTecnicos.Persistencia.Persistencia;
import UI.Controlador.ControladorPrincipal;
import UI.Controlador.ControladorRegistroUsuario;

/**
 *
 * @author jose
 */
public class Main {
    
   /**
     * @param args the command line arguments
    */
    public static void main(String args[]) {
      
        final Principal principal  = new Principal();
        Persistencia persistencia = new Persistencia();
        ControladorPrincipal ctrPrincipal = new ControladorPrincipal(principal,persistencia);
        //ControladorRegistroUsuario ctrRegistro;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal.setVisible(true);
            }
        });
    }
}
