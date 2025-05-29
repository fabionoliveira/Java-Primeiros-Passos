
package Tarefa_04_Objetos;

//CLASSE
public class QtdeElementosIguais {
    
    public int[] Valores;
    public int x = 77;
        
    //CONSTRUTOR
    public QtdeElementosIguais (int parametro[],int x){
        
        Valores = parametro;
    }
    
    //MÉTODO
    public int NumIguais(){
        
        int saida=0;
              
        for (int i=0; i<Valores.length;i++) {
            
            if(Valores[i]== x){
                saida++;
            }
        }
        
        return saida;
       }
    
 }// fim classe