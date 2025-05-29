
package Tarefa_04_Objetos;

import javax.swing.JOptionPane;

public class OBjetos_Tarefa04 {
    
    public static void main(String[] args) {
       
       
        int [] numeros = {10,77,15,-1,33,77,54,-2,77};
        int x = 77;
                
        QtdeElementosIguais local_Exerc02 = new QtdeElementosIguais(numeros, x);
                      
        JOptionPane.showMessageDialog(null, local_Exerc02.NumIguais() );
    }
}


