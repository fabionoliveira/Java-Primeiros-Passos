
package Aula_semana_02_0408;

import javax.swing.JOptionPane;


public class Exemplo_1{
    public static void main (String[] args)
    {
        // Teste do message
        JOptionPane.showMessageDialog(null, "Olá mundo!" ,"*saudação*",JOptionPane.INFORMATION_MESSAGE);
        
        // Teste do Confirm
        int resp = JOptionPane.showConfirmDialog (null, "Deseja Sair ?","Confirma Operação!", JOptionPane.YES_NO_OPTION);
        
        if ( resp == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        
        }//fim if
        
        double x = Double.parseDouble (  JOptionPane.showInputDialog(null, "Digite x:") );
        
        double y = Double.parseDouble(   JOptionPane.showInputDialog(null, "Digite y:") );
        
        JOptionPane.showMessageDialog(null, "O valor de (x + y) é:" + (x + y) );
            
    }//MAIN



}//CLASSE