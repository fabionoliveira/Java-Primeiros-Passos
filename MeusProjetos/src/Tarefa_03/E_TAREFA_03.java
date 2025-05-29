
package Tarefa_03;

import java.util.Scanner;

public class E_TAREFA_03 {
    public double a;
    public double b;
    public double c;
    public double delta;
    public double raiz;
    public double x1;
    public double x2;    
    public String msg;
    
    public void leitura()
    { Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        a = leitor.nextDouble();
        System.out.println("Digite um valor para B: ");
        b = leitor.nextDouble();
        System.out.println("Digite um valor para C: ");
        c = leitor.nextDouble();
                
    }//fim leitura    
    public void calcular() 
    {   delta = (Math.pow(b, 2))- 4 *a *c;
        raiz = Math.sqrt(delta);
        x1 = (-b + raiz)/ (2 *a);
        x2 = (-b - raiz)/ (2 *a);         
                    
    }//fim calcular
    public void exibir()
            
    {      if (a == 0){
            msg = "O valor de A tem que ser diferente de ZERO.\n"
                    + "Programa finalizado!!!\n";        
           }else if ( delta >= 0){
               msg = "valor de Delta: "+ String.format("%.2f", delta);           
               msg += "\nValor de Raiz 1: "+ String.format("%.2f", x1);
               msg += "\nValor da Raiz 2: "+ String.format("%.2f", x2);
               msg += "\n>> Se o delta for maior que zero, a equação terá dois valores reais "
                       + "e distintos."
                       + "\n>> Se o delta for igual a zero, a equação terá somente"
                       + " um valor real ou dois resultados iguais.\n";
               
           }else{
               msg = ">> O valor de Delta: "+ String.format("%.2f", delta);
               msg += "\n>> Como delta é menor que zero, a equação não terá raízes reais,\n"
                     + ">> pois não existe raiz quadrada de número negativo.\n";
               
           }
           System.out.print("================================ Resultado ================================");       
           System.out.println("\n"+ msg);
           System.exit(0);
        
    }//fim exibir
         
    public static void main(String[] args)
    {
        E_TAREFA_03 v1 = new E_TAREFA_03();
        
        v1.leitura();
        v1.calcular();
        v1.exibir(); 
        System.exit(0);
    }//fim main

}//fim classe
