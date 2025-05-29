
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Exerc_02 {

public static void main(String[] args) {
    
    
        String s;
        int valores [] = new int [6];
        
        for (int i=0; i<6; i=i+1){
            
           s = JOptionPane.showInputDialog(null,"Digite o Valor", "Digitação do valor:"+i, JOptionPane.QUESTION_MESSAGE);
           
           valores[i]= Integer.parseInt(s);
            
        }
        
        JOptionPane.showMessageDialog(null, Arrays.toString(valores));
  
}//fim classe main
}//fim classe Exerc_02