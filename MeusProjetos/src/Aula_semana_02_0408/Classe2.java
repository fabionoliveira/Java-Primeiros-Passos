
package Aula_semana_02_0408;

import javax.swing.JOptionPane;

public class Classe2 {
    /*Atributos são variáveis globais da classe */
    public double n1, n2;
    public double media;
    
    /* Métodos são functions e voids da classe*/
    public void ler()
    {
        n1 = Double.parseDouble ( JOptionPane.showInputDialog(null, "Digite a Nota 1:") );
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Nota 2:") ); 
      
    }//FIM LEITURA
    public void calcular ()
    {
        media = ( n1 + n2 )/2;    
    }//FIM CALCULAR
    
    public void exibir ()
    {
        JOptionPane.showMessageDialog( null , "Sua média é " + media); 
    }//FIM EXIBIR
    
    public static void main ( String args[] )
    {
        /* Instanciando a Classe */
        Classe2 obj = new Classe2 ();
        
        JOptionPane.showMessageDialog ( null, "*** Média entre dois valores ***");
        
        obj.ler();
        obj.calcular();
        obj.exibir ();
        System.exit(0);  
    
    }//FIM MAIN    

}//CLASSE
