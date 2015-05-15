package Dominio.Muro;

import Dominio.Usuario.Usuario;
import UI.Interfaz.Observador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class Muro {
    
    private int id;
    private Usuario dueno;
    
    private List<Entrada> entradas = new ArrayList<>();
    
    private List<Observador> escuchadores = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getDueno() {
        return dueno;
    }

    public void setDueno(Usuario dueno) {
        this.dueno = dueno;
    }
    
    public List<Entrada> getEntradas(){
        return entradas;
    }
    
    public void addEntrada(Entrada e){
        entradas.add(e);
        actualizarObservadores();
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
}
