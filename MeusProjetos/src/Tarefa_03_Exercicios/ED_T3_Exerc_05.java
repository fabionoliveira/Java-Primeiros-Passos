
package Tarefa_03_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ED_T3_Exerc_05 {
    
    public static void main(String[] args) 
    {
        int valores[] = {23,500,-45,68,-20,11,0,12,-36,100,-77,45,55,-3,256,389};
                
            JOptionPane.showConfirmDialog(null,"Saida = "+Arrays.toString(MudaValor(valores)),"Muda valor da Array de Origem",JOptionPane.PLAIN_MESSAGE);
            
    }
    
    public static int[]  MudaValor(int[] parametro)
    {
        for (int i=0; i<parametro.length;i++)
        { 
            if ( parametro[i]%2 == 0)
            {
                parametro[i] = 1;           
            }
            else{
            
                parametro[i] = -1;            
            }
        }
        return parametro;   
    
    }
}
