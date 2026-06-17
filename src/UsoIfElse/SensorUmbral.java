package UsoIfElse;

public class SensorUmbral {

    public SensorUmbral() {
    }

    public void ejecutar(double tempActual, double umbralAlerta) {
        if (tempActual > umbralAlerta) {
            System.out.println("¡ALERTA! La temperatura (" + tempActual + "°C) ha superado el umbral critico (" + umbralAlerta + "°C).");
        } else {
            System.out.println("La temperatura es normal (" + tempActual + "°C).");
        }
    }
}
