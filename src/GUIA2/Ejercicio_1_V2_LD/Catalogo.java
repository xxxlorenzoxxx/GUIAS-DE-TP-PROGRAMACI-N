package GUIA2.Ejercicio_1_V2_LD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;

    public Catalogo() {
        this.discos = new ArrayList<>();
    }

    public void agregarDVD(DVD dvd) {
        discos.add(dvd);
    }

    public void agregarBlueRay(BlueRay blueRay) {
        discos.add(blueRay);
    }

    public void agregarLaserdisc(Laserdisc laserdisc) {
        discos.add(laserdisc);
    }

    public List<Disco> listarTodos() {
        return new ArrayList<>(discos);
    }

    public boolean eliminarDisco(String titulo) {
        return discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public boolean modificarDisco(String titulo, String genero, Integer duracion, Boolean tengo, String comentario) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                disco.modificarAtributos(genero, duracion, tengo, comentario);
                return true;
            }
        }
        return false;
    }

    public void ordenarPorDuracion() {
        discos.sort(Comparator.comparingInt(Disco::getDuracion));
    }

    public void ordenarPorTitulo() {
        discos.sort(Comparator.comparing(Disco::getTitulo, String.CASE_INSENSITIVE_ORDER));
    }
}