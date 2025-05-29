
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exerc_10
{   public static void main(String[] args)
    {
            String S, mensagem;
        double Valores [] = new double [5];
     
        int i=0;
        double media, teste, soma=0;
        
        // leitura
        for (i=0; i<Valores.length;i++) {
            
            do{
                S=JOptionPane.showInputDialog(null,"Digite a Nota: ","Nota "+i,JOptionPane.PLAIN_MESSAGE);
                
                teste=Double.parseDouble(S);
                if ((teste>10)||(teste<0)) {
                    JOptionPane.showMessageDialog(null, "Nota invalálida!\n"+teste+"\nDigite de 0 a 10", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }    
            while ((teste>10)||(teste<0));                

            
            Valores[i]=teste;
            soma=soma+teste;
            
        } // final do for
        
        media = soma/Valores.length;
        
        
        mensagem = "Notas " + Arrays.toString(Valores) + "\n";
        mensagem = mensagem + "Média Geral " + String.valueOf(media);
      
        
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
