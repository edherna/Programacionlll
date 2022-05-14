package EjercicioBinario;

public class ArbolBinario {
    Arbol RA;// raiz A
    Grafo RB;// raiz B

    public ArbolBinario(){
        this.RA = null;
        this.RB = null;
    }

    //insertar un nodo
    public void addNodoA(int dato){
        Arbol  nuevo = new Arbol(dato);
        if(RA == null){
            RA = nuevo;
        }else{
            Arbol aux = RA;
            Arbol padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    //va a la izquierda
                    aux= aux.hijoIzquierdoA;
                    if(aux==null){
                        padre.hijoIzquierdoA = nuevo;
                        return;
                    }
                }else{
                    //va a la derecha
                    aux = aux.hijoDerechoA;
                    if(aux == null){
                        padre.hijoDerechoA = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public void addNodoB(int dato){
        Grafo nuevo = new Grafo(dato);
        if(RB == null){
            RB = nuevo;
        }else{
            Grafo aux = RB;
            Grafo GrPrincipal;
            while(true){
                GrPrincipal=aux;
                if(dato<aux.dato){
                    
                    aux= aux.hijoIzquierdoB;
                    if(aux==null){
                        GrPrincipal.hijoIzquierdoB = nuevo;
                        return;
                    }
                }else{
                    
                    aux = aux.hijoDerechoB;
                    if(aux == null){
                        GrPrincipal.hijoDerechoB = nuevo;
                        return;
                    }
                }
            }
        }       
    }

    public void inOrdenA(Arbol root){
        if(root!= null){
            inOrdenA(root.hijoIzquierdoA);
            System.out.print(root.dato + ", ");
            inOrdenA(root.hijoDerechoA);
        }
    }

    public void inOrdenB(Grafo nodo){
        if(nodo.hijoIzquierdoB != null){   
            inOrdenB(nodo.hijoIzquierdoB);}  
        System.out.print(", "+nodo.dato);     
        if(nodo.hijoDerechoB != null){  
            inOrdenB(nodo.hijoDerechoB); 
        }         
    }

    //recorrer árbol preOrden R-I-D
    public void preOrdenA(Arbol root){
        if(root!= null){
            System.out.print(root.dato + ", ");
            preOrdenA(root.hijoIzquierdoA);
            preOrdenA(root.hijoDerechoA);
        }

    }

    public void preOrdenB(Grafo nodo){
        System.out.print(" "+nodo.dato);     
        if(nodo.hijoIzquierdoB != null){   
            preOrdenB(nodo.hijoIzquierdoB);}  
        if(nodo.hijoDerechoB != null){  
            preOrdenB(nodo.hijoDerechoB); 
        }                 
    }

    //recorrer árbol postOrden I-D-R
    public void postOrdenA(Arbol root){
        if(root!= null){
            postOrdenA(root.hijoIzquierdoA);
            postOrdenA(root.hijoDerechoA);
            System.out.print(root.dato + ", ");
           
        }

    }

    public void postOrdenB(Grafo nodo){
        if(nodo.hijoIzquierdoB != null){   
            postOrdenB(nodo.hijoIzquierdoB);}  
        if(nodo.hijoDerechoB != null){  
            postOrdenB(nodo.hijoDerechoB); 
        }
        System.out.print(" "+nodo.dato);     
    }

    //árbol vacío
    public boolean isEmptyA(){
        return this.RA == null;  
    }

    public boolean isEmptyB(){
        if( RB == null){
            System.out.println("No hay elementos ");
            return true;
        }else{
            return false;
        }           
    }

    public void CompareAB(Grafo nodo,Arbol root){
        if(nodo != null && root!= null){   
            CompareAB(nodo.hijoIzquierdoB,root.hijoIzquierdoA);  
            if(nodo.dato == root.dato){
                System.out.println(" Arbol Uno "+root.dato +" Arbol Dos "+nodo.dato+" Comparacion son iguales");
            }else{
                System.out.println(" Arbol Uno "+root.dato +" Arbol Dos"+nodo.dato+" Comparacion no son iguales");
            }
            CompareAB(nodo.hijoDerechoB,root.hijoDerechoA); 
        }
    }

}