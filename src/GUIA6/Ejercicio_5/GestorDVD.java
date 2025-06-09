package GUIA6.Ejercicio_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDVD {
    private final String archivo;

    public GestorDVD(String archivo) {
        this.archivo = archivo;
    }

    public List<DVD> leerDVDs() throws IOException {
        List<DVD> dvds = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    String titulo = datos[0].trim();
                    String genero = datos[1].trim();
                    int anio = Integer.parseInt(datos[2].trim());
                    boolean activo = Boolean.parseBoolean(datos[3].trim());
                    dvds.add(new DVD(titulo, genero, anio, activo));
                }
            }
        }
        return dvds;
    }

    public void escribirDVDs(List<DVD> dvds) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (DVD dvd : dvds) {
                writer.write(dvd.toString());
                writer.newLine();
            }
        }
    }
}