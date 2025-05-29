package Tarefa_13;


/**
 *
 * @author FO
 */
public class Classe13_Mae {

    public int N;

    Classe13_Mae() {
    }

    public int LernIntPos() {

        return N;
    }

    public int fatorial(int x) {
        int fat = 1;
        for (int i = x; i >= 1; i--) {
            fat *= i; // fatora, Calcula o produto e armazena em fat

        }

        System.out.println("=-=-=-=-=-=-=-= Exibir Resultado  =-=-=-=-=-==-=-=");
        System.out.println("O Número " + x + "! é " + fat + ".");

        return fat;

    }

    public static int ehprimo(int n) {
        int contdiv = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contdiv++;
            }
        }

        if (contdiv == 2) {
            return 1;
        } else {
            return -1;
        }

    }

    public int getSomaNumPrimo(int x) {

        int somap = 0;
        for (int i = 1; i <= x; i++) {
            if (ehprimo(i) == 1) {
                somap += i;
            }
        }
        System.out.println("Resultado do Somatório: " + somap);
        return somap;

    }

    public void exibirNumPrimos(int x) {

        if (x > 0) {
            System.out.print("São Primos ");
            for (int i = 1; i <= x; i++) {
                if (ehprimo(i) == 1) {
                    System.out.print(+i + ", ");

                }

            }

        }
        if (x < 0) {
            System.out.print(">>> NÃO TEM NÚMERO PRIMO!!!"
                    + "\n>>> POIS " + x + " É UM NÚMERO NEGATIVO.");
        }

    }

}
