package GUIA2.Ejercicio_1_V2_LD;

public class DVD extends Disco {
    public DVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
        super(titulo, genero, duracion, tengo, comentario);
    }

    public void reproducir() {
        System.out.println("Reproduciendo el DVD: " + getTitulo());
    }
}