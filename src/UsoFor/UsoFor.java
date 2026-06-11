package UsoFor;

public class UsoFor {
    private final int numeroTabla;

    public UsoFor(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public void hacer_ciclo() {
        System.out.println("\nTABLA DE MULTIPLICAR DEL " + this.numeroTabla);
        
        for (int i = 1; i <= 10; i++) {
            int resultado = this.numeroTabla * i;
            System.out.println(this.numeroTabla + " x " + i + " = " + resultado);
        }
    }
}
