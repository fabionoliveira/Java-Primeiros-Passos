package Tarefa_16;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Executar extends Mae {

    public void controle(Quadrado q1, Triangulo t1, Pentagono p1, Scanner Leitor) {

        int item = 0;
        String menu = "=============== Sub Menu Principal ===============";
        menu += "\nEscolha a opção da Figura Geométrica.\n--------------------------------------------------";
        menu += "\n1 Área do Quadrado\n2 Área do Triângulo\n3 Área do Pentágono\n4 Sair";

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            item = Leitor.nextInt();

            switch (item) {

                case 1:
                    q1.controleq(Leitor);
                    //this.controle(q1, t1, p1, Leitor);
                    break;

                case 2:
                    t1.controlet(Leitor);
                    break;

                case 3:
                    p1.controlep(Leitor);
                    break;

                case 4:
                   
                    System.out.println("\n------------- Voltar Menu Principal --------------\n");
                    return;

                default:
                    System.out.println("Selecione uma Item válido!");
                    System.out.println();

            }

        }

    }

    public static void main(String[] args) {
        Executar exe1 = new Executar();
        Triangulo t1 = new Triangulo();
        Quadrado q1 = new Quadrado();
        Pentagono p1 = new Pentagono();

        Scanner Leitor = new Scanner(System.in);
        int item = 0;
        String menu = "=============== Menu Principal ===================";
        menu += "\n1 Ler Exibir\n2 Finalizar";

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            item = Leitor.nextInt();

            switch (item) {

                case 1:
                    exe1.controle(q1, t1, p1, Leitor);

                    break;

                case 2:
                    System.out.println("\n---------------- Programa Finalizado!!------------\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Selecione uma Item válido!");
                    System.out.println();

            }

        }

    }

}
