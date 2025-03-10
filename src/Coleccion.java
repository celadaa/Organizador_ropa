import java.util.ArrayList;
import java.util.List;

/**
 * Clase Coleccion representa una colección de prendas de ropa.
 */
public class Coleccion {
    private String nombre;
    private List<Prenda> prendas;

    // Constructor
    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.prendas = new ArrayList<>();
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar una prenda a la colección
    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    // Método para eliminar una prenda de la colección
    public void eliminarPrenda(Prenda prenda) {
        prendas.remove(prenda);
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colección: " + nombre + "\n");
        for (Prenda prenda : prendas) {
            sb.append("  " + prenda.toString() + "\n");
        }
        return sb.toString();
    }
}
