/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculosN;

/**
 *
 * @author FO
 */
import java.util.Scanner;

public class ExecutaExercicio13 extends Exercicio13 
{ public int Fatorial;
  public int Somatorio;
  
  public void CalcularFatorial(){
      Fatorial = N;
      for (int i = N - 1; i > 0; i--)
          Fatorial = Fatorial * i;
  }
  
  public void SomatorioPrimos1N(){
      int divisoes = 0;
      for (int i = 1; i <= N; i++){
          divisoes = 0;
      for (int x = 1; x <= i; x++)
          if(i % x == 0)
              divisoes++;
          if(divisoes == 2)
              Somatorio = Somatorio + i;
      }
  }
  
  public void ExibirPrimos1N(){
      int divisoes = 0;
      for (int i = 1; i <= N; i++){
          divisoes = 0;
          for (int x = 1; x <= 1; x++)
              if(i % x == 0)
                  divisoes++;
          if(divisoes == 2)
              System.out.println(i);
      }
  }
  
  public void Exibir(){
      System.out.println("Fatorial = " + Fatorial);
       System.out.println("Somatório = " + Somatorio);
  }
  
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ExecutaExercicio13 y = new ExecutaExercicio13();
        int tecla = 0;
        
        while (tecla != 4){
            System.out.println("\n***MENU***\n1 - Ler\n2 - Calcular\n3 - Exibir\n4 - Sair\nItem: ");
            
            tecla = leitor.nextInt();
            if (tecla == 1){
                y.Leitura();
            }
            else if(tecla == 2){
                y.CalcularFatorial();
                y.SomatorioPrimos1N();
            }
            else if(tecla == 3){
                
                y.ExibirPrimos1N();
                y.Exibir();
            }
        }
        System.out.println("\nPrograma Finalizado!");
        System.exit(0);
    }
}
