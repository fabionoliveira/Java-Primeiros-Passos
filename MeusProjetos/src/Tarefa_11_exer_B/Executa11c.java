
package Tarefa_11_exer_B;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Executa11c extends Classe11c {
    
    public void Exibir() {

        System.out.println("++ Quantidade de MENORES de idade: " + MenorIdade);
        System.out.println("<< Menor Salário dos MENORES de idade: " + String.format( "%.2f", MenorSalario_MenorIdade));
        System.out.println(">> Maior Salário dos MENORES de idade: " + String.format( "%.2f", MaiorSalario_MenorIdade )+"\n");
        
        System.out.println("++ Quantidade de MAIORES de idade: " + MaiorIdade);
        System.out.println("<< Menor Salário dos MAIORES de idade: " + String.format( "%.2f", MenorSalario_MaiorIdade ));
        System.out.println(">> Maior Salário dos MAIORES de idade: " + String.format( "%.2f", MaiorSalario_MaiorIdade ) +"\n");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Executa11c obj4 = new Executa11c();

        int item;
        String menu;
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair";

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            item = scan.nextInt();

            switch (item) {

                case 1:
                    System.out.println("=-=-=-=-=-=-=-=-=   Ler Dados  =-=-=-=-=-=-=-=-=-=");
                    obj4.Ler();
                    System.out.println("           >>> Dados Registrado com Sucesso!!! <<<\n");
                    break;

                case 2:
                    System.out.println("           >>> Calculado com Sucesso!!! <<<\n");
                    obj4.IdadeMenor();
                    obj4.IdadeMaior();
                    break;

                case 3:
                    System.out.println("=-=-=-=-=-=-=-= Exibir Resultados =-=-=-=-=-=-=-=");
                    obj4.Exibir();
                    break;

                case 4:
                    System.out.println("---------------- Programa Finalizado!!------------\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione um item válido!");

                    System.out.println();

            }

        }

    }
}
