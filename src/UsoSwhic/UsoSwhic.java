
package UsoSwhic;

public class UsoSwhic {
   public static String opcion;
    
    public static void hacer_condicional(){
        switch (UsoSwhic.opcion){
            case "A" -> System.out.print("Selecciono A");
            case "B" -> System.out.print("Selecciono B");
            case "C" -> System.out.print("Selecciono C");
            default -> System.out.print("Error de Seleccion....");
                
        }   
    }
}
