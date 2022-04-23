
public class Nodo {
    public String dato;
    public char datoR;
    public Nodo siguiente;

    public Nodo(char dato){
        this.datoR = dato;
    }
   
    public Nodo(char dato, Nodo siguiente){
        this.datoR = dato;
        this.siguiente = siguiente;
    }

}