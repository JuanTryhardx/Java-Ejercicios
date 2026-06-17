package UsoFor;

import java.util.Scanner;

public class TiendaVirtualFor {

    public TiendaVirtualFor() {
    }

    public void ejecutar(Scanner teclado) {
        System.out.println("--- TIENDA VIRTUAL (CANTIDAD FIJA DE ITEMS) ---");
        System.out.print("¿Cuantos productos desea agregar al carrito?: ");
        int totalProductos = teclado.nextInt();

        double totalCompra = 0;
        String acumuladorProductos = "";

        for (int i = 1; i <= totalProductos; i++) {
            teclado.nextLine(); // Limpiar buffer
            System.out.println("\nProducto #" + i);
            System.out.print("Nombre del producto: ");
            String nombre = teclado.nextLine();

            System.out.print("Precio del producto: ");
            double precio = teclado.nextDouble();

            if (precio >= 0) {
                totalCompra += precio;
                acumuladorProductos += "- " + nombre + " ($" + precio + ")\n";
            } else {
                System.out.println("ERROR: Precio no valido. Producto omitido.");
            }
        }

        System.out.println("\n--- DETALLE DE SU CARRITO ---");
        System.out.print(acumuladorProductos);
        System.out.println("-----------------------------");
        System.out.println("TOTAL NETO A PAGAR: $" + totalCompra);
    }
}
