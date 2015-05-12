package ServiciosTecnicos.Persistencia;

import Dominio.Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Persistencia {
    
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Persistencia() {
        usuarios.add(new Usuario("Eduardo","Primer Apellido","Segundo Apellido","eduardo",""));
        
    }
    
    public boolean existeUsuario(String email){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail()== email){
                return true;
            }
        }
        return false;
    }

}
