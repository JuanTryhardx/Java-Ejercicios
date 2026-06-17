package UsoDoWhile;

import java.util.Scanner;

public class MenuComidasRapidas {

    public MenuComidasRapidas() {
    }

    public void ejecutar(Scanner teclado) {
        double totalPedido = 0;
        int opcion;

        System.out.println("--- MENÚ COMIDAS RÁPIDAS ---");
        do {
            System.out.println("1. Hamburguesa ($12000)");
            System.out.println("2. Perro Caliente ($8000)");
            System.out.println("3. Papas Fritas ($5000)");
            System.out.println("4. Gaseosa ($4000)");
            System.out.println("5. Finalizar Pedido");
            System.out.print("Elija una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    totalPedido += 12000;
                    System.out.println("Hamburguesa agregada.");
                    break;
                case 2:
                    totalPedido += 8000;
                    System.out.println("Perro Caliente agregado.");
                    break;
                case 3:
                    totalPedido += 5000;
                    System.out.println("Papas Fritas agregadas.");
                    break;
                case 4:
                    totalPedido += 4000;
                    System.out.println("Gaseosa agregada.");
                    break;
                case 5:
                    System.out.println("Procesando cierre de cuenta...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 5);

        System.out.println("Costo total de los pedidos: $" + totalPedido);
        System.out.println("¡Muchas gracias por su compra!");
    }
}
