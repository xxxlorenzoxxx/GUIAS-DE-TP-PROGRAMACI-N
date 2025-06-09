package GUIA2.Ejercicio_2;

public class Libro {
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

    public void vender() {
        if (stock > 0) {
            stock--;
        } else {
            throw new IllegalStateException("No hay stock disponible.");
        }
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