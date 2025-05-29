
package Aula_semana_04_1808;

import java.util.Scanner;

 

public class Classe1 
{ 
    public double N1, N2, MG, F;
    
    
public void ler ( Scanner leitor) 
{
  System.out.println("\nDigite n1:");
  N1 = leitor.nextDouble();

 

  System.out.println("\nDigite n2:");
  N2= leitor.nextDouble();

 

  System.out.println("\nDigite faltas:");
  F= leitor.nextDouble(); 
}

 

public void exibir() 
{ 
  if ( MG < 6 || F > 20 )
   { 
     System.out.println("\nReprovado!\nMédia:"+String.format("%.3f", MG));
     System.out.println("\nFaltas:" + F); 
   }
else
  {
    System.out.println("\nAprovado!\nMédia: "+String.format("%.3f",MG));
    System.out.println("\nFaltas:" +F ); 
  }
}

 

public void calcular() 
{
  MG = Math.sqrt( N1 * N2 ); 
}  

 

public static void main (String [] args) 
{
   Scanner leitor = new Scanner(System.in);
   
   Classe1 c1= new Classe1 ();
   
   int tecla=0;
   
   do {
        System.out.println("\nMenu\n1 Ler, calcular e exibir\n2sair\nItem:");
        tecla = leitor.nextInt();//Lê e converte p/char
        switch ( tecla ) 
        {
          case 1: c1.ler ( leitor ); 
                  c1.calcular(); 
                  c1.exibir(); 
                  break;
                  
          case 2: System.out.println("\nProgr. Finalizado!\n");
                  System.exit(0); 
                  break;
        } 
   
      } while ( true ); 
}
}