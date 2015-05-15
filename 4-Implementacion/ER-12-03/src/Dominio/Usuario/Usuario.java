
package Dominio.Usuario;

import Dominio.Muro.Muro;
import UI.Interfaz.Observador;
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
    private List<Usuario> amigos = new ArrayList<Usuario>();
    private List<Usuario> peticionesEnviadas = new ArrayList<Usuario>();
    private List<Usuario> peticionesRecibidas = new ArrayList<Usuario>();
    
    private List<Observador> escuchadores = new ArrayList<>();

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

    public List<Usuario> getPeticionesEnviadas() {
        return peticionesEnviadas;
    }

    public void setPeticionesEnviadas(List<Usuario> peticionesEnviadas) {
        this.peticionesEnviadas = peticionesEnviadas;
        actualizarObservadores();
    }

    public List<Usuario> getPeticionesRecibidas() {
        System.out.println("Peticiones recibidas" + peticionesRecibidas.size());
        return peticionesRecibidas;
    }

    public void setPeticionesRecibidas(List<Usuario> peticionesRecibidas) {
        this.peticionesRecibidas = peticionesRecibidas;
        actualizarObservadores();
    }
    
    
    public void addAmigo(Usuario amigo) {
        amigos.add(amigo);
        actualizarObservadores();
    }
    
    private List<Usuario> recibirPeticionAmistad(Usuario emisor){
        this.peticionesRecibidas.add(emisor);
        actualizarObservadores();
        return peticionesRecibidas;
    }
    
    public List<Usuario> enviarPeticionAmistad(Usuario amigo){
        System.out.println(this.getNombre() + "envia petición a " + amigo.getNombre());
        this.peticionesEnviadas.add(amigo);
        amigo.recibirPeticionAmistad(this);
        actualizarObservadores();
        return peticionesEnviadas;
    }
    
    public List<Usuario> eliminarPeticionRecibida(Usuario usuario){
        this.peticionesRecibidas.remove(usuario);
        actualizarObservadores();
        return peticionesRecibidas;
    }
    public List<Usuario> rechazarPeticionAmistad(Usuario emisor){
        this.peticionesRecibidas.remove(emisor);
        actualizarObservadores();
        return peticionesRecibidas;
    }
    
    public List<Usuario> amigosYPeticiones(){
        List<Usuario> amigosYPeticiones = new ArrayList<Usuario>(amigos);
        amigosYPeticiones.addAll(peticionesEnviadas);
        amigosYPeticiones.addAll(peticionesRecibidas);
        return amigosYPeticiones;
    }
    
    public void registrarObservador(Observador o){
        escuchadores.add(o);
        o.actualizar();
    }
    
    public void eliminarObservador(Observador o){
        escuchadores.remove(o);
    }
    
    private void actualizarObservadores(){
        for (Observador o : escuchadores) {
            o.actualizar();
        }
    }
    
    public Usuario(String nombre, String primerApellido, String segundoapellido,String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoapellido = segundoapellido;
        this.muro = new Muro();
    }
    
    
    
}
