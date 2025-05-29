
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manipulando dados com ArrayList ( Dinanmico )
 * @author FO
 */
public class ArrayListDinamico {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int tecla;

        try {

            while (true) {

                System.out.println("-=-=-=-=- CADASTRO -=-=-=-=-\nLista de Dados\n"
                        + "-=-=-=-=--=-=-=-=--=-=-=-=-");
                System.out.print("1- Add Dado\n2- Imprimir\n3- Remover Dado\n4- Sair\nOpção: ");
                tecla = scan.nextInt();

                switch (tecla) {
                    case 1:
                        System.out.println("Digite um dado: ");
                        String nome = scan.next().toUpperCase();
                        nomes.add(nome);
                        break;

                    case 2:
                        System.out.println("Lista de Controle");
                        System.out.println("Indice | Dado");
                        for (int i = 0; i < nomes.size(); i++) {

                            System.out.println("   " + i + "   : " + nomes.get(i));

                        }
                        break;
                    case 3:
                        System.out.println("Excluir do Contatos");
                        System.out.println("Digite um Indice para Excluir: ");
                        int indice = scan.nextInt();
                        for (int i = 0; i < nomes.size(); i++) {
                            if (i == indice) {

                                nomes.remove(i);
                            }

                        }
                        break;

                    case 4:
                        System.out.println("Sair");
                        System.exit(0);
                        break;

                    default:

                        System.out.println("Tecla não identificada!!!!");

                        break;

                }

            }
        } catch (Exception e) {
            System.out.println("Tecla não identificada!!!!");
            
           
        }

    }
}
