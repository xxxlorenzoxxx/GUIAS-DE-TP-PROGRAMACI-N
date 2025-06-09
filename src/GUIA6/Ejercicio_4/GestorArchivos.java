package GUIA6.Ejercicio_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivos {
    public List<Pais> leerPaises(String archivoEntrada) throws IOException {
        List<Pais> paises = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    try {
                        String nombre = datos[0].trim();
                        double poblacion = Double.parseDouble(datos[1].trim());
                        double pbi = Double.parseDouble(datos[2].trim());
                        paises.add(new Pais(nombre, poblacion, pbi));
                    } catch (NumberFormatException e) {
                        System.out.println("Error en formato numérico: " + linea);
                    }
                } else {
                    System.out.println("Línea con formato incorrecto: " + linea);
                }
            }
        }
        return paises;
    }

    public void escribirPaises(String archivoSalida, List<Pais> paises) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (Pais pais : paises) {
                writer.write(pais.toString());
                writer.newLine();
            }
        }
    }
}