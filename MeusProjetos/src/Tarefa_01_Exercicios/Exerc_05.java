
package Tarefa_01_Exercicios;

import java.util.Arrays;

public class Exerc_05 {
          
    public static void main(String[] args) {
       int v[] = {1,2,3,4,5,6,7,8,9,10};        
       
       int cont = 0;
       int qtpar = 0;
       for ( int i = 0; i < v.length; i++){
             cont = i + 1;   
           if ( v[i] % 2 == 0)
           {
               qtpar++;
           }
           
       }
       
       System.out.println();
       System.out.print("Vetor = ");
       System.out.println(Arrays.toString(v));
       System.out.println("\nContagem: " + cont);       
       System.out.println("\nQuantidade de pares = " + qtpar + "\n");
    }
}