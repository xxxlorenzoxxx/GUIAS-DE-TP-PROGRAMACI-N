package GUIA2.Ejercicio_1_V2_LD;

public class BlueRay extends Disco {
    private String resolucion; // Ejemplo: "1080p", "4K"
    private String formatoAudio; // Ejemplo: "Dolby Atmos", "DTS"

    public BlueRay(String titulo, String genero, int duracion, boolean tengo, String comentario, String resolucion, String formatoAudio) {
        super(titulo, genero, duracion, tengo, comentario);
        this.resolucion = resolucion;
        this.formatoAudio = formatoAudio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getFormatoAudio() {
        return formatoAudio;
    }

    public void setFormatoAudio(String formatoAudio) {
        this.formatoAudio = formatoAudio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Resolución: " + resolucion + ", Formato de Audio: " + formatoAudio;
    }
}