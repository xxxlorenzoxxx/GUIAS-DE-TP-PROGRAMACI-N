package GUIA3.Ejercicio_2;

public class EmpleadoPorComision extends Empleado{
    private double tasaComision;
    private int cantidadVentas; //en pesos

    public EmpleadoPorComision (String legajo, String Nombre, String Apellido,double tasaComision, int cantidadVentas){
        super(legajo, Nombre, Apellido);
        this.tasaComision = tasaComision;
        this.cantidadVentas = cantidadVentas;
    }
    @Override
    public double calcularPago() {
        return cantidadVentas * (tasaComision/100);
    }

}