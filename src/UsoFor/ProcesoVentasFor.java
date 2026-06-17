package UsoFor;

import java.util.Scanner;

public class ProcesoVentasFor {

    public ProcesoVentasFor() {
    }

    public void ejecutar(Scanner teclado) {
        System.out.println("--- SISTEMA DE PROCESO DE VENTAS ---");
        System.out.print("¿Cuantos tipos de productos diferentes vendio?: ");
        int tiposProductos = teclado.nextInt();

        double totalGeneralVentas = 0;
        String productosVendidos = "";

        for (int i = 1; i <= tiposProductos; i++) {
            teclado.nextLine(); // Limpiar buffer
            System.out.println("\nRegistro de Venta #" + i);
            System.out.print("Nombre del producto: ");
            String nombre = teclado.nextLine();

            System.out.print("Precio unitario: ");
            double precio = teclado.nextDouble();

            System.out.print("Cantidad vendida: ");
            int cantidad = teclado.nextInt();

            if (precio >= 0 && cantidad >= 0) {
                double subtotal = precio * cantidad;
                totalGeneralVentas += subtotal;
                productosVendidos += "- " + nombre + " | Cantidad: " + cantidad + " | Subtotal: $" + subtotal + "\n";
            } else {
                System.out.println("ERROR: Datos invalidos en la venta actual. Registro ignorado.");
            }
        }

        System.out.println("\n--- COMPROBANTE DE VENTAS TOTALES ---");
        System.out.print(productosVendidos);
        System.out.println("-------------------------------------");
        System.out.println("TOTAL GENERAL DE VENTAS: $" + totalGeneralVentas);
    }
}
