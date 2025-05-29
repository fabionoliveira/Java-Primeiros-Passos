package ava_13;

import java.util.Scanner;

public class Filha_aval_13 extends Aval_13 {

    public int Fatorial;
    public int Soma = 0;
    public int Divisores;

    public void CalcularFatorial() {
        Fatorial = N;
        for (int i = N - 1; i > 0; i--) {
            Fatorial = Fatorial * i;
        }
    }

    public void NumPrimos() {

        for (int i = 1; i <= N; i++) {
            Soma = Soma + i;
            i += 1;
        }
    }

    public void Exibir() {
        System.out.println("Fatorial  de  " + N + " é " + Fatorial);
        System.out.println("Somatório dos números primos entre 1 e " + N + " é " + Soma);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Filha_aval_13 y = new Filha_aval_13();

        int tecla = 0;

        while (tecla != 4) {
            System.out.println("\n***MENU***\n1 - Ler\n2 - Calcular\n3 - Exibir\n4 - Sair\nItem: ");

            tecla = leitor.nextInt();
            if (tecla == 1) {
                y.Leitura();
            } else if (tecla == 2) {
                y.CalcularFatorial();
                y.NumPrimos();
                System.out.println("\n***Calculado***");

            } else if (tecla == 3) {
                y.Exibir();

            }
        }
        System.out.println("\nPrograma Finalizado!");
        System.exit(0);

    }    
}
