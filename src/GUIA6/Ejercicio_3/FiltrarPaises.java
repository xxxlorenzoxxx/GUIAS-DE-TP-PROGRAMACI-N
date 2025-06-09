package GUIA6.Ejercicio_3;

import java.io.*;

public class FiltrarPaises {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java FiltrarPaises <archivo_entrada> <directorio_salida>");
            return;
        }

        String archivoEntrada = args[0];
        String directorioSalida = args[1];

        File dirSalida = new File(directorioSalida);
        if (!dirSalida.exists()) {
            dirSalida.mkdirs();
        }

        String archivoMenor30 = directorioSalida + File.separator + "paises_menor_30_millones.txt";
        String archivoMayorIgual30 = directorioSalida + File.separator + "paises_mayor_igual_30_millones.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writerMenor30 = new BufferedWriter(new FileWriter(archivoMenor30));
             BufferedWriter writerMayorIgual30 = new BufferedWriter(new FileWriter(archivoMayorIgual30))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length != 3) {
                    System.out.println("Línea con formato incorrecto: " + linea);
                    continue;
                }

                String nombrePais = datos[0].trim();
                double poblacion;
                try {
                    poblacion = Double.parseDouble(datos[1].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Población inválida en línea: " + linea);
                    continue;
                }

                if (poblacion < 30) {
                    writerMenor30.write(linea);
                    writerMenor30.newLine();
                } else {
                    writerMayorIgual30.write(linea);
                    writerMayorIgual30.newLine();
                }
            }

            System.out.println("Archivos generados en el directorio: " + directorioSalida);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}