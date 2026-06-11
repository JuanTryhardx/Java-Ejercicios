package UsoWhile;

public class UsoWhile {
    private int variable_control;

    public UsoWhile(int variable_control) {
        this.variable_control = variable_control;
    }

    public int getVariable_control() {
        return variable_control;
    }

    public void setVariable_control(int variable_control) {
        this.variable_control = variable_control;
    }
    
    public void hacer_while(){
        while(this.variable_control == 1){
            System.out.println("Hola....Saludo del buclee.......");
            System.out.println("Confirmar variable (1 para seguir / 0 para salir).......");               
            break; 
        }
    }
}
