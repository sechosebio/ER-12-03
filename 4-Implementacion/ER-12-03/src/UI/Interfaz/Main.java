package UI.Interfaz;

import Dominio.Muro.GestorEntradas;
import Dominio.Usuario.GestorUsuarios;
import Dominio.Usuario.Usuario;
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
        GestorUsuarios gUsuarios = new GestorUsuarios();
        GestorEntradas gEntradas = new GestorEntradas();
        ControladorPrincipal ctrlPrin = new ControladorPrincipal(principal,gUsuarios);
        
        //Cargar datos fake
        Usuario u1 = gUsuarios.registrarUsuario("Eduardo","Primer Apellido","Segundo Apellido","eduardo","");
        Usuario u2 = gUsuarios.registrarUsuario("Pepe","Primer Apellido","Segundo Apellido","pepe","");
        Usuario u3 = gUsuarios.registrarUsuario("Javier","Primer Apellido","Segundo Apellido","javi","");
        gUsuarios.aceptarAmistad(u1,u2);
        gUsuarios.aceptarAmistad(u1,u3);
        gEntradas.publicarEntrada(u1.getMuro(), u1, "Hola esto es fake");
        gEntradas.publicarEntrada(u1.getMuro(), u1, "Hola esto es fake 2");
        gEntradas.publicarEntrada(u1.getMuro(), u1, "Hola esto es fake  3");
        
        //ControladorRegistroUsuario ctrRegistro;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal.setVisible(true);
            }
        });
    }
}
