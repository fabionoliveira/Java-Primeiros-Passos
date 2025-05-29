package com.mycompany.helloworldapp;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Teste01 {

    public String nome;
    public String idade;
    public String sexo;

    public void ColetaDados() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        nome = scan.next().toUpperCase();
        System.out.println("Digite sua Idae: ");
        idade = scan.next().toUpperCase();
        System.out.println("Digite seu sexo: ");
        sexo = scan.next().toUpperCase();

    }

    public void Saida() {
        
        System.out.println("\n\nSeu Nome é " + nome
                + "\nSua Idade é " + idade
                + "\nSeu sexo é " + sexo);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Teste01 tes = new Teste01();
        tes.ColetaDados();
        tes.Saida();

        // TODO code application logic here
    }

}
