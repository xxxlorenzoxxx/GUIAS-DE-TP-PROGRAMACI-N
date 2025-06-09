package GUIA1.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Socio> socios; // Lista de socios
    private int proximoNumero; // Proximo numero de socio

    // Constructor
    public Club() {
        this.socios = new ArrayList<>();
        this.proximoNumero = 1; // Inicializa en 1
    }

    // Agregar un nuevo socio
    public Socio agregarSocio(String nombre) {
        Socio nuevoSocio = new Socio(nombre, proximoNumero);
        socios.add(nuevoSocio);
        proximoNumero++; // Incrementa el número
        return nuevoSocio;
    }

    // Mostrar todos los socios
    public void mostrarSocios() {
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}