package GUIA6.Ejercicio_6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;
    private final String archivo = "libreria.txt";

    public Libreria() {
        this.libros = new ArrayList<>();
        cargarDesdeArchivo();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        guardarEnArchivo();
    }

    public boolean eliminarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                libros.remove(libro);
                guardarEnArchivo();
                return true;
            }
        }
        return false;
    }

    public boolean modificarLibro(String isbn, String nuevoTitulo, String nuevaEditorial, int nuevoStock) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                if (nuevoTitulo != null) libro.setTitulo(nuevoTitulo);
                if (nuevaEditorial != null) libro.setEditorial(nuevaEditorial);
                if (nuevoStock >= 0) libro.setStock(nuevoStock);
                guardarEnArchivo();
                return true;
            }
        }
        return false;
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public int cantidadDeLibros() {
        return libros.size();
    }

    public int cantidadQueCumplenCondicion(String genero) {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro instanceof Novela && ((Novela) libro).getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }

    public List<Libro> listarTodos() {
        return new ArrayList<>(libros);
    }

    public List<Libro> listarPorCondicion(String genero) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro instanceof Novela && ((Novela) libro).getGenero().equalsIgnoreCase(genero)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(libros);
        } catch (IOException e) {
            System.out.println("Error al guardar en archivo: " + e.getMessage());
        }
    }

    private void cargarDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            libros = (List<Libro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            libros = new ArrayList<>();
        }
    }
}