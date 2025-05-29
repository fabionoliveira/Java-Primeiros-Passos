/*
 * j) Elaborar um programa que efetue a apresentação do valor da conversão em real 
de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar
e também a quantidade de dólares disponível com o usuário, 
para que seja apresentado o valor em moeda brasileira.
 */
package Tarefa_07;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class ConversaoDolarReal {
  public double dolar;
  public double cotacao;
  
  public void Ler(double cot, double dol){
             
     cotacao = cot;
     dolar = dol;    
  }
  
  public double getValorReal(){
   
    double valorReal = cotacao * dolar;
   
    return valorReal;    
  }
  public void Exibir(double valorReal){
      
      JOptionPane.showMessageDialog(null,"O valor convertido de Dólar para Real é R$ "
              + String.format("%.2f", valorReal),"Resultado",1);
   
  }
    
}
