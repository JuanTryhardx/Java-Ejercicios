package UsoWhile;

import java.util.Scanner;

public class ViajeCoche {

    public ViajeCoche() {
    }

    public void ejecutar(Scanner teclado) {
        char otroViaje = 'S';

        System.out.println("--- ASISTENTE DE VIAJE EN COCHE ---");
        while (Character.toUpperCase(otroViaje) == 'S') {
            System.out.print("Ingrese la distancia total del viaje (km): ");
            double distancia = teclado.nextDouble();

            System.out.print("Ingrese la velocidad promedio (km/h): ");
            double velocidad = teclado.nextDouble();

            if (distancia > 0 && velocidad > 0) {
                double tiempoEstimado = distancia / velocidad;
                System.out.printf("El tiempo estimado de viaje es de: %.2f horas.\n", tiempoEstimado);
            } else {
                System.out.println("ERROR: La distancia y la velocidad deben ser mayores a cero.");
            }

            System.out.print("¿Desea simular otro viaje? (S/N): ");
            otroViaje = teclado.next().charAt(0);
            System.out.println();
        }
        System.out.println("Simulador de viajes terminado.");
    }
}
