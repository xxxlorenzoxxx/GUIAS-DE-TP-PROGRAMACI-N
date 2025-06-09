package GUIA3.Ejercicio_2;

public class EmpleadoPorHoras extends Empleado {
    private double sueldoBasico; // Cambiado a double
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String legajo, String Nombre, String Apellido, double sueldoBasico, int horasTrabajadas, double valorHora) {
        super(legajo, Nombre, Apellido); // Agregado el punto y coma
        this.sueldoBasico = sueldoBasico;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() { // Corregido el nombre del método
        return sueldoBasico + (horasTrabajadas * valorHora); // Agregado el punto y coma
    }
}


