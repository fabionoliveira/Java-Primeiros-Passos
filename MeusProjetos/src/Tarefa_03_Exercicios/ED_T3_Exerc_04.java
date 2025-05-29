 
package Tarefa_03_Exercicios;

import javax.swing.JOptionPane;

public class ED_T3_Exerc_04
{ /*Exercício 4: Escreva um método que recebe um array de números e devolve
    a posição onde se encontra o maior valor do array.
    Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
  */
    public static void main(String[] args)
    {
        int valores[] = {23,-45,500,68,-20,11,0,12,-36,500,100,-77,45,55,-3,256,389};
                
            JOptionPane.showConfirmDialog(null,MaiorPosicao(valores),"Maior valor e Posição",JOptionPane.PLAIN_MESSAGE);
        
    }
    
    public static String MaiorPosicao(int [] parametro)
    { String saida;
      int posi = 0;
      int maior = parametro[0];
      
       for ( int i=0; i < parametro.length; i++ )
       {
           if (parametro[i] > maior)
           {
               maior = parametro[i];
               posi = i;
           }
       }
       saida = "Maior valor é "+maior+ " e posição " +posi;
       
       return saida;
    }    
          
}
