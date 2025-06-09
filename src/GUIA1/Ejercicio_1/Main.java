package GUIA1.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Club club = new Club(); // Crear club

        // Crear primer socio
        Socio socio1 = club.agregarSocio("Juan Pérez");
        System.out.println("Datos del primer socio:");
        System.out.println("Nombre: " + socio1.getNombre());
        System.out.println("Número: " + socio1.getNumero());

        // Crear segundo socio
        Socio socio2 = club.agregarSocio("María López");
        System.out.println("Datos del segundo socio:");
        System.out.println("Nombre: " + socio2.getNombre());
        System.out.println("Número: " + socio2.getNumero());

        // Mostrar todos los socios
        System.out.println("Lista de socios del club:");
        club.mostrarSocios();
    }
}