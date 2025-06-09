package GUIA6.Ejercicio_4;

public class Pais {
    private String nombre;
    private double poblacion;
    private double pbi;

    public Pais(String nombre, double poblacion, double pbi) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pbi = pbi;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public double getPbi() {
        return pbi;
    }

    @Override
    public String toString() {
        return nombre + "," + poblacion + "," + pbi;
    }
}