
package EjercicioBinario;
import java.util.Scanner;

public class CompararBinarios {
    
    Scanner SacanData = new Scanner(System.in);
    ArbolBinario ArbolUno = new ArbolBinario();
    ArbolBinario ArbolDos = new ArbolBinario();
    public static void main(String[] args) {
        CompararBinarios IniciarEjercicio = new CompararBinarios();
        IniciarEjercicio.EjercicioCompararBinarios();
    }

    
    public void EjercicioCompararBinarios(){
        
        boolean BrakeMenu = false;
        int option;
        
        while(!BrakeMenu){
        System.out.println(" ");
        System.out.println("""
            Ejercicio CompararBinarios 
            1. Agregar
            2. PreOrden 
            3. InOrden  
            4. PostOrden 
            5  comparar Arboles
            6. Salir
            Selecciona la opción del menu
        """);
        option = SacanData.nextInt();
        SacanData.nextLine();
            if(option==1){
                    System.out.println("Ingrese dato Arbol Uno: ");  
                    ArbolUno.addNodoA(SacanData.nextInt());
                    System.out.println("Ingrese dato Arbol Dos: ");
                    ArbolDos.addNodoB(SacanData.nextInt());
            }
            else if(option==2){
                if( ArbolUno.isEmptyA()== false){
                    ArbolUno.preOrdenA(ArbolUno.RA);
                }
                if( ArbolDos.isEmptyB()== false){
                    ArbolDos.preOrdenB(ArbolDos.RB);
                } 
            }
            else if(option==3){
                if( ArbolUno.isEmptyA()== false){
                    ArbolUno.inOrdenA(ArbolUno.RA);

                }
                if( ArbolDos.isEmptyB()== false){
                    ArbolDos.inOrdenB(ArbolDos.RB);
                }
            }
            else if(option==4){
                if( ArbolUno.isEmptyA()== false){
                    ArbolUno.postOrdenA(ArbolUno.RA);
                }
                if( ArbolDos.isEmptyB()== false){
                    ArbolDos.postOrdenB(ArbolDos.RB);
                }
            }
            else if(option==5){
                if( ArbolUno.isEmptyA()== false){
                    ArbolUno.CompareAB(ArbolDos.RB,ArbolUno.RA);
                }
            }
            else if(option==6){
                BrakeMenu = true;
            }else {
                System.out.println("hay un error ingrese otra opcion");
            }
        }
    }

}