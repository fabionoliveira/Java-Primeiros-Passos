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

/**
 *
 * @author FO
 */
public class Classe15_Scan {

    public static int n = 10;

    public static double valorPagar[] = new double[n];
    public static double valorPrincipal[] = new double[n];
    public static int periodoDias[] = new int[n];
    public static double txjuros = 0.033;
    public static double txmulta = 0.02;
    public static double VLJUROS[] = new double[n];
    public static double VLMULTA[] = new double[n];
    public static int Linha = -1;

    public static double LerPrestacao(Scanner Leitor) {
        double prest;
        System.out.print("Digite o valor da Prestação R$ ");
        prest = Leitor.nextDouble();

        return prest;

    }

    public static int LerDias(Scanner Leitor) {

        int dias;
        System.out.print("Digite os Dias em Atraso: ");
        dias = Leitor.nextInt();

        return dias;

    }

    public static void novaLinha(Scanner Leitor) {

        Linha++;

        valorPrincipal[Linha] = LerPrestacao(Leitor);
        periodoDias[Linha] = LerDias(Leitor);

    }

    public static void getCalcular() {

        for (int i = 0; i <= Linha; i++) {

            VLMULTA[i] = (txmulta * valorPrincipal[i]);

            VLJUROS[i] = (txjuros * (periodoDias[i] * valorPrincipal[i]));

            valorPagar[i] = (VLJUROS[i] + (VLMULTA[i] + valorPrincipal[i]));
        }

    }

    public static void exibir() {

        String saida = null;

        for (int j = 0; j <= Linha; j++) {

            saida = "+ VALOR PRESTAÇÃO.... R$ " + String.format("%.2f", valorPrincipal[j]);
            saida += "\n  DIAS EM ATRASO.......: " + periodoDias[j] + " dias";
            saida += "\n+ VALOR DA MULTA (2%) R$ " + String.format("%.2f", VLMULTA[j]);
            saida += "\n+ VALOR DO JUROS......R$ " + String.format("%.2f", VLJUROS[j]);
            saida += "\n= VALOR TOTAL PAGAR...R$ " + String.format("%.2f <<", valorPagar[j]);
            saida += "\n--------------------------------------------------";

            System.out.println(saida);

        }

    }

    public static void exibirV2() {

        String saida = null;

        for (int x = 0; x <= Linha; x++) {

            System.out.println("PRESTAÇÃO\tATRASADO\tMULTA(2%)\tJUROS\t\tTOTAL PAGAR");

            saida = String.format("R$ %.2f", valorPrincipal[x]);
            saida += "\t" + periodoDias[x] + " dias";
            saida += "\t\t" + String.format("R$ %.2f", VLMULTA[x]);
            saida += "\t\t" + String.format("R$ %.2f", VLJUROS[x]);
            saida += "\t" + String.format("R$ %.2f", valorPagar[x]);
            saida += "\n--------------------------------------------------------------------------------------------";

            System.out.println(saida);

        }
    }

    public static void controle(Scanner Leitor) {

        String menu = "\n=============== Menu Principal ===================";
        menu += "\n1 Ler\n2 Exibir Resultado\n3 Exibir Resultado v2\n4 Sair";
        int item = 0;

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            item = Leitor.nextInt();

            switch (item) {

                case 1:
                    System.out.println("\n=-=-=-==-=-=-=-=   Ler Dados   =-==-==-==-==-=-=-=");
                    novaLinha(Leitor);
                    break;

                case 2:
                    System.out.println("\n=-=-=-=-=-=-=-= Exibir Resultado  =-=-=-=-=-==-=-=");
                    getCalcular();
                    exibir();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\n=-=-=-=-=-=-=-= Exibir Resultado V2 =-=-=-=-=-=-=-=-=-==-=-==-=-=-=-=-==-=-==-=-=-=-=-==-=-=");
                    getCalcular();
                    exibirV2();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\n---------------- Programa Finalizado!!------------\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Selecione uma Item válido!");
                    System.out.println();

            }

        }

    }
    
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        controle(Leitor);
    }
    

}
