/*
 *L) Elaborar um programa que efetue a leitura de três valores (A, B e C)
e apresente como resultado final à soma dos quadrados dos três valores lidos.
 */
package Z_TAREFA_07;

import java.util.Scanner;

/**
 *
 * @author FO
 */
public class SomaQuadradoTresNumeros_1 {
    
    public double A;
    public double B;
    public double C;    
    
    public void Ler(Scanner scan){
        
        System.out.println("Digite um valor para A: ");
        A = scan.nextDouble();
        System.out.println("Digite um valor para B: ");
        B = scan.nextDouble();
        System.out.println("Digite um valor para C: ");
        C = scan.nextDouble();
    
    }
    
    public double getSomaQuadrado(){
        
       double q2difernca = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);
       
       return q2difernca;
    }
    
    public void Exibir(double q2difernca){
        
        System.out.println("Resultado final à soma dos quadrados dos três valores lidos é "+ String.format("%.2f", + q2difernca));
    
    }
}
