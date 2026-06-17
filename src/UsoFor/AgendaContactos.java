package UsoFor;

import java.util.Scanner;

public class AgendaContactos {

    public AgendaContactos() {
    }

    public void ejecutar(Scanner teclado) {
        System.out.println("--- AGENDA DE CONTACTOS ---");
        System.out.print("¿Cuantos contactos desea guardar en la agenda?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        String listaContactos = "";

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\nContacto #" + i);
            System.out.print("Nombre completo: ");
            String nombre = teclado.nextLine();

            System.out.print("Numero de telefono: ");
            String telefono = teclado.nextLine();

            listaContactos += "- " + nombre + " | Tel: " + telefono + "\n";
        }

        System.out.println("\n--- LISTA DE CONTACTOS REGISTRADOS ---");
        if (listaContactos.isEmpty()) {
            System.out.println("Agenda vacia.");
        } else {
            System.out.print(listaContactos);
        }
    }
}
