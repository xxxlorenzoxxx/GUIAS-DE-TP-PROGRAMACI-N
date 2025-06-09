package GUIA3.Ejercicio_1;

public class Persona {
    public String nombre;          // Atributo publico
    protected int edad;           // Atributo protegido
    private String dni;           // Atributo privado

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    // Metodo privado para mostrar DNI
    private String mostrarDni() {
        return dni;
    }
}