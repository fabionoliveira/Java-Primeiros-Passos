
package Aula_semana_04_1808;



import java.util.Scanner;

 


public class Classe2 
{
    public double a,b,c;
    public String tipo;
    
    
    public void ler ( Scanner leitor)
    {
        System.out.println("\nDigite os lados A, B e C:");
        a =leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        
        
    }
    
    public void processarExibir()
    {
        if (a == b && a == c)
        {
            tipo = "Equilátero";
        }
        else if ( a != b && a!=c && b!=c)
        {
          tipo = "Escaleno";
        }
        else
        {
            tipo = "Isósceles";
        }
        
        
        String Saida;
        Saida = "\n*** Tela de Saída ***";
        Saida += "\nLado A:" + a;
        Saida += "\nLado B:" + b;
        Saida += "\nLado C:" + c;
        Saida += "\nTipo..:" + tipo;
        System.out.println(Saida);
    }
  
    
    public void controle ( Scanner leitor) 
    {
    int tecla;
    
     do {
           System.out.println("\n1 Ler e exibir");
           System.out.println("\n2 Finalizar\nitem:");
           tecla = leitor.nextInt();
           switch(tecla)
           {
               case 1: ler ( leitor );
                       processarExibir();
                       break;
               
               case 2: System.exit(0); break;
           }
            
        } while (true);
    }
    
    
    public static void main ( String[] args ) 
    {
        Classe2 obj = new Classe2();
        
        Scanner leitor = new Scanner(System.in);
        
        obj.controle ( leitor );
    }
}
 


