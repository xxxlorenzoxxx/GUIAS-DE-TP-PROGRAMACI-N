package GUIA6.Ejercicio_4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        GestorArchivos gestor = new GestorArchivos();

        try {
            List<Pais> paises = gestor.leerPaises(archivoEntrada);

            List<Pais> menor30 = new ArrayList<>();
            List<Pais> mayorIgual30 = new ArrayList<>();

            for (Pais pais : paises) {
                if (pais.getPoblacion() < 30) {
                    menor30.add(pais);
                } else {
                    mayorIgual30.add(pais);
                }
            }

            gestor.escribirPaises(archivoMenor30, menor30);
            gestor.escribirPaises(archivoMayorIgual30, mayorIgual30);

            System.out.println("Archivos generados en el directorio: " + directorioSalida);

        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}