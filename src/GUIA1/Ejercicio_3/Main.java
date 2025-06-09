package GUIA1.Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBase = 2000.0;
        double porcentajeComision = 0.06;
        int dias = 7; // Número de días en una semana

        Vendedor vendedor = new Vendedor(salarioBase, porcentajeComision, dias);

        // Recoger las ventas diarias
        for (int i = 0; i < dias; i++) {
            System.out.print("Ingrese las ventas del día " + (i + 1) + ": ");
            double ventasDia = scanner.nextDouble();
            vendedor.agregarVentas(i, ventasDia); // Almacenar en el objeto Vendedor
        }

        // Calcular y mostrar el ingreso total
        double ingresoTotal = vendedor.calcularIngresoTotal();
        System.out.printf("El ingreso total del vendedor es: $%.2f%n", ingresoTotal);

        scanner.close();
    }
}