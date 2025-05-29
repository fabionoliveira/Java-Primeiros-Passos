package ed_212_aula05_resolucao_Tarefa04;

/**
Exercício 3: Escreva um método que recebe um array de inteiros a e 
devolve um array de boolean onde, cada posição indique true se o 
elemento da posição correspondente de a é positivo e false caso seja negativo ou zero.

{1,-1,5,-5,8,-9} >> { true,false,true,false,true,false}

*/
public class Exercicio03 {

   public int Lista [];
    
    public Exercicio03 (int [] parametro) {
        Lista = parametro;
    }
    
    public  boolean []  Exercicio03 () {    
        
        boolean saida [] = new boolean [Lista.length];
        
        for(int i=0; i<this.Lista.length;i++) {
        
            if(this.Lista[i]>=0) {
                saida[i]=true;
            } else {
                saida[i]=false;
            }
        }
        
        return saida;
    }
    
    
}
