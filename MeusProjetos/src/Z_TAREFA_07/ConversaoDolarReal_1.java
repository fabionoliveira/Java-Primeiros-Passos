/*
 * j) Elaborar um programa que efetue a apresentação do valor da conversão em real 
de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar
e também a quantidade de dólares disponível com o usuário, 
para que seja apresentado o valor em moeda brasileira.
 */
package Z_TAREFA_07;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class ConversaoDolarReal_1 {
  public double dolar;
  public double cotacao;
  
  public void Ler(Scanner scan){
             
     System.out.println("Qual o valor da cotação do Dólar hoje? ");
     cotacao = scan.nextDouble();
     System.out.println("Quantos dólares disponivel para converter em moeda Brasileira? ");
     dolar = scan.nextDouble();    
     
  }
  
  public double getValorReal(){
   
    double valorReal = cotacao * dolar;
   
    return valorReal;    
  }
  public void Exibir(double valorReal){
      
      System.out.println("O valor convertido de Dólar para Real é R$ "+ String.format("%.2f", valorReal));
   
  }
    
}
