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
//Tarefa 01

public class Ava_01_Desconto
    {//Nossos Atributos
        public String produto;
        public double valor, novovalor;
        final double desconto = 0.09;
                
     //Nossos Métodos
        public void leitura()
            {Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o Produto: ");
            produto = leitor.next();
        
            System.out.println("Digite o Valor: ");
            valor = leitor.nextDouble();}
        
        public void calcular()
            {novovalor = valor - (valor * desconto);}
        
        public void exibir()
            {System.out.print("\nRESULTADO COM DESCONTO");
             System.out.print("\n>> O Novo Valor do "+produto + " com desconto de 9% é R$"+novovalor);
            //System.out.print(produto);
            //System.out.print(" com desconto de 9% é R$");
            //System.out.print(novovalor);
            System.out.println();}
             
        public static void main(String[] args)
            {//Instanciamneto da classe
            Ava_01_Desconto desc1 = new Ava_01_Desconto();
            
            desc1.leitura();
            desc1.calcular();
            desc1.exibir();
            } 
    
}//Fim classe  
