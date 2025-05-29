/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_testes;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class NumerosPrmos_JOp_2v {

    public static boolean ehPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog(null, "Entre com o Número: ");

        int n = Integer.parseInt(aux);
        boolean primo = ehPrimo(n);

        if (primo) {
            JOptionPane.showMessageDialog(null, "O número " + n + " é Primo!");
            //se for primo verifica todos os numeros menores que ele
            for (int i = n - 1; i > 0; i--) {
                if (ehPrimo(i) == true) {
                    JOptionPane.showMessageDialog(null, "O número " + n + " é Primo!");
                } 
            }
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n + " não é Primo!");
        }
    }
}
