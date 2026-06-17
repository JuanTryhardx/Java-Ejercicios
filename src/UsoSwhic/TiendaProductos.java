package UsoSwhic;

public class TiendaProductos {

    public TiendaProductos() {
    }

    public void ejecutar(char tipo, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser un numero positivo.");
            return;
        }

        double precioBase = 0;
        double descuento = 0;
        String nombreTipo = "";

        // Asignamos precios base de ejemplo para cada tipo
        switch (Character.toUpperCase(tipo)) {
            case 'A':
                nombreTipo = "Alimentos";
                precioBase = 1500.0;
                descuento = 0.10; // 10%
                break;
            case 'V':
                nombreTipo = "Vestimenta";
                precioBase = 5000.0;
                descuento = 0.05; // 5%
                break;
            case 'E':
                nombreTipo = "Electronicos";
                precioBase = 12000.0;
                descuento = 0.00; // Sin descuento
                break;
            default:
                System.out.println("ERROR: Tipo de producto no valido (Use A, V o E).");
                return;
        }

        double costoSinDescuento = precioBase * cantidad;
        double valorDescuento = costoSinDescuento * descuento;
        double costoTotal = costoSinDescuento - valorDescuento;

        System.out.println("--- RESUMEN DE COMPRA ---");
        System.out.println("Producto: " + nombreTipo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Costo total a pagar: $" + costoTotal);
    }
}
