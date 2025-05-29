
package Tarefa_03;

import java.util.Scanner;

public class F_TAREFA_03 {
    public double A,B,C;
    public String msg;
    public void leitura()
    { Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        A = leitor.nextDouble();
        System.out.println("Digite um valor para B: ");
        B = leitor.nextDouble();
        System.out.println("Digite um valor para C: ");
        C = leitor.nextDouble();
        
     
        if ( A <= B && A <= C ){
            if( B <= C ){
                msg = String.format(" %.2f, %.2f, %.2f", A, B, C);} 
            else{msg = String.format(" %.2f, %.2f, %.2f",A ,C ,B);}}
        if ( B <= A && B <= C){
            if(A <= C){
                msg = String.format(" %.2f, %.2f, %.2f",B ,A ,C);}
            else{msg = String.format(" %.2f, %.2f, %.2f",B ,C ,A);}}
        if (C <= A && C <= B){  
            if (A <= B){
             msg = String.format(" %.2f, %.2f, %.2f",C ,A, B);}
            else{msg = String.format(" %.2f, %.2f, %.2f",C ,B ,A);}
        
            }//fim if else
    }//fim leitura
    public void exibir()
    { System.out.println("\nOrdem crescente dos valores fornecidos é: "+ msg +".");
        
    }//fim exibir
         
    public static void main(String[] args)
    {
        F_TAREFA_03 v1 = new F_TAREFA_03();
        
        v1.leitura();
        v1.exibir(); 
        
    }//fim main

}//fim classe
