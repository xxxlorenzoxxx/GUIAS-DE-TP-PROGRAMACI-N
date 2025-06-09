package GUIA6.Ejercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un nuevo libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Modificar los datos de un libro");
            System.out.println("4. Consultas");
            System.out.println("5. Informes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Editorial: ");
                    String editorial = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    System.out.print("¿Es una novela? (true/false): ");
                    boolean esNovela = scanner.nextBoolean();
                    scanner.nextLine(); // Consumir salto de línea
                    if (esNovela) {
                        System.out.print("Género: ");
                        String genero = scanner.nextLine();
                        libreria.agregarLibro(new Novela(titulo, editorial, isbn, stock, genero));
                    } else {
                        System.out.print("Área técnica: ");
                        String area = scanner.nextLine();
                        libreria.agregarLibro(new LibroTecnico(titulo, editorial, isbn, stock, area));
                    }
                    System.out.println("Libro agregado.");
                }
                case 2 -> {
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbn = scanner.nextLine();
                    if (libreria.eliminarLibro(isbn)) {
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el ISBN del libro a modificar: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Nuevo título (o presione Enter para no cambiar): ");
                    String titulo = scanner.nextLine();
                    System.out.print("Nueva editorial (o presione Enter para no cambiar): ");
                    String editorial = scanner.nextLine();
                    System.out.print("Nuevo stock (o -1 para no cambiar): ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    if (libreria.modificarLibro(isbn, titulo.isEmpty() ? null : titulo, editorial.isEmpty() ? null : editorial, stock == -1 ? -1 : stock)) {
                        System.out.println("Libro modificado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                }
                case 4 -> {
                    System.out.println("1. Buscar por ISBN");
                    System.out.println("2. Cantidad de libros");
                    System.out.println("3. Cantidad que cumplen con una condición");
                    System.out.print("Seleccione una opción: ");
                    int consulta = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    switch (consulta) {
                        case 1 -> {
                            System.out.print("Ingrese el ISBN: ");
                            String isbn = scanner.nextLine();
                            Libro libro = libreria.buscarPorIsbn(isbn);
                            if (libro != null) {
                                System.out.println(libro);
                            } else {
                                System.out.println("Libro no encontrado.");
                            }
                        }
                        case 2 -> System.out.println("Cantidad de libros: " + libreria.cantidadDeLibros());
                        case 3 -> {
                            System.out.print("Ingrese el género: ");
                            String genero = scanner.nextLine();
                            System.out.println("Cantidad que cumplen con la condición: " + libreria.cantidadQueCumplenCondicion(genero));
                        }
                        default -> System.out.println("Opción no válida.");
                    }
                }
                case 5 -> {
                    System.out.println("1. Listado de todos los libros");
                    System.out.println("2. Listado de los libros que cumplen con una condición");
                    System.out.print("Seleccione una opción: ");
                    int informe = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    switch (informe) {
                        case 1 -> {
                            System.out.println("Listado de todos los libros:");
                            for (Libro libro : libreria.listarTodos()) {
                                System.out.println(libro);
                            }
                        }
                        case 2 -> {
                            System.out.print("Ingrese el género: ");
                            String genero = scanner.nextLine();
                            System.out.println("Listado de los libros que cumplen con la condición:");
                            for (Libro libro : libreria.listarPorCondicion(genero)) {
                                System.out.println(libro);
                            }
                        }
                        default -> System.out.println("Opción no válida.");
                    }
                }
                case 6 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}