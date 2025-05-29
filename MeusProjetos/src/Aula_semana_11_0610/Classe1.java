/*
 *[10:16] ELISEU LEMES DA SILVA
    Classe1 uso da função contzeros
 */
package Aula_semana_11_0610;

public class Classe1 {

    public int contZeros(String texto) {   //  texto = "p r o g 0 0 1 2 4 000els44446000000"
        //           0 1 2 3 4 5 6 7 8 9

        int cont = 0; // total de caracteres do texto
        int contzeros = 0; // total de zeros

        String x;   // armazena cada caractere do texto

        while (cont < texto.length()) {  //                      1        2
            x = texto.substring(cont, cont + 1);

            if (x.equals("0")) {
                contzeros++; // contzeros + 1 
            }

            cont++; // cont = cont + 1
        }

        return contzeros;
    }

    public void executar() {
        String t = "prog00124000els444460000000";

        int zeros = contZeros(t);

        System.out.println("\nQuantidade de zeros:" + zeros);
    }

    public static void main(String[] agrs) {
        Classe1 m = new Classe1();
        m.executar();
    }

}
