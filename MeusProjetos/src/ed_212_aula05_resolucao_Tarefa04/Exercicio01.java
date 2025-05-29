package ed_212_aula05_resolucao_Tarefa04;
/*
Exercício 1: Crie um método que recebe um array de inteiros e retorna 
a quantidade de elementos do array que são números negativos. 
*/

public class Exercicio01 {


    public int Lista [];
    
    public Exercicio01 (int [] parametro) {
        Lista = parametro;
    }
    
    
    public int contaNegativo () {
       int saida=0;
       
       for(int i=0; i<this.Lista.length;i++) {
           
           if(this.Lista[i]<0) {
               saida++; // saida=saida+1;
           }
       }
       
       return saida; 
    }

    
}
