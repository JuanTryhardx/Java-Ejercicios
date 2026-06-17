package UsoDoWhile;

import java.util.Scanner;

public class SensorTemperaturaDoWhile {

    public SensorTemperaturaDoWhile() {
    }

    public void ejecutar(Scanner teclado) {
        double tempActual;
        double tempMinima = 18.0;
        double tempMaxima = 25.0;

        System.out.println("--- SENSOR DE TEMPERATURA ---");
        do {
            System.out.print("Ingrese la temperatura actual ambiental (°C): ");
            tempActual = teclado.nextDouble();

            if (tempActual < tempMinima || tempActual > tempMaxima) {
                System.out.println("¡ALERTA! Temperatura fuera del rango aceptable (18°C a 25°C). Intente nuevamente.");
                System.out.println();
            }
        } while (tempActual < tempMinima || tempActual > tempMaxima);

        System.out.println("Temperatura estable (" + tempActual + "°C). Lectura correcta.");
    }
}
