package GUIA3.Ejercicio_2;

public class Empleado {
    private String legajo;
    private String Nombre;
    private String Apellido;

    public Empleado(String legajo, String Nombre, String Apellido){
        this.legajo = legajo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public double calcularPago() {
        return 0;
    }


    public  String getLegajo() {
        return legajo;
    }
    public void SetLegajo (String legajo) {
        this.legajo = legajo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void SetNombre(String nombre){
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }

    public void SetApellido(String apellido){
        this.Apellido = apellido;
    }
    public String mostrarInfo() {
        return "Legajo: " + legajo + "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\n";

    }

}

