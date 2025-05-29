/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ava_12;

/**
 *
 * @author FO
 */
import javax.swing.JOptionPane;

class Classe12b {

    public int Num = 0;

    public int fator = 1;

    void lerNum() {
        Num = Integer.parseInt(JOptionPane.showInputDialog(null, "***Digite um valore inteiro para fatorar***"
                + "\nDigite um valor inteiro: ", "Fatorial", JOptionPane.QUESTION_MESSAGE));

        for (int i = 1; i <= Num; i++) {
            fator *= i;

        }
    }

    void exibirfat() {
        String linhas;

        linhas = "\n ***Resultado***";
        linhas += "\nO número " + Num + " fatorado é " + fator;

        JOptionPane.showMessageDialog(null, linhas,"Resultado Fatorial", 1);
    }
}
