package GUIA3.Ejercicio_1;

public class Estudiante extends Persona {
    private String matricula;      // Atributo privado

    public Estudiante(String nombre, int edad, String dni, String matricula) {
        super(nombre, edad, dni);
        this.matricula = matricula;
    }

    // Metodo set para matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println(mostrarInfo()); // Llama a mostrarInfo
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad (protected): " + getEdad()); // Acceso a edad
    }
}