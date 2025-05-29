
package Tarefa_01_Exercicios;

import javax.swing.JOptionPane;


public class Exerc_04 {
    public static void main(String[] args) {
        String s;
         double v1 [] = new double [8];
         double soma;
         int pos1=0, pos2=0;
        
         for (int i=0; i<8; i++) {
            
            
            s = JOptionPane.showInputDialog(null,"Digite o valor["+i+"]:","Digitação",JOptionPane.QUESTION_MESSAGE);
            
            v1[i] = Double.parseDouble(s);
            
            
         } /// fim do for

         s = JOptionPane.showInputDialog(null, "Digite a Primeira posição: ", "Digitação",JOptionPane.QUESTION_MESSAGE);            
            
         pos1 = Integer.parseInt(s);
            
         s = JOptionPane.showInputDialog(null, "Digite a Segunda posição: ", "Digitação",JOptionPane.QUESTION_MESSAGE);            
            
         
         pos2 = Integer.parseInt(s);
         
         
         
         if ((pos1>7)||(pos2>7)) {
             
             JOptionPane.showMessageDialog(null, "Posição 1 ou 2 é maior que 7. Operação não permitida");
         } else {
             soma = v1[pos1] + v1[pos2];
             JOptionPane.showMessageDialog(null, soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
         }  
        
        
        
    }
    
}
