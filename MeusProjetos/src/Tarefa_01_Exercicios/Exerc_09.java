
package Tarefa_01_Exercicios;

import javax.swing.JOptionPane;

public class Exerc_09 
{ public static void main(String[] atgs)
    {
        String S, mensagem;
        int Valores [] = new int [6];
     
        int i=0,teste;
        
        // leitura
        for (i=0; i<Valores.length;i++)
        {           
            do{
                S=JOptionPane.showInputDialog(null,"Digite um valor PAR: ","Valor "+i,JOptionPane.PLAIN_MESSAGE);
                
                teste=Integer.parseInt(S);
                if (teste%2!=0) {
                    JOptionPane.showMessageDialog(null, "Valores invalálido!\n"+teste+"\nDigite apenas Pares!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }    
            while(teste%2>0);                

            
            Valores[i]=teste;
            
        } // final do for
        
       
          mensagem = "Lista=";
        
        for (i=Valores.length-1; i>=0; i--)
        {        
            mensagem = mensagem + Valores[i] + ",";
        }
        
        JOptionPane.showMessageDialog(null, mensagem, "Array Invertido", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
