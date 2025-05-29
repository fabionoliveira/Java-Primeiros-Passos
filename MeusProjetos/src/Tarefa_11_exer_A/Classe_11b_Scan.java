/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_11_exer_A;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FO
 */
public class Classe_11b_Scan extends Object{
    
    public char sexo;
    public double salario;
    public int mulher = 0;
    public int homem = 0;
    public double saldom;
    public double saldoh;
    public double mediam = 0;
    public double mediah = 0;

    public void Ler() throws IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite F para mulher ou H para Homen");
        sexo = (char) System.in.read();
              
        System.out.print("Digite o Salário:\nR$ ");
        salario = scan.nextDouble();
        
        switch (sexo) {
            case 'f':
            case 'F':
                mulher++;
                saldom += salario;
                break;
            case 'h':
            case 'H':
                homem++;
                saldoh += salario;
                break;
            default:
                System.out.println("erro, errrrrrroooo");
                System.exit(0);
        
        }
        
    }
       
    
    public double getMediaM() {

        return mediam = saldom / mulher;
    }

    public double getMediaH() {

        return mediah = saldoh / homem;
    }

    public void exibir() {
        
        System.out.println("Quantidade Mulheres: " + mulher);
        System.out.println("Quantidade Homens: " + homem);
        System.out.println("Saldo Mulheres: R$" + String.format("%.2f", saldom));
        System.out.println("Saldo Homens: R$" + String.format("%.2f", saldoh));
        System.out.println("Média Mulheres: R$" + String.format("%.2f", mediam));
        System.out.println("Média Homens: R$" + String.format("%.2f", mediah));
        
    }
/*
    public static void main(String[] args) {
        Classe11b obj1 = new Classe11b();

        obj1.Ler();
        obj1.getMediaM();
        obj1.getMediaH();
        obj1.exibir();

    }
*/
}

