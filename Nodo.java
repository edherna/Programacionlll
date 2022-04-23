
public class Nodo {
    public String dato;
    public char datoR;
    public Nodo next2;

    public Nodo(char dato){
        this.datoR = dato;
    }
   
    public Nodo(char dato, Nodo next2){
        this.datoR = dato;
        this.next2 = next2;
    }

}