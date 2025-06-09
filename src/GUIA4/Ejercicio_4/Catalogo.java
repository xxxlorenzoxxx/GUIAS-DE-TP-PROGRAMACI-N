package GUIA4.Ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;

    public Catalogo() {
        this.discos = new ArrayList<>();
    }

    public List<Disco> listarPorGenero(String genero) throws GeneroNoEncontradoException {
        List<Disco> resultado = new ArrayList<>();
        for (Disco disco : discos) {
            if (disco.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(disco);
            }
        }
        if (resultado.isEmpty()) {
            throw new GeneroNoEncontradoException("No se encontraron discos del género: " + genero);
        }
        return resultado;
    }
}