/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_12_exer_A;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe12A {

    public static void ler(int a, int b) {
        System.out.println("=-=-=-=-=-=-=-= Exibir Resultado =-=-=-=-=-==-=-=-=-=-=-=-=");
        int i = 0, soma = 0;
        if (a < b) {
            for (i = a; i <= b; i += 1) {
                if (i % 2 != 0) {

                    soma += i; // somar
                    System.out.println("valor encontrado:" + i + ", somado com o resultado anterior = " + soma);
                }
            }
        }

        
        if (b < a) {
            for (i = b; i <= a; i += 1) {
                if (i % 2 != 0) {

                    soma += i; // somar
                    System.out.println("Valor encontrado:" + i + ", somado com o resultado anterior = " + soma);
                }
            }
        }

        System.out.println(">> O somatório de todos os números ímpares entre A e B :\nResultado = " + soma + ".\n");

    }

    public static int fatorial(int NUM) {
        int fat = 1;
        for (int i = NUM; i >= 1; i--) {
            fat = fat * i; // fatora

            //System.out.println("Passo "+ (NUM+1 - i) +"FatoraL de"+ NUM +" = "+ fat+".");
            System.out.println("Passo "+ (i) +" = "+ fat+".");
        }
        System.out.println("=-=-=-=-=-=-=-= Exibir Resultado =-=-=-=-=-==-=-=-=-=-=-=-=");
        System.out.println("O Fatorial de " + NUM + "! é " + fat + ".\n");
        return fat;

    }

    public static void controle() {
        Scanner scan = new Scanner(System.in);

        int item = 0;
        String menu = "=============== Menu Principal ============================";
        menu += "\nTodas Opções Lê Dados, Executa e Exibe os Resultados.";
        menu += "\n===========================================================";
        menu += "\n1 Somatório de todos os números ímpares entre A e B.\n2 Fatorial de um Número.\n3 Sair";

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();

            switch (item) {

                case 1:
                    System.out.println("=-=-=-=-=-=-=-=-=   Ler Dados   =-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Digite um número para A e B:");
                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    ler(x, y);
                    break;

                case 2:
                    System.out.println("=-=-=-=-=-=-=-=-=   Ler Dados   =-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Digite um Número para Fatorar:");
                    int z = scan.nextInt();
                    fatorial(z);
                    break;

                case 3:
                    System.out.println("---------------- Programa Finalizado!! --------------------\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println(">>> Selecione um item válido!! <<<");
                    System.out.println();

            }

        }

    }

    public static void main(String[] args) {

        controle();

    }
}
