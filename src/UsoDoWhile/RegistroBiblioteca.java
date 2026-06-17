package UsoDoWhile;

import java.util.Scanner;

public class RegistroBiblioteca {

    public RegistroBiblioteca() {
    }

    public void ejecutar(Scanner teclado) {
        String acumuladorLibros = "";
        char continuar;

        System.out.println("--- REGISTRO DE BIBLIOTECA ---");
        do {
            teclado.nextLine(); // Limpiar buffer
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = teclado.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = teclado.nextLine();

            System.out.print("Ingrese el numero de paginas: ");
            int paginas = teclado.nextInt();

            // Acumulamos la información en formato de texto
            acumuladorLibros += "- " + titulo + " escrito por " + autor + " (" + paginas + " pags.)\n";

            System.out.print("¿Desea registrar otro libro? (S/N): ");
            continuar = teclado.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(continuar) == 'S');

        System.out.println("--- LIBROS REGISTRADOS ---");
        if (acumuladorLibros.isEmpty()) {
            System.out.println("No se registraron libros.");
        } else {
            System.out.print(acumuladorLibros);
        }
    }
}
