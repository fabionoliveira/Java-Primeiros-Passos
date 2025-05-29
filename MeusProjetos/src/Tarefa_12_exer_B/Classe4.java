/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_12_exer_B;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe4 {

    public int n;
    public int totpar;
    public int totimpar;
    public int tecla = '0';

    public int lern() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um Número (Exp: 27): ");
        n = scan.nextInt();

        return n;

    }

    public int calpar(int n) {
        int par = 0;

        for (int cont = 0; cont <= n; cont += 1) {
            
            if(cont != 0){

                if (cont % 2 == 0) {

                    par++;

                }
            }
        } 

        return par;
    }

    public int calimpar(int n) {
        int impar = 0;

        for (int cont = 0; cont <= n; cont += 1) {
            
            if ( cont != 0){

                if (cont % 2 != 0) {

                    impar += cont;

                }
            }   
        }

        return impar;
    }
    
    public int gettotpar(){
                
        return totpar = calpar(n); 
    }
    
    public int gettotimpar(){
                       
       return totimpar = calimpar(n);   
    }

    public void exibir(int n, int par, int impar) {

        System.out.println("O Número informado foi: " + n);
        System.out.println("Quantidade de Números Pares: " + par);
        System.out.println("Soma Total de números Impares: " + impar+"\n");

    }

    public void controle() {

        Scanner scan = new Scanner(System.in);
        String menu;
        menu = "=============== Menu Principal ===================";
        menu += "\n1 Ler\n2 Calcular\n3 Exibir\n4 Sair";

        while (true) {
            System.out.println(menu);
            System.out.print("Item: ");
            tecla = scan.nextInt();
            switch (tecla) {

                case 1:
                    System.out.println("\n=-=-=-=-=-=-=-=-=  Ler Número  =-=-=-=-=-=-=-=-=-=");
                    n = lern();
                    break;

                case 2:
                    System.out.println("           >>> Calculado com Sucesso!!! <<<\n");
                    gettotpar();
                    gettotimpar();
                    break;
                case 3:
                    System.out.println("=-=-=-=-=-=-=-= Exibir Resultados =-=-=-=-=-=-=-=");
                    int par = gettotpar();
                    int impar = gettotimpar();
                    exibir(n, par, impar);
                    break;

                case 4:
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
        Classe4 obj4 = new Classe4();

        obj4.controle();

    }

}
