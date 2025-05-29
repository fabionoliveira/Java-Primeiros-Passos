
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc_07 
{   public static void main(String[] args)
        
   {
    
    String S, mensagem;
        int Valores [] = new int [10];
        
        int i, Maior, pos;
        
        // leitura
        for (i=0; i<10;i++) {
            
            S=JOptionPane.showInputDialog(null,"Digite o valor: ","Valor "+i,JOptionPane.PLAIN_MESSAGE);

            Valores[i]=Integer.parseInt(S);
        } // final do for
        
        Maior = Valores[0];
        pos=0;
       
        
        
        for(i=1;i<10;i++) {
            
            if(Valores[i]>Maior) {
                Maior =Valores[i]; // armazena o maior valor 
                pos = i; // armazena a posição do maior valor 
            }
        
        } // for de comparação 
        
        mensagem = "Valores: "+ Arrays.toString(Valores);
        mensagem = mensagem + "\n\n   Maior Valor= " + Maior;
        mensagem = mensagem + "\nPosição do Maior= " + pos;
        
        JOptionPane.showMessageDialog(null, mensagem, "Resultado",JOptionPane.INFORMATION_MESSAGE);
   }    
}
