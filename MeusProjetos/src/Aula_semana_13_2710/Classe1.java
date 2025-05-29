/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_13_2710;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe1 {
    //   contdiv = 0  
//      n   i
//   se 5 % 1 == 0   contdiv ++  => 1
//   se 5 % 2 == 0 
//   se 5 % 3 == 0 
//   se 5 % 4 == 0 
//   se 5 % n == 0   contdiv ++   => 2  então o n é um primo

//                                  5
    public static boolean ehprimo(int n) {
        int contdiv = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contdiv++;
            }
        }

        if (contdiv == 2) {
            return true;
        } else {
            return false;
        }

    }
    // Função que encontra um número par em uma posição fornecida dentro 
    // de um intervalo de dois números

    //                       148   2950     54
    public static int posPar(int a, int b, int pos) {  // i =      148 149 150 ....x.....2950  i te passo 1 
        // contpos    1      2     54   
        int contpos = 0;
        for (int i = a; i <= b; i += 1) // i++, i+=1 ou i=i+1    passo 1 
        {
            if (i % 2 == 0) {
                contpos++; // conta a posição do número par encontrado
                if (contpos == pos) {
                    return i;
                }
            }
        }

        return -1; // retorna -1 quando não encontrar a posição desejada   
    }

    public static int lerValor(String var, Scanner leitor) {
        System.out.println("\nDigite o valor de " + var + ": ");
        int valor = leitor.nextInt();
        return valor;
    }

//                                  1 2 3 4 9
    public static void exemploFor1(int x, int y) {
        // i = x   e vai até o valor de y
        double produto = 1; // vai acumular o produto dos numeros de x até y

        for (int i = x; i <= y; i++) // passo 1
        {
            produto *= i; // produto = produto * i
            System.out.println("i:" + i + " produto :" + produto);
        }

        System.out.println();
    }

    public static void controle(Scanner leitor) {
        while (true) {
            System.out.println("'\n1 Executar produto\n2 Executar posPar\n3 Executa a função ehprimo...\n4 sair\nitem:");
            int itemmenu = leitor.nextInt();

            switch (itemmenu) {
                case 1:
                    System.out.println("\nFunção produto dos números inteiros");
                    int x = lerValor("X", leitor);
                    int y = lerValor("Y", leitor);
                    exemploFor1(x, y);
                    break;

                case 2:
                    System.out.println("\nFunção encontra Par na posição");
                    int a = lerValor("A", leitor);
                    int b = lerValor("B", leitor);
                    int pos = lerValor("Posição", leitor);
                    int par = posPar(a, b, pos);

                    if (par != -1) {
                        System.out.println("\nO número " + par + " foi encontrado na posição " + pos);
                    } else {
                        System.out.println("\nNão foi encontrado um número par na posição " + pos);
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("\nExecuta a função primo");
                    int n = lerValor("Número a ser analisado", leitor);
                    boolean primo = ehprimo(n);

                    if (!primo) {
                        System.out.println("\nO número " + n + " NÃO é primo...");
                    } else {
                        System.out.println("\nO número " + n + " é primo...");
                    }

                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        controle(leitor);
    }

}
