/*
Bhaskara.java
--------------------------------------
VA double
VB double
VC double
-------------------------------------
ler_A( a ) void
ler_B( b ) void
ler_C( c ) void
cal_delta() double
cal_x1 ( delta ) double
cal_x2 ( delta ) double
exibir (delta, x1, x2) void
-------------------------------------

Fórmulas e Cálculos

delta = b * b - 4 * a * c
x1 = (-b + sqrt(delta)) / (2 * a)
x2 = (-b - sqrt(delta)) / (2 * a)

*/
package Aula_semana_08_1509;

/**
 *
 * @author FO
 */
public class Bhaskara {
    
    public double va;
    public double vb;
    public double vc;
    
    public void ler_a(double a){va = a;}
    
    public void ler_b(double b){vb = b;}
    
    public void ler_c(double c){vc = c;}
    
    
    public double cal_Delta () 
    {
       double delta = Math.pow(vb,2) - 4 * va * vc;
       
       return delta; 
    }
    
    public double cal_x1 ( double delta ) 
    {
       double x1 = (-vb + Math.sqrt(delta))/(2*va);
       return x1; 
    }
    
    public double cal_x2 ( double delta ) 
    {
       double x2 = (-vb - Math.sqrt(delta))/(2*va);
       return x2; 
    }
    
   public void exibir () 
   {
      double delta = cal_Delta();

 

        System.out.println("\n*** Tela de Saída ***\n");
        System.out.println("\nValor de ....A:" + va);
        System.out.println("\nValor de ....B:" + vb);
        System.out.println("\nValor de ....C:" + vc);
        System.out.println("\nValor de delta:" + delta);

 

        if (delta < 0) 
        { 
          System.out.println("\nErro! Delta Negativo Impossível calcular X1 e X2!");
          System.out.println();
          return; // finalizar o metodo exibir
        }
        
        else
        { 
            double x1 = cal_x1( delta );
            double x2 = cal_x2( delta );
            
        System.out.println("\nValor de ....x1:"+ String.format("%.2f",x1) );
        System.out.println("\nValor de ....x2:"+ String.format("%.2f",x2) + "\n");
        }
    }
}