package ed_212_aula04_objetos;

public class QtdeNegativos {

    public int [] Valores;
    
    public QtdeNegativos (int parametro  []) {
        
        Valores = parametro;
    }
    
    public int ContaNegativos () {

       int saida=0;
       
       for(int i=0; i<Valores.length;i++) {
           
           if(Valores[i]<0) {
               saida++; // saida=saida+1;
           }
       }
       
       return saida; 

        
    }

    
}

/*


*/