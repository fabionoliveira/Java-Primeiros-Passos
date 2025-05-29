/*
 i) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença 
do primeiro valor pelo segundo.
 */
package Z_TAREFA_07;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class QuadradoDiferenca_1 {
  public int A;
  public int B;
    

  public void Ler(Scanner scan){
     
     System.out.println("Digite o valor para A: ");
     A = scan.nextInt();
     System.out.println("Digite o valor para B: ");
     B = scan.nextInt();
    
  }
  
  public int getQuadradoDiferenca(){
      
    int q2diferenca = (int)(Math.pow((A - B), 2));
    
    return q2diferenca;
    
  }
  
  public void Exibir(int q2diferenca){
     
     System.out.println("O resultado do quadrado da diferença " +
"do primeiro Valor pelo segundo é : "+ q2diferenca);
  }
}
