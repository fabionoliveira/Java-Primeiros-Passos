/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aval_14;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Aval_14 {

    static String[] nome = new String[5];
    static double[] ida = new double[5];
    static double[] sal = new double[5];
    static int linha = -1;
    static int maiorid = 18;

    public static void armazenar(Scanner leitor) {
        for (int i = 0; i < 5; ++i) {
            linha += 1;
            System.out.print("\nDigite os dados");
            System.out.print("\nNome: ");
            nome[linha] = leitor.next();
            System.out.print("Idade: ");
            ida[linha] = leitor.nextInt();
            System.out.print("Salário: R$ ");
            sal[linha] = leitor.nextDouble();
        }
    }

    public static void mostrar() {
        double aux = 0;
        for (int i = 0; i <= linha; i++) {
            if (ida[i] < maiorid) {
                aux = sal[i] * 1.08; //  8%
            }
            if (ida[i] >= maiorid) {
                aux = sal[i] * 1.15; //  15%
            }
            System.out.print("\nNome: " + nome[i] + " - Idade:  " + String.format("%.0f", ida[i])
                    + " - Salário Inicial R$ " + String.format("%.2f", sal[i])
                    + " - Salário Reajustado R$: " + String.format("%.2f", aux));

            System.out.print("\n");
        }
    }

    public static void controle(Scanner leitor) {
        int itemmenu;
        OUTER:
        while (true) {
            System.out.print("\n***AVAL 14***");
            System.out.print("\n1 Ler\n2 Mostrar\n3 Sair\nItem:");
            itemmenu = leitor.nextInt();
            switch (itemmenu) {
                case 1:
                    armazenar(leitor);
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    System.out.print("***PROGRAMA FINALIZADO***");
                    break OUTER;
                default:
                    break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        controle(leitor);
        System.exit(0);
    }

}
