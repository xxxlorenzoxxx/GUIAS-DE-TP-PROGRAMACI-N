package GUIA6.Ejercicio_5;

public class DVD {
    private String titulo;
    private String genero;
    private int anio;
    private boolean activo;

    public DVD(String titulo, String genero, int anio, boolean activo) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.activo = activo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void modificar(String genero, int anio) {
        this.genero = genero;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return titulo + "," + genero + "," + anio + "," + activo;
    }
}