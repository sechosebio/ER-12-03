package Dominio.Muro;

import Dominio.Usuario.Usuario;
import java.util.Calendar;

/**
 *
 * @author jose
 */
public class Entrada {
    
    
    private int id;
    private Calendar fecha;
    private String contenido;
    private Muro muro;
    private Usuario autor;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    
    
}
