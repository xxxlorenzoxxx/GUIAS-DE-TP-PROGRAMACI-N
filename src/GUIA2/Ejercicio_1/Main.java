package GUIA2.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Catalogo
        Catalogo catalogo = new Catalogo();

        // Agregar DVDs
        DVD dvd1 = new DVD("Inception", "Ciencia Ficcion", 148, true, "Excelente");
        DVD dvd2 = new DVD("El padrino", "Drama", 175, true, "Muy Buena");
        DVD dvd3 = new DVD("Toy Story", "Animacion", 81, false, "Buena");

        catalogo.agregarDVD(dvd1);
        catalogo.agregarDVD(dvd2);
        catalogo.agregarDVD(dvd3);

        // Modificar DVD
        catalogo.modificarDVD("Inception", null, 150, null, null);

        // Prueba positiva
        DVD dvdModificado = catalogo.listarTodos().get(0); // "Inception"
        System.out.println("\nVerificando 'Inception':");
        System.out.println("Esperada: 150");
        System.out.println("Real: " + dvdModificado.getDuracion());


        // Comprobar duracion
        if (dvdModificado.getDuracion() == 150) {
            System.out.println("Modificada correctamente.");
        } else {
            System.out.println("Error: no modificada.");
        }

        // Prueba negativa
        System.out.println("\nVerificando que no sea 200:");
        System.out.println("No esperada: 200");
        System.out.println("Real: " + dvdModificado.getDuracion());

        // Comprobar duracion
        if (dvdModificado.getDuracion() != 200) {
            System.out.println("No es 200, correcto.");
        } else {
            System.out.println("Error: es 200.");
        }

        // DVDs que tengo
        System.out.println("\nDVDs que tengo:");
        for (DVD dvd : catalogo.listarTengo()) {
            System.out.println(dvd);
        }

        // DVDs < 100 min
        System.out.println("\nDVDs < 100 min:");
        for (DVD dvd : catalogo.listarDuracionMenor(100)) {
            System.out.println(dvd);
        }

        // Eliminar DVD
        catalogo.eliminarDVD("Toy Story");

        // DVDs tras eliminacion
        System.out.println("\nTodos tras eliminar 'Toy Story':");
        for (DVD dvd : catalogo.listarTodos()) {
            System.out.println(dvd);
        }

        // Cantidad total
        System.out.println("\nTotal DVDs: " + catalogo.cantidadTotalDVDs());
        System.out.println("DVDs que tengo: " + catalogo.cantidadDVDsTengo());

        // DVDs ordenados
        System.out.println("\nDVDs ordenados:");
        for (DVD dvd : catalogo.listarOrdenadoPorTitulo()) {
            System.out.println(dvd);
        }

        // Fin
        System.out.println("\nPruebas completadas.");
    }
}