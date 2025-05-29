/*
  a) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros
     (variáveis A, B, C e D).
     Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com
     o terceiro valor, e o resultado do produto (variável P) do primeiro com o terceiro valor,
     e o resultado da soma (variável S) do segundo com o quarto valor.
 */
package Tarefa_08;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class A {

    public int a;
    public int b;
    public int c;
    public int d;

    public void Ler(Scanner scan) {
        System.out.println("Digite valor para A, B, C e D. ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

    }

    public int calP() {

        int P = a * c;

        return P;
    }

    public int calS() {

        int S = b + d;

        return S;
    }

    public void Exibir(int p, int s) {
        System.out.println("=-=-=-=-=-=-=-=   Resultado  =-=-=-=-=-=-=-=");
        System.out.println("O resultado do produto do primeiro com o terceiro valor é : " + p);
        System.out.println("O resultado da soma do segundo com o quarto valor é : " + s);
        System.out.println();
    }

    public void menu_controle() {
        Scanner scan = new Scanner(System.in);
        
        int tecla = 0;

        while (true) {
            System.out.println("============ Menu executar A ===============");
            System.out.print("1 Executar\n2 Finalizar\n3 Sair\nItem: ");
            tecla = scan.nextInt();

            switch (tecla) {
                case 1:
                    System.out.println("\n============ Opção 1 Escolhida. ============");
                    Ler(scan);
                    int p = calP();
                    int s = calS();
                    Exibir(p, s);
   
                    break;

                case 2:
                    System.out.println("\n>>>>>>>>>>>>>>>> Finalizado <<<<<<<<<<<<<<<<");
                    System.out.println();
                    return;
                    
                case 3:
                    System.out.println();
                    break;
                                      
            }
        }
    }

    public static void main(String[] args) {

        A a1 = new A();

        a1.menu_controle();
    }

}
