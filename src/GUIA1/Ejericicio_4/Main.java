package GUIA1.Ejericicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del primer libro
        System.out.println("Ingrese los datos del primer libro:");
        System.out.print("Título: ");
        String titulo1 = scanner.nextLine();
        System.out.print("¿Es original? (true/false): ");
        boolean original1 = scanner.nextBoolean();
        System.out.print("¿Es prestable? (true/false): ");
        boolean prestable1 = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea

        Libro libro1 = new Libro(titulo1, original1, prestable1);

        // Ingresar datos del segundo libro
        System.out.println("\nIngrese los datos del segundo libro:");
        System.out.print("Título: ");
        String titulo2 = scanner.nextLine();
        System.out.print("¿Es original? (true/false): ");
        boolean original2 = scanner.nextBoolean();
        System.out.print("¿Es prestable? (true/false): ");
        boolean prestable2 = scanner.nextBoolean();

        Libro libro2 = new Libro(titulo2, original2, prestable2);

        // Mostrar los libros creados
        System.out.println("\nLibros creados:");
        System.out.println(libro1);
        System.out.println(libro2);

        scanner.close();
    }
}