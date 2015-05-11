package Dominio.Usuario;

/**
 *
 * @author jose
 */
public class Video extends Multimedia {
    
    
    private int tamano;
    private int duracion;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
