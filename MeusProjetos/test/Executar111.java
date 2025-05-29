
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FO
 */
public class Executar111 extends Classe111{

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Executar111 ex = new Executar111();
        String menu;
        menu = "\n1 Ler\n2 Exibir\n3 Sair";
        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            int itemmenu = scan.nextInt();
            switch (itemmenu) {
                case 1:
                    ex.Ler();
                    ex.getMediaH();
                    ex.getMediaM();
                    break;
                case 2:
                    ex.exibir();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Selecione um item válido!");
                    System.out.println();
                    break;
            }
        }
    }
}


