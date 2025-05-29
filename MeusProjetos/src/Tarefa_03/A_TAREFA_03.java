
package Tarefa_03;

import java.util.Scanner;

public class A_TAREFA_03 {
    public int n1,n2,diferenca;
    public String saida;
    
    public void leitura()
    { Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nº: ");
        n1= leitor.nextInt();
        System.out.println("Digite o segundo nº: ");
        n2 = leitor.nextInt();
    }
    public void calcular()
    {
        if ( n1 > n2){
            diferenca = n1 - n2 ;
        }
        else{
            diferenca = n2 - n1;
        }
    }
    public void exibir()
    {   double converter = (double) diferenca;
        saida = String.format("%.2f", converter);
        System.out.println("\nA diferença do maior pelo menor é: "+ saida);
        
    }//fim exibir
         
    public static void main(String[] args)
    {
        A_TAREFA_03 v1 = new A_TAREFA_03();
        
        v1.leitura();
        v1.calcular();
        v1.exibir(); 
        
    }//fim main

}//fim classe
