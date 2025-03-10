/**
 * Clase Prenda representa una prenda de ropa, que tiene un tipo de ropa, un color y una talla.
 */
public class Prenda {
    private TipoRopa ropa;
    private String color;
    private int talla;

    // Constructor
    public Prenda(TipoRopa ropa, String color, int talla) {
        this.ropa = ropa;
        this.color = color;
        this.talla = talla;
    }

    // Getters y Setters
    public TipoRopa getRopa() {
        return ropa;
    }

    public void setRopa(TipoRopa ropa) {
        this.ropa = ropa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Prenda: " + ropa + " - Color: " + color + " (Talla: " + talla + ")";
    }
}
