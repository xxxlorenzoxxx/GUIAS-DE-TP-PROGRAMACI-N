package GUIA6.Ejercicio_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorArchivo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java ContadorArchivo <opciones> <nombre_archivo>");
            System.out.println("Opciones:");
            System.out.println("  c - contar caracteres");
            System.out.println("  l - contar líneas");
            return;
        }

        String opciones = args[0];
        String nombreArchivo = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            int totalCaracteres = 0;
            int totalLineas = 0;

            String linea;
            while ((linea = reader.readLine()) != null) {
                totalLineas++;
                totalCaracteres += linea.length();
            }

            if (opciones.contains("c")) {
                System.out.println("Total de caracteres: " + totalCaracteres);
            }
            if (opciones.contains("l")) {
                System.out.println("Total de líneas: " + totalLineas);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
