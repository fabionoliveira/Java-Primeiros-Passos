
package Tarefa_04;

import java.util.Scanner;

public class Classe2_TAREFA_4 
{
    public double a,b,c;
    public double S,AR;
    public String tipo;
    
    
    public void ler ( Scanner leitor)
    {
        System.out.print("====== ENTRADA DADOS =====");
        System.out.println("\nDigite os lados A, B e C:");
        a =leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
              
    }// fim ler
    
    public void calcular()
    {   // (S) =(A+B+C)/2
        S = ( a + b + c) / 2;
        AR = Math.sqrt(S*(S - a)*(S - b) * (S - c));
        // (AR) = RAIZ(S*(S-A)*(S-B)*(S-C))
        System.out.println("==========================");
        System.out.println("Calculado com Sucesso!!!");
        
    }//fim calcular
    
    public void exibir()
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
        System.out.println("==========================");
        Saida = "***** Tela de Saída ******";
        Saida += "\nLado A:" + a;
        Saida += "\nLado B:" + b;
        Saida += "\nLado C:" + c;
        Saida += "\nTipo..:" + tipo;
        Saida += "\nSemiperímetro = "+String.format("%.3f", S);
        Saida += "\nÁrea do triângulo = "+String.format("%.3f", AR);
        System.out.println(Saida);
    }// fim exibir
  
    
    public void controle ( Scanner leitor) 
    {
    int tecla;
    
     do {  System.out.println("========== Menu =========="); 
           System.out.print("1 Ler\n2 Calcular\n3 Exibir");
           System.out.print("\n4 Finalizar\nitem: ");
           tecla = leitor.nextInt();
           switch(tecla)
           {
               case 1: ler ( leitor );
                       break;
               case 2: calcular();
                       break;
               case 3: exibir();
                       break;               
               case 4: 
                       System.out.println(">> Programa Finalizado. <<"); 
                       System.exit(0);
                       break;
           }
            
        } while (true);
    }
    
    
    public static void main ( String[] args ) 
    {
        Classe2_TAREFA_4 obj = new Classe2_TAREFA_4();
        
        Scanner leitor = new Scanner(System.in);
        
        obj.controle ( leitor );
    }
}
 


