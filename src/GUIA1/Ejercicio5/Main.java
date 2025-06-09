package GUIA1.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creando una nueva cuenta bancaria...");

        // Solicitar datos al usuario
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoActual = scanner.nextDouble();

        System.out.print("Ingrese el interés anual (en porcentaje): ");
        double interesAnual = scanner.nextDouble();

        // Crear la cuenta con los datos ingresados
        Cuenta cuenta = new Cuenta(dniCliente, saldoActual, interesAnual);

        // Mostrar los datos de la cuenta creada
        System.out.println("\nDatos de la cuenta creada:");
        cuenta.mostrarDatos();

        scanner.close();
    }
}