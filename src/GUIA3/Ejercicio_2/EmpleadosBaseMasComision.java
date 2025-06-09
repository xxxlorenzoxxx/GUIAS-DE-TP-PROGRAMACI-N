package GUIA3.Ejercicio_2;

public class EmpleadosBaseMasComision extends Empleado{
    private double sueldoBase;
    private double tasaComision;
    private double cantidadVentas;

    public EmpleadosBaseMasComision(String legajo, String Nombre, String Apellido, double sueldoBase, double tasaComision, double cantidadVentas) {
        super(legajo, Nombre, Apellido);
        this.sueldoBase = sueldoBase;
        this.tasaComision = tasaComision;
        this.cantidadVentas = cantidadVentas;
    }
    @Override
    public double calcularPago(){
        return sueldoBase + (cantidadVentas* (tasaComision / 100));
    }
}
