/*
 * Exemplo 1 de vetores em java
 */
package Aula_semana_14_0311;

/**
 *
 * @author FO
 */
public class Classe1_Vetores 
{
   public static int x[] = { 1, 0 , -1 , 4, 5, -9, 0, 3, 20,  100 };
   //    i=                  0  1   2    3  4  ....           n-1
   
   public static int n = x.length; // contar os elementos do vetor

 

   public static double aux = 0;

 

public static void executar() 
{
          for ( int i=0; i<=n-1; i++)
         { 
           aux = Math.pow( x[i], 2) + x[i];
           System.out.println ( "x:" + x[i] + " resultado de (x elevado a 2) + 1=" + aux + "\n");
         }

 

}
   
  public static void main ( String[] args ) 
    {
      executar();
    }   
}