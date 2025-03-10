/**
 * Clase TipoRopa representa el tipo de ropa.
 */
public class TipoRopa {
    private String nombre;

    // Constructor
    public TipoRopa(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
