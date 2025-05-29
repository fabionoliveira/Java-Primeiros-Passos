/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_13_2710;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe3_NumPrimoFOR {

    Classe3_NumPrimoFOR() {
        Scanner leitor = new Scanner(System.in);
        int num, contdiv = 0;
        System.out.println("\nDigite o número:");
        num = leitor.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contdiv++;
            }
        }
        if (contdiv == 2) {
            System.out.println("\n" + num + " é primo!\n");
        } else {
            System.out.println("\n" + num + " não é primo!\n");
        }
}
    public static void main(String[] args) {
        Classe3_NumPrimoFOR obj3 = new Classe3_NumPrimoFOR();
        
        
    }
            
}
