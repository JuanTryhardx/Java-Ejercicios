package UsoIfElse;

public class AscensorBasico {

    public AscensorBasico() {
    }

    public void ejecutar(int pisoDeseado) {
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            System.out.println("El piso " + pisoDeseado + " es valido. El ascensor se mueve al piso deseado.");
        } else {
            System.out.println("ERROR: El piso " + pisoDeseado + " no es valido. Rango permitido: " + pisoMinimo + " a " + pisoMaximo);
        }
    }
}
