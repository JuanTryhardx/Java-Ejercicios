package UsoSwhic;

public class MenuRestaurante {

    public MenuRestaurante() {
    }

    public void ejecutar(int plato, int metodoPago) {
        double precioBase = 0;
        String nombrePlato = "";

        // 1. Selección del plato
        switch (plato) {
            case 1:
                nombrePlato = "Plato Ejecutivo";
                precioBase = 15000;
                break;
            case 2:
                nombrePlato = "Plato Especial";
                precioBase = 25000;
                break;
            case 3:
                nombrePlato = "Bebida Grande";
                precioBase = 5000;
                break;
            default:
                System.out.println("ERROR: Seleccion de plato no valida.");
                return;
        }

        double descuentoOrecargo = 0;
        String nombrePago = "";

        // 2. Selección del método de pago y sus condiciones habituales
        switch (metodoPago) {
            case 1:
                nombrePago = "Efectivo";
                descuentoOrecargo = -precioBase * 0.05; // 5% descuento
                break;
            case 2:
                nombrePago = "Tarjeta de credito";
                descuentoOrecargo = precioBase * 0.03; // 3% recargo por comision
                break;
            case 3:
                nombrePago = "Cheque";
                descuentoOrecargo = 0; // Sin cambios
                break;
            default:
                System.out.println("ERROR: Metodo de pago no valido.");
                return;
        }

        double total = precioBase + descuentoOrecargo;

        System.out.println("--- FACTURA RESTAURANTE ---");
        System.out.println("Item pedido: " + nombrePlato + " ($" + precioBase + ")");
        System.out.println("Metodo de pago: " + nombrePago);
        System.out.println("Ajuste por pago (Descuento/Recargo): $" + descuentoOrecargo);
        System.out.println("Total neto a pagar: $" + total);
    }
}
