/*
 *L) Elaborar um programa que efetue a leitura de três valores (A, B e C)
e apresente como resultado final à soma dos quadrados dos três valores lidos.
 */
package Tarefa_07;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class SomaQuadradoTresNumeros {
    
    public double A;
    public double B;
    public double C;    
    
    public void Ler(double x1, double x2, double x3){
        
        A = x1;
        B = x2;
        C = x3;    
    }
    
    public double getSomaQuadrado(){
        
       double q2difernca = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);
       
       return q2difernca;
    }
    
    public void Exibir(double q2difernca){
        
        JOptionPane.showMessageDialog(null,"Resultado final à soma dos"
                + " quadrados dos três valores lidos é "+ String.format("%.2f", + q2difernca),"Resultado",1);
    
    }
}
