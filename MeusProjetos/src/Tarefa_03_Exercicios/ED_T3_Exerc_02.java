
package Tarefa_03_Exercicios;

import javax.swing.JOptionPane;

public class ED_T3_Exerc_02 {
    
    public static void main(String[] args)
    {
        int valores[] = {23,-45,68,-77,-20,11,12,-36,100,-77,45,55,-3,256,-389};
        int Valores2 [] = {1,-2,3,-4,5,-6,7,-8}; 
        int e02 = -77;
        
        JOptionPane.showMessageDialog(null, Exercicio02(valores,e02), "Qtde de elementos iguais a "+e02, JOptionPane.INFORMATION_MESSAGE);
           
    }
    public static int  Exercicio02 (int [] parametro, int x)  {
        int saida=0;
        
        for (int i=0; i<parametro.length;i++) {
            
            if(parametro[i]==x){
                saida++;
            }
        }
        
        return saida;
    }
}
