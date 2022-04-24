import java.util.Scanner;

public class EjecutordeNombres {
    static Scanner Opcion = new Scanner(System.in);
    static Nuevapila3 lista = new Nuevapila3();
    public static void main(String[] args){
        
        boolean activo = true;
        do{
            Options();
        String InData = Opcion.nextLine(); 
            if(Integer.parseInt(InData)==1){
                Store();
            } else if(Integer.parseInt(InData)==2){
                POP();
            }else if(Integer.parseInt(InData)==3){
                activo = false;
            }
            
        }while(activo);
    }
    public static void Options(){
        System.out.println("""
            --->DUPLICADOS<---

        INGRESE LA OPCION
        1: REGISTRAR UNA PALABRA
        2: ELIMINAR
        3: SALIR
        INGRESE LA OPCION: 
        """);
    }

    public static void Store()
    {
        System.out.println("INGRESE LA PALABRA QUE DESEE: ");
        String NA=Opcion.nextLine();
        lista.Store(NA);
    }
    public static void POP()
    {
        
        lista.pop();
    }

}
