package Dominio.Muro;

import Dominio.Usuario.Usuario;
import java.util.Calendar;

/**
 *
 * @author jose
 */
public class GestorEntradas {
    
    public void publicarEntrada(Muro muro, Usuario u, String en){
        
        muro.addEntrada(new Entrada(Calendar.getInstance(),en));
        
        
    }
}
