
package UsoIfElse;

public class UsoIfElse {
    //declarar las variables de los atributos....
    private String nombre_cliente;
    private int edad_cliente;
    
    //hacer el constructor
    public UsoIfElse(String dato_nombre, int dato_edad){
        this.nombre_cliente = dato_nombre;
        this.edad_cliente = dato_edad;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getEdad_cliente() {
        return edad_cliente;
    }

    public void setEdad_cliente(int edad_cliente) {
        this.edad_cliente = edad_cliente;
    }
    
    public void hacer_condicional(){
    if(this.edad_cliente >=18) {
        System.out.println("Cliente es mayor de edad");
    }
    else{
    System.out.print("Cliente es menor de edad");
            }
    }
}
