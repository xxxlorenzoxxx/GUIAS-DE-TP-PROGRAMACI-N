package GUIA2.Ejercicio_1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear catálogo
        Catalogo catalogo = new Catalogo();

        // Agregar DVDs con datos ingresados por el usuario
        System.out.println("¿Cuántos DVDs desea agregar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nIngrese los datos del DVD " + (i + 1) + ":");

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Género (Suspenso, Comedia, Acción): ");
            String genero = scanner.nextLine();

            System.out.print("Duración (en minutos): ");
            int duracion = scanner.nextInt();

            System.out.print("¿Lo tienes? (true/false): ");
            boolean tengo = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Comentario: ");
            String comentario = scanner.nextLine();

            DVD dvd = new DVD(titulo, genero, duracion, tengo, comentario);
            catalogo.agregarDVD(dvd);
        }

        // Ejecutar pruebas
        ejecutarPruebas(catalogo);

        // Listar DVDs
        System.out.println("\nTodos los DVDs:");
        for (DVD dvd : catalogo.listarTodos()) {
            System.out.println(dvd);
        }

        // DVDs que tengo
        System.out.println("\nDVDs que tengo:");
        for (DVD dvd : catalogo.listarTengo()) {
            System.out.println(dvd);
        }

        // DVDs con duración menor a un valor ingresado por el usuario
        System.out.print("\nIngrese la duración máxima para listar DVDs: ");
        int duracionMaxima = scanner.nextInt();
        System.out.println("\nDVDs con duración menor a " + duracionMaxima + " minutos:");
        for (DVD dvd : catalogo.listarDuracionMenor(duracionMaxima)) {
            System.out.println(dvd);
        }

        // Eliminar un DVD por título
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("\nIngrese el título del DVD que desea eliminar: ");
        String tituloEliminar = scanner.nextLine();
        catalogo.eliminarDVD(tituloEliminar);

        // DVDs tras eliminación
        System.out.println("\nTodos los DVDs tras eliminar '" + tituloEliminar + "':");
        for (DVD dvd : catalogo.listarTodos()) {
            System.out.println(dvd);
        }

        // Cantidad total de DVDs
        System.out.println("\nTotal DVDs: " + catalogo.cantidadTotalDVDs());
        System.out.println("DVDs que tengo: " + catalogo.cantidadDVDsTengo());

        // DVDs ordenados por título
        System.out.println("\nDVDs ordenados por título:");
        for (DVD dvd : catalogo.listarOrdenadoPorTitulo()) {
            System.out.println(dvd);
        }

        // Fin
        System.out.println("\nPruebas completadas.");
        scanner.close();
    }

    private static void ejecutarPruebas(Catalogo catalogo) {
        System.out.println("\n--- Ejecutando pruebas ---");

        // Prueba positiva: Título válido
        try {
            DVD dvdPrueba = new DVD("Matrix", "Accion", 120, true, "Excelente");
            System.out.println("Prueba positiva (título válido): PASÓ");
        } catch (Exception e) {
            System.out.println("Prueba positiva (título válido): FALLÓ");
        }

        // Prueba negativa: Título vacío
        try {
            DVD dvdPrueba = new DVD("", "Accion", 120, true, "Excelente");
            System.out.println("Prueba negativa (título vacío): FALLÓ");
        } catch (Exception e) {
            System.out.println("Prueba negativa (título vacío): PASÓ");
        }

        // Prueba positiva: Duración válida
        try {
            DVD dvdPrueba = new DVD("Avatar", "Ciencia Ficcion", 150, true, "Muy buena");
            System.out.println("Prueba positiva (duración válida): PASÓ");
        } catch (Exception e) {
            System.out.println("Prueba positiva (duración válida): FALLÓ");
        }

        // Prueba negativa: Duración inválida
        try {
            DVD dvdPrueba = new DVD("Avatar", "Ciencia Ficcion", 0, true, "Muy buena");
            System.out.println("Prueba negativa (duración inválida): FALLÓ");
        } catch (Exception e) {
            System.out.println("Prueba negativa (duración inválida): PASÓ");
        }

        // Prueba positiva: Género válido
        try {
            DVD dvdPrueba = new DVD("Titanic", "Suspenso", 195, true, "Clásico");
            System.out.println("Prueba positiva (género válido): PASÓ");
        } catch (Exception e) {
            System.out.println("Prueba positiva (género válido): FALLÓ");
        }

        // Prueba negativa: Género inválido
        try {
            DVD dvdPrueba = new DVD("Titanic", "Terror", 195, true, "Clásico");
            System.out.println("Prueba negativa (género inválido): FALLÓ");
        } catch (Exception e) {
            System.out.println("Prueba negativa (género inválido): PASÓ");
        }

        System.out.println("--- Fin de las pruebas ---");
    }
}