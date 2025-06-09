package GUIA2.Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;
    private List<Proveedor> proveedores;

    public Libreria() {
        libros = new ArrayList<>();
        proveedores = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public Libro buscarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void venderLibro(String isbn) {
        Libro libro = buscarLibro(isbn);
        if (libro != null) {
            try {
                libro.vender();
                System.out.println("Libro vendido: " + libro);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void verificarStock(String isbn) {
        Libro libro = buscarLibro(isbn);
        if (libro != null) {
            System.out.println("Stock del libro: " + libro.getStock());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void encargarLibro(String isbn) {
        Libro libro = buscarLibro(isbn);
        if (libro != null) {
            for (Proveedor proveedor : proveedores) {
                if (proveedor.getEditoriales().contains(libro.getEditorial())) {
                    proveedor.solicitarLibro(libro);
                    return;
                }
            }
            System.out.println("No hay proveedores disponibles para la editorial.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}