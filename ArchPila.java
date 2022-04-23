public class ArchPila {
    protected Nodo1 st, fin;
    boolean Valid = true;
    int Size;

    public ArchPila(){
        this.st = null;
        this.fin = null;

    }

    public void ElementosGuardados(String dato){
        int i=0;
        int tam=dato.length();
        while(i<tam){
            if(dato.charAt(i)=='('){
                Nodo1 n = new Nodo1('(');
                if(st == null){
                    st = n;
                    fin = n;
                }else{
                    fin.next2 = n;
                    fin = n;
                }
                Size++;
                }
            else if(dato.charAt(i)==')'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Valid = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            if(dato.charAt(i)=='{'){
                Nodo1 n = new Nodo1('{');
                if(st == null){
                    st = n;
                    fin = n;
                }else{
                    fin.next2 = n;
                    fin = n;
                }
                Size++;
                }
            else if(dato.charAt(i)=='}'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Valid = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            if(dato.charAt(i)=='['){
                Nodo1 n = new Nodo1('[');
                if(st == null){
                    st = n;
                    fin = n;
                }else{
                    fin.next2 = n;
                    fin = n;
                }
                Size++;
                }
            else if(dato.charAt(i)==']'){
                if(estaVacia()){
                    System.out.println("Falso");
                    Valid = false;
                    pop();
                    break;
                }
                else{
                    pop();
                }
            }
            i++;
        }
        
        if (estaVacia()&& Valid==true){
                System.out.println("Correcto");
                Valid=true;
        }else{
                st=null;
                System.out.println("Incorrecto");
                Valid=true;
        }
    }

    public void pop(){
        if(st != null){
            st = st.next2;
        }
    }

    public boolean estaVacia(){
        if(st == null){
            return true;
        }
        else{
            
            Valid=true;
            return false;
        }
    }


}

