
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc_08
{   public static void main (String[] args)
    {
        String S, mensagem;
        int Valores [] = new int [5];
     
        int i=0;
        
        // leitura
        for (i=0; i<Valores.length;i++)
        {           
            S=JOptionPane.showInputDialog(null,"Digite o valor: ","Valor "+i,JOptionPane.PLAIN_MESSAGE);

            Valores[i]=Integer.parseInt(S);
        } // final do for
        
        mensagem = "Lista=";
        
        for (i=Valores.length-1; i>=0; i--)
        {       
            mensagem = mensagem + Valores[i] + ",";
        }
        
        JOptionPane.showMessageDialog(null, mensagem, "Array Invertido", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(Arrays.toString(Valores));
        System.out.println(mensagem);
    
    }
}
