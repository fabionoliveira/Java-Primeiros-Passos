package ed_212_aula05_resolucao_Tarefa04;
/*
Exercício 2: Crie um método que recebe um array de inteiros a e um valor 
inteiro x e retorna a quantidade de vezes que x aparece no array a.
*/
public class Exercicio02 {

    public int Lista [];
    
    public Exercicio02 (int [] parametro) {
        Lista = parametro;
    }
    
    public int  Exercicio02 ( int x)  {
        int saida=0;
        
        for (int i=0; i<this.Lista.length;i++) {
            
            if(this.Lista[i]==x){
                saida++;
            }
        }
        
        return saida;
    }
    
    public int  Exercicio02v02 ( int x)  {
        int saida=0;
        int i = 0;
        
        while(i<this.Lista.length) {
             
            if(this.Lista[i]==x){
                saida++;
            } 
           i++;
        }
        
     
        return saida;
    }
    
    
    
    


    
}
