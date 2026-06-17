package UsoWhile;

import java.util.Scanner;

public class TiendaLinea {

    public TiendaLinea(){
    }

    public void ejecutar(Scanner teclado) {
        double costoTotalCompra = 0;
        char agregarOtro = 'S';

        System.out.println("--- TIENDA EN LÍNEA ---");
        while (Character.toUpperCase(agregarOtro) == 'S') {
            System.out.print("Ingrese el precio del producto: ");
            double precio = teclado.nextDouble();
            
            System.out.print("Ingrese la cantidad: ");
            int cantidad = teclado.nextInt();

            if (precio > 0 && cantidad > 0) {
                double subtotal = precio * cantidad;
                costoTotalCompra += subtotal;
                System.out.println("Subtotal del producto agregado: $" + subtotal);
            } else {
                System.out.println("ERROR: Datos invalidos. El producto no se sumo.");
            }

            System.out.print("¿Desea agregar otro producto? (S/N): ");
            agregarOtro = teclado.next().charAt(0);
            System.out.println();
        }

        System.out.println("Compra finalizada. El costo total es: $" + costoTotalCompra);
    }
}
