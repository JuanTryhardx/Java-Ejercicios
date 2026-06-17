package UsoIfElse;

public class AscensorPeso {

    public AscensorPeso() {
    }

    public void ejecutar(double pesoUsuario, int pisoDeseado) {
        double pesoMaximo = 400.0; //limite de peso en kg
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        if (pesoUsuario <= pesoMaximo) {
            if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
                System.out.println("Peso adecuado. El ascensor se mueve al piso " + pisoDeseado + ".");
            } else {
                System.out.println("ERROR: El piso " + pisoDeseado + " no es valido.");
            }
        } else {
            System.out.println("ERROR: El ascensor esta sobrecargado. Limite: " + pesoMaximo + " kg. Ingreso: " + pesoUsuario + " kg.");
        }
    }
}
