
package ed_212_aula04_objetos;

public class SubstituiElementos {
    
    public int [] Valores;
    
    public SubstituiElementos(int[] parametro){
        
        Valores = parametro;    
    }
    public int[] TrocaElementos(int[] parametro){
        
        for  (int i=0;i<Valores.length;i++) {
            if(Valores[i]%2==0){
                Valores[i]=1;
            } else {
                Valores[i]=-1;
            }
        }
        
        return Valores;   
    
    }
}// fim classe
