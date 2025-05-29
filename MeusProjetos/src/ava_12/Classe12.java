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
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Classe12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Classe12a a1 = new Classe12a();
        Classe12b b1 = new Classe12b();

        int tecla = 0;
        while (tecla != 5) {

            String saida = "\n1 Valores entre A e B"
                    + "\n2 Resultado dos valores entre A e B"
                    + "\n3 Fatorar um número"
                    + "\n4 Resultado da fatoração"
                    + "\n5 Finalizar Programa "
                    + "\nItem: ";
            
            tecla = Integer.parseInt(JOptionPane.showInputDialog(null, saida, "Menu", 3));

            switch (tecla) {
                case 1:
                    a1.lerAB();

                    break;
                case 2:
                    a1.exibir();
                    break;
                case 3:
                    b1.lerNum();
                    break;
                case 4:
                    b1.exibirfat();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}
