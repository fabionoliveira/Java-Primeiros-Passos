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

class Classe12a {

    public int A = 0;
    public int B = 0;
    public int soma = 0;

    void lerAB() {

        A = Integer.parseInt(JOptionPane.showInputDialog(null, "***Digite dois valores inteiros sendo para A e B***"
                + "\nDigite um valor inteiro para A: ", "Valor", JOptionPane.QUESTION_MESSAGE));
        
        B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro para  B: ", "Valor", JOptionPane.QUESTION_MESSAGE));

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {

                soma += i;
            }
        }
    }

    void exibir() {
        String linhas;

        linhas = "\n ***Resultado***";
        linhas += "\n Soma de impares entre " + A + " e " + B + " é " + soma;

        JOptionPane.showMessageDialog(null, linhas, "Resultado Soma Impares", 1);

    }

}
