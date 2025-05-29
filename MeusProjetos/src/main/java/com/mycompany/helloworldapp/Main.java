/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Main {
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

    public static void main(String[] args) {
        System.out.println("hello world é Meu  teste");

        Main tes = new Main();
        tes.ColetaDados();
        tes.Saida();
    }

}
