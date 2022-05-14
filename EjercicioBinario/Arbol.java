package EjercicioBinario;

public class Arbol {

    int dato;
    Arbol hijoIzquierdoA;
    Arbol hijoDerechoA;

    public Arbol(int dato){
        this.dato = dato;
        this.hijoIzquierdoA = null;
        this.hijoDerechoA = null;
    }

    public String toString(){
        return "su dato es " + this.dato;
    }

}
