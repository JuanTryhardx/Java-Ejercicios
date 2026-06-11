package Principal;

import UsoFor.UsoFor;
import UsoIfElse.UsoIfElse;
import UsoSwhic.UsoSwhic;
import UsoWhile.UsoWhile;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        //aqui se va a ejecutar todo...
        //obj interactua con la consola y el usuario
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite la edad: ");
        int edad_cliente = teclado.nextInt();
        
        System.out.println("Digite el nombre: ");
        String nombre_cliente = teclado.next();
        
        // Se crea el objeto del condicipnal
        UsoIfElse objCondicional = new UsoIfElse(nombre_cliente, edad_cliente);
        objCondicional.hacer_condicional();
        
        // Uso del Switch
        System.out.println("Digite la opcion: ");
        UsoSwhic.opcion = teclado.next();
        UsoSwhic.hacer_condicional();
              
        //se crea el objeto para el ciclo
        System.out.println("\nDigite 1 para entrar al bucle While, o 0 para saltar: ");
        int opcion = teclado.nextInt();
        
        UsoWhile objWhile = new UsoWhile(opcion);
        objWhile.hacer_while();
        
        System.out.println("Digite 1 para repetir o 0 para apagar el bucle: ");
        int opcion2 = teclado.nextInt();
       
        objWhile.setVariable_control(opcion2); 
        System.out.println("Fin del programa.");
        
        //ciclo for
        System.out.println("\n Que tabla de multiplicar deseas ver?: ");
        int numero_elegido = teclado.nextInt();
        
        // Se crea el objeto para el ciclo for
        UsoFor objCiclo = new UsoFor(numero_elegido);
        objCiclo.hacer_ciclo();
    }
}
