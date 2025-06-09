package GUIA2.Ejercicio_2;

import java.util.List;

public class Proveedor {
    private String nombre;
    private List<String> editoriales;

    public Proveedor(String nombre, List<String> editoriales) {
        this.nombre = nombre;
        this.editoriales = editoriales;
    }

    public void solicitarLibro(Libro libro) {
        System.out.println("Solicitando el libro: " + libro + " al proveedor: " + nombre);
    }

    public List<String> getEditoriales() {
        return editoriales;
    }
}