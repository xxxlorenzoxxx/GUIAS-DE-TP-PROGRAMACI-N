package GUIA1.Ejercicio_2;

public class PruebaFactura {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura = new Factura("F-001", 101, "Martillo", 5, 250.0);

        // Mostrar los detalles de la factura
        System.out.println("Número de Factura: " + factura.getNumeroFactura());
        System.out.println("Número de Artículo: " + factura.getNumeroArticulo());
        System.out.println("Descripción del Artículo: " + factura.getDescripcionArticulo());
        System.out.println("Cantidad de Artículos: " + factura.getCantidadArticulos());
        System.out.println("Precio por Artículo: $" + factura.getPrecioArticulo());

        // Calcular y mostrar el monto de la factura
        System.out.println("Monto de la Factura: $" + factura.obtenerMontoFactura());

        // Probar con valores negativos
        factura.setCantidadArticulos(-3);
        factura.setPrecioArticulo(-100.0);
        System.out.println("\nDespués de establecer valores negativos:");
        System.out.println("Cantidad de Artículos: " + factura.getCantidadArticulos());
        System.out.println("Precio por Artículo: $" + factura.getPrecioArticulo());
        System.out.println("Monto de la Factura: $" + factura.obtenerMontoFactura());
    }
}