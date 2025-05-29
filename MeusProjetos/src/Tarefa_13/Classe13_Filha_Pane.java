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

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class Classe13_Filha_Pane extends Classe13_Mae_Pane{
    
        
    Classe13_Filha_Pane(){ }
        
    public void Controle(){
        while (true) {
            String menu;
            menu = "\n1 Ler Número Inteiro Positivo\n2 Calcular Fatorial do Número"
                    + "\n3 Calcular o Somatório dos números Primos de 1 até Número"
                    + "\n4 Exibir os Números Primos de 1 até Número\n5 Sair\nItem:";
            
            int itemmenu = Integer.parseInt(JOptionPane.showInputDialog(null, menu , "Menu Principal", 3));

            switch (itemmenu) {
                case 1:
                    String L1 = "Digite um Número Inteiro: ";
                    N = Integer.parseInt(JOptionPane.showInputDialog(null, L1 , "Ler Número Inteiro Positivo", 3));
                    if (N > 0) {
                        JOptionPane.showMessageDialog(null, "Número " + N + " é positivo.", "Mensagem", 1);

                    } else {
                        JOptionPane.showMessageDialog(null, "Número " + N + " não é positivo."
                                + "\n>>> Retornando para o Menu Principal <<<", "Mensagem", 0);
                        Controle();
                    }
                    int x = N;
                    LernIntPos();
                    break; 

                case 2:
                    fatorial(N);
                    break;

                case 3:
                    getSomaNumPrimo(N);                    
                    break;
                
                case 4:                    
                    exibirNP(N);                   
                    break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!!", "Sair do Programa", 1);
                    System.exit(0);
                    break;
                    
                default:         
                    JOptionPane.showMessageDialog(null, "Selecione uma Tecla válida!", "Mensagem", 0);
                    
            }
        }
    }
    public static void main(String[] args) {
        //Scanner Leitor = new Scanner(System.in);
        arrayList = new ArrayList<>();
        
        Classe13_Filha_Pane obj1 = new Classe13_Filha_Pane();
        
        obj1.Controle();
    }
    
}
