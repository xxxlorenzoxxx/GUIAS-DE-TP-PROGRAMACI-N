package GUIA1.Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        // Crear dos planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149, "TERRESTRE", true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, "GASEOSO", true);

        // Mostrar los valores de los atributos
        System.out.println("Planeta 1:");
        tierra.imprimirAtributos();
        System.out.println("Densidad: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + tierra.esPlanetaExterior());

        System.out.println("\nPlaneta 2:");
        jupiter.imprimirAtributos();
        System.out.println("Densidad: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + jupiter.esPlanetaExterior());
    }
}