package GUIA3.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante("Pipa", 30, "1201032", "0912-2018");

        // Mostrar detalles del estudiante
        estudiante.mostrarDetalles();

        // Modificar atributos
        estudiante.setNombre("Pedro");
        estudiante.setEdad(21);
        estudiante.setMatricula("2023-002");

        // Mostrar detalles tras modificacion
        System.out.println("\nDetalles tras modificacion:");
        estudiante.mostrarDetalles();
    }
}