

public class Nuevapila3 {
    protected Nodo inicio, termina;

    int TamanoDeN;

    public Nuevapila3(){
        this.inicio = null;
        this.termina = null;

    }

    public void Data(){
        Nodo auxiliarNe = inicio;
        String PrimerTexto = "";
        String TextoDos2 = "";
        String TextoNumero3="";
        Boolean Evaluacion1 = true;
        while(auxiliarNe != null){
            if(auxiliarNe.datoR=='('){
                PrimerTexto = PrimerTexto+ auxiliarNe.datoR;
            }else if(auxiliarNe.datoR==')'){
                TextoDos2 = TextoDos2+ auxiliarNe.datoR;
            }
            
                
            
            auxiliarNe=auxiliarNe.siguiente;
        }
        TextoNumero3 = PrimerTexto + TextoDos2;
        if(TextoNumero3.length()==2 && TextoNumero3.equals("()")){
            Evaluacion1= false;
            
        }else if(TextoNumero3.length()>2 ){
            Evaluacion1 = true;

            if(TextoNumero3.length()%2==0){
                Evaluacion1= true;
            }else{
                Evaluacion1= false;
            }
        }else if(TextoNumero3.length()<2 ){
            Evaluacion1= false;
            
        }
        System.out.println(Evaluacion1);

        limpiar ();
    }

    public void Store(String dato){

        for (int i = 0; i < dato.length(); i++) {
            inicio = new Nodo(dato.charAt(i),this.inicio);
            if(termina == null){
                termina = inicio;
            }
            TamanoDeN++;
        }
        Data();
    }

    public void pop(){
        if(inicio != null){
            inicio = inicio.siguiente;
        }
    }

    public void limpiar (){
        while(inicio != null){
            pop();
        }
    }

}
