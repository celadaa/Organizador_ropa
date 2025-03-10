import java.util.ArrayList;
import java.util.List;

/**
 * Clase Tienda simula una tienda que contiene varias colecciones de prendas de ropa.
 */
public class Tienda {
    private List<Coleccion> colecciones;

    // Constructor
    public Tienda() {
        colecciones = new ArrayList<>();
    }

    // Método para agregar una colección
    public void agregarColeccion(Coleccion coleccion) {
        colecciones.add(coleccion);
    }

    // Método para eliminar una colección
    public void eliminarColeccion(Coleccion coleccion) {
        colecciones.remove(coleccion);
    }

    public List<Coleccion> getColecciones() {
        return colecciones;
    }

    // Método para mostrar todas las colecciones y sus prendas
    public void mostrarColecciones() {
        System.out.println("=== Colecciones en la Tienda ===");
        for (Coleccion coleccion : colecciones) {
            System.out.println(coleccion.toString());
        }
    }
}
