package UsoIfElse;

public class AscensorTemperatura {

    public AscensorTemperatura() {
    }

    public void ejecutar(int pisoDeseado, double tempAmbiente) {
        double tempMinima = 18.0;
        double tempMaxima = 25.0;
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        if (tempAmbiente >= tempMinima && tempAmbiente <= tempMaxima) {
            System.out.println("Temperatura adecuada (" + tempAmbiente + "°C). Procediendo al movimiento...");
            
            if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
                System.out.println("El ascensor se mueve al piso deseado: " + pisoDeseado + ".");
            } else {
                System.out.println("ERROR: El piso " + pisoDeseado + " no es valido.");
            }
        } else {
            System.out.println("ERROR: La temperatura no es adecuada (" + tempAmbiente + "°C). No se permite el movimiento del ascensor por seguridad.");
        }
    }
}
