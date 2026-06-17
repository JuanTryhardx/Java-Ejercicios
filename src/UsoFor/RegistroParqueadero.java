package UsoFor;

import java.util.Scanner;

public class RegistroParqueadero {

    public RegistroParqueadero() {
    }

    public void ejecutar(Scanner teclado) {
        System.out.println("--- REGISTRO DE PARQUEADERO ---");
        System.out.print("¿Cuantos vehiculos ingresaran al parqueadero?: ");
        int cantidadVehiculos = teclado.nextInt();
        teclado.nextLine(); // Limpiar buffer

        String acumuladorCarros = "";

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.println("\nVehiculo #" + i);
            System.out.print("Ingrese la placa del vehiculo: ");
            String placa = teclado.nextLine();

            System.out.print("Ingrese la hora de ingreso (ej. 14:30): ");
            String hora = teclado.nextLine();

            acumuladorCarros += "Vehiculo " + i + " -> Placa: " + placa + " | Hora Ingreso: " + hora + "\n";
        }

        System.out.println("\n--- RESUMEN DE VEHÍCULOS REGISTRADOS ---");
        if (acumuladorCarros.isEmpty()) {
            System.out.println("No se registraron vehiculos.");
        } else {
            System.out.print(acumuladorCarros);
        }
    }
}
