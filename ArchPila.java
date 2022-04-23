public class ArchPila {
    protected Nodo S, end;
    boolean Verd = true;
    int tam;

    public ArchPila(){
        this.S = null;
        this.end = null;

    }

    public void Store(String dato){
        int i=0;
        int tam=dato.length();
        while(i<tam){
            if(dato.charAt(i)=='('){
                Nodo nuevo = new Nodo('(');
                if(S == null){
                    S = nuevo;
                    end = nuevo;
                }else{
                    end.siguiente = nuevo;
                    end = nuevo;
                }
                tam++;
                }
            else if(dato.charAt(i)==')'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Verd = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            if(dato.charAt(i)=='{'){
                Nodo nuevo = new Nodo('{');
                if(S == null){
                    S = nuevo;
                    end = nuevo;
                }else{
                    end.siguiente = nuevo;
                    end = nuevo;
                }
                tam++;
                }
            else if(dato.charAt(i)=='}'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Verd = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            if(dato.charAt(i)=='['){
                Nodo nuevo = new Nodo('[');
                if(S == null){
                    S = nuevo;
                    end = nuevo;
                }else{
                    end.siguiente = nuevo;
                    end = nuevo;
                }
                tam++;
                }
            else if(dato.charAt(i)==']'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Verd = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            i++;
        }
        
        if (estaVacia()&& Verd==true){
                System.out.println("Es correcto :3");
                Verd=true;
        }else{
                S=null;
                System.out.println("Es Incorrecto :(");
                Verd=true;
        }
    }

    public void pop(){
        if(S != null){
            S = S.siguiente;
        }
    }

    public boolean estaVacia(){
        if(S == null){
            return true;
        }
        else{
            
            Verd=true;
            return false;
        }
    }


}

