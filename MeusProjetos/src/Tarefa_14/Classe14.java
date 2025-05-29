/**
 * TAREFA / AVALIAÇÃO
 * Faça uma classe que contenha os vetores não explícitos que deverão ser
 * preenchidos através de uma leitura via teclado: nomes [ ], idades [ ], salários [ ] e
 * novoSal [ ]. Cada vetor poderá ter no maximo 3 elementos. Através de um menu faça a
 * leitura dos vetores, coloque também uma opção no menu para exibir os vetores na tela.
 * O vetor novoSal [ ] deverá conter o calculo de 15% do salário para pessoas com mais de
 * 18 anos e 8% para pessoas com menos de 18 anos.
 * NOTA: Entregar o código fonte e o print de execução em um arquivo no formato DOC ou
 * PDF.
 */
package Tarefa_14;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe14 {

    public static int n = 10;
    public static String nomes[] = new String[n];
    public static int idades[] = new int[n];
    public static double salarios[] = new double[n];
    public static double novoSals[] = new double[n];
    public static int linha = -1;

    public static String Lernome(Scanner Leitor) {
        String nome;
        Leitor.nextLine();
        System.out.print("Digite o Nome: ");
        nome = Leitor.nextLine();
        return nome;

    }

    public static int Leridade(Scanner Leitor) {

        int ida;
        System.out.print("Digite a Idade: ");
        ida = Leitor.nextInt();

        return ida;

    }

    public static double Lersal(Scanner Leitor) {

        double sal;
        System.out.print("Digite o Salário R$ ");
        sal = Leitor.nextDouble();
        System.out.println();

        return sal;

    }

    public static void novaLinha(Scanner Leitor) {

        linha++;

        nomes[linha] = Lernome(Leitor);
        idades[linha] = Leridade(Leitor);
        salarios[linha] = Lersal(Leitor);

        for (int j = 0; j < idades.length; j++) {

            if (idades[j] >= 18) {

                novoSals[j] = salarios[j] * 1.15;

            }
            if (idades[j] < 18) {
                novoSals[j] = salarios[j] * 1.08;

            }
        }

    }

    public static void controle(Scanner Leitor) {

        String menu = "=============== Menu Principal ===================";
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
                    String saida = null;
                    
                    for (int i = 0; i <= linha; i++) {
                        System.out.println("Nome\tIdade\tSalário\t\tNovoSalário");

                        saida = nomes[i] + "\t" + idades[i];
                        saida += "\tR$ " + String.format("%.2f", salarios[i]);
                        saida += "\tR$ " + String.format("%.2f", novoSals[i]);
                        saida += "\n--------------------------------------------------";
                        System.out.printf(saida);
                        System.out.println();
                    }
                    System.out.println();

                    break;
                    
                case 3:
                    System.out.println("\n=-=-=-=-=-=-=-= Exibir Resultado v2 =-=-=-=-=-==-=");
                    String saida2 = null;
                    System.out.println("Nome\tIdade\tSalário\t\tNovoSalário");
                    for (int i = 0; i <= linha; i++) {
                        //System.out.println("Nome\tIdade\tSalário\t\tNovoSalário");

                        saida2 = nomes[i] + "\t" + idades[i];
                        saida2 += "\tR$ " + String.format("%.2f", salarios[i]);
                        saida2 += "\tR$ " + String.format("%.2f", novoSals[i]);
                        saida2 += "\n--------------------------------------------------";
                        System.out.printf(saida2);
                        System.out.println();
                    }
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
