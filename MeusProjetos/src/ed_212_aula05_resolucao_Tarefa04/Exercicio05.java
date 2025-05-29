/*

Exercício 5: Crie um método que recebe um array de inteiros  e 
substitui seus elementos de valor ímpar por -1 e os pares por +1
 */
package ed_212_aula05_resolucao_Tarefa04;


public class Exercicio05 {
    
    public int Lista [];
    
    public Exercicio05 (int [] parametro) {
        Lista = parametro;
    }
    
    public int [] Exercicio05 () {
        
        for  (int i=0;i<this.Lista.length;i++) {
            if(this.Lista[i]%2==0){
                this.Lista[i]=1;
            } else {
                this.Lista[i]=-1;
            }
        }
        
        return this.Lista;
    }
    
    
}
