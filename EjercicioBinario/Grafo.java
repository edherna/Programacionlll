
package EjercicioBinario;

public class Grafo {
    int dato;
    Grafo hijoIzquierdoB;
    Grafo hijoDerechoB;
    
    public Grafo(int dato){
        this.dato = dato;
        this.hijoIzquierdoB = null;
        this.hijoDerechoB = null;
    }   
    public String toString(){
        return "su dato es " + this.dato;
    }

}