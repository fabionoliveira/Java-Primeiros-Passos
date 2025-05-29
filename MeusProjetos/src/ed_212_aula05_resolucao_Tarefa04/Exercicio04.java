/*
Exercício 4: Escreva um método que recebe um array de números e devolve 
a posição onde se encontra o maior valor do array. 
Se houver mais de um valor maior, devolver a posição da primeira ocorrência. 

{100,5,6,330,90,4,100} >>> 330 4
*/
package ed_212_aula05_resolucao_Tarefa04;

public class Exercicio04 {
    
    public int Lista [];
    
    public Exercicio04 (int [] parametro) {
        Lista = parametro;
    }
    
    public  String Exercicio04 () {
        String saida="";
        int Maior=this.Lista[0],posicao=0;
        
        for (int i=0;i<this.Lista.length;i++) {
            
            if(this.Lista[i]>Maior) {
                
                Maior = Lista[i];
                posicao = i;
            }
            
        }
        
        saida = "O maior valor é "+Maior+"\nSua posição é "+posicao;
        
        
        return saida;
    }
    
    
}
