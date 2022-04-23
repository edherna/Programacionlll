import java.util.Scanner;

public class EjercicioParen {
    static Scanner op = new Scanner(System.in);
    static ArchPila Pila = new ArchPila();
    public static void main(String[] args){
        
        boolean Verdadero = true;
        do{
            Options();
        String DatosGuar = op.nextLine(); 
            if(Integer.parseInt(DatosGuar)==1){
                Store();
            } else if(Integer.parseInt(DatosGuar)==2){
                POP();
            }else if(Integer.parseInt(DatosGuar)==4){
                Verdadero = false;
            }
            
        }while(Verdadero);
    }
    public static void Options(){
        System.out.println("""
        EJERCICIO 1 PARENTESIS PARCIAL #2

        Ingrese el numero del insiso que desea: 

        1: Evaluar
        2: Salir

        Ingrese una opcion: 
        """);
    }

    public static void Store()
    {
        System.out.println("verificar parentesis");
        String n=op.nextLine();
        Pila.Store(n);
    }
    public static void POP()
    {
        
        Pila.pop();
    }

}































