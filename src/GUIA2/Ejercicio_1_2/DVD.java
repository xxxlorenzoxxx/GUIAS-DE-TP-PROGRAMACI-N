package GUIA2.Ejercicio_1_2;

public class DVD {
    private String titulo;
    private String genero;
    private int duracion; // en minutos
    private boolean tengo; // true si tengo el DVD
    private String comentario; // Excelente, Muy Buena, etc.

    public DVD(String titulo, String genero, int duracion, boolean tengo, String comentario) {
        validarTitulo(titulo);
        validarGenero(genero);
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.tengo = tengo;
        this.comentario = comentario;
    }

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo no puede estar vacio");
        }
    }

    private void validarGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío");
        }
        genero = genero.toUpperCase(); // Convertir a mayúsculas
        if (!genero.equals("S") && !genero.equals("C") && !genero.equals("A")) {
            throw new IllegalArgumentException("El género debe ser 'S' (Suspenso), 'C' (Comedia) o 'A' (Acción)");
        }
        this.genero = genero;
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
        if (genero != null) {
            validarGenero(genero);
        }
        if (duracion != null) {
            this.duracion = duracion;
        }
        if (tengo != null) {
            this.tengo = tengo;
        }
        if (comentario != null) {
            this.comentario = comentario;
        }
    }

    public void setTitulo(String titulo) {
        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        validarGenero(genero);
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