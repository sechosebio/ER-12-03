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
        /*
        Entrada e1, e2, e3;
        e1 = new Entrada(Calendar.getInstance(), "Entrada 1");
        e2 = new Entrada(Calendar.getInstance(), "Entrada dos, asdfasdfasd");
        e3 = new Entrada(Calendar.getInstance(), "Entrada 3");
        Muro m1 = new Muro();
        m1.addEntrada(e1);
        m1.addEntrada(e2);
        m1.addEntrada(e3);
        Usuario u1, u2, u3;
        u1 = new Usuario("Eduardo","Primer Apellido","Segundo Apellido","eduardo","");
        u2 = new Usuario("Pepe","Primer Apellido","Segundo Apellido","pepe","");
        u3 = new Usuario("Javier","Primer Apellido","Segundo Apellido","javi","");
        u1.addAmigo(u2);
        u2.addAmigo(u1);
        u1.addAmigo(u3);
        u3.addAmigo(u1);
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);*/
        
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
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
