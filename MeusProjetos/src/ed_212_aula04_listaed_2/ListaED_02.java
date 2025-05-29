package ed_212_aula04_listaed_2;

public class ListaED_02 {


    public int [] parametro;
    public int x;
    
    public ListaED_02 (int [] p) {
        
        parametro = p;
    }
    
    // Metodo Contar Números Negativos de uma LISTA.
    public int Exercicio01 () {
       int saida=0;
       
       for(int i=0; i<parametro.length;i++) {
           
           if(parametro[i]<0) {
               saida++; // saida=saida+1;
           }
       }
       
       return saida; 
    }
    
}
