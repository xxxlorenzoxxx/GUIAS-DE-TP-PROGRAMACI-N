package GUIA1.Ejericicio_4;

public class Libro {
    private String titulo;
    private boolean original;
    private boolean prestable;

    // Constructor
    public Libro(String titulo, boolean original, boolean prestable) {
        this.titulo = titulo;
        this.original = original;
        this.prestable = prestable;
    }

    // Métodos de instancia
    public String getTitulo() {
        return titulo;
    }

    public boolean getOriginal() {
        return original;
    }

    public boolean getPrestable() {
        return prestable;
    }

    public boolean esOriginal() {
        return original;
    }

    public boolean sePresta() {
        return prestable;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public void setPrestable(boolean prestable) {
        this.prestable = prestable;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", original=" + original +
                ", prestable=" + prestable +
                '}';
    }
}