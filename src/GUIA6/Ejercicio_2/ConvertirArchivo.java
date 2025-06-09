package GUIA6.Ejercicio_2;

import java.io.*;

public class ConvertirArchivo {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java ConvertirArchivo <opción> <archivo_entrada> <archivo_salida>");
            System.out.println("Opciones:");
            System.out.println("  u - convertir a mayúsculas");
            System.out.println("  l - convertir a minúsculas");
            return;
        }

        String opcion = args[0];
        String archivoEntrada = args[1];
        String archivoSalida = args[2];

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                if ("u".equals(opcion)) {
                    writer.write(linea.toUpperCase());
                } else if ("l".equals(opcion)) {
                    writer.write(linea.toLowerCase());
                } else {
                    System.out.println("Opción no válida. Use 'u' para mayúsculas o 'l' para minúsculas.");
                    return;
                }
                writer.newLine();
            }

            System.out.println("Archivo convertido y guardado en: " + archivoSalida);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}