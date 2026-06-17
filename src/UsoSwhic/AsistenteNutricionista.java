package UsoSwhic;

public class AsistenteNutricionista {

    public AsistenteNutricionista() {
    }

    public void ejecutar(double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            System.out.println("ERROR: El peso y la altura deben ser mayores a cero.");
            return;
        }

        double imc = peso / (altura * altura);
        int rango = 0;

        // Clasificamos en un entero para poder usar el Switch
        if (imc < 18.5) {
            rango = 1;
        } else if (imc <= 24.9) {
            rango = 2;
        } else if (imc <= 29.9) {
            rango = 3;
        } else {
            rango = 4;
        }

        System.out.printf("Su IMC es: %.2f\n", imc);
        switch (rango) {
            case 1:
                System.out.println("Categoria: Bajo peso.");
                break;
            case 2:
                System.out.println("Categoria: Peso normal.");
                break;
            case 3:
                System.out.println("Categoria: Sobrepeso.");
                break;
            case 4:
                System.out.println("Categoria: Obesidad.");
                break;
        }
    }
}
