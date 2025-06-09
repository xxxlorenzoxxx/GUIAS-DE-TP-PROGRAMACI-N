package GUIA2.Ejercicio_2;

public class Novela extends Libro {
    private String genero;

    public Novela(String titulo, String editorial, String isbn, int stock, String genero) {
        super(titulo, editorial, isbn, stock);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", genero='" + genero + '\'';
    }
}