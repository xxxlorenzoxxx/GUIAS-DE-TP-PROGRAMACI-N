package GUIA6.Ejercicio_6;

public class LibroTecnico extends Libro {
    private String area;

    public LibroTecnico(String titulo, String editorial, String isbn, int stock, String area) {
        super(titulo, editorial, isbn, stock);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", area='" + area + '\'';
    }
}