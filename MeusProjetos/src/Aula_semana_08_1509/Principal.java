/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_semana_08_1509;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Principal {
    public void menu_controle()
  {
    Scanner leitor = new Scanner(System.in);
    Bhaskara a1 = new Bhaskara ( );
    
    double a, b, c; 
    int tecla = 0;

 

    while ( true ) 
    {
        System.out.print("\nMenu\n1 Executar\n2 Sair\nitem: ");
        tecla = leitor.nextInt ();
        
            switch ( tecla )
            {
               case 1: System.out.println("\nDigite A, B e C");
                       a = leitor.nextDouble();
                       b = leitor.nextDouble();
                       c = leitor.nextDouble();

 

                       if ( a == 0 ) 
                       { 
                           System.out.println("\nErro!'A' deve ser diferente de zero!\n");
                           System.out.println(); 
                           return; 
                       }

 

                       a1.ler_a ( a );
                       a1.ler_b ( b );
                       a1.ler_c ( c );
                       a1.exibir ( ); 
                       break;

 

            case 2:     System.out.println("\nO programa será ﬁnalizado!");
                        System.out.println ();
                        break; 
            }
     } 
    
    }

 

    
    
    public static void main(String[] args) 
    {
       Principal p1 = new Principal();
       p1.menu_controle();
    }
}
