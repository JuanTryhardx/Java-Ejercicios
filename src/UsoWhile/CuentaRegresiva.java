package UsoWhile;

public class CuentaRegresiva {

    public CuentaRegresiva() {
    }

    public void ejecutar(int numeroInicial) {
        System.out.println("--- INICIANDO CUENTA REGRESIVA ---");
        
        if (numeroInicial <= 0) {
            System.out.println("ERROR: Debe ingresar un numero entero positivo.");
            return;
        }

        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--;
            
            // Pausa opcional de 1 segundo para realismo en consola
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("¡Tiempo cumplido!");
    }
}
