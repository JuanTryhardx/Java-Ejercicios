package UsoDoWhile;

import java.util.Scanner;

public class ResultadosExamenes {

    public ResultadosExamenes() {
    }

    public void ejecutar(Scanner teclado) {
        double sumaNotas = 0;
        int contadorNotas = 0;
        char continuar;

        System.out.println("--- CONTROL DE EXÁMENES ---");
        do {
            System.out.print("Ingrese la nota del examen: ");
            double nota = teclado.nextDouble();

            if (nota >= 0) {
                sumaNotas += nota;
                contadorNotas++;
            } else {
                System.out.println("ERROR: La nota no puede ser negativa.");
            }

            System.out.print("¿Desea ingresar otro resultado? (S/N): ");
            continuar = teclado.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(continuar) == 'S');

        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.printf("Cantidad de examenes: %d | Promedio Final: %.2f\n", contadorNotas, promedio);
            
            // Asumiendo que se aprueba con 3.0 o más
            if (promedio >= 3.0) {
                System.out.println("Estado del estudiante: APROBADO.");
            } else {
                System.out.println("Estado del estudiante: REPROBADO.");
            }
        } else {
            System.out.println("No se ingresaron notas validas.");
        }
    }
}
