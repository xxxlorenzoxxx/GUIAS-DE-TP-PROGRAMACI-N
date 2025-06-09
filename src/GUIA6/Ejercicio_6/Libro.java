package GUIA6.Ejercicio_6;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String editorial;
    private String isbn;
    private int stock;

    public Libro(String titulo, String editorial, String isbn, int stock) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.isbn = isbn;
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", stock=" + stock +
                '}';
    }
}