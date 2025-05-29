
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Exerc_01 {

   
    public static void main(String[] args) {
        int soma;
        int A1 [] = {1,0,5,-2,-5,7};
        int A [] = new int [6];
        
        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;
        
        soma = A[0]+A[1]+A[5];
        
        JOptionPane.showMessageDialog(null, soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        A[4] = 100;
        
        JOptionPane.showMessageDialog(null, Arrays.toString(A), "Array A", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
