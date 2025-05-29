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
public class NumerosPrmos_JOp {

    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog(null,"Entre com o Número: ","Imprimindo números Primos",JOptionPane.QUESTION_MESSAGE
        );

    int n = Integer.parseInt(aux);
        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                primo = false;
            }
        }
        if (primo == true) {
            JOptionPane.showMessageDialog(null,
                    "O número " + n + " é Primo!",
                    "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else if (primo == false) {
            JOptionPane.showMessageDialog(null,
                    "O número " + n + " não é Primo!",
                    "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }

    }
}