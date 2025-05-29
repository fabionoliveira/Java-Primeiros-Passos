/*
 * [10:25] ELISEU LEMES DA SILVA
    Terceiro exemplo do comando FOR

 */
package Aula_semana_12_2010;

import java.util.Scanner;

public class Classe1_FOR_Exp3_get_soma {

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

        System.out.println("Digite x e y:");
        int x = leitor.nextInt();
        int y = leitor.nextInt();

        int somar = get_soma(x, y);

        System.out.println("Somatórios dos divisiveis por 3 e 4:" + somar);
    }
}
