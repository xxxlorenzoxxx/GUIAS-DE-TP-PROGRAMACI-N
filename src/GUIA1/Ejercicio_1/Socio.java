package GUIA1.Ejercicio_1;

public class Socio {
    private String nombre; // Nombre del socio
    private int numero; // Número unico del socio

    // Constructor
    public Socio(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // Metodos getter
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    // Metodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Representacion en cadena
    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                '}';
    }
}