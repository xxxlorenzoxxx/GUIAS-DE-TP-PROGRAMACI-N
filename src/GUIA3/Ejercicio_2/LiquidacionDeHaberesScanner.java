package GUIA3.Ejercicio_2;

import java.util.Scanner;

public class LiquidacionDeHaberesScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el legajo del empleado: ");
        String legajo = scanner.nextLine();

        System.out.print("Ingese el nombre del empleado: ");
        String Nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del empleado: ");
        String Apellido = scanner.nextLine();

        System.out.print("Ingrese el sueldo del empleado (en pesos): ");
        double sueldoMensual = scanner.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de hora: ");
        double valorHora = scanner.nextDouble();

        double liquidacion = calcularLiquidacion(sueldoMensual, horasTrabajadas);

        System.out.println("Liquidación de " + Nombre + " (Legajo: " + legajo + "): " + liquidacion);

        scanner.close();
    }

    public static double calcularLiquidacion(double sueldoMensual, int horasTrabajadas) {
        return (sueldoMensual * horasTrabajadas);
    }
}












