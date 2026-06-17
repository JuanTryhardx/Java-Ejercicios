package Principal;

import UsoDoWhile.GestionTareas;
import UsoDoWhile.MenuComidasRapidas;
import UsoDoWhile.RegistroBiblioteca;
import UsoDoWhile.RegistroVentas;
import UsoDoWhile.ResultadosExamenes;
import UsoDoWhile.SensorTemperaturaDoWhile;
import UsoFor.UsoFor;
import UsoIfElse.UsoIfElse;
import UsoSwhic.UsoSwhic;
import UsoWhile.UsoWhile;
import java.util.Scanner;

import UsoIfElse.*;
import UsoSwhic.*;
import UsoWhile.*;
import UsoFor.*;

public class Ejemplo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite la edad: ");
        int edad_cliente = teclado.nextInt();
        
        System.out.println("Digite el nombre: ");
        String nombre_cliente = teclado.next();
        
        UsoIfElse objCondicional = new UsoIfElse(nombre_cliente, edad_cliente);
        objCondicional.hacer_condicional();
        
        System.out.println("Digite la opcion: ");
        UsoSwhic.opcion = teclado.next();
        UsoSwhic.hacer_condicional();
              
        System.out.println("\nDigite 1 para entrar al bucle While, o 0 para saltar: ");
        int opcion = teclado.nextInt();
        
        UsoWhile objWhile = new UsoWhile(opcion);
        objWhile.hacer_while();
        
        System.out.println("Digite 1 para repetir o 0 para apagar el bucle: ");
        int opcion2 = teclado.nextInt();
       
        objWhile.setVariable_control(opcion2); 
        System.out.println("Fin del programa.");
        
        System.out.println("\n Que tabla de multiplicar deseas ver?: ");
        int numero_elegido = teclado.nextInt();
        
        UsoFor objCiclo = new UsoFor(numero_elegido);
        objCiclo.hacer_ciclo();
        
        int modulo;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Condicionales");
            System.out.println("2. Switch");
            System.out.println("3. While y Do-While");
            System.out.println("4. For");
            System.out.println("5. Salir");
            System.out.print("Seleccione modulo: ");
            modulo = teclado.nextInt();
            System.out.println();

            switch (modulo) {
                case 1 -> menuIfElse(teclado);
                case 2 -> menuSwitch(teclado);
                case 3 -> menuWhile(teclado);
                case 4 -> menuFor(teclado);
                case 5 -> System.out.println("Programa terminado.");
                default -> System.out.println("Opcion invalida.");
            }
        } while (modulo != 5);
    }

    private static void menuIfElse(Scanner teclado) {
        System.out.println("--- MENU CONDICIONALES ---");
        System.out.println("1. Ascensor Basico");
        System.out.println("2. Ascensor con Limite de Peso");
        System.out.println("3. Sensor de Temperatura Ambiente");
        System.out.println("4. Sensor de Temperatura con Umbral de Alerta");
        System.out.println("5. Simulacion Combinada");
        System.out.print("Elija el ejercicio: ");
        int opcion = teclado.nextInt();
        System.out.println();

        switch (opcion) {
            case 1 -> {
                AscensorBasico ab = new AscensorBasico();
                System.out.print("Digite el piso: ");
                int piso = teclado.nextInt();
                ab.ejecutar(piso);
            }
            case 2 -> {
                AscensorPeso ap = new AscensorPeso();
                System.out.print("Ingrese el peso: ");
                double peso = teclado.nextDouble();
                System.out.print("Digite el piso: ");
                int pisoP = teclado.nextInt();
                ap.ejecutar(peso, pisoP);
            }
            case 3 -> {
                SensorTemperatura st = new SensorTemperatura();
                System.out.print("Ingrese la temperatura: ");
                double temp = teclado.nextDouble();
                st.ejecutar(temp);
            }
            case 4 -> {
                SensorUmbral su = new SensorUmbral();
                System.out.print("Ingrese la temperatura actual: ");
                double tActual = teclado.nextDouble();
                System.out.print("Defina el umbral: ");
                double umbral = teclado.nextDouble();
                su.ejecutar(tActual, umbral);
            }
            case 5 -> {
                AscensorTemperatura at = new AscensorTemperatura();
                System.out.print("Digite el piso: ");
                int pisoT = teclado.nextInt();
                System.out.print("Ingrese la temperatura: ");
                double tAmbiente = teclado.nextDouble();
                at.ejecutar(pisoT, tAmbiente);
            }
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuSwitch(Scanner teclado) {
        System.out.println("--- MENU SWITCH ---");
        System.out.println("1. Tienda de Productos");
        System.out.println("2. Asistente Nutricionista");
        System.out.println("3. Asistente de Cine");
        System.out.println("4. Campeonato Deportivo");
        System.out.println("5. Menu de Restaurante");
        System.out.print("Elija el ejercicio: ");
        int opcion = teclado.nextInt();
        System.out.println();

        switch (opcion) {
            case 1 -> {
                TiendaProductos tp = new TiendaProductos();
                System.out.print("Ingrese tipo (A/V/E): ");
                char tipo = teclado.next().charAt(0);
                System.out.print("Ingrese cantidad: ");
                int cant = teclado.nextInt();
                tp.ejecutar(tipo, cant);
            }
            case 2 -> {
                AsistenteNutricionista an = new AsistenteNutricionista();
                System.out.print("Ingrese peso: ");
                double peso = teclado.nextDouble();
                System.out.print("Ingrese altura: ");
                double altura = teclado.nextDouble();
                an.ejecutar(peso, altura);
            }
            case 3 -> {
                AsistenteCine ac = new AsistenteCine();
                System.out.print("Ingrese edad: ");
                int edad = teclado.nextInt();
                ac.ejecutar(edad);
            }
            case 4 -> {
                CampeonatoDeportivo cd = new CampeonatoDeportivo();
                System.out.print("Ingrese resultado: ");
                String res = teclado.next();
                cd.ejecutar(res);
            }
            case 5 -> {
                MenuRestaurante mr = new MenuRestaurante();
                System.out.print("Seleccione plato (1-3): ");
                int plato = teclado.nextInt();
                System.out.print("Seleccione pago (1-3): ");
                int pago = teclado.nextInt();
                mr.ejecutar(plato, pago);
            }
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuWhile(Scanner teclado) {
        System.out.println("--- MENU WHILE Y DO-WHILE ---");
        System.out.println("1. Cajero Automatico");
        System.out.println("2. Tienda en Linea");
        System.out.println("3. Simulador de Impresora");
        System.out.println("4. Viaje en Coche");
        System.out.println("5. Cuenta Regresiva");
        System.out.println("6. Juego de Adivinanza");
        System.out.println("7. Registro de Biblioteca");
        System.out.println("8. Menu de Comidas Rapidas");
        System.out.println("9. Sensor de Temperatura Stable");
        System.out.println("10. Control de Examenes");
        System.out.println("11. Gestion de Tareas");
        System.out.println("12. Registro de Ventas");
        System.out.print("Elija el ejercicio: ");
        int opcion = teclado.nextInt();
        System.out.println();

        switch (opcion) {
            case 1 -> new CajeroAutomatico().ejecutar(teclado);
            case 2 -> new TiendaLinea().ejecutar(teclado);
            case 3 -> new SimuladorImpresora().ejecutar(teclado);
            case 4 -> new ViajeCoche().ejecutar(teclado);
            case 5 -> {
                System.out.print("Ingrese numero: ");
                int numReg = teclado.nextInt();
                new CuentaRegresiva().ejecutar(numReg);
            }
            case 6 -> new JuegoAdivinanza().ejecutar(teclado);
            case 7 -> new RegistroBiblioteca().ejecutar(teclado);
            case 8 -> new MenuComidasRapidas().ejecutar(teclado);
            case 9 -> new SensorTemperaturaDoWhile().ejecutar(teclado);
            case 10 -> new ResultadosExamenes().ejecutar(teclado);
            case 11 -> new GestionTareas().ejecutar(teclado);
            case 12 -> new RegistroVentas().ejecutar(teclado);
            default -> System.out.println("Opcion no valida.");
        }
    }

    private static void menuFor(Scanner teclado) {
        System.out.println("--- MENU FOR ---");
        System.out.println("1. Registro de Vehiculos");
        System.out.println("2. Carrito de Tienda Virtual");
        System.out.println("3. Agenda de Contactos");
        System.out.println("4. Sumatoria de Numeros");
        System.out.println("5. Sistema de Ventas Totales");
        System.out.print("Elija el ejercicio: ");
        int opcion = teclado.nextInt();
        System.out.println();

        switch (opcion) {
            case 1 -> new RegistroParqueadero().ejecutar(teclado);
            case 2 -> new TiendaVirtualFor().ejecutar(teclado);
            case 3 -> new AgendaContactos().ejecutar(teclado);
            case 4 -> new SumaNumerosFor().ejecutar(teclado);
            case 5 -> new ProcesoVentasFor().ejecutar(teclado);
            default -> System.out.println("Opcion no valida.");
        }

    }

    }
    