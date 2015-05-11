package Dominio.Muro;

import Dominio.Usuario.Usuario;

/**
 *
 * @author jose
 */
public class Muro {
    
    private int id;
    private Usuario dueno;

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
    
    
}
