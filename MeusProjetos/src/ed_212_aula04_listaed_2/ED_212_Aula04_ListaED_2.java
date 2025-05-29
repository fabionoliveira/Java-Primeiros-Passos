/**
 * Conta quantos números Negativos tem na lista.
 * 
 * 
 * 
 */


package ed_212_aula04_listaed_2;

import javax.swing.JOptionPane;

public class ED_212_Aula04_ListaED_2 {

    public static void main(String[] args) {

        
        int Valores [] = {10,100,-1,2,33,34,35,6,37,8,10,33,-10,-9,100,-11,-12,0,10,10,10,-25}; 
        
        ListaED_02 local_ListaED_02 = new  ListaED_02 (Valores);
        
        JOptionPane.showMessageDialog(null, local_ListaED_02.Exercicio01());
        
        
    }
    
}
