package UsoDoWhile;

import java.util.Scanner;

public class GestionTareas {

    public GestionTareas() {
    }

    public void ejecutar(Scanner teclado) {
        String acumuladorTareas = "";
        char continuar;

        System.out.println("--- GESTIÓN DE TAREAS ---");
        do {
            teclado.nextLine(); // Limpiar buffer
            System.out.print("Ingrese la descripcion de la tarea: ");
            String descripcion = teclado.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (ej. DD/MM/AAAA): ");
            String fecha = teclado.nextLine();

            acumuladorTareas += "- " + descripcion + " (Vence: " + fecha + ")\n";

            System.out.print("¿Desea agregar otra tarea? (S/N): ");
            continuar = teclado.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(continuar) == 'S');

        System.out.println("--- LISTA DE TAREAS PENDIENTES ---");
        if (acumuladorTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.print(acumuladorTareas);
        }
    }
}
