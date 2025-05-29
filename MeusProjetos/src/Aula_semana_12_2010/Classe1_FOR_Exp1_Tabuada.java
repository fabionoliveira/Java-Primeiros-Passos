/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_12_2010;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe1_FOR_Exp1_Tabuada {

    public static void executar(Scanner leitor) {
        int R = 1, X;
        System.out.println("\nDigite o valor da tabuada:");
        X = leitor.nextInt();

        for (int cont = 1; cont <= 10; cont += 1) {
            R = X * cont;

            System.out.println(cont + " * " + X + " = " + R);
        }
    
    }
    
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        executar(leitor);

    }

}
