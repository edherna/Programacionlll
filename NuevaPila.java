public class NuevaPila {
    protected Nodo2 inicio, termina;
    String TextoInicio="";
    Boolean RecibeParamnew=true;
    int contador=0;

    int TamanoDeP;

    public NuevaPila(){
        this.inicio = null;
        this.termina = null;

    }

    public void DatosGuar(){
        Nodo2 aux = inicio;
        String TextoINICIO = "";
        while(aux != null){
            
            if(aux.datoR==TextoInicio.charAt(contador)){
                System.out.println("---> " + aux.datoR + " Es Igual a " + TextoInicio.charAt(contador) + " <---");
            }else{
                System.out.println("---> " + aux.datoR + " No es igual a " + TextoInicio.charAt(contador) + " <---");
                RecibeParamnew=false;
            }
            TextoINICIO=TextoINICIO+aux.datoR;
            aux=aux.next2;
            contador++;
        }
        if(RecibeParamnew){
            System.out.println("<---Es Palindromo--->");
        }else{
            System.out.println("<---No es Palindromo--->");
        }
    }

    public void ValoresGuad(String dato){
        TextoInicio=dato;
        for (int i = 0; i < dato.length(); i++) {
            inicio = new Nodo2(dato.charAt(i),this.inicio);
            if(termina == null){
                termina = inicio;
            }
            TamanoDeP++;
        }
        System.out.println("<---Se ha registrado correctamente--->");
        DatosGuar();
    }


}