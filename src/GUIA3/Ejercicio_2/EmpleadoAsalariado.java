package GUIA3.Ejercicio_2;

public class EmpleadoAsalariado extends Empleado{
    private double sueldoMensual;

    public EmpleadoAsalariado(String legajo, String Nombre, String Apellido, double sueldoMensual){
        super(legajo,Nombre,Apellido);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularPago() {
        return sueldoMensual;
    }
}
