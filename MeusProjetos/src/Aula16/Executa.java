/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula16;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Executa {
    protected void processar(Figura Fig, double[] lados) {
        Fig.calc_area(lados);
        Fig.mostrarDados();
    }

    protected int n(Scanner ler) {
        int n;
        String Saida;

        Saida = "\nInforme quatidade de lados que tem sua figura: \n";
        Saida += "ATENÇão...\n";
        Saida += "Para figura quadrada digite apenas numero 1\n";
        System.out.print(Saida);
        n = ler.nextInt();

        return n;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Executa e1 = new Executa();

        String saida;

        saida = "\n*** MENU DE CONTROLE ***\n";
        saida += "[1] - Executa \n";
        saida += "[2] - Exibir informações \n";
        saida += "[3} - Sair \n";
        saida += "digite sua informação: ";

        int key;

        int n = e1.n(ler);
        double lados[];
        lados = new double[n];

        while (true) {
            System.out.print(saida);
            key = ler.nextInt();

            switch (key) {

            case 1:

                if (n == 1) {
                    System.out.print("\nDigite o valor do lado: ");
                    lados[0] = ler.nextDouble();

                } else if (n == 3) {
                    System.out.print("\nDigite o valor dos lados: ");
                    System.out.print("\nLado 1: ");
                    lados[0] = ler.nextDouble();
                    System.out.print("\nLado 2: ");
                    lados[1] = ler.nextDouble();
                    System.out.print("\nLado 3: ");
                    lados[2] = ler.nextDouble();

                } else if (n == 4) {
                    System.out.print("\nDigite o valor dos lados: ");
                    System.out.print("\nLado 1: ");
                    lados[0] = ler.nextDouble();
                    System.out.print("\nLado 2: ");
                    lados[1] = ler.nextDouble();

                } else if (n == 5) {
                    System.out.print("\nDigite o valor de Apótema: ");
                    lados[0] = ler.nextDouble();
                    System.out.print("\nDigite o valor de um dos lados: ");
                    lados[1] = ler.nextDouble();

                } else {
                    System.out.println("\nFigura inconcistente....");
                }
                break;

            case 2:
                if (n == 1) {
                    e1.processar(new Figura(), lados);

                } else if (n == 3) {
                    e1.processar(new Figura(), lados);

                } else if (n == 4) {
                    e1.processar(new Figura(), lados);

                } else if (n == 5) {
                    e1.processar(new Figura(), lados);

                }

                break;

            case 3:
                System.out.println("\nFinalizando o programa....");
                System.out.println("Agradecemos a preferencia. \n");
                System.exit(0);
                break;
            }
        }
    }
}

