package GUIA2.Ejercicio_1_V2_LD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar DVD");
            System.out.println("2. Agregar BlueRay");
            System.out.println("3. Agregar Laserdisc");
            System.out.println("4. Eliminar disco");
            System.out.println("5. Modificar disco");
            System.out.println("6. Ordenar por duración");
            System.out.println("7. Ordenar por título");
            System.out.println("8. Mostrar todos los discos");
            System.out.println("9. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
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
                    catalogo.agregarDVD(new DVD(titulo, genero, duracion, tengo, comentario));
                }
                case 2 -> {
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
                    System.out.print("Resolución: ");
                    String resolucion = scanner.nextLine();
                    System.out.print("Formato de Audio: ");
                    String formatoAudio = scanner.nextLine();
                    catalogo.agregarBlueRay(new BlueRay(titulo, genero, duracion, tengo, comentario, resolucion, formatoAudio));
                }
                case 3 -> {
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
                    System.out.print("¿Es analógico? (true/false): ");
                    boolean esAnalogo = scanner.nextBoolean();
                    catalogo.agregarLaserdisc(new Laserdisc(titulo, genero, duracion, tengo, comentario, esAnalogo));
                }
                case 4 -> {
                    System.out.print("Ingrese el título del disco a eliminar: ");
                    String titulo = scanner.nextLine();
                    if (catalogo.eliminarDisco(titulo)) {
                        System.out.println("Disco eliminado.");
                    } else {
                        System.out.println("Disco no encontrado.");
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese el título del disco a modificar: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Nuevo género (o presione Enter para no cambiar): ");
                    String genero = scanner.nextLine();
                    System.out.print("Nueva duración (o -1 para no cambiar): ");
                    int duracion = scanner.nextInt();
                    System.out.print("¿Lo tienes? (true/false o presione Enter para no cambiar): ");
                    boolean tengo = scanner.nextBoolean();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Nuevo comentario (o presione Enter para no cambiar): ");
                    String comentario = scanner.nextLine();
                    if (catalogo.modificarDisco(titulo, genero.isEmpty() ? null : genero, duracion == -1 ? null : duracion, tengo, comentario.isEmpty() ? null : comentario)) {
                        System.out.println("Disco modificado.");
                    } else {
                        System.out.println("Disco no encontrado.");
                    }
                }
                case 6 -> {
                    catalogo.ordenarPorDuracion();
                    System.out.println("Discos ordenados por duración.");
                }
                case 7 -> {
                    catalogo.ordenarPorTitulo();
                    System.out.println("Discos ordenados por título.");
                }
                case 8 -> {
                    System.out.println("\nTodos los discos:");
                    for (Disco disco : catalogo.listarTodos()) {
                        System.out.println(disco);
                    }
                }
                case 9 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}