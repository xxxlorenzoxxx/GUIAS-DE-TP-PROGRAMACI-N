package GUIA2.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Crear libros
        Libro novela = new Novela("Novela Ejemplo", "Salchipapa", "123456789", 10, "Ciencia ficción");
        Libro libroTecnico = new LibroTecnico("Libro Técnico Ejemplo", "Huevodur", "987654321", 5, "Ingeniería");

        // Agregar libros a la librería
        libreria.agregarLibro(novela);
        libreria.agregarLibro(libroTecnico);

        // Crear proveedores
        List<String> editorialesProveedor = new ArrayList<>();
        editorialesProveedor.add("Editorial 1");
        Proveedor proveedor = new Proveedor("Proveedor 1", editorialesProveedor);

        // Agregar proveedor a la librería
        libreria.agregarProveedor(proveedor);

        // Probar métodos de la librería
        libreria.verificarStock("123456789");
        libreria.venderLibro("123456789");
        libreria.verificarStock("123456789");
        libreria.encargarLibro("987654321");
    }
}