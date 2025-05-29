/*
 * [10:05] ELISEU LEMES DA SILVA
    Exemplo FOR 1
 */
package Aula_semana_12_2010;

import java.util.Scanner;

public class Classe1_FOR_Exp2_naoDivisiveispor3 {

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

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite x e y:");
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        nãoDivisiveispor3(x, y);
    }
}
