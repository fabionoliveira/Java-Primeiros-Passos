
package ed_212_aula05_resolucao_Tarefa04;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Ed_212_Aula05_resolucao_Tarefa04 {

    
    public static void main(String[] args) {
        int e02 = -33;
        
        int [] Valores =  {10,-10,33,5,-5,6,-6,44,-44,33,-33,33};
        
        
        Exercicio01   myExec1 = new Exercicio01 (Valores);
        Exercicio02   myExec2 = new Exercicio02 (Valores);
        Exercicio03   myExec3 = new Exercicio03 (Valores);
        Exercicio04   myExec4 = new Exercicio04 (Valores);
        Exercicio05   myExec5 = new Exercicio05 (Valores);
        
        JOptionPane.showMessageDialog(null, myExec1.contaNegativo(), "Qtde de Negativos"+Arrays.toString(Valores), JOptionPane.INFORMATION_MESSAGE);
        
        
        
        JOptionPane.showMessageDialog(null, myExec2.Exercicio02(e02), Arrays.toString(Valores)+"Qtde de elementos iguais a "+e02, JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, myExec2.Exercicio02v02(e02), "Qtde de elementos iguais a "+e02, JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, Arrays.toString(myExec3.Exercicio03()), "Array Remodelada "+Arrays.toString(Valores), JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, myExec4.Exercicio04(), "Maior valor e posição "+Arrays.toString(Valores), JOptionPane.INFORMATION_MESSAGE);
    
        
        
        JOptionPane.showMessageDialog(null, Arrays.toString(myExec5.Exercicio05()), "Array Remodelada Exec05 "+Arrays.toString(Valores), JOptionPane.INFORMATION_MESSAGE);
        
        
    } /// final do main
    
    
    public static int [] DigitaArray() {
        String entrada;
        int tamanho;
        
        entrada = JOptionPane.showInputDialog(null, "Digite o Tamanho do Array: ");
        tamanho = Integer.parseInt(entrada);
        
        int valores [] = new int [tamanho];
        
        for(int i=0;i<valores.length;i++) {
            
            entrada = JOptionPane.showInputDialog(null, "Digite o Valor["+i+"]: ");
            valores[i]=Integer.parseInt(entrada);
        
        }
        
        return valores;
    }
    
    

    
    

   
    
    
   
    
    
    
    
    
    
} ////////////////////////////////////////////////////////// fim classe
