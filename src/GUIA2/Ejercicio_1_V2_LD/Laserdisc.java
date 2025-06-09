package GUIA2.Ejercicio_1_V2_LD;

public class Laserdisc extends Disco {
    private boolean esAnalogo; // true si es analógico, false si no

    public Laserdisc(String titulo, String genero, int duracion, boolean tengo, String comentario, boolean esAnalogo) {
        super(titulo, genero, duracion, tengo, comentario);
        this.esAnalogo = esAnalogo;
    }

    public boolean isEsAnalogo() {
        return esAnalogo;
    }

    public void setEsAnalogo(boolean esAnalogo) {
        this.esAnalogo = esAnalogo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Es Analógico: " + (esAnalogo ? "Sí" : "No");
    }
}