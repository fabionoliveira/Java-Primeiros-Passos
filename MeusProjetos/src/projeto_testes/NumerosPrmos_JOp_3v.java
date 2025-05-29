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
public class NumerosPrmos_JOp_3v {

    public static void main(String args[]) {
        int numero, contador, i;
        i = 2;
        contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite o numero "));
        
        while (i < numero) {
            if (numero % i == 0) contador++;
            i++;
        }
        
        if (contador > 0 || numero == 1) JOptionPane.showMessageDialog(null, "nao é primo " + numero);
        else JOptionPane.showMessageDialog(null, "é primo " + numero);
    }
}
