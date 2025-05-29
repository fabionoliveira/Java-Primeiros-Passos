/*
 nova versão do projeto Aula04_REsolução_Tarefa04 - colocando todos os objs em um só 
*/
package ed_212_aula05_resolucao_Tarefa04_V02;


public class Tarefa04 {
   
    public int Lista [];
    
    public Tarefa04 (int [] parametro) {
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
