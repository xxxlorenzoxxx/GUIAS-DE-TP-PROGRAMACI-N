package GUIA2.Ejercicio_1;

public class DVD {
    private String titulo;
    private String genero;
    private int duracion; // en minutos
    private boolean tengo; // true si tengo el DVD
    private String comentario; // Excelente, Muy Buena, etc.
    private void ValidarTitulo(String titulo){
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo no puede estar vacio");
        }
    };

    public DVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
        ValidarTitulo(titulo);
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.tengo = tengo;
        this.comentario = comentario;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isTengo() {
        return tengo;
    }

    public String getComentario() {
        return comentario;
    }




    public void modificarAtributos(String genero, Integer duracion, Boolean tengo, String comentario) {
    }
    public void setTitulo(String titulo) {
        ValidarTitulo(titulo);
        this.titulo = titulo;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTengo(boolean tengo) {
        this.tengo = tengo;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }






    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Genero: " + genero + ", Duracion: " + duracion + " min, Tengo: " + (tengo ? "Si" : "No") + ", Comentario: " + comentario;
    }
}