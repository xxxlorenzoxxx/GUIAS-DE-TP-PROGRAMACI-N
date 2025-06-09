package GUIA6.Ejercicio_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDVD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDVD gestor = new GestorDVD("dvds.txt");
        List<DVD> dvds = new ArrayList<>();

        try {
            dvds = gestor.leerDVDs();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un nuevo elemento (alta)");
            System.out.println("2. Eliminar un elemento (baja lógica)");
            System.out.println("3. Modificar los datos de un elemento existente");
            System.out.println("4. Consultas");
            System.out.println("5. Informes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Género: ");
                    String genero = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    dvds.add(new DVD(titulo, genero, anio, true));
                    System.out.println("DVD agregado.");
                }
                case 2 -> {
                    System.out.print("Ingrese el título del DVD a eliminar: ");
                    String titulo = scanner.nextLine();
                    boolean encontrado = false;
                    for (DVD dvd : dvds) {
                        if (dvd.getTitulo().equalsIgnoreCase(titulo) && dvd.isActivo()) {
                            dvd.setActivo(false);
                            encontrado = true;
                            System.out.println("DVD eliminado (baja lógica).");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("DVD no encontrado o ya eliminado.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el título del DVD a modificar: ");
                    String titulo = scanner.nextLine();
                    boolean encontrado = false;
                    for (DVD dvd : dvds) {
                        if (dvd.getTitulo().equalsIgnoreCase(titulo) && dvd.isActivo()) {
                            System.out.print("Nuevo género: ");
                            String genero = scanner.nextLine();
                            System.out.print("Nuevo año: ");
                            int anio = scanner.nextInt();
                            scanner.nextLine();
                            dvd.modificar(genero, anio);
                            encontrado = true;
                            System.out.println("DVD modificado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("DVD no encontrado o inactivo.");
                    }
                }
                case 4 -> {
                    System.out.println("1. Mostrar datos de un DVD");
                    System.out.println("2. Cantidad de elementos");
                    System.out.println("3. Cantidad de elementos que cumplen una condición");
                    System.out.print("Seleccione una opción: ");
                    int consulta = scanner.nextInt();
                    scanner.nextLine();

                    if (consulta == 1) {
                        System.out.print("Ingrese título del DVD: ");
                        String titulo = scanner.nextLine();
                        boolean encontrado = false;
                        for (DVD dvd : dvds) {
                            if (dvd.getTitulo().equalsIgnoreCase(titulo) && dvd.isActivo()) {
                                System.out.println(dvd);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("DVD no encontrado o inactivo.");
                        }
                    } else if (consulta == 2) {
                        System.out.println("Cantidad de elementos: " + dvds.size());
                    } else if (consulta == 3) {
                        System.out.print("Ingrese año mínimo: ");
                        int anioMinimo = scanner.nextInt();
                        scanner.nextLine();
                        long cantidad = dvds.stream().filter(dvd -> dvd.getAnio() >= anioMinimo && dvd.isActivo()).count();
                        System.out.println("Cantidad de elementos que cumplen la condición: " + cantidad);
                    }
                }
                case 5 -> {
                    System.out.println("1. Listado de todos los elementos");
                    System.out.println("2. Listado de elementos que cumplen una condición");
                    System.out.print("Seleccione una opción: ");
                    int informe = scanner.nextInt();
                    scanner.nextLine();

                    if (informe == 1) {
                        dvds.forEach(System.out::println);
                    } else if (informe == 2) {
                        System.out.print("Ingrese género: ");
                        String genero = scanner.nextLine();
                        dvds.stream().filter(dvd -> dvd.getGenero().equalsIgnoreCase(genero) && dvd.isActivo())
                                .forEach(System.out::println);
                    }
                }
                case 6 -> {
                    try {
                        gestor.escribirDVDs(dvds);
                        System.out.println("Cambios guardados. Saliendo...");
                    } catch (IOException e) {
                        System.out.println("Error al guardar los cambios: " + e.getMessage());
                    }
                    continuar = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}