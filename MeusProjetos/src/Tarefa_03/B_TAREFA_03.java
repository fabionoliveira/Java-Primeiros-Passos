
package Tarefa_03;

import java.util.Scanner;

public class B_TAREFA_03 {
    public int n1;
    public String saida;
    
    public void leitura()
    {   Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um Nº Inteiro positivo ou negativo: ");
        n1= leitor.nextInt();
        
    }//fim leitura
    public void calcular()
    {
        if ( n1 < 0){
            n1 = n1 * - 1;
        }
       
    }//fim calcular
    public void exibir()
            
    {   double converter = (double) n1;
        saida = String.format("%.2f", converter);
        System.out.println("\nO módulo do número fornecido é: "+ saida);
      
    }//fim exibir
         
    public static void main(String[] args)
    {
        B_TAREFA_03 v1 = new B_TAREFA_03();
       
        v1.leitura();
        v1.calcular();
        v1.exibir(); 
        
    }//fim main

}//fim classe

   