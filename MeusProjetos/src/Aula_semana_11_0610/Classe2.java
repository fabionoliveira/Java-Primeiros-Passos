/*
 * [10:26] ELISEU LEMES DA SILVA
    Classe2 soma  pares...
 */
package Aula_semana_11_0610;

public class Classe2 {

    //                     10 11 12 ...20
    public int somapar(int inicio, int fim) {
        int somapares = 0;

        while (inicio <= fim) {
            if (inicio % 2 == 0) // checa se o inicio é par
            {

                somapares += inicio; // somapares = somapares + inicio

                System.out.println("Valor: " + inicio + "   Soma:" + somapares);
            }

            inicio++; // 10  11  12   inicio = inicio + 1
        }

        return somapares;
    }

    public void executar(int a, int b) {
        int pares = somapar(a, b);

        System.out.println("\nSoma de pares:" + pares);
    }

    public static void main(String[] agrs) {
        Classe2 m = new Classe2();

        m.executar(10, 20);
    }

}
