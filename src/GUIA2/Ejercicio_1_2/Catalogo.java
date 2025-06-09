package GUIA2.Ejercicio_1_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogo {
    private List<DVD> dvds;

    public Catalogo() {
        dvds = new ArrayList<>();
    }

    public void agregarDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public void eliminarDVD(String titulo) {
        dvds.removeIf(dvd -> dvd.getTitulo().equalsIgnoreCase(titulo));
    }

    public void modificarDVD(String titulo, String genero, Integer duracion, Boolean tengo, String comentario) {
        for (DVD dvd : dvds) {
            if (dvd.getTitulo().equalsIgnoreCase(titulo)) {
                dvd.modificarAtributos(genero, duracion, tengo, comentario);
                break;
            }
        }
    }

    public List<DVD> listarTodos() {
        return dvds;
    }

    public List<DVD> listarTengo() {
        List<DVD> tengoList = new ArrayList<>();
        for (DVD dvd : dvds) {
            if (dvd.isTengo()) {
                tengoList.add(dvd);
            }
        }
        return tengoList;
    }

    public List<DVD> listarDuracionMenor(int minutos) {
        List<DVD> menorDuracion = new ArrayList<>();
        for (DVD dvd : dvds) {
            if (dvd.getDuracion() < minutos) {
                menorDuracion.add(dvd);
            }
        }
        return menorDuracion;
    }

    public List<DVD> listarOrdenadoPorTitulo() {
        dvds.sort(Comparator.comparing(DVD::getTitulo));
        return dvds;
    }

    public int cantidadTotalDVDs() {
        return dvds.size();
    }

    public int cantidadDVDsTengo() {
        return listarTengo().size();
    }
}