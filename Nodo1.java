
public class Nodo1 {
    public String dato;
    public char datoR;
    public Nodo1 next2;

    public Nodo1(char dato){
        this.datoR = dato;
    }
   
    public Nodo1(char dato, Nodo1 next2){
        this.datoR = dato;
        this.next2 = next2;
    }

}