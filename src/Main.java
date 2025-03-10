public class Main {
    public static void main(String[] args) {
        // Crear objetos de TipoRopa
        TipoRopa tipoCamisa = new TipoRopa("Camisa");
        TipoRopa tipoPantalon = new TipoRopa("Pantalón");

        // Crear objetos de Prenda (añadir tus datos aquí)
        Prenda prenda1 = new Prenda(tipoCamisa, "Rojo", 42);
        Prenda prenda2 = new Prenda(tipoPantalon, "Azul", 38);

        // Crear una Coleccion (puedes añadir tantas como quieras)
        Coleccion coleccionVerano = new Coleccion("Verano");
        coleccionVerano.agregarPrenda(prenda1);
        coleccionVerano.agregarPrenda(prenda2);

        // Crear una Tienda (agregar más colecciones si quieres)
        Tienda tienda = new Tienda();
        tienda.agregarColeccion(coleccionVerano);
        // Mostrar todas las colecciones en la tienda
        tienda.mostrarColecciones();
    }
}
