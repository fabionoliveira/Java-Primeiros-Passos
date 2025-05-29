
package Aula_semana_02_0408;

import javax.swing.JOptionPane;

public class Classe1 
{
    public static void main (String args[])
    {
        String a = JOptionPane.showInputDialog(null, "Digite uma palavra:");
        String b = JOptionPane.showInputDialog(null, "Digite outra palavra:");
        
        // compara se o conteúdo de a é o mesmo de b
        if ( a.equals ( b ) )
        {
            String msg = "As duas palavras digitadas são iguais:" + a ;
            JOptionPane.showMessageDialog(null, msg );
        }//FIM IF
        else
        {
            String msg = "As duas palavras digitadas são diferentes:" + a + " e " + b;
            JOptionPane.showMessageDialog(null, msg );
        }//FIM ELSE
        System.exit(0);// finaliza programa           
     
    }//MAIN

}//CLASSE
