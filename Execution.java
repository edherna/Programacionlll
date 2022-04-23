import java.util.Scanner;

public class Execution {
    static Scanner OpcionesSys = new Scanner(System.in);
    static NuevaPila AlmacenLista = new NuevaPila();
    public static void main(String[] args){
            ValoresGuad();
    }

    public static void ValoresGuad()
    {
        System.out.println("BIENVENIDO AL PROGRAMA PALINDROMOS ");
        System.out.println("Ingrese la palabra para verificar si es palindromo: ");
        String n=OpcionesSys.nextLine();
        AlmacenLista.ValoresGuad(n);
    }
}