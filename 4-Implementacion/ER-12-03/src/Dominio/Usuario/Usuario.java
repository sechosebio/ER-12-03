
package Dominio.Usuario;

import Dominio.Muro.Muro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class Usuario {

    private int id;
    private String email;
    private String contraseña;
    private String nombre;
    private String primerApellido;
    private String segundoapellido;
    private double dinero;
    
    private Muro muro;
    private List<Usuario> amigos = new ArrayList<>();

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void addAmigo(Usuario amigo) {
        amigos.add(amigo);
    }
    
    

    public Usuario(String nombre, String primerApellido, String segundoapellido,String email, String contraseña, Muro muro) {
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoapellido = segundoapellido;
        this.muro = muro;
    }
    
    
    
}
