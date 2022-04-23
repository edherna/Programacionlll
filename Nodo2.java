public class Nodo2 {
    public String dato;
    public char datoR;
    public Nodo2 next2;

    public Nodo2(char dato){
        this.datoR = dato;
    }
   
    public Nodo2(char dato, Nodo2 next2){
        this.datoR = dato;
        this.next2 = next2;
    }

}