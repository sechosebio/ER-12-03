package Dominio.Muro;

import Dominio.Usuario.Usuario;
import java.util.Calendar;

/**
 *
 * @author jose
 */
public class Comentario {
    
    private int id;
    private String contenido;
    private Calendar fecha;
    private Entrada entrada;
    private Usuario autor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    
    
            
            
    
    
}
