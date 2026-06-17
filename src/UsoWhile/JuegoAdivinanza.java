package UsoWhile;

import java.util.Scanner;

public class JuegoAdivinanza {

    public JuegoAdivinanza() {
    }

    public void ejecutar(Scanner teclado) {
        // Genera un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intentoUsuario = 0;

        System.out.println("--- JUEGO DE ADIVINANZA ---");
        System.out.println("He pensado un numero entre 1 y 100. ¡Intenta adivinarlo!");

        while (intentoUsuario != numeroAleatorio) {
            System.out.print("Introduce tu numero: ");
            intentoUsuario = teclado.nextInt();

            if (intentoUsuario < numeroAleatorio) {
                System.out.println("Pista: El numero es MAYOR.");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("Pista: El numero es MENOR.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el numero correctamente.");
            }
            System.out.println();
        }
    }
}
