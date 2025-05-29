
package Tarefa_01_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Exerc_03 {
    public static void main(String[] args) {
        String linha;
        String s;
        double v1 []  = new double[10];
        double v2 []  = new double[10];
        
        for (int i=0; i<10; i++) {
            
            
            s = JOptionPane.showInputDialog(null,"Digite o valor["+i+"]:","Digitação",JOptionPane.QUESTION_MESSAGE);
            
            v1[i] = Double.parseDouble(s);
            
            v2[i] = v1[i] * v1[i];
            
        } /// fim do for
        
        linha = "V1= "+Arrays.toString(v1) + "\n V2= "+Arrays.toString(v2);
        
        JOptionPane.showMessageDialog(null,linha,"Resultado",JOptionPane.PLAIN_MESSAGE );
    
    }
    
    
}
