/*
 * Exemplo 2 vetores estruturado 
 */
package Aula_semana_14_0311;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe2 {

    public static final int n = 10;

    public static int linha = -1;
    //  linha       ida    sal     nome
    //    0         20     2000    mauro
    //    1         30     2500    maria
    //    2         32     3000    marcia

    public static double sal[] = new double[n];
    public static int ida[] = new int[n];
    public static String nome[] = new String[n];

    public static double lerSal(Scanner leitor) {
        double sal;
        System.out.println("Digite o salário:");
        sal = leitor.nextDouble();
        return sal;
    }

    public static int lerIda(Scanner leitor) {
        int idade;
        System.out.println("Digite a idade:");
        idade = leitor.nextInt();
        return idade;
    }

    public static String lerNome(Scanner leitor) {
        String nome;
        leitor.nextLine();
        System.out.println("Digite o nome:");
        nome = leitor.nextLine();
        return nome;
    }

    public static void novaLinha(Scanner leitor) {
        linha++; // incrementar 1 ao valor da linha

        ida[linha] = lerIda(leitor);
        sal[linha] = lerSal(leitor);
        nome[linha] = lerNome(leitor);
    }

    public static void controle(Scanner leitor) {
        double aux, itemmenu;
        while (true) {
            System.out.print("\n1 Ler\n2 Mostrar\n3 Sair\nitem:");
            itemmenu = leitor.nextInt();
            if (itemmenu == 1) {
                novaLinha(leitor);
            } else if (itemmenu == 2) {
                String saida;
                for (int i = 0; i <= linha; i++) {
                    saida = nome[i] + " | " + sal[i] + " | ";
                    saida += ida[i] + " | " + sal[i] * 1.1;
                    System.out.println(saida);
                }
                System.out.println();
            } else if (itemmenu == 3) {
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
