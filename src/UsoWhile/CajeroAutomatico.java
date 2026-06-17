package UsoWhile;

import java.util.Scanner;

public class CajeroAutomatico {

    public CajeroAutomatico() {
    }

    public void ejecutar(Scanner teclado) {
        double saldoDisponible = 500000; // Saldo inicial de ejemplo
        boolean continuar = true;

        System.out.println("--- CAJERO AUTOMÁTICO ---");
        while (continuar) {
            System.out.println("Saldo actual disponible: $" + saldoDisponible);
            System.out.print("Ingrese el monto que desea retirar (o 0 para salir): ");
            double montoRetirar = teclado.nextDouble();

            if (montoRetirar == 0) {
                continuar = false;
            } else if (montoRetirar < 0) {
                System.out.println("ERROR: El monto no puede ser negativo.");
            } else if (montoRetirar > saldoDisponible) {
                System.out.println("ERROR: Fondos insuficientes. No puede exceder el saldo.");
            } else {
                saldoDisponible -= montoRetirar;
                System.out.println("Retiro exitoso. Reciba su dinero.");
            }
            System.out.println();
        }
        System.out.println("Gracias por usar el cajero automático.");
    }
}
