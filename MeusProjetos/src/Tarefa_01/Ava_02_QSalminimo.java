/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_01;

/**
 *
 * @author FO
 */
import java.util.Scanner;

public class Ava_02_QSalminimo {
    //Atributos
    public String nome;
    public double salm, salp, qsalm;
    //Métodos
    public void leitura()
        {Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitor.next();
        
        System.out.println("Digite o valor do salário mínimo: ");
        salm = leitor.nextDouble();
        
        System.out.println(nome +" Digite o valor de seu salário: ");
        salp = leitor.nextDouble();}
        
    public void calcular()
        {qsalm = salp / salm ;}
    
    public void exibir()
        {System.out.print("\nRESULTADO");
         System.out.print("\n>> A quantidade Salário mínimo(s) recebido é "+qsalm);
         System.out.print("\n>> "+nome +" recebe a quantidade de "+qsalm +" Salário mínimo(s).");
         System.out.println();}
        
    public static void main(String[] args)
        //Instanciamento da classe
        {Ava_02_QSalminimo sal1 = new Ava_02_QSalminimo();
         
        sal1.leitura();
        sal1.calcular();
        sal1.exibir();
        }
    
}//Fim classe
