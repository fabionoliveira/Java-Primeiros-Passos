
package Tarefa_03_Exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ED_T3_Exerc_01
{    
    public static void main(String[] args)
    {
        int valores[] = {23,-45,68,-20,11,12,-36,100,-77,45,55,-3,256,-389};
        
        JOptionPane.showMessageDialog(null,QtNegativos(valores),"Resultado",JOptionPane.INFORMATION_MESSAGE);
           
    }
    
    public static String QtNegativos(int[] parametro)
    {   String saida = "";
        int qt = 0;
        for (int i=0; i < parametro.length; i++ )
        {   
            if (parametro[i] < 0){
            
            qt++;    
            
            }
        }
        saida = "Quantidade de Elementos do\n array = "+ Arrays.toString(parametro)+"\nque são números Negativos:  "+String.valueOf(qt);
    
        return saida;
        
    }
}
