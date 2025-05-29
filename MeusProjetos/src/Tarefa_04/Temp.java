
package Tarefa_04;

import java.util.Scanner;

public class Temp 
{
    public double a;
    public double b;
    public double c;
    public double delta;
    public double raiz;
    public double x1;
    public double x2;    
    //public String msg;
    
    public void leitura(Scanner leitor)
    {   System.out.println("============ ENTRADA DADOS ===========");
        System.out.print("Digite um valor para A: ");
        a = leitor.nextDouble();
        System.out.print("Digite um valor para B: ");
        b = leitor.nextDouble();
        System.out.print("Digite um valor para C: ");
        c = leitor.nextDouble();
                
    }//fim leitura    
    public void calcular() 
    {   System.out.println("======================================");
        System.out.println(">>> Calculado com Sucesso!!! <<<");
        delta = (Math.pow(b, 2))- 4 *a *c;
        if ( delta >= 0)
        {
           raiz = Math.sqrt(delta);
           x1 = (-b + raiz)/ (2 *a);
           x2 = (-b - raiz)/ (2 *a);         
        }            
    }//fim calcular
    public void exibir()
            
    {      System.out.print("============== RESULTADO ==============");       
           System.out.println("\nvalor A: "+ String.format("%.2f", a)          
                               +"\nValor B: "+ String.format("%.2f", b)
                               +"\nValor C: "+ String.format("%.2f", c)
                               +"\nValor Delta: "+ String.format("%.2f", delta));
                
           if (a != 0 && b != 0 && c != 0)
           {
               System.out.println( "OBS: >>> O coeficiente de A, B ou C devem ser diferente de ZERO. <<<\n"
                    + "Programa finalizado!!!\n");        
           }
           else if( delta >= 0)
           {   System.out.println("Valor de X1: "+ String.format("%.2f", x1)
                            +"\nValor da X2: "+ String.format("%.2f", x2));        
                                               
           }
           else{ 
               System.out.print("OBS: >>> Sem solução no conjunto dos números Reais! <<<\n");
           }
                         
    }//fim exibir
    
    public void controle(Scanner leitor)
    {    
        int tecla;
        
        do{ 
            System.out.println("================ MENU ================");
            System.out.print("1 Ler\n2 Calcular\n3 Exibir\n4 Finalizar\nItem: ");
            //System.out.println("Item: ");
            tecla = leitor.nextInt();
            switch(tecla)
            {
                case 1: leitura(leitor);
                        break;
                case 2: calcular();
                        break;
                case 3: exibir();
                        break;
                case 4: 
                        System.out.println(">> Programa Finalizado <<");
                        System.exit(0);           
            }        
        } 
        while (true);
       
    }
    public static void main(String[] args)
    {   Scanner leitor = new Scanner(System.in);
        Temp CTR = new Temp();
        
        CTR.controle(leitor);
        
    }//fim main

}
