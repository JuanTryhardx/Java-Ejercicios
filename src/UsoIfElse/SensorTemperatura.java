package UsoIfElse;

public class SensorTemperatura {

    public SensorTemperatura() {
    }

    public void ejecutar(double tempActual) {
        double tempMinima = 18.0;
        double tempMaxima = 25.0;

        if (tempActual >= tempMinima && tempActual <= tempMaxima) {
            System.out.println("La temperatura es adecuada (" + tempActual + "°C).");
        } else {
            System.out.println("La temperatura esta fuera del rango deseado (" + tempActual + "°C).");
        }
    }
}
