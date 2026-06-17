package UsoFor;

import java.util.Scanner;

public class SumaNumerosFor {

    public SumaNumerosFor() {
    }

    public void ejecutar(Scanner teclado) {
        System.out.println("--- SUMATORIA DE NÚMEROS ---");
        System.out.print("¿Cuantos numeros desea ingresar en la lista?: ");
        int cantidadNumeros = teclado.nextInt();

        double sumaTotal = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double numero = teclado.nextDouble();
            
            // Validación simple de números reales válidos
            if (!Double.isNaN(numero) && !Double.isInfinite(numero)) {
                sumaTotal += numero;
            } else {
                System.out.println("ERROR: El numero ingresado no es valido.");
                i--; // Decrementar contador para repetir la entrada actual
            }
        }

        System.out.println("\nEl resultado de sumar todos los numeros es: " + sumaTotal);
    }
}
