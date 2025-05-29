/*
 * “AVAL 15”

Faça um código para calcular o valor de uma prestação em atraso com base na 
multa de 2% e também do juros mensal de 1% sobre o valor principal. 
Declare vetores atributos, valorPagar[], valorprincipal [ ], periodoDias [ ], 
as constantes txjuros e txmulta. Crie os métodos para calcular , VLJUROS, 
VLMUTA, VLPRINCIPAL. 
Ao final imprima a tabela com todos os vetores exibindo uma espécie de planilha
dos dados abulados. 
Faça duas classes Mãe, Filha e use herança.

 */
package Tarefa_15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Classe15 {

    public static int n = 10;

    public static double valorPagar[] = new double[n];
    public static double valorPrincipal[] = new double[n];
    public static int periodoDias[] = new int[n];
    public static double txjuros = 0.033;
    public static double txmulta = 0.02;
    public static double VLJUROS[] = new double[n];
    public static double VLMULTA[] = new double[n];
    public static int pos = -1;

    public static double LerPrestacao() {
        double prest;
        prest = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Prestação R$ ", "LerPrestação", 3));
        return prest;

    }

    public static int LerDias() {

        int dias;
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os Dias em Atraso: ", "LerDias", 3));
        return dias;

    }

    public static void novaLinha() {

        pos++;

        valorPrincipal[pos] = LerPrestacao();
        periodoDias[pos] = LerDias();

        /*
        for (int i = 0; i <= Linha; i++) {

            VLMULTA = (txmulta * valorPrincipal[i]);
            VLJUROS = (txjuros * (periodoDias[i] * valorPrincipal[i]));
            valorPagar[i] = VLJUROS + VLMULTA + valorPrincipal[i];
        }
         */
    }

    public static void getCalcular() {
        //Linha++;
        for (int i = 0; i <= pos; i++) {

            VLMULTA[i] = (txmulta * valorPrincipal[i]);

            VLJUROS[i] = (txjuros * (periodoDias[i] * valorPrincipal[i]));

            valorPagar[i] = (VLJUROS[i] + (VLMULTA[i] + valorPrincipal[i]));
        }

    }

    public static void exibir() {
        int[] presta = new int[n];

        String saida = null;

        for (int j = 0; j <= pos; j++) {
            presta[j] = j+1;

            saida = "+ VALOR PRESTAÇÃO.... R$ " + String.format("%.2f", valorPrincipal[j]);
            saida += "\n   DIAS EM ATRASO.......: " + periodoDias[j] + " dias";
            saida += "\n+ VALOR DA MULTA (2%) R$ " + String.format("%.2f", VLMULTA[j]);
            saida += "\n+ VALOR DO JUROS......R$ " + String.format("%.2f", VLJUROS[j]);
            saida += "\n= VALOR TOTAL PAGAR...R$ " + String.format("%.2f <<", valorPagar[j]);
            saida += "\n--------------------------------------------------";

            JOptionPane.showMessageDialog(null, saida, "RESULTADO PRESTAÇÃO " + presta[j], 1);
        }

    }

    public static void controle(Scanner Leitor) {

        String menu = "1 Ler Prestação\n2 Exibir Resultado\n3 Sair\nItem: ";
        int item = 0;

        while (true) {

            item = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menu Principal", 3));

            switch (item) {

                case 1:
                    novaLinha();
                    break;

                case 2:
                    getCalcular();
                    exibir();
                    System.out.println();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!!", "SAIR", 1);
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Selecione um Item válido!", "Mensagem", 0);
                    System.out.println();

            }

        }

    }

}
