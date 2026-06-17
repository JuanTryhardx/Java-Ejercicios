package UsoWhile;

import java.util.Scanner;

public class SimuladorImpresora {

    public SimuladorImpresora() {
    }

    public void ejecutar(Scanner teclado) {
        int papelRestante = 50; // Capacidad inicial de la impresora
        boolean continuar = true;

        System.out.println("--- SIMULADOR DE IMPRESORA ---");
        while (continuar && papelRestante > 0) {
            System.out.println("Papel disponible en bandeja: " + papelRestante + " paginas.");
            System.out.print("Ingrese la cantidad de paginas que desea imprimir (o 0 para salir): ");
            int paginasImprimir = teclado.nextInt();

            if (paginasImprimir == 0) {
                continuar = false;
            } else if (paginasImprimir < 0) {
                System.out.println("ERROR: Ingrese un numero valido.");
            } else if (paginasImprimir > papelRestante) {
                System.out.println("ERROR: No hay suficiente papel. Solo quedan " + papelRestante + " paginas.");
            } else {
                papelRestante -= paginasImprimir;
                System.out.println("Imprimiendo " + paginasImprimir + " paginas...");
                System.out.println("Impresion finalizada con exito.");
            }
            System.out.println();
            
            if (papelRestante == 0) {
                System.out.println("La impresora se ha quedado sin papel.");
            }
        }
    }
}
