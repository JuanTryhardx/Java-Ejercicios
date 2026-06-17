package UsoDoWhile;

import java.util.Scanner;

public class RegistroVentas {

    public RegistroVentas() {
    }

    public void ejecutar(Scanner teclado) {
        double montoTotalVentas = 0;
        String resumenProductos = "";
        char continuar;

        System.out.println("--- REGISTRO DE VENTAS ---");
        do {
            teclado.nextLine(); // Limpiar buffer
            System.out.print("Ingrese el nombre del producto vendido: ");
            String nombreProducto = teclado.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = teclado.nextDouble();

            if (precio > 0) {
                montoTotalVentas += precio;
                resumenProductos += "- " + nombreProducto + " ($" + precio + ")\n";
            } else {
                System.out.println("ERROR: El precio debe ser un numero positivo.");
            }

            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = teclado.next().charAt(0);
            System.out.println();
        } while (Character.toUpperCase(continuar) == 'S');

        System.out.println("--- RESUMEN DE VENTAS DEL DÍA ---");
        if (resumenProductos.isEmpty()) {
            System.out.println("No se realizaron ventas.");
        } else {
            System.out.print(resumenProductos);
            System.out.println("---------------------------------");
            System.out.println("MONTO TOTAL VENDIDO: $" + montoTotalVentas);
        }
    }
}
