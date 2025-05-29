
package ed_212_aula04_objetos;

import java.util.Arrays;

public class MaiorPosicao {
    
    public int [] Valores;
    
    public MaiorPosicao(int [] parametro){
    
        Valores = parametro;
    }
    
    public String MaiorEPosicao(int parametro[]){
        
        String saida="";
        int Maior= Valores[0],posicao=0;
        
        for (int i=0;i<Valores.length;i++) {
            
            if(Valores[i]>Maior) {
                
                Maior = Valores[i];
                posicao = i;
            }
            
        }
        
        saida = "O maior valor é "+Maior+"\nSua posição é "+posicao ;        
        return saida;
    
    
    
    
    }
    
    
    
}
