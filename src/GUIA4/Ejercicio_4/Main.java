package GUIA4.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        // Agregar discos
        catalogo.agregarDVD(new DVD("Inception", "S", 148, true, "Excelente"));
        catalogo.agregarBlueRay(new BlueRay("Avatar", "A", 162, false, "Muy buena", "4K", "Dolby Atmos"));

        // Intentar listar por género
        try {
            System.out.println("Discos de género 'C':");
            for (Disco disco : catalogo.listarPorGenero("C")) {
                System.out.println(disco);
            }
        } catch (GeneroNoEncontradoException e) {
            System.err.println(e.getMessage());
        }
    }
}