package GUIA1.Ejercicio_3;

public class Vendedor {
    private double salarioBase;
    private double porcentajeComision;
    private double[] ventasDiarias;

    public Vendedor(double salarioBase, double porcentajeComision, int dias) {
        this.salarioBase = salarioBase;
        this.porcentajeComision = porcentajeComision;
        this.ventasDiarias = new double[dias];
    }

    public void agregarVentas(int dia, double ventas) {
        if (dia >= 0 && dia < ventasDiarias.length) {
            ventasDiarias[dia] = ventas;
        }
    }

    public double calcularIngresoTotal() {
        double totalVentas = 0.0;
        for (double ventas : ventasDiarias) {
            totalVentas += ventas;
        }
        double comision = totalVentas * porcentajeComision;
        return salarioBase + comision;
    }
}

