/*
 * Faça o desenho do Diagrama de Classes para este exercícios, depois faça o
código fonte da classe Mãe contendo todos os atributos e métodos contendo os
processos abaixo. Finalmente faça a classe filha para utilizar os recursos da mãe e
finalmente executar o programa. Neste exercício, use um construtor vazio tanto na
classe mãe quando na classe filha. O void main deverá estar na classe filha.

i) método para ler um número inteiro positivo N;
ii) método para calcular o fatorial de N;
iii) método para calcular o somatório dos números primos de 1 até N;
iv) método para exibir os números primos de 1 até N;
 */
package Tarefa_13;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe13_Filha extends Classe13_Mae{
    
    Classe13_Filha(){ }
        
    public void Controle(Scanner Leitor){
        while (true) {
            String menu;
            menu = "=============== Menu Principal ===================";
            menu += "\n1 Ler Número Inteiro Positivo\n2 Calcular Fatorial do Número"
                    + "\n3 Calcular o Somatório dos números Primos de 1 até Número"
                    + "\n4 Exibir os Números Primos de 1 até Número\n5 Sair";
            System.out.println(menu);
            System.out.print("Item: ");
            int itemmenu = Leitor.nextInt();

            switch (itemmenu) {
                case 1:
                    System.out.println("\n=-=-=-==-=-=-= Ler Número Inteiro Positivo =-=-=-=");
                    System.out.print("Digite um Número Inteiro: ");
                    N = Leitor.nextInt();
                    if (N > 0) {
                        System.out.println("Número " + N + " é positivo.\n");

                    } else {
                        System.out.println("O número " + N + " não é positivo.\n");
                        System.out.println(">>> Retornando para o Menu Principal <<<\n");
                        Controle(Leitor);
                    }
                    int x = N;
                    LernIntPos();
                    break; 

                case 2:
                    System.out.println(">>>>> Calcular Fatorial do Número Digitado <<<<<<<");
                    fatorial(N);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("=-=-=-==-=-=-= Resultado Soma Números Primos =-=-=");
                    getSomaNumPrimo(N);
                    System.out.println();
                    break;
                
                case 4: 
                    System.out.println("=-=-=-==-=-=-= Exibir Números Primos  =-=-=-==-=-=");
                    ehprimo(N);
                    exibirNumPrimos(N);
                    System.out.println("\n");
                    break;
                
                case 5:
                    System.out.println("---------------- Programa Finalizado!!------------\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione uma Tecla válida!");
                    System.out.println();

            }
        }
    }
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        
        Classe13_Filha obj1 = new Classe13_Filha();
        
        obj1.Controle(Leitor);
    }
    
}
