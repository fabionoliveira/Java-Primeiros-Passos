/*
 i) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença 
do primeiro valor pelo segundo.
 */
package Tarefa_07;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class QuadradoDiferenca {
  public int A;
  public int B;
    

  public void Ler(int n1, int n2){
     A = n1;
     B = n2;
  }
  
  public int getQuadradoDiferenca(){
      
    int q2diferenca = (int)(Math.pow((A - B), 2));
    
    return q2diferenca;
    
  }
  
  public void Exibir(int q2diferenca){
     JOptionPane.showMessageDialog(null,"O resultado do quadrado da diferença " +
"do primeiro Valor pelo segundo é : "+ q2diferenca,"Resultado",1);
  }
}
