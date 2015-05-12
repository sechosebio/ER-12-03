package ServiciosTecnicos.Persistencia;

import Dominio.Muro.Entrada;
import Dominio.Muro.Muro;
import Dominio.Usuario.Usuario;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author jose
 */
public class Persistencia {
    
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Persistencia() {
        Entrada e1, e2, e3;
        e1 = new Entrada(Calendar.getInstance(), "Entrada 1");
        e2 = new Entrada(Calendar.getInstance(), "Entrada dos, asdfasdfasd");
        e3 = new Entrada(Calendar.getInstance(), "Entrada 3");
        Muro m1 = new Muro();
        m1.addEntrada(e1);m1.addEntrada(e2);m1.addEntrada(e3);
        usuarios.add(new Usuario("Eduardo","Primer Apellido","Segundo Apellido","eduardo","", m1));
        
    }
    
    public boolean existeUsuario(String email){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getEmail());
            if(usuario.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    
    public void addUser(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public Usuario getUser(String email){
        for (Usuario usuario : usuarios) {
            if(usuario.getEmail().equals(email)){
                return usuario;
            }
        }
        return null;
    }

}
