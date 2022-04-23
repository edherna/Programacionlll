import java.util.Scanner;

public class EjercicioParen {
    static Scanner op = new Scanner(System.in);
    static ArchPila Pila = new ArchPila();
    public static void main(String[] args){
        
        boolean verd = true;
        do{
            OpcionesDelPrograma();
        String DatosGuar = op.nextLine(); 
            if(Integer.parseInt(DatosGuar)==1){
                ElementosGuardados();
            } else if(Integer.parseInt(DatosGuar)==2){
                POP();
            }else if(Integer.parseInt(DatosGuar)==4){
                verd = false;
            }
            
        }while(verd);
    }
    public static void OpcionesDelPrograma(){
        System.out.println("""
        EJERCICIO 1 PARENTESIS PARCIAL #2

        Ingrese el numero del insiso que desea: 

        1: Evaluar Parentesis
        2: Salir
        Ingrese una opcion: 
        """);
    }

    public static void ElementosGuardados()
    {
        System.out.println("verificar parentesis");
        String n=op.nextLine();
        Pila.ElementosGuardados(n);
    }
    public static void POP()
    {
        
        Pila.pop();
    }

}





























