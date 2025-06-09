package GUIA1.Ejercicio_2;

public class Factura {
    private String numeroFactura;
    private int numeroArticulo;
    private String descripcionArticulo;
    private int cantidadArticulos;
    private double precioArticulo;

    public Factura(String numeroFactura, int numeroArticulo, String descripcionArticulo, int cantidadArticulos, double precioArticulo) {
        this.numeroFactura = numeroFactura;
        this.numeroArticulo = numeroArticulo;
        this.descripcionArticulo = descripcionArticulo;
        setPrecioArticulo(precioArticulo);
        setCantidadArticulos(cantidadArticulos);
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = Math.max(precioArticulo, 0.0); // Si es negativo, se establece en 0.0
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = Math.max(cantidadArticulos, 0); // Si es negativo, se establece en 0
    }

    public double obtenerMontoFactura() {
        return precioArticulo * cantidadArticulos;
    }
}