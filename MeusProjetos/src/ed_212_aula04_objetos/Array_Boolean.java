
package ed_212_aula04_objetos;

public class Array_Boolean {
    
    public int[] Valores;
    
    public Array_Boolean(int parametro[]){
    
        Valores = parametro;    
    }
    
    public boolean[] Remodelada_exerc04(int[] parametro){
        
        boolean saida [] = new boolean [parametro.length];
        
        for(int i=0; i<Valores.length;i++) {
        
            if(Valores[i]>=0) {
                saida[i]=true;
            } else {
                saida[i]=false;
            }
        }
        
        return saida;
    }

}
