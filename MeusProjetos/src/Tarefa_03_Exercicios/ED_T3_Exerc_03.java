
package Tarefa_03_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ED_T3_Exerc_03 {
    
    public static void main(String[] args)
    {
        int valores[] = {23,-45,68,-20,11,0,12,-36,100,-77,45,55,-3,256,-389};
                
            JOptionPane.showConfirmDialog(null,Boolean(valores),"Resolução Boolean",JOptionPane.PLAIN_MESSAGE);
    }
    
    public static String Boolean(int[] parametro)
    {   String saida = " ";
        boolean mensagem[] = new boolean[parametro.length];
        
        for (int i=0; i < parametro.length; i++ )
        {   
            if (parametro[i] <= 0){
            
                mensagem[i] = true ;
            }else{
                
                mensagem[i] = false ;
            }
            saida =  "Para cada posição indique true se o elemento da posição correspondente é \n" +
"positivo e false caso seja negativo ou zero.\nEntrada = "+Arrays.toString(parametro)+"\nSaida = "+Arrays.toString(mensagem) ;
           
        }        
        return saida;
    }
  
}




