/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_12_2010;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Todos_Exemplos {

    public static void executar(Scanner leitor) {
        int R = 1, X;
        System.out.println("\nDigite o valor da tabuada:");
        X = leitor.nextInt();

        for (int cont = 1; cont <= 10; cont += 1) {
            R = X * cont;

            System.out.println(cont + " * " + X + " = " + R);
        }

    }

    public static void nãoDivisiveispor3(int x, int y) {
        int i, cont = 0, soma = 0, media = 0;
        // x = 10    i = 10 11 12 13....20    y = 20  
        for (i = x; i <= y; i += 1) {
            if (i % 3 != 0) {
                System.out.println("valor:" + i + " cont:" + cont + " soma:" + soma + " media:" + media);

                cont++; // contar
                soma += i; // somar
                media = soma / cont;

            }
        }
    }

    public static int get_soma(int x, int y) {
        int soma = 0;
        // x=1      i = 1 2 3 4 5 6 7 8 9 10   y = 10
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                soma += i;
                System.out.println("Valor encontrado:" + i + "  Soma=" + soma);
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("TABUADA");
        executar(leitor);

        System.out.println("===================================");

        System.out.println("Não divisiveis por 3.\n");

        System.out.println("Digite x e y:");
        int x = leitor.nextInt();
        int y = leitor.nextInt();

        nãoDivisiveispor3(x, y);

        System.out.println("===================================");
        System.out.println("Divisiveis por 3 e 4.");

        int somar = get_soma(x, y);

        System.out.println("Somatórios dos divisiveis por 3 e 4:" + somar);
    }

}
