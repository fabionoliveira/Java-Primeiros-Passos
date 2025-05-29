/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_11_exer_A;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Executa11b_Scan extends Classe_11b_Scan{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Executa11b_Scan ex = new Executa11b_Scan();

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
